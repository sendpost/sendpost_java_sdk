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
import io.swagger.client.model.ModelsAlertLabel;
import java.io.IOException;

/**
 * ModelsDetailedAlert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T07:50:19.455Z")



public class ModelsDetailedAlert {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("entityValue")
  private String entityValue = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("label")
  private ModelsAlertLabel label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parameter")
  private Long parameter = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("threshold")
  private String threshold = null;

  public ModelsDetailedAlert active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ModelsDetailedAlert entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ModelsDetailedAlert entityValue(String entityValue) {
    this.entityValue = entityValue;
    return this;
  }

   /**
   * Get entityValue
   * @return entityValue
  **/
  @ApiModelProperty(value = "")
  public String getEntityValue() {
    return entityValue;
  }

  public void setEntityValue(String entityValue) {
    this.entityValue = entityValue;
  }

  public ModelsDetailedAlert id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ModelsDetailedAlert label(ModelsAlertLabel label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public ModelsAlertLabel getLabel() {
    return label;
  }

  public void setLabel(ModelsAlertLabel label) {
    this.label = label;
  }

  public ModelsDetailedAlert name(String name) {
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

  public ModelsDetailedAlert parameter(Long parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @ApiModelProperty(value = "")
  public Long getParameter() {
    return parameter;
  }

  public void setParameter(Long parameter) {
    this.parameter = parameter;
  }

  public ModelsDetailedAlert provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ModelsDetailedAlert threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsDetailedAlert modelsDetailedAlert = (ModelsDetailedAlert) o;
    return Objects.equals(this.active, modelsDetailedAlert.active) &&
        Objects.equals(this.entityType, modelsDetailedAlert.entityType) &&
        Objects.equals(this.entityValue, modelsDetailedAlert.entityValue) &&
        Objects.equals(this.id, modelsDetailedAlert.id) &&
        Objects.equals(this.label, modelsDetailedAlert.label) &&
        Objects.equals(this.name, modelsDetailedAlert.name) &&
        Objects.equals(this.parameter, modelsDetailedAlert.parameter) &&
        Objects.equals(this.provider, modelsDetailedAlert.provider) &&
        Objects.equals(this.threshold, modelsDetailedAlert.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, entityType, entityValue, id, label, name, parameter, provider, threshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDetailedAlert {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityValue: ").append(toIndentedString(entityValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

