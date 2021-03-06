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
import io.swagger.client.model.ModelsBackOffConfiguration;
import io.swagger.client.model.ModelsBackOffTrigger;
import java.io.IOException;

/**
 * ModelsIIP
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsIIP {
  @SerializedName("backOffConfiguration")
  private ModelsBackOffConfiguration backOffConfiguration = null;

  @SerializedName("backOffTrigger")
  private ModelsBackOffTrigger backOffTrigger = null;

  @SerializedName("maxConcurrentConnections")
  private Long maxConcurrentConnections = null;

  @SerializedName("maxSendPerDay")
  private Long maxSendPerDay = null;

  @SerializedName("maxSendPerHour")
  private Long maxSendPerHour = null;

  @SerializedName("maxSendPerMinute")
  private Long maxSendPerMinute = null;

  @SerializedName("name")
  private String name = null;

  public ModelsIIP backOffConfiguration(ModelsBackOffConfiguration backOffConfiguration) {
    this.backOffConfiguration = backOffConfiguration;
    return this;
  }

   /**
   * Get backOffConfiguration
   * @return backOffConfiguration
  **/
  @ApiModelProperty(value = "")
  public ModelsBackOffConfiguration getBackOffConfiguration() {
    return backOffConfiguration;
  }

  public void setBackOffConfiguration(ModelsBackOffConfiguration backOffConfiguration) {
    this.backOffConfiguration = backOffConfiguration;
  }

  public ModelsIIP backOffTrigger(ModelsBackOffTrigger backOffTrigger) {
    this.backOffTrigger = backOffTrigger;
    return this;
  }

   /**
   * Get backOffTrigger
   * @return backOffTrigger
  **/
  @ApiModelProperty(value = "")
  public ModelsBackOffTrigger getBackOffTrigger() {
    return backOffTrigger;
  }

  public void setBackOffTrigger(ModelsBackOffTrigger backOffTrigger) {
    this.backOffTrigger = backOffTrigger;
  }

  public ModelsIIP maxConcurrentConnections(Long maxConcurrentConnections) {
    this.maxConcurrentConnections = maxConcurrentConnections;
    return this;
  }

   /**
   * Get maxConcurrentConnections
   * @return maxConcurrentConnections
  **/
  @ApiModelProperty(value = "")
  public Long getMaxConcurrentConnections() {
    return maxConcurrentConnections;
  }

  public void setMaxConcurrentConnections(Long maxConcurrentConnections) {
    this.maxConcurrentConnections = maxConcurrentConnections;
  }

  public ModelsIIP maxSendPerDay(Long maxSendPerDay) {
    this.maxSendPerDay = maxSendPerDay;
    return this;
  }

   /**
   * Get maxSendPerDay
   * @return maxSendPerDay
  **/
  @ApiModelProperty(value = "")
  public Long getMaxSendPerDay() {
    return maxSendPerDay;
  }

  public void setMaxSendPerDay(Long maxSendPerDay) {
    this.maxSendPerDay = maxSendPerDay;
  }

  public ModelsIIP maxSendPerHour(Long maxSendPerHour) {
    this.maxSendPerHour = maxSendPerHour;
    return this;
  }

   /**
   * Get maxSendPerHour
   * @return maxSendPerHour
  **/
  @ApiModelProperty(value = "")
  public Long getMaxSendPerHour() {
    return maxSendPerHour;
  }

  public void setMaxSendPerHour(Long maxSendPerHour) {
    this.maxSendPerHour = maxSendPerHour;
  }

  public ModelsIIP maxSendPerMinute(Long maxSendPerMinute) {
    this.maxSendPerMinute = maxSendPerMinute;
    return this;
  }

   /**
   * Get maxSendPerMinute
   * @return maxSendPerMinute
  **/
  @ApiModelProperty(value = "")
  public Long getMaxSendPerMinute() {
    return maxSendPerMinute;
  }

  public void setMaxSendPerMinute(Long maxSendPerMinute) {
    this.maxSendPerMinute = maxSendPerMinute;
  }

  public ModelsIIP name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsIIP modelsIIP = (ModelsIIP) o;
    return Objects.equals(this.backOffConfiguration, modelsIIP.backOffConfiguration) &&
        Objects.equals(this.backOffTrigger, modelsIIP.backOffTrigger) &&
        Objects.equals(this.maxConcurrentConnections, modelsIIP.maxConcurrentConnections) &&
        Objects.equals(this.maxSendPerDay, modelsIIP.maxSendPerDay) &&
        Objects.equals(this.maxSendPerHour, modelsIIP.maxSendPerHour) &&
        Objects.equals(this.maxSendPerMinute, modelsIIP.maxSendPerMinute) &&
        Objects.equals(this.name, modelsIIP.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backOffConfiguration, backOffTrigger, maxConcurrentConnections, maxSendPerDay, maxSendPerHour, maxSendPerMinute, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsIIP {\n");
    
    sb.append("    backOffConfiguration: ").append(toIndentedString(backOffConfiguration)).append("\n");
    sb.append("    backOffTrigger: ").append(toIndentedString(backOffTrigger)).append("\n");
    sb.append("    maxConcurrentConnections: ").append(toIndentedString(maxConcurrentConnections)).append("\n");
    sb.append("    maxSendPerDay: ").append(toIndentedString(maxSendPerDay)).append("\n");
    sb.append("    maxSendPerHour: ").append(toIndentedString(maxSendPerHour)).append("\n");
    sb.append("    maxSendPerMinute: ").append(toIndentedString(maxSendPerMinute)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

