/*
 * SendPost API
 * SendPost API to send transactional emails reliably
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hello@sendx.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModelsEInvitation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:08:13.160Z")



public class ModelsEInvitation {
  @SerializedName("fromEmail")
  private String fromEmail = null;

  @SerializedName("toEmail")
  private String toEmail = null;

  public ModelsEInvitation fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Get fromEmail
   * @return fromEmail
  **/
  @ApiModelProperty(value = "")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public ModelsEInvitation toEmail(String toEmail) {
    this.toEmail = toEmail;
    return this;
  }

   /**
   * Get toEmail
   * @return toEmail
  **/
  @ApiModelProperty(value = "")
  public String getToEmail() {
    return toEmail;
  }

  public void setToEmail(String toEmail) {
    this.toEmail = toEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEInvitation modelsEInvitation = (ModelsEInvitation) o;
    return Objects.equals(this.fromEmail, modelsEInvitation.fromEmail) &&
        Objects.equals(this.toEmail, modelsEInvitation.toEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromEmail, toEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEInvitation {\n");
    
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    toEmail: ").append(toIndentedString(toEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

