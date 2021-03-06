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
import io.swagger.client.model.ModelsIncident;
import io.swagger.client.model.ModelsMember;
import java.io.IOException;

/**
 * ModelsComment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsComment {
  @SerializedName("author")
  private ModelsMember author = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("incident")
  private ModelsIncident incident = null;

  public ModelsComment author(ModelsMember author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public ModelsMember getAuthor() {
    return author;
  }

  public void setAuthor(ModelsMember author) {
    this.author = author;
  }

  public ModelsComment content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ModelsComment created(Long created) {
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

  public ModelsComment id(Long id) {
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

  public ModelsComment incident(ModelsIncident incident) {
    this.incident = incident;
    return this;
  }

   /**
   * Get incident
   * @return incident
  **/
  @ApiModelProperty(value = "")
  public ModelsIncident getIncident() {
    return incident;
  }

  public void setIncident(ModelsIncident incident) {
    this.incident = incident;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsComment modelsComment = (ModelsComment) o;
    return Objects.equals(this.author, modelsComment.author) &&
        Objects.equals(this.content, modelsComment.content) &&
        Objects.equals(this.created, modelsComment.created) &&
        Objects.equals(this.id, modelsComment.id) &&
        Objects.equals(this.incident, modelsComment.incident);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, created, id, incident);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsComment {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incident: ").append(toIndentedString(incident)).append("\n");
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

