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
import io.swagger.client.model.ModelsIPType;
import io.swagger.client.model.ModelsSystemDomain;
import java.io.IOException;

/**
 * ModelsIP
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsIP {
  @SerializedName("aolSettings")
  private String aolSettings = null;

  @SerializedName("autoWarmupEnabled")
  private Boolean autoWarmupEnabled = null;

  @SerializedName("autoWarmupStage")
  private Long autoWarmupStage = null;

  @SerializedName("comcastSettings")
  private String comcastSettings = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("defaultSettings")
  private String defaultSettings = null;

  @SerializedName("gmailSettings")
  private String gmailSettings = null;

  @SerializedName("gmxSettings")
  private String gmxSettings = null;

  @SerializedName("icloudSettings")
  private String icloudSettings = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mailruSettings")
  private String mailruSettings = null;

  @SerializedName("microsoftSettings")
  private String microsoftSettings = null;

  @SerializedName("publicIP")
  private String publicIP = null;

  @SerializedName("qqSettings")
  private String qqSettings = null;

  @SerializedName("reverseDNSHostname")
  private String reverseDNSHostname = null;

  @SerializedName("systemDomain")
  private ModelsSystemDomain systemDomain = null;

  @SerializedName("type")
  private ModelsIPType type = null;

  @SerializedName("yahooSettings")
  private String yahooSettings = null;

  @SerializedName("yandexSettings")
  private String yandexSettings = null;

  @SerializedName("zohoSettings")
  private String zohoSettings = null;

  public ModelsIP aolSettings(String aolSettings) {
    this.aolSettings = aolSettings;
    return this;
  }

   /**
   * Get aolSettings
   * @return aolSettings
  **/
  @ApiModelProperty(value = "")
  public String getAolSettings() {
    return aolSettings;
  }

  public void setAolSettings(String aolSettings) {
    this.aolSettings = aolSettings;
  }

  public ModelsIP autoWarmupEnabled(Boolean autoWarmupEnabled) {
    this.autoWarmupEnabled = autoWarmupEnabled;
    return this;
  }

   /**
   * Get autoWarmupEnabled
   * @return autoWarmupEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoWarmupEnabled() {
    return autoWarmupEnabled;
  }

  public void setAutoWarmupEnabled(Boolean autoWarmupEnabled) {
    this.autoWarmupEnabled = autoWarmupEnabled;
  }

  public ModelsIP autoWarmupStage(Long autoWarmupStage) {
    this.autoWarmupStage = autoWarmupStage;
    return this;
  }

   /**
   * Get autoWarmupStage
   * @return autoWarmupStage
  **/
  @ApiModelProperty(value = "")
  public Long getAutoWarmupStage() {
    return autoWarmupStage;
  }

  public void setAutoWarmupStage(Long autoWarmupStage) {
    this.autoWarmupStage = autoWarmupStage;
  }

  public ModelsIP comcastSettings(String comcastSettings) {
    this.comcastSettings = comcastSettings;
    return this;
  }

   /**
   * Get comcastSettings
   * @return comcastSettings
  **/
  @ApiModelProperty(value = "")
  public String getComcastSettings() {
    return comcastSettings;
  }

  public void setComcastSettings(String comcastSettings) {
    this.comcastSettings = comcastSettings;
  }

  public ModelsIP created(Long created) {
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

  public ModelsIP defaultSettings(String defaultSettings) {
    this.defaultSettings = defaultSettings;
    return this;
  }

   /**
   * Get defaultSettings
   * @return defaultSettings
  **/
  @ApiModelProperty(value = "")
  public String getDefaultSettings() {
    return defaultSettings;
  }

  public void setDefaultSettings(String defaultSettings) {
    this.defaultSettings = defaultSettings;
  }

  public ModelsIP gmailSettings(String gmailSettings) {
    this.gmailSettings = gmailSettings;
    return this;
  }

   /**
   * Get gmailSettings
   * @return gmailSettings
  **/
  @ApiModelProperty(value = "")
  public String getGmailSettings() {
    return gmailSettings;
  }

  public void setGmailSettings(String gmailSettings) {
    this.gmailSettings = gmailSettings;
  }

  public ModelsIP gmxSettings(String gmxSettings) {
    this.gmxSettings = gmxSettings;
    return this;
  }

   /**
   * Get gmxSettings
   * @return gmxSettings
  **/
  @ApiModelProperty(value = "")
  public String getGmxSettings() {
    return gmxSettings;
  }

  public void setGmxSettings(String gmxSettings) {
    this.gmxSettings = gmxSettings;
  }

  public ModelsIP icloudSettings(String icloudSettings) {
    this.icloudSettings = icloudSettings;
    return this;
  }

   /**
   * Get icloudSettings
   * @return icloudSettings
  **/
  @ApiModelProperty(value = "")
  public String getIcloudSettings() {
    return icloudSettings;
  }

  public void setIcloudSettings(String icloudSettings) {
    this.icloudSettings = icloudSettings;
  }

  public ModelsIP id(Long id) {
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

  public ModelsIP mailruSettings(String mailruSettings) {
    this.mailruSettings = mailruSettings;
    return this;
  }

   /**
   * Get mailruSettings
   * @return mailruSettings
  **/
  @ApiModelProperty(value = "")
  public String getMailruSettings() {
    return mailruSettings;
  }

  public void setMailruSettings(String mailruSettings) {
    this.mailruSettings = mailruSettings;
  }

  public ModelsIP microsoftSettings(String microsoftSettings) {
    this.microsoftSettings = microsoftSettings;
    return this;
  }

   /**
   * Get microsoftSettings
   * @return microsoftSettings
  **/
  @ApiModelProperty(value = "")
  public String getMicrosoftSettings() {
    return microsoftSettings;
  }

  public void setMicrosoftSettings(String microsoftSettings) {
    this.microsoftSettings = microsoftSettings;
  }

  public ModelsIP publicIP(String publicIP) {
    this.publicIP = publicIP;
    return this;
  }

   /**
   * Get publicIP
   * @return publicIP
  **/
  @ApiModelProperty(value = "")
  public String getPublicIP() {
    return publicIP;
  }

  public void setPublicIP(String publicIP) {
    this.publicIP = publicIP;
  }

  public ModelsIP qqSettings(String qqSettings) {
    this.qqSettings = qqSettings;
    return this;
  }

   /**
   * Get qqSettings
   * @return qqSettings
  **/
  @ApiModelProperty(value = "")
  public String getQqSettings() {
    return qqSettings;
  }

  public void setQqSettings(String qqSettings) {
    this.qqSettings = qqSettings;
  }

  public ModelsIP reverseDNSHostname(String reverseDNSHostname) {
    this.reverseDNSHostname = reverseDNSHostname;
    return this;
  }

   /**
   * Get reverseDNSHostname
   * @return reverseDNSHostname
  **/
  @ApiModelProperty(value = "")
  public String getReverseDNSHostname() {
    return reverseDNSHostname;
  }

  public void setReverseDNSHostname(String reverseDNSHostname) {
    this.reverseDNSHostname = reverseDNSHostname;
  }

  public ModelsIP systemDomain(ModelsSystemDomain systemDomain) {
    this.systemDomain = systemDomain;
    return this;
  }

   /**
   * Get systemDomain
   * @return systemDomain
  **/
  @ApiModelProperty(value = "")
  public ModelsSystemDomain getSystemDomain() {
    return systemDomain;
  }

  public void setSystemDomain(ModelsSystemDomain systemDomain) {
    this.systemDomain = systemDomain;
  }

  public ModelsIP type(ModelsIPType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ModelsIPType getType() {
    return type;
  }

  public void setType(ModelsIPType type) {
    this.type = type;
  }

  public ModelsIP yahooSettings(String yahooSettings) {
    this.yahooSettings = yahooSettings;
    return this;
  }

   /**
   * Get yahooSettings
   * @return yahooSettings
  **/
  @ApiModelProperty(value = "")
  public String getYahooSettings() {
    return yahooSettings;
  }

  public void setYahooSettings(String yahooSettings) {
    this.yahooSettings = yahooSettings;
  }

  public ModelsIP yandexSettings(String yandexSettings) {
    this.yandexSettings = yandexSettings;
    return this;
  }

   /**
   * Get yandexSettings
   * @return yandexSettings
  **/
  @ApiModelProperty(value = "")
  public String getYandexSettings() {
    return yandexSettings;
  }

  public void setYandexSettings(String yandexSettings) {
    this.yandexSettings = yandexSettings;
  }

  public ModelsIP zohoSettings(String zohoSettings) {
    this.zohoSettings = zohoSettings;
    return this;
  }

   /**
   * Get zohoSettings
   * @return zohoSettings
  **/
  @ApiModelProperty(value = "")
  public String getZohoSettings() {
    return zohoSettings;
  }

  public void setZohoSettings(String zohoSettings) {
    this.zohoSettings = zohoSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsIP modelsIP = (ModelsIP) o;
    return Objects.equals(this.aolSettings, modelsIP.aolSettings) &&
        Objects.equals(this.autoWarmupEnabled, modelsIP.autoWarmupEnabled) &&
        Objects.equals(this.autoWarmupStage, modelsIP.autoWarmupStage) &&
        Objects.equals(this.comcastSettings, modelsIP.comcastSettings) &&
        Objects.equals(this.created, modelsIP.created) &&
        Objects.equals(this.defaultSettings, modelsIP.defaultSettings) &&
        Objects.equals(this.gmailSettings, modelsIP.gmailSettings) &&
        Objects.equals(this.gmxSettings, modelsIP.gmxSettings) &&
        Objects.equals(this.icloudSettings, modelsIP.icloudSettings) &&
        Objects.equals(this.id, modelsIP.id) &&
        Objects.equals(this.mailruSettings, modelsIP.mailruSettings) &&
        Objects.equals(this.microsoftSettings, modelsIP.microsoftSettings) &&
        Objects.equals(this.publicIP, modelsIP.publicIP) &&
        Objects.equals(this.qqSettings, modelsIP.qqSettings) &&
        Objects.equals(this.reverseDNSHostname, modelsIP.reverseDNSHostname) &&
        Objects.equals(this.systemDomain, modelsIP.systemDomain) &&
        Objects.equals(this.type, modelsIP.type) &&
        Objects.equals(this.yahooSettings, modelsIP.yahooSettings) &&
        Objects.equals(this.yandexSettings, modelsIP.yandexSettings) &&
        Objects.equals(this.zohoSettings, modelsIP.zohoSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aolSettings, autoWarmupEnabled, autoWarmupStage, comcastSettings, created, defaultSettings, gmailSettings, gmxSettings, icloudSettings, id, mailruSettings, microsoftSettings, publicIP, qqSettings, reverseDNSHostname, systemDomain, type, yahooSettings, yandexSettings, zohoSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsIP {\n");
    
    sb.append("    aolSettings: ").append(toIndentedString(aolSettings)).append("\n");
    sb.append("    autoWarmupEnabled: ").append(toIndentedString(autoWarmupEnabled)).append("\n");
    sb.append("    autoWarmupStage: ").append(toIndentedString(autoWarmupStage)).append("\n");
    sb.append("    comcastSettings: ").append(toIndentedString(comcastSettings)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    defaultSettings: ").append(toIndentedString(defaultSettings)).append("\n");
    sb.append("    gmailSettings: ").append(toIndentedString(gmailSettings)).append("\n");
    sb.append("    gmxSettings: ").append(toIndentedString(gmxSettings)).append("\n");
    sb.append("    icloudSettings: ").append(toIndentedString(icloudSettings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mailruSettings: ").append(toIndentedString(mailruSettings)).append("\n");
    sb.append("    microsoftSettings: ").append(toIndentedString(microsoftSettings)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    qqSettings: ").append(toIndentedString(qqSettings)).append("\n");
    sb.append("    reverseDNSHostname: ").append(toIndentedString(reverseDNSHostname)).append("\n");
    sb.append("    systemDomain: ").append(toIndentedString(systemDomain)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yahooSettings: ").append(toIndentedString(yahooSettings)).append("\n");
    sb.append("    yandexSettings: ").append(toIndentedString(yandexSettings)).append("\n");
    sb.append("    zohoSettings: ").append(toIndentedString(zohoSettings)).append("\n");
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

