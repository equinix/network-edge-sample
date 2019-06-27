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

import com.equinix.networkedge.model.OAuthResponse;
import com.equinix.networkedge.model.PostConnectionRequest;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

import static com.equinix.networkedge.utils.ConfigUtil.createOAuthRequest;
import static com.equinix.networkedge.utils.ConfigUtil.get;
import static com.equinix.networkedge.utils.ConfigUtil.getAuthToken;

public class CreateL2Connection {
    public static void main(String... args) {
        // Prerequisites for creating an L2 Connection with a NON-HA single vNF Edge Device.
        // 1. The Device should be PROVISIONED and the Licensed REGISTERED before any L2 connections can be created with the device.
        // 2. The Service Profile UUID should be known which will be used for L2 connection.
        // 3. Any CSP related ServiceKey or Authorization keys need to be provided.

        List<String> emails = new ArrayList<>();
        Gson gson = new Gson();
        emails.add("api-notifications@mycompany.com");
        String hostname = get("ne.url.hostname");
        String urlL2Connection = hostname + get("ne.url.ecx.l2.connection");

        PostConnectionRequest request = new PostConnectionRequest();
        request.primaryName("ttestt_012_primary_vc")
                .profileUUID("174067c5-3ffa-45e3-9f29-c88fcb14dc09")
                .speed(50)
                .speedUnit("MB")
                .notifications(emails)
                .purchaseOrderNumber("")
                .virtualDeviceUUID("bde6a11c-6b19-4e1e-94cc-14a7737c28d8")
                //.secondaryName("ttestt_011_secondary_vc")
                //.secondaryVirtualDeviceUUID("def2c652-baaa-44d0-aa85-c3aad32e2962")
                //.secondarySpeed(50)
                //.secondarySpeedUnit("MB")
                //.secondaryAuthorizationKey("123456789123")
                .sellerRegion("us-east-1")
                .sellerMetroCode("DC")
                .authorizationKey("123456789123");

        // 4. Good idea to validate the Auth key before you set it in the L2 Connection Request.

        String authToken = getAuthToken();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = Unirest.post(urlL2Connection)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .header("Authorization", "Bearer " + authToken)
                    .body(gson.toJson(request)).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        System.out.println("L2 Connection Response: " + httpResponse.getBody());
    }
}
