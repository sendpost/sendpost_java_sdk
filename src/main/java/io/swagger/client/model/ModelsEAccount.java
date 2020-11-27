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
 * ModelsEAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsEAccount {
  @SerializedName("email")
  private String email = null;

  @SerializedName("signupMode")
  private String signupMode = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("uid")
  private String uid = null;

  public ModelsEAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ModelsEAccount signupMode(String signupMode) {
    this.signupMode = signupMode;
    return this;
  }

   /**
   * Get signupMode
   * @return signupMode
  **/
  @ApiModelProperty(value = "")
  public String getSignupMode() {
    return signupMode;
  }

  public void setSignupMode(String signupMode) {
    this.signupMode = signupMode;
  }

  public ModelsEAccount token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ModelsEAccount uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEAccount modelsEAccount = (ModelsEAccount) o;
    return Objects.equals(this.email, modelsEAccount.email) &&
        Objects.equals(this.signupMode, modelsEAccount.signupMode) &&
        Objects.equals(this.token, modelsEAccount.token) &&
        Objects.equals(this.uid, modelsEAccount.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, signupMode, token, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEAccount {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signupMode: ").append(toIndentedString(signupMode)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

