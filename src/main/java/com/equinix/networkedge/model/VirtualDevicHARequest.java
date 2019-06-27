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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VirtualDevicHARequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class VirtualDevicHARequest {
  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("accountReferenceId")
  private String accountReferenceId = null;

  @SerializedName("additionalBandwidth")
  private Integer additionalBandwidth = null;

  @SerializedName("licenseFileId")
  private String licenseFileId = null;

  @SerializedName("licenseToken")
  private String licenseToken = null;

  @SerializedName("metroCode")
  private String metroCode = null;

  /**
   * Gets or Sets notifications
   */
  @JsonAdapter(NotificationsEnum.Adapter.class)
  public enum NotificationsEnum {
    TEST1_EXAMPLE_COM("test1@example.com"),
    
    TEST2_EXAMPLE_COM("test2@example.com");

    private String value;

    NotificationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationsEnum fromValue(String text) {
      for (NotificationsEnum b : NotificationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotificationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotificationsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("notifications")
  private List<NotificationsEnum> notifications = new ArrayList<NotificationsEnum>();

  /**
   * Gets or Sets sshAcl
   */
  @JsonAdapter(SshAclEnum.Adapter.class)
  public enum SshAclEnum {
    _192_168_1_1_29("192.168.1.1/29"),
    
    _10_10_25_1_24("10.10.25.1/24");

    private String value;

    SshAclEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SshAclEnum fromValue(String text) {
      for (SshAclEnum b : SshAclEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SshAclEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SshAclEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SshAclEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SshAclEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sshAcl")
  private List<SshAclEnum> sshAcl = null;

  @SerializedName("sshUsers")
  private List<SshUserOperationRequest> sshUsers = null;

  @SerializedName("virtualDeviceName")
  private String virtualDeviceName = null;

  @SerializedName("siteId")
  private String siteId = null;

  @SerializedName("systemIpAddress")
  private String systemIpAddress = null;

  public VirtualDevicHARequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "10478398", value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public VirtualDevicHARequest accountReferenceId(String accountReferenceId) {
    this.accountReferenceId = accountReferenceId;
    return this;
  }

   /**
   * Get accountReferenceId
   * @return accountReferenceId
  **/
  @ApiModelProperty(example = "209805", value = "")
  public String getAccountReferenceId() {
    return accountReferenceId;
  }

  public void setAccountReferenceId(String accountReferenceId) {
    this.accountReferenceId = accountReferenceId;
  }

  public VirtualDevicHARequest additionalBandwidth(Integer additionalBandwidth) {
    this.additionalBandwidth = additionalBandwidth;
    return this;
  }

   /**
   * Secondary additional bandwidth to be configured (in Mbps for HA). Default bandwidth provided is 15 Mbps.
   * @return additionalBandwidth
  **/
  @ApiModelProperty(example = "100", value = "Secondary additional bandwidth to be configured (in Mbps for HA). Default bandwidth provided is 15 Mbps.")
  public Integer getAdditionalBandwidth() {
    return additionalBandwidth;
  }

  public void setAdditionalBandwidth(Integer additionalBandwidth) {
    this.additionalBandwidth = additionalBandwidth;
  }

  public VirtualDevicHARequest licenseFileId(String licenseFileId) {
    this.licenseFileId = licenseFileId;
    return this;
  }

   /**
   * Get licenseFileId
   * @return licenseFileId
  **/
  @ApiModelProperty(example = "d6e21e0c-86dd-11e8-adc0-fa7ae01bbebc", value = "")
  public String getLicenseFileId() {
    return licenseFileId;
  }

  public void setLicenseFileId(String licenseFileId) {
    this.licenseFileId = licenseFileId;
  }

  public VirtualDevicHARequest licenseToken(String licenseToken) {
    this.licenseToken = licenseToken;
    return this;
  }

   /**
   * Get licenseToken
   * @return licenseToken
  **/
  @ApiModelProperty(example = "V74191621", value = "")
  public String getLicenseToken() {
    return licenseToken;
  }

  public void setLicenseToken(String licenseToken) {
    this.licenseToken = licenseToken;
  }

  public VirtualDevicHARequest metroCode(String metroCode) {
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Get metroCode
   * @return metroCode
  **/
  @ApiModelProperty(example = "SV", required = true, value = "")
  public String getMetroCode() {
    return metroCode;
  }

  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }

  public VirtualDevicHARequest notifications(List<NotificationsEnum> notifications) {
    this.notifications = notifications;
    return this;
  }

  public VirtualDevicHARequest addNotificationsItem(NotificationsEnum notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "")
  public List<NotificationsEnum> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationsEnum> notifications) {
    this.notifications = notifications;
  }

  public VirtualDevicHARequest sshAcl(List<SshAclEnum> sshAcl) {
    this.sshAcl = sshAcl;
    return this;
  }

  public VirtualDevicHARequest addSshAclItem(SshAclEnum sshAclItem) {
    if (this.sshAcl == null) {
      this.sshAcl = new ArrayList<SshAclEnum>();
    }
    this.sshAcl.add(sshAclItem);
    return this;
  }

   /**
   * Get sshAcl
   * @return sshAcl
  **/
  @ApiModelProperty(value = "")
  public List<SshAclEnum> getSshAcl() {
    return sshAcl;
  }

  public void setSshAcl(List<SshAclEnum> sshAcl) {
    this.sshAcl = sshAcl;
  }

  public VirtualDevicHARequest sshUsers(List<SshUserOperationRequest> sshUsers) {
    this.sshUsers = sshUsers;
    return this;
  }

  public VirtualDevicHARequest addSshUsersItem(SshUserOperationRequest sshUsersItem) {
    if (this.sshUsers == null) {
      this.sshUsers = new ArrayList<SshUserOperationRequest>();
    }
    this.sshUsers.add(sshUsersItem);
    return this;
  }

   /**
   * Get sshUsers
   * @return sshUsers
  **/
  @ApiModelProperty(value = "")
  public List<SshUserOperationRequest> getSshUsers() {
    return sshUsers;
  }

  public void setSshUsers(List<SshUserOperationRequest> sshUsers) {
    this.sshUsers = sshUsers;
  }

  public VirtualDevicHARequest virtualDeviceName(String virtualDeviceName) {
    this.virtualDeviceName = virtualDeviceName;
    return this;
  }

   /**
   * Virtual Device Name
   * @return virtualDeviceName
  **/
  @ApiModelProperty(example = "Router1-csr1000v", required = true, value = "Virtual Device Name")
  public String getVirtualDeviceName() {
    return virtualDeviceName;
  }

  public void setVirtualDeviceName(String virtualDeviceName) {
    this.virtualDeviceName = virtualDeviceName;
  }

  public VirtualDevicHARequest siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(example = "12345", value = "")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public VirtualDevicHARequest systemIpAddress(String systemIpAddress) {
    this.systemIpAddress = systemIpAddress;
    return this;
  }

   /**
   * Get systemIpAddress
   * @return systemIpAddress
  **/
  @ApiModelProperty(example = "192.168.2.5", value = "")
  public String getSystemIpAddress() {
    return systemIpAddress;
  }

  public void setSystemIpAddress(String systemIpAddress) {
    this.systemIpAddress = systemIpAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualDevicHARequest virtualDevicHARequest = (VirtualDevicHARequest) o;
    return Objects.equals(this.accountNumber, virtualDevicHARequest.accountNumber) &&
        Objects.equals(this.accountReferenceId, virtualDevicHARequest.accountReferenceId) &&
        Objects.equals(this.additionalBandwidth, virtualDevicHARequest.additionalBandwidth) &&
        Objects.equals(this.licenseFileId, virtualDevicHARequest.licenseFileId) &&
        Objects.equals(this.licenseToken, virtualDevicHARequest.licenseToken) &&
        Objects.equals(this.metroCode, virtualDevicHARequest.metroCode) &&
        Objects.equals(this.notifications, virtualDevicHARequest.notifications) &&
        Objects.equals(this.sshAcl, virtualDevicHARequest.sshAcl) &&
        Objects.equals(this.sshUsers, virtualDevicHARequest.sshUsers) &&
        Objects.equals(this.virtualDeviceName, virtualDevicHARequest.virtualDeviceName) &&
        Objects.equals(this.siteId, virtualDevicHARequest.siteId) &&
        Objects.equals(this.systemIpAddress, virtualDevicHARequest.systemIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountReferenceId, additionalBandwidth, licenseFileId, licenseToken, metroCode, notifications, sshAcl, sshUsers, virtualDeviceName, siteId, systemIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualDevicHARequest {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountReferenceId: ").append(toIndentedString(accountReferenceId)).append("\n");
    sb.append("    additionalBandwidth: ").append(toIndentedString(additionalBandwidth)).append("\n");
    sb.append("    licenseFileId: ").append(toIndentedString(licenseFileId)).append("\n");
    sb.append("    licenseToken: ").append(toIndentedString(licenseToken)).append("\n");
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    sshAcl: ").append(toIndentedString(sshAcl)).append("\n");
    sb.append("    sshUsers: ").append(toIndentedString(sshUsers)).append("\n");
    sb.append("    virtualDeviceName: ").append(toIndentedString(virtualDeviceName)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    systemIpAddress: ").append(toIndentedString(systemIpAddress)).append("\n");
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
