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
package com.equinix.networkedge;

import com.equinix.networkedge.config.ApiConfiguration;
import com.equinix.networkedge.model.*;
import com.equinix.networkedge.model.HttpRequest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

import static com.equinix.networkedge.config.URIType.*;


public class APIHandler {

    private ApiConfiguration properties = new ApiConfiguration();

    private RestTemplate restTemplate = new RestTemplate();

    public APIHandler() {
    }

    public Oauth2TokenResponse getOauth2AccessToken(HttpHeaders headers, Oauth2TokenRequest request) throws APIException {

        String url = properties.getUri() + OAUTH.path();
        final HttpEntity<Oauth2TokenRequest> entity = new HttpEntity<Oauth2TokenRequest>(request, headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        Object[] args = new String[]{};
        try {
            ResponseEntity<Oauth2TokenResponse> metroResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
                    Oauth2TokenResponse.class, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(1000, e.getMessage());
        }
    }

    public List<Metro> getAllMetros(Oauth2TokenResponse oauthToken) throws APIException {

        String url = properties.getUri() + METRO.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{};
        try {
            ResponseEntity<List<Metro>> metroResponse = restTemplate.exchange(url, HttpMethod.GET, entity, new
                    ParameterizedTypeReference<List<Metro>>() {
                    }, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(2000, e.getMessage());
        }
    }

    public List<PortsResponse> getPorts(Oauth2TokenResponse oauthToken) throws APIException {

        String url = properties.getUri() + USERPORT.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{};
        try {
            ResponseEntity<List<PortsResponse>> metroResponse = restTemplate.exchange(url, HttpMethod.GET, entity,
                    new ParameterizedTypeReference<List<PortsResponse>>() {
                    }, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(3000, e.getMessage());
        }

    }

    public List<BuyerConnectionResponse> getAllConnections(Oauth2TokenResponse oauthToken) throws
            APIException {

        String url = properties.getUri() + BUYER_CONNECTIONS.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{};
        try {
            ResponseEntity<BuyerResponse> buyerResponse = restTemplate.exchange(url, HttpMethod.GET, entity,
                    BuyerResponse.class, args);
            return buyerResponse.getBody().getContent();
        } catch (Exception e) {
            throw new APIException(4000, e.getMessage());
        }
    }

    public List<ValidateResponse> validateAuthKey(Oauth2TokenResponse oauthToken, ValidateRequest request) throws
            APIException {

        String url = properties.getUri() + VALIDATE_AUTHKEY.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{};
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("authorizationKey", request.getAuthorizationkey())
                .queryParam("profileId", request.getProfileId())
                .queryParam("region", request.getRegion())
                .queryParam("metroCode", request.getMetroCode());
        try {
            ResponseEntity<List<ValidateResponse>> validateResponse = restTemplate.exchange(builder.toUriString(),
                    HttpMethod.GET, entity, new ParameterizedTypeReference<List<ValidateResponse>>() {
                    }, args);
            return validateResponse.getBody();
        } catch (Exception e) {
            throw new APIException(5000, e.getMessage());
        }
    }

    public ConnectionResponse createConnection(Oauth2TokenResponse oauthToken, ConnectionRequest request) throws
            APIException {

        String url = properties.getUri() + CONNECTIONS.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{};
        try {
            ResponseEntity<ConnectionResponse> metroResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
                    ConnectionResponse.class, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(6000, e.getMessage());
        }
    }

    public ConnectionResponse deleteConnection(Oauth2TokenResponse oauthToken, String connId) throws APIException {

        String url = properties.getUri() + CRUD_CONNECTIONS.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{connId};
        try {
            ResponseEntity<ConnectionResponse> metroResponse = restTemplate.exchange(url, HttpMethod.DELETE, entity,
                    ConnectionResponse.class, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(7000, e.getMessage());
        }
    }

    public ConnectionResponse updateConnection(Oauth2TokenResponse oauthToken, String connId) throws APIException {

        String url = properties.getUri() + CRUD_CONNECTIONS.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{connId};
        try {
            ResponseEntity<ConnectionResponse> metroResponse = restTemplate.exchange(url, HttpMethod.PATCH, entity,
                    ConnectionResponse.class, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(7000, e.getMessage());
        }
    }

    public BuyerConnectionResponse getConnection(Oauth2TokenResponse oauthToken, String connId) throws APIException {

        String url = properties.getUri() + CRUD_CONNECTIONS.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{connId};
        try {
            ResponseEntity<BuyerConnectionResponse> metroResponse = restTemplate.exchange(url, HttpMethod.GET, entity,
                    BuyerConnectionResponse.class, args);
            return metroResponse.getBody();
        } catch (Exception e) {
            throw new APIException(7000, e.getMessage());
        }
    }


    public Object getSellerProfile(Oauth2TokenResponse oauthToken, HttpRequest httpRequest,
                                   String uuid) throws APIException {
        String url = properties.getUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        final HttpEntity entity = new HttpEntity(headers);
        Object[] args = new String[]{uuid};
        if (httpRequest != null) {
            url = url + SELLER_PROFILES.path();
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                    .queryParam("page", httpRequest.getPageNumber())
                    .queryParam("metroCode", String.join(",", httpRequest.getMetroCode()))
                    .queryParam("total", httpRequest.getPageSize());
            url = builder.toUriString();
            try {
                ResponseEntity<SellerReponse> metroResponse = restTemplate.exchange(url, HttpMethod.GET,
                        entity, SellerReponse.class, args);
                return metroResponse.getBody().getContent();
            } catch (Exception e) {
                throw new APIException(8000, e.getMessage());
            }

        } else if(uuid != null) {
            url = url + SELLER_PROFILES_BY_UUID.path();
            try {
                ResponseEntity<ServiceProfileResponse> metroResponse = restTemplate.exchange(url, HttpMethod.GET,
                        entity, ServiceProfileResponse.class, args);
                return metroResponse.getBody();
            } catch (Exception e) {
                throw new APIException(8000, e.getMessage());
            }
        }else{
            url = url + SELLER_PROFILES.path();
            try {
                ResponseEntity<SellerReponse> metroResponse = restTemplate.exchange(url, HttpMethod.GET,
                        entity, SellerReponse.class, args);
                return metroResponse.getBody().getContent();
            } catch (Exception e) {
                throw new APIException(8000, e.getMessage());
            }
        }

    }

    public BuyerPreferenceResponse getBuyerPreferences(Oauth2TokenResponse oauthToken, BuyerPreferenceRequest
            request, HttpMethod method)
            throws APIException {
        String url = properties.getUri() + BUYER_PREFERENCES.path();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", ApiConfiguration.BEARER + oauthToken.getAccess_token());
        Object[] args = new String[]{};
        ResponseEntity<BuyerPreferenceResponse> buyerPrefs = null;
        try {
            if (request == null) {
                buyerPrefs = restTemplate.exchange(url, method,
                        new HttpEntity(headers), BuyerPreferenceResponse.class, args);
            } else {
                buyerPrefs = restTemplate.exchange(url, method,
                        new HttpEntity<BuyerPreferenceRequest>(request, headers), BuyerPreferenceResponse.class, args);
            }
            return buyerPrefs.getBody();
        } catch (Exception e) {
            throw new APIException(9000, e.getMessage());
        }
    }
}
