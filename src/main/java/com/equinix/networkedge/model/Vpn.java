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
import com.equinix.networkedge.model.VpnRequest;

/**
 * Vpn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class Vpn {
  @SerializedName("siteName")
  private String siteName = null;

  @SerializedName("virtualDeviceUUID")
  private String virtualDeviceUUID = null;

  @SerializedName("configName")
  private String configName = null;

  @SerializedName("peerIp")
  private String peerIp = null;

  @SerializedName("peerSharedKey")
  private String peerSharedKey = null;

  @SerializedName("remoteAsn")
  private Long remoteAsn = null;

  @SerializedName("remoteIpAddress")
  private String remoteIpAddress = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("localAsn")
  private Long localAsn = null;

  @SerializedName("tunnelIp")
  private String tunnelIp = null;

  @SerializedName("secondary")
  private VpnRequest secondary = null;

  public Vpn siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(example = "Chicago", required = true, value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public Vpn virtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
    return this;
  }

   /**
   * Primary Virtual Device UUID
   * @return virtualDeviceUUID
  **/
  @ApiModelProperty(example = "f79eead8-b837-41d3-9095-9b15c2c4996d", required = true, value = "Primary Virtual Device UUID")
  public String getVirtualDeviceUUID() {
    return virtualDeviceUUID;
  }

  public void setVirtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
  }

  public Vpn configName(String configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @ApiModelProperty(example = "Traffic from AWS cloud", value = "")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public Vpn peerIp(String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

   /**
   * Get peerIp
   * @return peerIp
  **/
  @ApiModelProperty(example = "110.11.12.222", required = true, value = "")
  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public Vpn peerSharedKey(String peerSharedKey) {
    this.peerSharedKey = peerSharedKey;
    return this;
  }

   /**
   * Get peerSharedKey
   * @return peerSharedKey
  **/
  @ApiModelProperty(example = "5bb2424e888bd", required = true, value = "")
  public String getPeerSharedKey() {
    return peerSharedKey;
  }

  public void setPeerSharedKey(String peerSharedKey) {
    this.peerSharedKey = peerSharedKey;
  }

  public Vpn remoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
    return this;
  }

   /**
   * Remote Customer ASN - Customer side
   * @return remoteAsn
  **/
  @ApiModelProperty(example = "65413", required = true, value = "Remote Customer ASN - Customer side")
  public Long getRemoteAsn() {
    return remoteAsn;
  }

  public void setRemoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
  }

  public Vpn remoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
    return this;
  }

   /**
   * Remote Customer IP Address - Customer side
   * @return remoteIpAddress
  **/
  @ApiModelProperty(example = "100.210.1.31", required = true, value = "Remote Customer IP Address - Customer side")
  public String getRemoteIpAddress() {
    return remoteIpAddress;
  }

  public void setRemoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
  }

  public Vpn password(String password) {
    this.password = password;
    return this;
  }

   /**
   * BGP Password
   * @return password
  **/
  @ApiModelProperty(example = "pass123", required = true, value = "BGP Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Vpn localAsn(Long localAsn) {
    this.localAsn = localAsn;
    return this;
  }

   /**
   * Local ASN - Equinix side
   * @return localAsn
  **/
  @ApiModelProperty(example = "65414", value = "Local ASN - Equinix side")
  public Long getLocalAsn() {
    return localAsn;
  }

  public void setLocalAsn(Long localAsn) {
    this.localAsn = localAsn;
  }

  public Vpn tunnelIp(String tunnelIp) {
    this.tunnelIp = tunnelIp;
    return this;
  }

   /**
   * Local Tunnel IP Address in CIDR format
   * @return tunnelIp
  **/
  @ApiModelProperty(example = "192.168.7.2/30", required = true, value = "Local Tunnel IP Address in CIDR format")
  public String getTunnelIp() {
    return tunnelIp;
  }

  public void setTunnelIp(String tunnelIp) {
    this.tunnelIp = tunnelIp;
  }

  public Vpn secondary(VpnRequest secondary) {
    this.secondary = secondary;
    return this;
  }

   /**
   * Secondary VPN details. Required if VPN is for a HA enabled device.
   * @return secondary
  **/
  @ApiModelProperty(value = "Secondary VPN details. Required if VPN is for a HA enabled device.")
  public VpnRequest getSecondary() {
    return secondary;
  }

  public void setSecondary(VpnRequest secondary) {
    this.secondary = secondary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vpn vpn = (Vpn) o;
    return Objects.equals(this.siteName, vpn.siteName) &&
        Objects.equals(this.virtualDeviceUUID, vpn.virtualDeviceUUID) &&
        Objects.equals(this.configName, vpn.configName) &&
        Objects.equals(this.peerIp, vpn.peerIp) &&
        Objects.equals(this.peerSharedKey, vpn.peerSharedKey) &&
        Objects.equals(this.remoteAsn, vpn.remoteAsn) &&
        Objects.equals(this.remoteIpAddress, vpn.remoteIpAddress) &&
        Objects.equals(this.password, vpn.password) &&
        Objects.equals(this.localAsn, vpn.localAsn) &&
        Objects.equals(this.tunnelIp, vpn.tunnelIp) &&
        Objects.equals(this.secondary, vpn.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteName, virtualDeviceUUID, configName, peerIp, peerSharedKey, remoteAsn, remoteIpAddress, password, localAsn, tunnelIp, secondary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vpn {\n");
    
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    virtualDeviceUUID: ").append(toIndentedString(virtualDeviceUUID)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    peerSharedKey: ").append(toIndentedString(peerSharedKey)).append("\n");
    sb.append("    remoteAsn: ").append(toIndentedString(remoteAsn)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    localAsn: ").append(toIndentedString(localAsn)).append("\n");
    sb.append("    tunnelIp: ").append(toIndentedString(tunnelIp)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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
