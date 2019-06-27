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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SshUserOperationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class SshUserOperationRequest {
  @SerializedName("sshUserUuid")
  private String sshUserUuid = null;

  /**
   * SSH operation to be performed
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CREATE("CREATE"),
    
    DELETE("DELETE"),
    
    REUSE("REUSE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("sshUsername")
  private String sshUsername = null;

  @SerializedName("sshPassword")
  private String sshPassword = null;

  public SshUserOperationRequest sshUserUuid(String sshUserUuid) {
    this.sshUserUuid = sshUserUuid;
    return this;
  }

   /**
   * Required for DELETE operation.
   * @return sshUserUuid
  **/
  @ApiModelProperty(example = "999a3aa2-c49a-dddd-98a6-007424e73777", value = "Required for DELETE operation.")
  public String getSshUserUuid() {
    return sshUserUuid;
  }

  public void setSshUserUuid(String sshUserUuid) {
    this.sshUserUuid = sshUserUuid;
  }

  public SshUserOperationRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * SSH operation to be performed
   * @return action
  **/
  @ApiModelProperty(example = "CREATE", required = true, value = "SSH operation to be performed")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public SshUserOperationRequest sshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * SSH User name
   * @return sshUsername
  **/
  @ApiModelProperty(example = "cust0001_DC", value = "SSH User name")
  public String getSshUsername() {
    return sshUsername;
  }

  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }

  public SshUserOperationRequest sshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * SSH Password
   * @return sshPassword
  **/
  @ApiModelProperty(example = "projPass", value = "SSH Password")
  public String getSshPassword() {
    return sshPassword;
  }

  public void setSshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshUserOperationRequest sshUserOperationRequest = (SshUserOperationRequest) o;
    return Objects.equals(this.sshUserUuid, sshUserOperationRequest.sshUserUuid) &&
        Objects.equals(this.action, sshUserOperationRequest.action) &&
        Objects.equals(this.sshUsername, sshUserOperationRequest.sshUsername) &&
        Objects.equals(this.sshPassword, sshUserOperationRequest.sshPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshUserUuid, action, sshUsername, sshPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshUserOperationRequest {\n");
    
    sb.append("    sshUserUuid: ").append(toIndentedString(sshUserUuid)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
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
