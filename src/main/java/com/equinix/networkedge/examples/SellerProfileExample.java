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
import com.equinix.networkedge.model.HttpRequest;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import com.equinix.networkedge.model.ServiceProfileResponse;

import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public class SellerProfileExample {

    private static Oauth2TokenResponse oauthToken;
    APIHandler handler = new APIHandler();

    public static void main(String[] args) {
        SellerProfileExample sellerProfileExample = new SellerProfileExample();



        try {
            oauthToken = Util.createToken();
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("OAuth Error Response is " + ex.getMessage());
        }

        /**
         * This API call will fetch all the service profiles associated with the Access token provided if metros and
         * page details are not provided.
         * To get service profile specific to Metro, add query parameter to the url as provided in
         * getAllServiceProfiles Method
         */

        sellerProfileExample.getAllServiceProfiles(oauthToken);

        /**
         * This API call will fetch service profiles by using access token and the UUID of the service profile
         *
         * Provide service profile UUID and uncomment the below method call.
         */

        String uuid = "";
        //sellerProfileExample.getServiceProfileByUUID(oauthToken, uuid);
    }


    private void getAllServiceProfiles(Oauth2TokenResponse oauthToken) {
        try {
            /**
             *  Provide the metro detail
             *  Provide page number and page size
             */
            String[] metros = {"DC", "SV"};
            HttpRequest httpRequest = new HttpRequest();
            httpRequest.setPageNumber("2");
            httpRequest.setPageSize("5");
            httpRequest.setMetroCode(metros);
            List<ServiceProfileResponse> spResponse = (List<ServiceProfileResponse>)handler.getSellerProfile
                    (oauthToken, httpRequest, null);
            System.out.println("Response is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (spResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get Metros Error Response " + e.getMessage());
        }
    }

    private void getServiceProfileByUUID(Oauth2TokenResponse oauthToken, String uuid) {
        try {
            ServiceProfileResponse spResponse = (ServiceProfileResponse)handler.getSellerProfile(oauthToken, null,
                    uuid);
            System.out.println("**** Response for UUID :: \n " + Util.mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(spResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get Metros Error Response " + e.getMessage());
        }
    }
}
