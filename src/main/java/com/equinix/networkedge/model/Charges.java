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
 * Charges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class Charges {
  @SerializedName("description")
  private String description = null;

  @SerializedName("monthlyRecurringCharges")
  private String monthlyRecurringCharges = null;

  public Charges description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the charge, whether it is for the virtual device, the device license, or the additional bandwidth
   * @return description
  **/
  @ApiModelProperty(value = "Description of the charge, whether it is for the virtual device, the device license, or the additional bandwidth")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Charges monthlyRecurringCharges(String monthlyRecurringCharges) {
    this.monthlyRecurringCharges = monthlyRecurringCharges;
    return this;
  }

   /**
   * Monthly charges
   * @return monthlyRecurringCharges
  **/
  @ApiModelProperty(value = "Monthly charges")
  public String getMonthlyRecurringCharges() {
    return monthlyRecurringCharges;
  }

  public void setMonthlyRecurringCharges(String monthlyRecurringCharges) {
    this.monthlyRecurringCharges = monthlyRecurringCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charges charges = (Charges) o;
    return Objects.equals(this.description, charges.description) &&
        Objects.equals(this.monthlyRecurringCharges, charges.monthlyRecurringCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, monthlyRecurringCharges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charges {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monthlyRecurringCharges: ").append(toIndentedString(monthlyRecurringCharges)).append("\n");
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
