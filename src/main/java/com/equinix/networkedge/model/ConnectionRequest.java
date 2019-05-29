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
import lombok.Getter;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public @Data class ConnectionRequest {


    @JsonProperty
    @NotNull
    @NotEmpty
    @Size(max = 24,message = "Max 24 characters are allowed for Primary Connection Name")
    private String primaryName;

    @JsonProperty
    @Range(min=2,max=4094, message = "Primary CTag must be between 2 and 4094")
    private Integer primaryVlanCTag;

    @JsonProperty
    @NotNull
    @Range(min=2,max=4094, message = "Primary STag must be between 2 and 4094")
    private Integer primaryVlanSTag;

    @JsonProperty
    @NotNull
    @NotEmpty
    private String primaryPortUUID;

    @JsonProperty
    @Size(max = 24,message = "Max 24 characters are allowed for Secondary Connection Name")
    @NotEmpty // validate only when object is not null
    private String secondaryName;

    @JsonProperty
    @Range(min=2,max=4094)
    private Integer secondaryVlanCTag;

    @JsonProperty
    @Range(min=2,max=4094)
    private Integer secondaryVlanSTag;

    @JsonProperty
    private String secondaryPortUUID;

    @JsonProperty
    @NotNull
    private String profileUUID;

    @JsonProperty
    private String authorizationKey;

    @JsonProperty
    private Integer speed;

    @JsonProperty
    private SpeedUnit speedUnit;

    @JsonProperty
    private String primaryZSidePortUUID;

    @JsonProperty
    @Range(min=2,max=4094)
    private Integer primaryZSideVlanCTag;

    @JsonProperty
    @Range(min=2,max=4094)
    private Integer primaryZSideVlanSTag;

    @JsonProperty
    @Range(min=2,max=4094, message = "Secondary CTag must be between 2 and 4094")
    private Integer secondaryZSideVlanCTag;

    @JsonProperty
    @Range(min=2,max=4094, message = "Secondary STag must be between 2 and 4094")
    private Integer secondaryZSideVlanSTag;

    @JsonProperty
    private String secondaryZSidePortUUID;

    @JsonProperty
    private String sellerRegion;

    @JsonProperty
    private String sellerMetroCode;

    @JsonProperty
    @NotNull
    private List<String> notifications;

    @JsonProperty
    @NotNull
    @Size(max = 25)
    private String purchaseOrderNumber;

    @JsonProperty
    private String namedTag;

    @JsonProperty
    private String manualCTag; // seller c tag

    @JsonProperty
    private String sTag; //


    public enum SpeedUnit {
        MB("MB"), GB("GB");

        @Getter
        private String unit;

        SpeedUnit(String unit) {
            this.unit = unit;
        }
    }



}
