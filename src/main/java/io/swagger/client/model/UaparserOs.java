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
 * UaparserOs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class UaparserOs {
  @SerializedName("Family")
  private String family = null;

  @SerializedName("Major")
  private String major = null;

  @SerializedName("Minor")
  private String minor = null;

  @SerializedName("Patch")
  private String patch = null;

  @SerializedName("PatchMinor")
  private String patchMinor = null;

  public UaparserOs family(String family) {
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

  public UaparserOs major(String major) {
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

  public UaparserOs minor(String minor) {
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

  public UaparserOs patch(String patch) {
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

  public UaparserOs patchMinor(String patchMinor) {
    this.patchMinor = patchMinor;
    return this;
  }

   /**
   * Get patchMinor
   * @return patchMinor
  **/
  @ApiModelProperty(value = "")
  public String getPatchMinor() {
    return patchMinor;
  }

  public void setPatchMinor(String patchMinor) {
    this.patchMinor = patchMinor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UaparserOs uaparserOs = (UaparserOs) o;
    return Objects.equals(this.family, uaparserOs.family) &&
        Objects.equals(this.major, uaparserOs.major) &&
        Objects.equals(this.minor, uaparserOs.minor) &&
        Objects.equals(this.patch, uaparserOs.patch) &&
        Objects.equals(this.patchMinor, uaparserOs.patchMinor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, major, minor, patch, patchMinor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UaparserOs {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    patchMinor: ").append(toIndentedString(patchMinor)).append("\n");
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

