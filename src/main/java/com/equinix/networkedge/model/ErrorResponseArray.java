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

import com.equinix.networkedge.model.ErrorResponse;
import java.util.ArrayList;

/**
 * ErrorResponseArray
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class ErrorResponseArray extends ArrayList<ErrorResponse> {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseArray {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

