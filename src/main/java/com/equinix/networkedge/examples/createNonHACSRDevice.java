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
import com.equinix.networkedge.model.BuyerPreferenceRequest;
import com.equinix.networkedge.model.BuyerPreferenceResponse;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *  This example will trigger a Api call to get buyer preference for specific Access token/user,
 *  create  buyer preference, delete  buyer preference and update buyer preference .
 * @author aanchala 7/13/2018
 **/
public class createNonHACSRDeviceExample {

    private static Oauth2TokenResponse oauthToken;
    APIHandler handler = new APIHandler();

    public static void main(String[] args) {
        createNonHACSRDeviceExample createNonHACSRDeviceExample = new createNonHACSRDeviceExample();
        try {
            oauthToken = Util.createToken();
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("OAuth Error Response is " + ex.getMessage());
        }
        // createNonHACSRDeviceExample.updatecreateNonHACSRDevice(oauthToken);
        // createNonHACSRDeviceExample.savecreateNonHACSRDevice(oauthToken);
        // createNonHACSRDeviceExample.deletecreateNonHACSRDevice(oauthToken);
        createNonHACSRDeviceExample.getcreateNonHACSRDevice(oauthToken);
    }


    private void savecreateNonHACSRDevice(Oauth2TokenResponse oauthToken) {
        try {
            BuyerPreferenceRequest buyerPreferenceRequest = new BuyerPreferenceRequest();
            List<String> emails = new ArrayList<String>();
            emails.add("test@test.com");
            buyerPreferenceRequest.setPortThreshold("10");
            buyerPreferenceRequest.setEmails(emails);
            BuyerPreferenceResponse bResponse = handler.getcreateNonHACSRDevice(oauthToken, buyerPreferenceRequest,
                    HttpMethod.POST);
            System.out.println("savecreateNonHACSRDevice is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (bResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("savecreateNonHACSRDevice Error Response " + e.getMessage());
        }
    }

    private void updatecreateNonHACSRDevice(Oauth2TokenResponse oauthToken) {
        try {
            BuyerPreferenceRequest buyerPreferenceRequest = new BuyerPreferenceRequest();
            List<String> emails = new ArrayList<String>();
            emails.add("test@test.com");
            buyerPreferenceRequest.setPortThreshold("10");
            buyerPreferenceRequest.setEmails(emails);
            BuyerPreferenceResponse bResponse = handler.getcreateNonHACSRDevice(oauthToken, buyerPreferenceRequest,
                    HttpMethod.PATCH);
            System.out.println("updatecreateNonHACSRDevice is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (bResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("updatecreateNonHACSRDevice Error Response " + e.getMessage());
        }
    }

    private void deletecreateNonHACSRDevice(Oauth2TokenResponse oauthToken) {
        try {

            BuyerPreferenceResponse bResponse = handler.getcreateNonHACSRDevice(oauthToken, null,
                    HttpMethod.DELETE);
            System.out.println("deletecreateNonHACSRDevice is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (bResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("deletecreateNonHACSRDevice Error Response " + e.getMessage());
        }
    }

    private void getcreateNonHACSRDevice(Oauth2TokenResponse oauthToken) {
        try {

            BuyerPreferenceResponse bResponse = handler.getcreateNonHACSRDevice(oauthToken, null,
                    HttpMethod.GET);
            System.out.println("getcreateNonHACSRDevice is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (bResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("getcreateNonHACSRDevice Error Response " + e.getMessage());
        }
    }

}
