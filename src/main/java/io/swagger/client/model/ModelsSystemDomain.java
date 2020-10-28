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
import io.swagger.client.model.ModelsSystemDNSRecord;
import java.io.IOException;

/**
 * ModelsSystemDomain
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-28T07:50:19.455Z")



public class ModelsSystemDomain {
  @SerializedName("created")
  private Long created = null;

  @SerializedName("dkim")
  private ModelsSystemDNSRecord dkim = null;

  @SerializedName("dkimConfig")
  private String dkimConfig = null;

  @SerializedName("dkimVerified")
  private Boolean dkimVerified = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mailboxVerified")
  private Boolean mailboxVerified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("spf")
  private ModelsSystemDNSRecord spf = null;

  @SerializedName("spfVerified")
  private Boolean spfVerified = null;

  @SerializedName("track")
  private ModelsSystemDNSRecord track = null;

  @SerializedName("trackVerified")
  private Boolean trackVerified = null;

  public ModelsSystemDomain created(Long created) {
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

  public ModelsSystemDomain dkim(ModelsSystemDNSRecord dkim) {
    this.dkim = dkim;
    return this;
  }

   /**
   * Get dkim
   * @return dkim
  **/
  @ApiModelProperty(value = "")
  public ModelsSystemDNSRecord getDkim() {
    return dkim;
  }

  public void setDkim(ModelsSystemDNSRecord dkim) {
    this.dkim = dkim;
  }

  public ModelsSystemDomain dkimConfig(String dkimConfig) {
    this.dkimConfig = dkimConfig;
    return this;
  }

   /**
   * Get dkimConfig
   * @return dkimConfig
  **/
  @ApiModelProperty(value = "")
  public String getDkimConfig() {
    return dkimConfig;
  }

  public void setDkimConfig(String dkimConfig) {
    this.dkimConfig = dkimConfig;
  }

  public ModelsSystemDomain dkimVerified(Boolean dkimVerified) {
    this.dkimVerified = dkimVerified;
    return this;
  }

   /**
   * Get dkimVerified
   * @return dkimVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean isDkimVerified() {
    return dkimVerified;
  }

  public void setDkimVerified(Boolean dkimVerified) {
    this.dkimVerified = dkimVerified;
  }

  public ModelsSystemDomain id(Long id) {
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

  public ModelsSystemDomain mailboxVerified(Boolean mailboxVerified) {
    this.mailboxVerified = mailboxVerified;
    return this;
  }

   /**
   * Get mailboxVerified
   * @return mailboxVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean isMailboxVerified() {
    return mailboxVerified;
  }

  public void setMailboxVerified(Boolean mailboxVerified) {
    this.mailboxVerified = mailboxVerified;
  }

  public ModelsSystemDomain name(String name) {
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

  public ModelsSystemDomain spf(ModelsSystemDNSRecord spf) {
    this.spf = spf;
    return this;
  }

   /**
   * Get spf
   * @return spf
  **/
  @ApiModelProperty(value = "")
  public ModelsSystemDNSRecord getSpf() {
    return spf;
  }

  public void setSpf(ModelsSystemDNSRecord spf) {
    this.spf = spf;
  }

  public ModelsSystemDomain spfVerified(Boolean spfVerified) {
    this.spfVerified = spfVerified;
    return this;
  }

   /**
   * Get spfVerified
   * @return spfVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean isSpfVerified() {
    return spfVerified;
  }

  public void setSpfVerified(Boolean spfVerified) {
    this.spfVerified = spfVerified;
  }

  public ModelsSystemDomain track(ModelsSystemDNSRecord track) {
    this.track = track;
    return this;
  }

   /**
   * Get track
   * @return track
  **/
  @ApiModelProperty(value = "")
  public ModelsSystemDNSRecord getTrack() {
    return track;
  }

  public void setTrack(ModelsSystemDNSRecord track) {
    this.track = track;
  }

  public ModelsSystemDomain trackVerified(Boolean trackVerified) {
    this.trackVerified = trackVerified;
    return this;
  }

   /**
   * Get trackVerified
   * @return trackVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean isTrackVerified() {
    return trackVerified;
  }

  public void setTrackVerified(Boolean trackVerified) {
    this.trackVerified = trackVerified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSystemDomain modelsSystemDomain = (ModelsSystemDomain) o;
    return Objects.equals(this.created, modelsSystemDomain.created) &&
        Objects.equals(this.dkim, modelsSystemDomain.dkim) &&
        Objects.equals(this.dkimConfig, modelsSystemDomain.dkimConfig) &&
        Objects.equals(this.dkimVerified, modelsSystemDomain.dkimVerified) &&
        Objects.equals(this.id, modelsSystemDomain.id) &&
        Objects.equals(this.mailboxVerified, modelsSystemDomain.mailboxVerified) &&
        Objects.equals(this.name, modelsSystemDomain.name) &&
        Objects.equals(this.spf, modelsSystemDomain.spf) &&
        Objects.equals(this.spfVerified, modelsSystemDomain.spfVerified) &&
        Objects.equals(this.track, modelsSystemDomain.track) &&
        Objects.equals(this.trackVerified, modelsSystemDomain.trackVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, dkim, dkimConfig, dkimVerified, id, mailboxVerified, name, spf, spfVerified, track, trackVerified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSystemDomain {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dkim: ").append(toIndentedString(dkim)).append("\n");
    sb.append("    dkimConfig: ").append(toIndentedString(dkimConfig)).append("\n");
    sb.append("    dkimVerified: ").append(toIndentedString(dkimVerified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mailboxVerified: ").append(toIndentedString(mailboxVerified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spf: ").append(toIndentedString(spf)).append("\n");
    sb.append("    spfVerified: ").append(toIndentedString(spfVerified)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    trackVerified: ").append(toIndentedString(trackVerified)).append("\n");
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

