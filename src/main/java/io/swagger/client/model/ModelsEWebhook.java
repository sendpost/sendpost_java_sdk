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
 * ModelsEWebhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:27:02.903Z")



public class ModelsEWebhook {
  @SerializedName("clicked")
  private Boolean clicked = null;

  @SerializedName("delivered")
  private Boolean delivered = null;

  @SerializedName("dropped")
  private Boolean dropped = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("hardBounced")
  private Boolean hardBounced = null;

  @SerializedName("opened")
  private Boolean opened = null;

  @SerializedName("processed")
  private Boolean processed = null;

  @SerializedName("softBounced")
  private Boolean softBounced = null;

  @SerializedName("spam")
  private Boolean spam = null;

  @SerializedName("unsubscribed")
  private Boolean unsubscribed = null;

  @SerializedName("url")
  private String url = null;

  public ModelsEWebhook clicked(Boolean clicked) {
    this.clicked = clicked;
    return this;
  }

   /**
   * Get clicked
   * @return clicked
  **/
  @ApiModelProperty(value = "")
  public Boolean isClicked() {
    return clicked;
  }

  public void setClicked(Boolean clicked) {
    this.clicked = clicked;
  }

  public ModelsEWebhook delivered(Boolean delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @ApiModelProperty(value = "")
  public Boolean isDelivered() {
    return delivered;
  }

  public void setDelivered(Boolean delivered) {
    this.delivered = delivered;
  }

  public ModelsEWebhook dropped(Boolean dropped) {
    this.dropped = dropped;
    return this;
  }

   /**
   * Get dropped
   * @return dropped
  **/
  @ApiModelProperty(value = "")
  public Boolean isDropped() {
    return dropped;
  }

  public void setDropped(Boolean dropped) {
    this.dropped = dropped;
  }

  public ModelsEWebhook enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ModelsEWebhook hardBounced(Boolean hardBounced) {
    this.hardBounced = hardBounced;
    return this;
  }

   /**
   * Get hardBounced
   * @return hardBounced
  **/
  @ApiModelProperty(value = "")
  public Boolean isHardBounced() {
    return hardBounced;
  }

  public void setHardBounced(Boolean hardBounced) {
    this.hardBounced = hardBounced;
  }

  public ModelsEWebhook opened(Boolean opened) {
    this.opened = opened;
    return this;
  }

   /**
   * Get opened
   * @return opened
  **/
  @ApiModelProperty(value = "")
  public Boolean isOpened() {
    return opened;
  }

  public void setOpened(Boolean opened) {
    this.opened = opened;
  }

  public ModelsEWebhook processed(Boolean processed) {
    this.processed = processed;
    return this;
  }

   /**
   * Get processed
   * @return processed
  **/
  @ApiModelProperty(value = "")
  public Boolean isProcessed() {
    return processed;
  }

  public void setProcessed(Boolean processed) {
    this.processed = processed;
  }

  public ModelsEWebhook softBounced(Boolean softBounced) {
    this.softBounced = softBounced;
    return this;
  }

   /**
   * Get softBounced
   * @return softBounced
  **/
  @ApiModelProperty(value = "")
  public Boolean isSoftBounced() {
    return softBounced;
  }

  public void setSoftBounced(Boolean softBounced) {
    this.softBounced = softBounced;
  }

  public ModelsEWebhook spam(Boolean spam) {
    this.spam = spam;
    return this;
  }

   /**
   * Get spam
   * @return spam
  **/
  @ApiModelProperty(value = "")
  public Boolean isSpam() {
    return spam;
  }

  public void setSpam(Boolean spam) {
    this.spam = spam;
  }

  public ModelsEWebhook unsubscribed(Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Get unsubscribed
   * @return unsubscribed
  **/
  @ApiModelProperty(value = "")
  public Boolean isUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
  }

  public ModelsEWebhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEWebhook modelsEWebhook = (ModelsEWebhook) o;
    return Objects.equals(this.clicked, modelsEWebhook.clicked) &&
        Objects.equals(this.delivered, modelsEWebhook.delivered) &&
        Objects.equals(this.dropped, modelsEWebhook.dropped) &&
        Objects.equals(this.enabled, modelsEWebhook.enabled) &&
        Objects.equals(this.hardBounced, modelsEWebhook.hardBounced) &&
        Objects.equals(this.opened, modelsEWebhook.opened) &&
        Objects.equals(this.processed, modelsEWebhook.processed) &&
        Objects.equals(this.softBounced, modelsEWebhook.softBounced) &&
        Objects.equals(this.spam, modelsEWebhook.spam) &&
        Objects.equals(this.unsubscribed, modelsEWebhook.unsubscribed) &&
        Objects.equals(this.url, modelsEWebhook.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicked, delivered, dropped, enabled, hardBounced, opened, processed, softBounced, spam, unsubscribed, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEWebhook {\n");
    
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hardBounced: ").append(toIndentedString(hardBounced)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    softBounced: ").append(toIndentedString(softBounced)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

