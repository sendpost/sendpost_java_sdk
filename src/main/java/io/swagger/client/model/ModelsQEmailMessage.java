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
import io.swagger.client.model.ModelsFrom;
import io.swagger.client.model.ModelsReplyTo;
import io.swagger.client.model.ModelsTo;
import java.io.IOException;

/**
 * ModelsQEmailMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsQEmailMessage {
  @SerializedName("accountID")
  private Long accountID = null;

  @SerializedName("ampBody")
  private String ampBody = null;

  @SerializedName("customFields")
  private Object customFields = null;

  @SerializedName("emailType")
  private String emailType = null;

  @SerializedName("from")
  private ModelsFrom from = null;

  @SerializedName("groups")
  private Object groups = null;

  @SerializedName("headers")
  private Object headers = null;

  @SerializedName("htmlBody")
  private String htmlBody = null;

  @SerializedName("ipID")
  private Long ipID = null;

  @SerializedName("ipPool")
  private String ipPool = null;

  @SerializedName("localIP")
  private String localIP = null;

  @SerializedName("messageID")
  private String messageID = null;

  @SerializedName("preText")
  private String preText = null;

  @SerializedName("publicIP")
  private String publicIP = null;

  @SerializedName("replyTo")
  private ModelsReplyTo replyTo = null;

  @SerializedName("subAccountID")
  private Long subAccountID = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("submittedAt")
  private Long submittedAt = null;

  @SerializedName("textBody")
  private String textBody = null;

  @SerializedName("to")
  private ModelsTo to = null;

  @SerializedName("trackClicks")
  private Boolean trackClicks = null;

  @SerializedName("trackOpens")
  private Boolean trackOpens = null;

  public ModelsQEmailMessage accountID(Long accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @ApiModelProperty(value = "")
  public Long getAccountID() {
    return accountID;
  }

  public void setAccountID(Long accountID) {
    this.accountID = accountID;
  }

  public ModelsQEmailMessage ampBody(String ampBody) {
    this.ampBody = ampBody;
    return this;
  }

   /**
   * Get ampBody
   * @return ampBody
  **/
  @ApiModelProperty(value = "")
  public String getAmpBody() {
    return ampBody;
  }

  public void setAmpBody(String ampBody) {
    this.ampBody = ampBody;
  }

  public ModelsQEmailMessage customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Object getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }

  public ModelsQEmailMessage emailType(String emailType) {
    this.emailType = emailType;
    return this;
  }

   /**
   * Get emailType
   * @return emailType
  **/
  @ApiModelProperty(value = "")
  public String getEmailType() {
    return emailType;
  }

  public void setEmailType(String emailType) {
    this.emailType = emailType;
  }

  public ModelsQEmailMessage from(ModelsFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public ModelsFrom getFrom() {
    return from;
  }

  public void setFrom(ModelsFrom from) {
    this.from = from;
  }

  public ModelsQEmailMessage groups(Object groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public Object getGroups() {
    return groups;
  }

  public void setGroups(Object groups) {
    this.groups = groups;
  }

  public ModelsQEmailMessage headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  public ModelsQEmailMessage htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * Get htmlBody
   * @return htmlBody
  **/
  @ApiModelProperty(value = "")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public ModelsQEmailMessage ipID(Long ipID) {
    this.ipID = ipID;
    return this;
  }

   /**
   * Get ipID
   * @return ipID
  **/
  @ApiModelProperty(value = "")
  public Long getIpID() {
    return ipID;
  }

  public void setIpID(Long ipID) {
    this.ipID = ipID;
  }

  public ModelsQEmailMessage ipPool(String ipPool) {
    this.ipPool = ipPool;
    return this;
  }

   /**
   * Get ipPool
   * @return ipPool
  **/
  @ApiModelProperty(value = "")
  public String getIpPool() {
    return ipPool;
  }

  public void setIpPool(String ipPool) {
    this.ipPool = ipPool;
  }

  public ModelsQEmailMessage localIP(String localIP) {
    this.localIP = localIP;
    return this;
  }

   /**
   * Get localIP
   * @return localIP
  **/
  @ApiModelProperty(value = "")
  public String getLocalIP() {
    return localIP;
  }

  public void setLocalIP(String localIP) {
    this.localIP = localIP;
  }

  public ModelsQEmailMessage messageID(String messageID) {
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @ApiModelProperty(value = "")
  public String getMessageID() {
    return messageID;
  }

  public void setMessageID(String messageID) {
    this.messageID = messageID;
  }

  public ModelsQEmailMessage preText(String preText) {
    this.preText = preText;
    return this;
  }

   /**
   * Get preText
   * @return preText
  **/
  @ApiModelProperty(value = "")
  public String getPreText() {
    return preText;
  }

  public void setPreText(String preText) {
    this.preText = preText;
  }

  public ModelsQEmailMessage publicIP(String publicIP) {
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

  public ModelsQEmailMessage replyTo(ModelsReplyTo replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @ApiModelProperty(value = "")
  public ModelsReplyTo getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(ModelsReplyTo replyTo) {
    this.replyTo = replyTo;
  }

  public ModelsQEmailMessage subAccountID(Long subAccountID) {
    this.subAccountID = subAccountID;
    return this;
  }

   /**
   * Get subAccountID
   * @return subAccountID
  **/
  @ApiModelProperty(value = "")
  public Long getSubAccountID() {
    return subAccountID;
  }

  public void setSubAccountID(Long subAccountID) {
    this.subAccountID = subAccountID;
  }

  public ModelsQEmailMessage subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ModelsQEmailMessage submittedAt(Long submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(value = "")
  public Long getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(Long submittedAt) {
    this.submittedAt = submittedAt;
  }

  public ModelsQEmailMessage textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * Get textBody
   * @return textBody
  **/
  @ApiModelProperty(value = "")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public ModelsQEmailMessage to(ModelsTo to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public ModelsTo getTo() {
    return to;
  }

  public void setTo(ModelsTo to) {
    this.to = to;
  }

  public ModelsQEmailMessage trackClicks(Boolean trackClicks) {
    this.trackClicks = trackClicks;
    return this;
  }

   /**
   * Get trackClicks
   * @return trackClicks
  **/
  @ApiModelProperty(value = "")
  public Boolean isTrackClicks() {
    return trackClicks;
  }

  public void setTrackClicks(Boolean trackClicks) {
    this.trackClicks = trackClicks;
  }

  public ModelsQEmailMessage trackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Get trackOpens
   * @return trackOpens
  **/
  @ApiModelProperty(value = "")
  public Boolean isTrackOpens() {
    return trackOpens;
  }

  public void setTrackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsQEmailMessage modelsQEmailMessage = (ModelsQEmailMessage) o;
    return Objects.equals(this.accountID, modelsQEmailMessage.accountID) &&
        Objects.equals(this.ampBody, modelsQEmailMessage.ampBody) &&
        Objects.equals(this.customFields, modelsQEmailMessage.customFields) &&
        Objects.equals(this.emailType, modelsQEmailMessage.emailType) &&
        Objects.equals(this.from, modelsQEmailMessage.from) &&
        Objects.equals(this.groups, modelsQEmailMessage.groups) &&
        Objects.equals(this.headers, modelsQEmailMessage.headers) &&
        Objects.equals(this.htmlBody, modelsQEmailMessage.htmlBody) &&
        Objects.equals(this.ipID, modelsQEmailMessage.ipID) &&
        Objects.equals(this.ipPool, modelsQEmailMessage.ipPool) &&
        Objects.equals(this.localIP, modelsQEmailMessage.localIP) &&
        Objects.equals(this.messageID, modelsQEmailMessage.messageID) &&
        Objects.equals(this.preText, modelsQEmailMessage.preText) &&
        Objects.equals(this.publicIP, modelsQEmailMessage.publicIP) &&
        Objects.equals(this.replyTo, modelsQEmailMessage.replyTo) &&
        Objects.equals(this.subAccountID, modelsQEmailMessage.subAccountID) &&
        Objects.equals(this.subject, modelsQEmailMessage.subject) &&
        Objects.equals(this.submittedAt, modelsQEmailMessage.submittedAt) &&
        Objects.equals(this.textBody, modelsQEmailMessage.textBody) &&
        Objects.equals(this.to, modelsQEmailMessage.to) &&
        Objects.equals(this.trackClicks, modelsQEmailMessage.trackClicks) &&
        Objects.equals(this.trackOpens, modelsQEmailMessage.trackOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, ampBody, customFields, emailType, from, groups, headers, htmlBody, ipID, ipPool, localIP, messageID, preText, publicIP, replyTo, subAccountID, subject, submittedAt, textBody, to, trackClicks, trackOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsQEmailMessage {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    ampBody: ").append(toIndentedString(ampBody)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    ipID: ").append(toIndentedString(ipID)).append("\n");
    sb.append("    ipPool: ").append(toIndentedString(ipPool)).append("\n");
    sb.append("    localIP: ").append(toIndentedString(localIP)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    preText: ").append(toIndentedString(preText)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subAccountID: ").append(toIndentedString(subAccountID)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    trackClicks: ").append(toIndentedString(trackClicks)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
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

