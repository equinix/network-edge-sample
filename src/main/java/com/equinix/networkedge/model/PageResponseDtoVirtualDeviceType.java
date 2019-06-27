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
import com.equinix.networkedge.model.VirtualDeviceType;

import java.util.ArrayList;
import java.util.List;

/**
 * PageResponseDtoVirtualDeviceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class PageResponseDtoVirtualDeviceType {
  @SerializedName("content")
  private List<VirtualDeviceType> content = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("totalCount")
  private Long totalCount = null;

  public PageResponseDtoVirtualDeviceType content(List<VirtualDeviceType> content) {
    this.content = content;
    return this;
  }

  public PageResponseDtoVirtualDeviceType addContentItem(VirtualDeviceType contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<VirtualDeviceType>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Array of available virtual device types
   * @return content
  **/
  @ApiModelProperty(value = "Array of available virtual device types")
  public List<VirtualDeviceType> getContent() {
    return content;
  }

  public void setContent(List<VirtualDeviceType> content) {
    this.content = content;
  }

  public PageResponseDtoVirtualDeviceType pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PageResponseDtoVirtualDeviceType pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of results on a page
   * @return pageSize
  **/
  @ApiModelProperty(value = "Number of results on a page")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PageResponseDtoVirtualDeviceType totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total count
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total count")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResponseDtoVirtualDeviceType pageResponseDtoVirtualDeviceType = (PageResponseDtoVirtualDeviceType) o;
    return Objects.equals(this.content, pageResponseDtoVirtualDeviceType.content) &&
        Objects.equals(this.pageNumber, pageResponseDtoVirtualDeviceType.pageNumber) &&
        Objects.equals(this.pageSize, pageResponseDtoVirtualDeviceType.pageSize) &&
        Objects.equals(this.totalCount, pageResponseDtoVirtualDeviceType.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResponseDtoVirtualDeviceType {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

