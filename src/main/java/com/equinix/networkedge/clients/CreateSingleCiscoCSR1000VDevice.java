/*
 * The Apache License
 *
 * Copyright 2017 Equinix Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.equinix.networkedge.clients;

import com.equinix.networkedge.model.OAuthRequest;
import com.equinix.networkedge.model.OAuthResponse;
import com.equinix.networkedge.model.SshUsers;
import com.equinix.networkedge.model.VirtualDeviceRequest;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import static com.equinix.networkedge.utils.ConfigUtil.get;

public class CreateSingleCiscoCSR1000VDevice {
    public static void main(String... args) {
        Gson gson = new Gson();
        List<String> sshAcls = new ArrayList<>();
        List<SshUsers> sshUsers = new ArrayList<>();
        List<String> notifications = new ArrayList<>();

        try {
            // 1. Generate Access Token.
            OAuthRequest oathReq = createOAuthRequest();

            // 2. Create Device Request.
            VirtualDeviceRequest deviceRequest = new VirtualDeviceRequest();
            deviceRequest.virtualDeviceName("cc2-from-api-nonha-jun20-dev04")
                    .deviceTypeCode("CSR1000V")
                    .accountNumber("903759")
                    .additionalBandwidth(30)
                    .throughput(500)
                    .throughputUnit("Mbps")
                    .metroCode("DC")
                    .licenseMode("Sub")
                    .packageCode("SEC")
                    .termLength(1)
                    .hostNamePrefix("cc2-jun20");

            sshAcls.add("15.0.0.0/8");

            SshUsers users = new SshUsers();
            users.action("CREATE");
            users.sshUsername("user10911");
            users.sshPassword("password");
            sshUsers.add(users);

            notifications.add("rvaranasi@equinix.com");

            deviceRequest.setSshAcl(sshAcls);
            deviceRequest.sshUsers(sshUsers);
            deviceRequest.notifications(notifications);

            // 3. Invoke Access Token API and get the token.
            String hostname = get("ne.url.hostname");
            String urlOAuth2 = hostname + get("ne.url.auth");
            String urlDevice = hostname + get("ne.url.device");

            // UniRest is a lightweight HTTPClient built on top of widely used Apache HTTP Client.
            // http://unirest.io/java.html
            HttpResponse<String> response = Unirest.post(urlOAuth2)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .body(gson.toJson(oathReq)).asString();
            OAuthResponse oauthResponse = gson.fromJson(response.getBody(), OAuthResponse.class);

            // 4. Invoke Create Device API.
            response = Unirest.post(urlDevice)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .header("Authorization", "Bearer " + oauthResponse.getAccessToken())
                    .body(gson.toJson(deviceRequest)).asString();

            System.out.println(response.getBody());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static OAuthRequest createOAuthRequest() {
        //  Generate OAuth2 Access Token.
        OAuthRequest oathReq = new OAuthRequest();
        try {
            oathReq.clientId(get("ne.client.access.client.id"));
            oathReq.clientSecret(get("ne.client.access.client.secret"));
            oathReq.grantType(get("ne.client.access.client.granttype"));
            oathReq.userName(get("ne.client.access.client.username"));
            String password = new String(Base64.getDecoder().decode(get("ne.client.access.client.base64.password")), "UTF-8");
            oathReq.userPassword(password);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return oathReq;
    }
}
