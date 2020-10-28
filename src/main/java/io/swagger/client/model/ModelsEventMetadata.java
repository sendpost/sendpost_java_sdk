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
import io.swagger.client.model.ModelsCity;
import io.swagger.client.model.UaparserDevice;
import io.swagger.client.model.UaparserOs;
import io.swagger.client.model.UaparserUserAgent;
import java.io.IOException;

/**
 * ModelsEventMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T07:50:19.455Z")



public class ModelsEventMetadata {
  @SerializedName("clickedURL")
  private String clickedURL = null;

  @SerializedName("device")
  private UaparserDevice device = null;

  @SerializedName("geo")
  private ModelsCity geo = null;

  @SerializedName("os")
  private UaparserOs os = null;

  @SerializedName("smtpCode")
  private Long smtpCode = null;

  @SerializedName("smtpDescription")
  private String smtpDescription = null;

  @SerializedName("userAgent")
  private UaparserUserAgent userAgent = null;

  public ModelsEventMetadata clickedURL(String clickedURL) {
    this.clickedURL = clickedURL;
    return this;
  }

   /**
   * Get clickedURL
   * @return clickedURL
  **/
  @ApiModelProperty(value = "")
  public String getClickedURL() {
    return clickedURL;
  }

  public void setClickedURL(String clickedURL) {
    this.clickedURL = clickedURL;
  }

  public ModelsEventMetadata device(UaparserDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")
  public UaparserDevice getDevice() {
    return device;
  }

  public void setDevice(UaparserDevice device) {
    this.device = device;
  }

  public ModelsEventMetadata geo(ModelsCity geo) {
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @ApiModelProperty(value = "")
  public ModelsCity getGeo() {
    return geo;
  }

  public void setGeo(ModelsCity geo) {
    this.geo = geo;
  }

  public ModelsEventMetadata os(UaparserOs os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @ApiModelProperty(value = "")
  public UaparserOs getOs() {
    return os;
  }

  public void setOs(UaparserOs os) {
    this.os = os;
  }

  public ModelsEventMetadata smtpCode(Long smtpCode) {
    this.smtpCode = smtpCode;
    return this;
  }

   /**
   * Get smtpCode
   * @return smtpCode
  **/
  @ApiModelProperty(value = "")
  public Long getSmtpCode() {
    return smtpCode;
  }

  public void setSmtpCode(Long smtpCode) {
    this.smtpCode = smtpCode;
  }

  public ModelsEventMetadata smtpDescription(String smtpDescription) {
    this.smtpDescription = smtpDescription;
    return this;
  }

   /**
   * Get smtpDescription
   * @return smtpDescription
  **/
  @ApiModelProperty(value = "")
  public String getSmtpDescription() {
    return smtpDescription;
  }

  public void setSmtpDescription(String smtpDescription) {
    this.smtpDescription = smtpDescription;
  }

  public ModelsEventMetadata userAgent(UaparserUserAgent userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @ApiModelProperty(value = "")
  public UaparserUserAgent getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(UaparserUserAgent userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEventMetadata modelsEventMetadata = (ModelsEventMetadata) o;
    return Objects.equals(this.clickedURL, modelsEventMetadata.clickedURL) &&
        Objects.equals(this.device, modelsEventMetadata.device) &&
        Objects.equals(this.geo, modelsEventMetadata.geo) &&
        Objects.equals(this.os, modelsEventMetadata.os) &&
        Objects.equals(this.smtpCode, modelsEventMetadata.smtpCode) &&
        Objects.equals(this.smtpDescription, modelsEventMetadata.smtpDescription) &&
        Objects.equals(this.userAgent, modelsEventMetadata.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickedURL, device, geo, os, smtpCode, smtpDescription, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEventMetadata {\n");
    
    sb.append("    clickedURL: ").append(toIndentedString(clickedURL)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    smtpCode: ").append(toIndentedString(smtpCode)).append("\n");
    sb.append("    smtpDescription: ").append(toIndentedString(smtpDescription)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
