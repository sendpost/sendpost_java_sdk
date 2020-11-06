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
import java.util.ArrayList;
import java.util.List;

/**
 * ModelsIntegrationSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:08:13.160Z")



public class ModelsIntegrationSettings {
  @SerializedName("autoEnableMonitoring")
  private Boolean autoEnableMonitoring = null;

  @SerializedName("emailTo")
  private List<String> emailTo = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("receiveReports")
  private Boolean receiveReports = null;

  public ModelsIntegrationSettings autoEnableMonitoring(Boolean autoEnableMonitoring) {
    this.autoEnableMonitoring = autoEnableMonitoring;
    return this;
  }

   /**
   * Get autoEnableMonitoring
   * @return autoEnableMonitoring
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoEnableMonitoring() {
    return autoEnableMonitoring;
  }

  public void setAutoEnableMonitoring(Boolean autoEnableMonitoring) {
    this.autoEnableMonitoring = autoEnableMonitoring;
  }

  public ModelsIntegrationSettings emailTo(List<String> emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  public ModelsIntegrationSettings addEmailToItem(String emailToItem) {
    if (this.emailTo == null) {
      this.emailTo = new ArrayList<String>();
    }
    this.emailTo.add(emailToItem);
    return this;
  }

   /**
   * Get emailTo
   * @return emailTo
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(List<String> emailTo) {
    this.emailTo = emailTo;
  }

  public ModelsIntegrationSettings frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public ModelsIntegrationSettings receiveReports(Boolean receiveReports) {
    this.receiveReports = receiveReports;
    return this;
  }

   /**
   * Get receiveReports
   * @return receiveReports
  **/
  @ApiModelProperty(value = "")
  public Boolean isReceiveReports() {
    return receiveReports;
  }

  public void setReceiveReports(Boolean receiveReports) {
    this.receiveReports = receiveReports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsIntegrationSettings modelsIntegrationSettings = (ModelsIntegrationSettings) o;
    return Objects.equals(this.autoEnableMonitoring, modelsIntegrationSettings.autoEnableMonitoring) &&
        Objects.equals(this.emailTo, modelsIntegrationSettings.emailTo) &&
        Objects.equals(this.frequency, modelsIntegrationSettings.frequency) &&
        Objects.equals(this.receiveReports, modelsIntegrationSettings.receiveReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoEnableMonitoring, emailTo, frequency, receiveReports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsIntegrationSettings {\n");
    
    sb.append("    autoEnableMonitoring: ").append(toIndentedString(autoEnableMonitoring)).append("\n");
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    receiveReports: ").append(toIndentedString(receiveReports)).append("\n");
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

