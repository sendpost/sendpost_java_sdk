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
 * UaparserUserAgent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:08:13.160Z")



public class UaparserUserAgent {
  @SerializedName("Family")
  private String family = null;

  @SerializedName("Major")
  private String major = null;

  @SerializedName("Minor")
  private String minor = null;

  @SerializedName("Patch")
  private String patch = null;

  public UaparserUserAgent family(String family) {
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @ApiModelProperty(value = "")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public UaparserUserAgent major(String major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(value = "")
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public UaparserUserAgent minor(String minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(value = "")
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public UaparserUserAgent patch(String patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @ApiModelProperty(value = "")
  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UaparserUserAgent uaparserUserAgent = (UaparserUserAgent) o;
    return Objects.equals(this.family, uaparserUserAgent.family) &&
        Objects.equals(this.major, uaparserUserAgent.major) &&
        Objects.equals(this.minor, uaparserUserAgent.minor) &&
        Objects.equals(this.patch, uaparserUserAgent.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, major, minor, patch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UaparserUserAgent {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

