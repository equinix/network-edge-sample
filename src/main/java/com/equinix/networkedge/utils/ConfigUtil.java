package com.equinix.networkedge.utils;

import com.equinix.networkedge.model.OAuthRequest;
import com.equinix.networkedge.model.OAuthResponse;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Base64;
import java.util.Properties;
import java.io.*;

public class ConfigUtil {

    public static String get(String key) {
        Properties prop = new Properties();
        try {
            //load a properties file from class path.
            prop.load(ConfigUtil.class.getClassLoader().getResourceAsStream("api-configuration.properties"));
        } catch (IOException e) {
            e.printStackTrace();    //For Now ;)
        }

        return prop.getProperty(key);
    }

    public static HttpResponse<String> postRequest(String url, String body) {
        HttpResponse<String> response = null;
        try {
            response = Unirest.post(url)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .body(body).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static HttpResponse<String> getRequest(String url, String body) {
        HttpResponse<String> response = null;
        try {
            response = Unirest.post(url)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .body(body).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static OAuthRequest createOAuthRequest() {
        //  Generate OAuth2 Access Token.
        OAuthRequest oathReq = new OAuthRequest();
        try {
            oathReq.clientId(get("ne.client.access.client.id"));
            oathReq.clientSecret(get("ne.client.access.client.secret"));
            oathReq.grantType(get("ne.client.access.client.granttype"));
            oathReq.userName(get("ne.client.access.client.username"));
            String password = new String(Base64.getDecoder().decode(get("ne.client.access.client.base64.password")), "UTF-8");
            oathReq.userPassword(password);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return oathReq;
    }

    public static String getAuthToken() {

        String hostname = get("ne.url.hostname");
        String urlOAuth2 = hostname + get("ne.url.auth");
        String urlDevice = hostname + get("ne.url.device");
        OAuthRequest oathReq = createOAuthRequest();
        Gson gson = new Gson();
        OAuthResponse authResponse = null;

        HttpResponse<String> response = null;
        try {
            response = Unirest.post(urlOAuth2)
                    .header("Content-Type", get("ne.client.http.body.contenttype"))
                    .body(gson.toJson(oathReq)).asString();
             authResponse = gson.fromJson(response.getBody(), OAuthResponse.class);

        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return authResponse.getAccessToken();
    }
}
