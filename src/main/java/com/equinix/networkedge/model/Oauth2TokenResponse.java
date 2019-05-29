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
package com.equinix.networkedge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public @Data class Oauth2TokenResponse {

    @JsonProperty("access_token")
    private String access_token = null;

    @JsonProperty("token_timeout")
    private String token_timeout = null;

    @JsonProperty("user_name")
    private String user_name = null;

    @JsonProperty("token_type")
    private String token_type = null;

    @JsonProperty("refresh_token")
    private String refresh_token = null;

    @JsonProperty("refresh_token_timeout")
    private String refresh_token_timeout = null;

    @Override
    public String toString() {
        return "Oauth2TokenResponse{ \n" +
                "access_token='" + access_token + '\'' +
                ", \n token_timeout='" + token_timeout + '\'' +
                ", \n user_name='" + user_name + '\'' +
                ", \n token_type='" + token_type + '\'' +
                ", \n refresh_token='" + refresh_token + '\'' +
                ", \n refresh_token_timeout='" + refresh_token_timeout + '\'' +
                '}';
    }
}
