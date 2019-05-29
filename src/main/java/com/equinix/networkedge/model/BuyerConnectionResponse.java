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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public @Data class BuyerConnectionResponse {

    @JsonProperty
    private String buyerOrganizationName;

    @JsonProperty
    private String uuid;

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer vlanCTag;

    @JsonProperty
    private Integer vlanSTag;

    @JsonProperty
    private String portUUID;

    @JsonIgnore
    private String portIbx;

    @JsonProperty
    private String portName;

    @JsonProperty
    private String asideEncapsulation;

    @JsonProperty
    private String metroCode;

    @JsonProperty
    private String metroDescription;

    @JsonProperty
    private String state;

    @JsonProperty
    private String status;

    @JsonProperty
    private String billingTier;

    @JsonProperty
    private String orderNumber;

    @JsonProperty
    private String serviceOrderNumber;

    @JsonProperty
    private String billingStatus;

    @JsonProperty
    private String profileUUID;

    @JsonProperty
    private String authorizationKey;

    @JsonProperty
    private Integer speed;

    @JsonProperty
    private SpeedUnit speedUnit;

    @JsonProperty
    private String redundancyType;

    @JsonProperty
    private String redundancyGroup;

    @JsonProperty
    private String sellerRegion;

    @JsonProperty
    private String sellerMetroCode;

    @JsonProperty
    private String sellerMetroDescription;

    @JsonProperty
    private String sellerServiceName;

    @JsonProperty
    private String sellerServiceUUID;

    @JsonProperty
    private String sellerOrganizationName;

    @JsonProperty( value = "zSidePortName")
    private String zsidePortName;

    @JsonProperty( value = "zSidePortUUID")
    private String zsidePortUUID;

    @JsonIgnore
    private String zsidePortIbx;

    @JsonProperty( value = "zSideVlanCTag")
    private Integer zsideVlanCTag;

    @JsonProperty( value = "zSideVlanSTag")
    private Integer zsideVlanSTag;

    @JsonProperty( value = "remote")
    private Boolean remote;

    @JsonProperty( value = "private")
    private Boolean privateProfile;

    @JsonProperty( value = "self")
    private Boolean self;

    @JsonProperty
    private List<String> notifications;

    @JsonProperty
    private String purchaseOrderNumber;

    @JsonProperty
    private String namedTag;

    @JsonProperty
    private String manualCTag; // seller c tag

    @JsonProperty
    private String sTag;

    @JsonProperty
    private List<AdditionalInfo> additionalInfo;

    @JsonProperty
    private JsonNode actionDetails;

    @JsonProperty
    private JsonNode metadata;

    @JsonProperty
    private String createdDate;

    @JsonProperty
    private String createdBy;

    @JsonProperty
    private String createdByFullName;

    @JsonProperty
    private String createdByEmail;

    @JsonProperty
    private String lastUpdatedBy;

    @JsonProperty
    private String lastUpdatedDate;

    @JsonProperty
    private String lastUpdatedByFullName;

    @JsonProperty
    private String lastUpdatedByEmail;

    @JsonProperty
    private String deletedBy;

    @JsonProperty
    private String deletedDate;

    @JsonProperty
    private String deletedByEmail;

    @JsonProperty(value = "rejectComment")
    private String comments;

    @JsonProperty( value = "redundantUUID")
    private String redundantUUID;


    @JsonProperty
    private Integer suggestedSecondaryZSideVlanCTag;

    @JsonProperty
    private Integer suggestedPrimaryZSideVlanCTag;

    @JsonIgnore
    private String globalCustId;

    public void setSpeedUnit(String speedUnit) {
        if (speedUnit.equalsIgnoreCase(SpeedUnit.GB.getUnit())) this.speedUnit = SpeedUnit.GB;
        if (speedUnit.equalsIgnoreCase(SpeedUnit.MB.getUnit())) this.speedUnit = SpeedUnit.MB;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    @AllArgsConstructor
    @Data
    public static class AdditionalInfo {
        private String name;
        private String value;
    }

    public enum SpeedUnit {
        MB("MB"), GB("GB");

        @Getter
        private String unit;

        SpeedUnit(String unit) {
            this.unit = unit;
        }
    }


}
