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
 * ModelsAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsAccount {
  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("currentEmailServiceProvider")
  private String currentEmailServiceProvider = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("isCanceled")
  private Boolean isCanceled = null;

  @SerializedName("isLastPaymentFailed")
  private Boolean isLastPaymentFailed = null;

  @SerializedName("isUpgraded")
  private Boolean isUpgraded = null;

  @SerializedName("lockThreshold")
  private Long lockThreshold = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("onboardCFinished")
  private Boolean onboardCFinished = null;

  @SerializedName("onboardQAnswered")
  private Boolean onboardQAnswered = null;

  @SerializedName("sendingVolumePerMonth")
  private String sendingVolumePerMonth = null;

  @SerializedName("url")
  private String url = null;

  public ModelsAccount apiKey(String apiKey) {
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

  public ModelsAccount created(Long created) {
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

  public ModelsAccount currentEmailServiceProvider(String currentEmailServiceProvider) {
    this.currentEmailServiceProvider = currentEmailServiceProvider;
    return this;
  }

   /**
   * Get currentEmailServiceProvider
   * @return currentEmailServiceProvider
  **/
  @ApiModelProperty(value = "")
  public String getCurrentEmailServiceProvider() {
    return currentEmailServiceProvider;
  }

  public void setCurrentEmailServiceProvider(String currentEmailServiceProvider) {
    this.currentEmailServiceProvider = currentEmailServiceProvider;
  }

  public ModelsAccount id(Long id) {
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

  public ModelsAccount industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @ApiModelProperty(value = "")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public ModelsAccount isCanceled(Boolean isCanceled) {
    this.isCanceled = isCanceled;
    return this;
  }

   /**
   * Get isCanceled
   * @return isCanceled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCanceled() {
    return isCanceled;
  }

  public void setIsCanceled(Boolean isCanceled) {
    this.isCanceled = isCanceled;
  }

  public ModelsAccount isLastPaymentFailed(Boolean isLastPaymentFailed) {
    this.isLastPaymentFailed = isLastPaymentFailed;
    return this;
  }

   /**
   * Get isLastPaymentFailed
   * @return isLastPaymentFailed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLastPaymentFailed() {
    return isLastPaymentFailed;
  }

  public void setIsLastPaymentFailed(Boolean isLastPaymentFailed) {
    this.isLastPaymentFailed = isLastPaymentFailed;
  }

  public ModelsAccount isUpgraded(Boolean isUpgraded) {
    this.isUpgraded = isUpgraded;
    return this;
  }

   /**
   * Get isUpgraded
   * @return isUpgraded
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsUpgraded() {
    return isUpgraded;
  }

  public void setIsUpgraded(Boolean isUpgraded) {
    this.isUpgraded = isUpgraded;
  }

  public ModelsAccount lockThreshold(Long lockThreshold) {
    this.lockThreshold = lockThreshold;
    return this;
  }

   /**
   * Get lockThreshold
   * @return lockThreshold
  **/
  @ApiModelProperty(value = "")
  public Long getLockThreshold() {
    return lockThreshold;
  }

  public void setLockThreshold(Long lockThreshold) {
    this.lockThreshold = lockThreshold;
  }

  public ModelsAccount locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ModelsAccount name(String name) {
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

  public ModelsAccount onboardCFinished(Boolean onboardCFinished) {
    this.onboardCFinished = onboardCFinished;
    return this;
  }

   /**
   * Get onboardCFinished
   * @return onboardCFinished
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnboardCFinished() {
    return onboardCFinished;
  }

  public void setOnboardCFinished(Boolean onboardCFinished) {
    this.onboardCFinished = onboardCFinished;
  }

  public ModelsAccount onboardQAnswered(Boolean onboardQAnswered) {
    this.onboardQAnswered = onboardQAnswered;
    return this;
  }

   /**
   * Get onboardQAnswered
   * @return onboardQAnswered
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnboardQAnswered() {
    return onboardQAnswered;
  }

  public void setOnboardQAnswered(Boolean onboardQAnswered) {
    this.onboardQAnswered = onboardQAnswered;
  }

  public ModelsAccount sendingVolumePerMonth(String sendingVolumePerMonth) {
    this.sendingVolumePerMonth = sendingVolumePerMonth;
    return this;
  }

   /**
   * Get sendingVolumePerMonth
   * @return sendingVolumePerMonth
  **/
  @ApiModelProperty(value = "")
  public String getSendingVolumePerMonth() {
    return sendingVolumePerMonth;
  }

  public void setSendingVolumePerMonth(String sendingVolumePerMonth) {
    this.sendingVolumePerMonth = sendingVolumePerMonth;
  }

  public ModelsAccount url(String url) {
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
    ModelsAccount modelsAccount = (ModelsAccount) o;
    return Objects.equals(this.apiKey, modelsAccount.apiKey) &&
        Objects.equals(this.created, modelsAccount.created) &&
        Objects.equals(this.currentEmailServiceProvider, modelsAccount.currentEmailServiceProvider) &&
        Objects.equals(this.id, modelsAccount.id) &&
        Objects.equals(this.industry, modelsAccount.industry) &&
        Objects.equals(this.isCanceled, modelsAccount.isCanceled) &&
        Objects.equals(this.isLastPaymentFailed, modelsAccount.isLastPaymentFailed) &&
        Objects.equals(this.isUpgraded, modelsAccount.isUpgraded) &&
        Objects.equals(this.lockThreshold, modelsAccount.lockThreshold) &&
        Objects.equals(this.locked, modelsAccount.locked) &&
        Objects.equals(this.name, modelsAccount.name) &&
        Objects.equals(this.onboardCFinished, modelsAccount.onboardCFinished) &&
        Objects.equals(this.onboardQAnswered, modelsAccount.onboardQAnswered) &&
        Objects.equals(this.sendingVolumePerMonth, modelsAccount.sendingVolumePerMonth) &&
        Objects.equals(this.url, modelsAccount.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, created, currentEmailServiceProvider, id, industry, isCanceled, isLastPaymentFailed, isUpgraded, lockThreshold, locked, name, onboardCFinished, onboardQAnswered, sendingVolumePerMonth, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsAccount {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    currentEmailServiceProvider: ").append(toIndentedString(currentEmailServiceProvider)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isCanceled: ").append(toIndentedString(isCanceled)).append("\n");
    sb.append("    isLastPaymentFailed: ").append(toIndentedString(isLastPaymentFailed)).append("\n");
    sb.append("    isUpgraded: ").append(toIndentedString(isUpgraded)).append("\n");
    sb.append("    lockThreshold: ").append(toIndentedString(lockThreshold)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onboardCFinished: ").append(toIndentedString(onboardCFinished)).append("\n");
    sb.append("    onboardQAnswered: ").append(toIndentedString(onboardQAnswered)).append("\n");
    sb.append("    sendingVolumePerMonth: ").append(toIndentedString(sendingVolumePerMonth)).append("\n");
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

