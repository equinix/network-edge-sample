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

import com.equinix.networkedge.APIException;
import com.equinix.networkedge.APIHandler;
import com.equinix.networkedge.Util;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import com.equinix.networkedge.model.ValidateRequest;
import com.equinix.networkedge.model.ValidateResponse;

import java.util.List;

/**
 * This example will trigger a Api call to Validate Authorization Key for a Access token/user
 * @author aanchala 7/13/2018
 **/
public class ValidateAuthorizationKeyExample {

    private static Oauth2TokenResponse oauthToken;

    public static void main(String[] args) {

        APIHandler handler = new APIHandler();
        try {
            oauthToken = Util.createToken();
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("OAuth Error Response is " + ex.getMessage());
        }

        try {
            ValidateRequest validateRequest = new ValidateRequest();

            /*
             * This Api will validate the Authorization/Service key based on Metro code, Profile Id and Region
             * Provide Authorization key, Profile Id, Region and Metro Code to validate the Key
             */

            validateRequest.setAuthorizationkey("");
            validateRequest.setMetroCode("");
            validateRequest.setProfileId("");
            validateRequest.setRegion("");
            List<ValidateResponse> validateResponse = handler.validateAuthKey(oauthToken, validateRequest);
            System.out.println("Validate Key Response is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString
                            (validateResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Validate Key Error Response " + e.getMessage());
        }
    }

}
