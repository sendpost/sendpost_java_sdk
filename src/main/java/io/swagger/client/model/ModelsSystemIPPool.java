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
import io.swagger.client.model.ModelsIP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModelsSystemIPPool
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-27T05:08:14.940Z")



public class ModelsSystemIPPool {
  @SerializedName("IPs")
  private List<ModelsIP> ips = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public ModelsSystemIPPool ips(List<ModelsIP> ips) {
    this.ips = ips;
    return this;
  }

  public ModelsSystemIPPool addIpsItem(ModelsIP ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<ModelsIP>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @ApiModelProperty(value = "")
  public List<ModelsIP> getIps() {
    return ips;
  }

  public void setIps(List<ModelsIP> ips) {
    this.ips = ips;
  }

  public ModelsSystemIPPool created(Long created) {
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

  public ModelsSystemIPPool id(Long id) {
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

  public ModelsSystemIPPool name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSystemIPPool modelsSystemIPPool = (ModelsSystemIPPool) o;
    return Objects.equals(this.ips, modelsSystemIPPool.ips) &&
        Objects.equals(this.created, modelsSystemIPPool.created) &&
        Objects.equals(this.id, modelsSystemIPPool.id) &&
        Objects.equals(this.name, modelsSystemIPPool.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ips, created, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSystemIPPool {\n");
    
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

