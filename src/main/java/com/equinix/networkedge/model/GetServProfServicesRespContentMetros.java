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

import java.util.ArrayList;
import java.util.List;

/**
 * GetServProfServicesRespContentMetros
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class GetServProfServicesRespContentMetros {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ibxs")
  private List<String> ibxs = null;

  @SerializedName("inTrail")
  private Boolean inTrail = null;

  @SerializedName("displayName")
  private String displayName = null;

  public GetServProfServicesRespContentMetros code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "SV", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetServProfServicesRespContentMetros name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Silicon Valley", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetServProfServicesRespContentMetros ibxs(List<String> ibxs) {
    this.ibxs = ibxs;
    return this;
  }

  public GetServProfServicesRespContentMetros addIbxsItem(String ibxsItem) {
    if (this.ibxs == null) {
      this.ibxs = new ArrayList<String>();
    }
    this.ibxs.add(ibxsItem);
    return this;
  }

   /**
   * Get ibxs
   * @return ibxs
  **/
  @ApiModelProperty(value = "")
  public List<String> getIbxs() {
    return ibxs;
  }

  public void setIbxs(List<String> ibxs) {
    this.ibxs = ibxs;
  }

  public GetServProfServicesRespContentMetros inTrail(Boolean inTrail) {
    this.inTrail = inTrail;
    return this;
  }

   /**
   * Get inTrail
   * @return inTrail
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isInTrail() {
    return inTrail;
  }

  public void setInTrail(Boolean inTrail) {
    this.inTrail = inTrail;
  }

  public GetServProfServicesRespContentMetros displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "Silicon Valley", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServProfServicesRespContentMetros getServProfServicesRespContentMetros = (GetServProfServicesRespContentMetros) o;
    return Objects.equals(this.code, getServProfServicesRespContentMetros.code) &&
        Objects.equals(this.name, getServProfServicesRespContentMetros.name) &&
        Objects.equals(this.ibxs, getServProfServicesRespContentMetros.ibxs) &&
        Objects.equals(this.inTrail, getServProfServicesRespContentMetros.inTrail) &&
        Objects.equals(this.displayName, getServProfServicesRespContentMetros.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, ibxs, inTrail, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServProfServicesRespContentMetros {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ibxs: ").append(toIndentedString(ibxs)).append("\n");
    sb.append("    inTrail: ").append(toIndentedString(inTrail)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
