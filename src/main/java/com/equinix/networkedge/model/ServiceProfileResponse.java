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
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public @Data
class ServiceProfileResponse {

    private static final long serialVersionUID = 1L;

    private String uuid;

    @JsonIgnore
    private String globalCustId;

    private String name;

    private String authKeyLabel;

    private String connectionNameLabel;

    private Boolean requiredRedundancy;

    @JsonProperty("private")
    private Boolean privateProfile;

    private List<String> privateUserEmails;

    private Boolean allowCustomSpeed;

    private List<SpeedBand> speedBands;

    private String description;

    private List<AdditionalBuyerInfo> additionalBuyerInfo;

    private List<ServiceMetro> metros;

    private String createdDate;

    private String createdBy;

    private String lastUpdatedDate;

    private String lastUpdatedBy;

    private Boolean vlanSameAsPrimary;

    private TagTypeENUM tagType;

    private String ctagLabel;

    private List<String> namedTags;

    private Boolean apiAvailable;

    private EnabledFeatures enabledFeatures;

    private Boolean selfProfile;

    private Boolean speedFromAPI;

    private String profileEncapsulation;
    private String authorizationKey;

    private List<PortDetail> ports;

    private String globalOrganization;

    private String organizationName;

}
