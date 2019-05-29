/*
 * The Apache License
 *
 * Copyright 2019 Equinix Inc.
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

package com.equinix.networkedge.config;

import lombok.Data;

public @Data
class ApiConfiguration {

    public static final String BEARER = "Bearer ";

    /*
    *  Please provide client id, client secret, grant type, user name and password
    *
    * */
    /*
     * Set the Client ID received from Equinix
     */
    public static final String CLIENT_ID = "<<CLIENT_ID>>";

    /*
     * Set the client secret received from Equinix
     */
    public static final String CLIENT_SECRET = "<<CLIENT_SECRET>>";

    /*
     * Do not change this. This represents client_credentials
     */
    public static final String GRANT_TYPE = "<<GRANT_TYPE>>";

    /*
     * Set the user name to access the cloud exchange
     */
    public static final String USER_NAME = "<<USER_NAME>>";

    /*
     * Set the user password for the above user name
     */
    public static final String PASSWORD = "<<PASSWORD>>";

    private String uri = "https://api.equinix.com";
}
