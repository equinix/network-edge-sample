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
package com.equinix.networkedge.examples;

import com.equinix.networkedge.APIHandler;
import com.equinix.networkedge.Util;
import com.equinix.networkedge.config.ApiConfiguration;
import com.equinix.networkedge.model.Oauth2TokenRequest;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import org.springframework.http.HttpHeaders;

/**
 *  This example will trigger a Api call to get Access Token from Equinix Inc.
 * @author aanchala 7/13/2018
 **/

public class AccessTokenExample {


    public static void main(String[] args) {

        /*
         * Provide ClientId, ClientSecret, GrantType, UserName and password in ApiConfiguration class
         */

        Oauth2TokenRequest oathReq = new Oauth2TokenRequest();
        oathReq.setClient_id(ApiConfiguration.CLIENT_ID);
        oathReq.setClient_secret(ApiConfiguration.CLIENT_SECRET);
        oathReq.setGrant_type(ApiConfiguration.GRANT_TYPE);
        oathReq.setUser_name(ApiConfiguration.USER_NAME);
        oathReq.setUser_password(ApiConfiguration.PASSWORD);

        try {
            APIHandler handler = new APIHandler();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            Oauth2TokenResponse oauthResponse = handler.getOauth2AccessToken(headers, oathReq);
            System.out.println("Response is :: \n " + Util.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString
                    (oauthResponse));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Get Access Token Response " + ex.getMessage());
        }
    }
}

