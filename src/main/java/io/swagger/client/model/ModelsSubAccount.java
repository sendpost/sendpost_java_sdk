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
import io.swagger.client.model.ModelsLabel;
import io.swagger.client.model.ModelsSMTPAuth;
import io.swagger.client.model.ModelsSubAccountType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModelsSubAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T07:50:19.455Z")



public class ModelsSubAccount {
  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("labels")
  private List<ModelsLabel> labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("smtpAuths")
  private List<ModelsSMTPAuth> smtpAuths = null;

  @SerializedName("type")
  private ModelsSubAccountType type = null;

  public ModelsSubAccount apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ModelsSubAccount created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ModelsSubAccount id(Long id) {
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

  public ModelsSubAccount labels(List<ModelsLabel> labels) {
    this.labels = labels;
    return this;
  }

  public ModelsSubAccount addLabelsItem(ModelsLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<ModelsLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<ModelsLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<ModelsLabel> labels) {
    this.labels = labels;
  }

  public ModelsSubAccount name(String name) {
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

  public ModelsSubAccount smtpAuths(List<ModelsSMTPAuth> smtpAuths) {
    this.smtpAuths = smtpAuths;
    return this;
  }

  public ModelsSubAccount addSmtpAuthsItem(ModelsSMTPAuth smtpAuthsItem) {
    if (this.smtpAuths == null) {
      this.smtpAuths = new ArrayList<ModelsSMTPAuth>();
    }
    this.smtpAuths.add(smtpAuthsItem);
    return this;
  }

   /**
   * Get smtpAuths
   * @return smtpAuths
  **/
  @ApiModelProperty(value = "")
  public List<ModelsSMTPAuth> getSmtpAuths() {
    return smtpAuths;
  }

  public void setSmtpAuths(List<ModelsSMTPAuth> smtpAuths) {
    this.smtpAuths = smtpAuths;
  }

  public ModelsSubAccount type(ModelsSubAccountType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ModelsSubAccountType getType() {
    return type;
  }

  public void setType(ModelsSubAccountType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSubAccount modelsSubAccount = (ModelsSubAccount) o;
    return Objects.equals(this.apiKey, modelsSubAccount.apiKey) &&
        Objects.equals(this.created, modelsSubAccount.created) &&
        Objects.equals(this.id, modelsSubAccount.id) &&
        Objects.equals(this.labels, modelsSubAccount.labels) &&
        Objects.equals(this.name, modelsSubAccount.name) &&
        Objects.equals(this.smtpAuths, modelsSubAccount.smtpAuths) &&
        Objects.equals(this.type, modelsSubAccount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, created, id, labels, name, smtpAuths, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSubAccount {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smtpAuths: ").append(toIndentedString(smtpAuths)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

