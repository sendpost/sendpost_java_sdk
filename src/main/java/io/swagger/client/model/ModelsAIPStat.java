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
import io.swagger.client.model.ModelsIPStat;
import java.io.IOException;

/**
 * ModelsAIPStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T12:08:13.160Z")



public class ModelsAIPStat {
  @SerializedName("ipid")
  private Long ipid = null;

  @SerializedName("publicIP")
  private String publicIP = null;

  @SerializedName("stat")
  private ModelsIPStat stat = null;

  public ModelsAIPStat ipid(Long ipid) {
    this.ipid = ipid;
    return this;
  }

   /**
   * Get ipid
   * @return ipid
  **/
  @ApiModelProperty(value = "")
  public Long getIpid() {
    return ipid;
  }

  public void setIpid(Long ipid) {
    this.ipid = ipid;
  }

  public ModelsAIPStat publicIP(String publicIP) {
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

  public ModelsAIPStat stat(ModelsIPStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public ModelsIPStat getStat() {
    return stat;
  }

  public void setStat(ModelsIPStat stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsAIPStat modelsAIPStat = (ModelsAIPStat) o;
    return Objects.equals(this.ipid, modelsAIPStat.ipid) &&
        Objects.equals(this.publicIP, modelsAIPStat.publicIP) &&
        Objects.equals(this.stat, modelsAIPStat.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipid, publicIP, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsAIPStat {\n");
    
    sb.append("    ipid: ").append(toIndentedString(ipid)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

