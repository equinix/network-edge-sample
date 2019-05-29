package com.equinix.networkedge.examples;

import com.equinix.networkedge.APIException;
import com.equinix.networkedge.APIHandler;
import com.equinix.networkedge.Util;
import com.equinix.networkedge.model.BuyerConnectionResponse;
import com.equinix.networkedge.model.ConnectionRequest;
import com.equinix.networkedge.model.ConnectionResponse;
import com.equinix.networkedge.model.Oauth2TokenResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * This example will trigger a Api call to get all connections for specific Access token/user,
 *  create connection, delete connection and update connection using connection Id.
 * @author aanchala 7/13/2018
 **/
public class BuyerConnectionsExample {

    private static Oauth2TokenResponse oauthToken;
    APIHandler handler = new APIHandler();

    public static void main(String[] args) {
        BuyerConnectionsExample buyerConnections = new BuyerConnectionsExample();
        String connId = null;
        try {
            oauthToken = Util.createToken();
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("OAuth Error Response is " + ex.getMessage());
        }
        buyerConnections.getAllConnections(oauthToken);
        buyerConnections.getConnection(oauthToken, connId);
        ConnectionResponse connectionResponse = buyerConnections.createConnection(oauthToken);
        buyerConnections.deleteConnection(oauthToken, connectionResponse.getPrimaryConnectionId());
        //buyerConnections.updateConnection(oauthToken, connId);
    }

    private void getAllConnections(Oauth2TokenResponse oauthToken) {
        try {
            List<BuyerConnectionResponse> buyerConnectionResponses = handler.getAllConnections(oauthToken);
            System.out.println("Get All Response is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString
                            (buyerConnectionResponses));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get All Connections Error Response " + e.getMessage());
        }
    }

    private ConnectionResponse createConnection(Oauth2TokenResponse oauthToken) {
        ConnectionResponse connectionResponse = new ConnectionResponse();
        try {
            ConnectionRequest request = populateRequest();
            connectionResponse = handler.createConnection(oauthToken, request);
            System.out.println("Create Connection  Response is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString
                            (connectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Create Connection Error Response " + e.getMessage());
        }
        return connectionResponse;
    }

    private void deleteConnection(Oauth2TokenResponse oauthToken, String connId) {
        try {

            ConnectionResponse connectionResponse = handler.deleteConnection(oauthToken, connId);
            System.out.println("Delete Connection  is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (connectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Delete Connection Error Response " + e.getMessage());
        }
    }

    private void getConnection(Oauth2TokenResponse oauthToken, String connId) {
        try {
            BuyerConnectionResponse connectionResponse = handler.getConnection(oauthToken, connId);
            System.out.println("Get Connection  is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (connectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get Connection Error Response " + e.getMessage());
        }
    }


    private void updateConnection(Oauth2TokenResponse oauthToken, String connId) {
        try {
            ConnectionResponse connectionResponse = handler.updateConnection(oauthToken, connId);
            System.out.println("Update Connection is :: \n " + Util.mapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (connectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update Connection Error Response " + e.getMessage());
        }
    }


    private ConnectionRequest populateRequest() {

        ConnectionRequest request = new ConnectionRequest();
        request.setPrimaryName("Sample Connection primary");
        request.setPrimaryPortUUID("");
        request.setPrimaryVlanCTag(45);
        request.setProfileUUID("");
        request.setAuthorizationKey("");
        request.setSpeed(50);
        request.setSpeedUnit(ConnectionRequest.SpeedUnit.MB);
        List<String> emails = new ArrayList<String>();
        emails.add("test@test.com");
        request.setNotifications(emails);
        request.setPurchaseOrderNumber("PO");
        request.setSellerRegion("");
        request.setSellerMetroCode("");
        request.setNamedTag("private");

        return request;
    }
}

