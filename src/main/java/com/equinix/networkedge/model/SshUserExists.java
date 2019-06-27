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

/**
 * SshUserExists
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class SshUserExists {
  @SerializedName("metroCode")
  private String metroCode = null;

  @SerializedName("sshUsername")
  private String sshUsername = null;

  public SshUserExists metroCode(String metroCode) {
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Get metroCode
   * @return metroCode
  **/
  @ApiModelProperty(example = "SV", value = "")
  public String getMetroCode() {
    return metroCode;
  }

  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }

  public SshUserExists sshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Get sshUsername
   * @return sshUsername
  **/
  @ApiModelProperty(example = "cust0001_DC", value = "")
  public String getSshUsername() {
    return sshUsername;
  }

  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshUserExists sshUserExists = (SshUserExists) o;
    return Objects.equals(this.metroCode, sshUserExists.metroCode) &&
        Objects.equals(this.sshUsername, sshUserExists.sshUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metroCode, sshUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshUserExists {\n");
    
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
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
