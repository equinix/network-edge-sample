/*
 * Network Edge APIs
 * API Documentation for NE's Beta APIs. More information about Network Edge marketplace & NE platform can be found [here](https://ecxfabric-documentation.equinix.com/hc/en-us/articles/360021809172-Enterprise-Network-Edge-Beta-Program-Introduction).
 *
 * OpenAPI spec version: General Availability
 * Contact: Network-Edge-Support@equinix.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.equinix.networkedge.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.equinix.networkedge.model.ConnectionList;

/**
 * ConnectionList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class ConnectionList {
  @SerializedName("interfaceUuid")
  private String interfaceUuid = null;

  @SerializedName("isPrimary")
  private Boolean isPrimary = null;

  @SerializedName("metro")
  private String metro = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("redundantConnection")
  private ConnectionList redundantConnection = null;

  @SerializedName("redundantUuid")
  private String redundantUuid = null;

  @SerializedName("sellerOrganizationName")
  private String sellerOrganizationName = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("uuid")
  private String uuid = null;

  public ConnectionList interfaceUuid(String interfaceUuid) {
    this.interfaceUuid = interfaceUuid;
    return this;
  }

   /**
   * Get interfaceUuid
   * @return interfaceUuid
  **/
  @ApiModelProperty(value = "")
  public String getInterfaceUuid() {
    return interfaceUuid;
  }

  public void setInterfaceUuid(String interfaceUuid) {
    this.interfaceUuid = interfaceUuid;
  }

  public ConnectionList isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public ConnectionList metro(String metro) {
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @ApiModelProperty(value = "")
  public String getMetro() {
    return metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public ConnectionList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionList redundantConnection(ConnectionList redundantConnection) {
    this.redundantConnection = redundantConnection;
    return this;
  }

   /**
   * Get redundantConnection
   * @return redundantConnection
  **/
  @ApiModelProperty(value = "")
  public ConnectionList getRedundantConnection() {
    return redundantConnection;
  }

  public void setRedundantConnection(ConnectionList redundantConnection) {
    this.redundantConnection = redundantConnection;
  }

  public ConnectionList redundantUuid(String redundantUuid) {
    this.redundantUuid = redundantUuid;
    return this;
  }

   /**
   * Get redundantUuid
   * @return redundantUuid
  **/
  @ApiModelProperty(value = "")
  public String getRedundantUuid() {
    return redundantUuid;
  }

  public void setRedundantUuid(String redundantUuid) {
    this.redundantUuid = redundantUuid;
  }

  public ConnectionList sellerOrganizationName(String sellerOrganizationName) {
    this.sellerOrganizationName = sellerOrganizationName;
    return this;
  }

   /**
   * Get sellerOrganizationName
   * @return sellerOrganizationName
  **/
  @ApiModelProperty(value = "")
  public String getSellerOrganizationName() {
    return sellerOrganizationName;
  }

  public void setSellerOrganizationName(String sellerOrganizationName) {
    this.sellerOrganizationName = sellerOrganizationName;
  }

  public ConnectionList state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ConnectionList status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConnectionList uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionList connectionList = (ConnectionList) o;
    return Objects.equals(this.interfaceUuid, connectionList.interfaceUuid) &&
        Objects.equals(this.isPrimary, connectionList.isPrimary) &&
        Objects.equals(this.metro, connectionList.metro) &&
        Objects.equals(this.name, connectionList.name) &&
        Objects.equals(this.redundantConnection, connectionList.redundantConnection) &&
        Objects.equals(this.redundantUuid, connectionList.redundantUuid) &&
        Objects.equals(this.sellerOrganizationName, connectionList.sellerOrganizationName) &&
        Objects.equals(this.state, connectionList.state) &&
        Objects.equals(this.status, connectionList.status) &&
        Objects.equals(this.uuid, connectionList.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceUuid, isPrimary, metro, name, redundantConnection, redundantUuid, sellerOrganizationName, state, status, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionList {\n");
    
    sb.append("    interfaceUuid: ").append(toIndentedString(interfaceUuid)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redundantConnection: ").append(toIndentedString(redundantConnection)).append("\n");
    sb.append("    redundantUuid: ").append(toIndentedString(redundantUuid)).append("\n");
    sb.append("    sellerOrganizationName: ").append(toIndentedString(sellerOrganizationName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
