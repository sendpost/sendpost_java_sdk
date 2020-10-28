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
import io.swagger.client.model.ModelsSingleCleanedMail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModelsCleanedList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T07:50:19.455Z")



public class ModelsCleanedList {
  @SerializedName("detailedResponse")
  private List<ModelsSingleCleanedMail> detailedResponse = null;

  @SerializedName("invalid")
  private Object invalid = null;

  @SerializedName("valid")
  private Object valid = null;

  public ModelsCleanedList detailedResponse(List<ModelsSingleCleanedMail> detailedResponse) {
    this.detailedResponse = detailedResponse;
    return this;
  }

  public ModelsCleanedList addDetailedResponseItem(ModelsSingleCleanedMail detailedResponseItem) {
    if (this.detailedResponse == null) {
      this.detailedResponse = new ArrayList<ModelsSingleCleanedMail>();
    }
    this.detailedResponse.add(detailedResponseItem);
    return this;
  }

   /**
   * Get detailedResponse
   * @return detailedResponse
  **/
  @ApiModelProperty(value = "")
  public List<ModelsSingleCleanedMail> getDetailedResponse() {
    return detailedResponse;
  }

  public void setDetailedResponse(List<ModelsSingleCleanedMail> detailedResponse) {
    this.detailedResponse = detailedResponse;
  }

  public ModelsCleanedList invalid(Object invalid) {
    this.invalid = invalid;
    return this;
  }

   /**
   * Get invalid
   * @return invalid
  **/
  @ApiModelProperty(value = "")
  public Object getInvalid() {
    return invalid;
  }

  public void setInvalid(Object invalid) {
    this.invalid = invalid;
  }

  public ModelsCleanedList valid(Object valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")
  public Object getValid() {
    return valid;
  }

  public void setValid(Object valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCleanedList modelsCleanedList = (ModelsCleanedList) o;
    return Objects.equals(this.detailedResponse, modelsCleanedList.detailedResponse) &&
        Objects.equals(this.invalid, modelsCleanedList.invalid) &&
        Objects.equals(this.valid, modelsCleanedList.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedResponse, invalid, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCleanedList {\n");
    
    sb.append("    detailedResponse: ").append(toIndentedString(detailedResponse)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

