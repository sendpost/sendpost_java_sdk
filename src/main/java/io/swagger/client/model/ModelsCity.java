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
 * ModelsCity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:27:02.903Z")



public class ModelsCity {
  @SerializedName("cityID")
  private Integer cityID = null;

  @SerializedName("continentCode")
  private String continentCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("timeZone")
  private String timeZone = null;

  public ModelsCity cityID(Integer cityID) {
    this.cityID = cityID;
    return this;
  }

   /**
   * Get cityID
   * @return cityID
  **/
  @ApiModelProperty(value = "")
  public Integer getCityID() {
    return cityID;
  }

  public void setCityID(Integer cityID) {
    this.cityID = cityID;
  }

  public ModelsCity continentCode(String continentCode) {
    this.continentCode = continentCode;
    return this;
  }

   /**
   * Get continentCode
   * @return continentCode
  **/
  @ApiModelProperty(value = "")
  public String getContinentCode() {
    return continentCode;
  }

  public void setContinentCode(String continentCode) {
    this.continentCode = continentCode;
  }

  public ModelsCity countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ModelsCity postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ModelsCity timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCity modelsCity = (ModelsCity) o;
    return Objects.equals(this.cityID, modelsCity.cityID) &&
        Objects.equals(this.continentCode, modelsCity.continentCode) &&
        Objects.equals(this.countryCode, modelsCity.countryCode) &&
        Objects.equals(this.postalCode, modelsCity.postalCode) &&
        Objects.equals(this.timeZone, modelsCity.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityID, continentCode, countryCode, postalCode, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCity {\n");
    
    sb.append("    cityID: ").append(toIndentedString(cityID)).append("\n");
    sb.append("    continentCode: ").append(toIndentedString(continentCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

