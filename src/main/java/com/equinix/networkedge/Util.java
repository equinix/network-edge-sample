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
package com.equinix.networkedge;

import com.equinix.networkedge.config.ApiConfiguration;
import com.equinix.networkedge.model.Oauth2TokenRequest;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpHeaders;

public class Util {

    public static ObjectMapper mapper = new ObjectMapper();

    public static ObjectMapper getObjectMapper() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        return mapper;
    }

    public static Oauth2TokenResponse createToken() throws APIException {
        Oauth2TokenResponse oauthResponse = null;

        Oauth2TokenRequest oathReq = new Oauth2TokenRequest();
        /*
         * Set the Client ID received from Equinix
         */
        oathReq.setClient_id(ApiConfiguration.CLIENT_ID);
        /*
         * Set the client secret received from Equinix
         */
        oathReq.setClient_secret(ApiConfiguration.CLIENT_SECRET);

        /*
         * Do not change this. This represents client_credentials
         */
        oathReq.setGrant_type(ApiConfiguration.GRANT_TYPE);

        /*
         * Set the user name to access the cloud exchange
         */
        oathReq.setUser_name(ApiConfiguration.USER_NAME);

        /*
         * Set the user password for the above user name
         */
        oathReq.setUser_password(ApiConfiguration.PASSWORD);


        try {
            APIHandler handler = new APIHandler();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            oauthResponse = handler.getOauth2AccessToken(headers, oathReq);
            System.out.println("Response is:: " + oauthResponse.toString());
        } catch (Exception ex) {
            throw new APIException(2000, ex.getMessage());
        }
        return oauthResponse;
    }

}
