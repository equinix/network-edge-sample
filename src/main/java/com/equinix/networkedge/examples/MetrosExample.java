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
import com.equinix.networkedge.model.Metro;
import com.equinix.networkedge.model.Oauth2TokenResponse;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 *   This example will trigger a Api call to get all the metros specific Access token/user.
 * @author aanchala 7/12/2018
 **/
@ComponentScan(basePackages = " com.equinix.networkedge")
public class MetrosExample {
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
            List<Metro> metroResponse = handler.getAllMetros(oauthToken);
            System.out.println("Response is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (metroResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get Metros Error Response " + e.getMessage());
        }
    }

}
