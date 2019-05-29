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

import java.util.regex.Pattern;

public enum DatatypeENUM {

    INTEGER("INTEGER", "^[0-9]{0,10}+$"),
    BOOLEAN("BOOLEAN", "^(true|false){1}$"),
    LONG("LONG", "^[0-9]{0,19}+$"),
    FLOAT("FLOAT", "^[0-9]+\\.{1}[0-9]{0,10}+$"),
    DOUBLE("DOUBLE",  "^[0-9]+\\.{1}[0-9]{0,10}+$"),
    STRING("STRING",  "(.*)");

    String value;
    Pattern pattern;

    /**
     * Constructor
     *
     * @param value
     */
    DatatypeENUM(String value, String pattern) {
        this.value = value;
        this.pattern = Pattern.compile(pattern);
    }

    /**
     * API to get value
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param input
     * @return
     */
    public boolean isValidInput(String input){
        return this.pattern.matcher( input ).find();
    }
}
