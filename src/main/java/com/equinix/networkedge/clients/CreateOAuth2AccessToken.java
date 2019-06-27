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
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.util.Base64;

import static com.equinix.networkedge.utils.ConfigUtil.get;

public class CreateOAuth2AccessToken {
    public static void main(String... args) {
        //  1. Generate OAuth2 Access Token.
        //  2. Verify the hostname.

        OAuthRequest oathReq = new OAuthRequest();
        Gson gson = new Gson();
        String hostname = get("ne.url.hostname");
        String urlOAuth2 = hostname + get("ne.url.auth");

        try {
            //  3. Set the generated Client ID, Secret generated in https://developer.equinix.com (Your App).
            //  4. Set the grant type to "password' or 'client_credentials' if you want API Gateway to generate the Access token.
            oathReq.clientId(get("ne.client.access.client.id"));
            oathReq.clientSecret(get("ne.client.access.client.secret"));
            oathReq.grantType(get("ne.client.access.client.granttype"));
            oathReq.userName(get("ne.client.access.client.username"));
            String password = new String(Base64.getDecoder().decode(get("ne.client.access.client.base64.password")), "UTF-8");
            oathReq.userPassword(password);

            HttpResponse<String> response = Unirest.post(urlOAuth2)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .body(gson.toJson(oathReq)).asString();
            OAuthResponse oauthResponse = gson.fromJson(response.getBody(), OAuthResponse.class);


            System.out.println("OAuth2 Access Token: " + oauthResponse.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
