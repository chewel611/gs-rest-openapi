/*
 * GeoServer Workspace
 * A workspace is a grouping of data stores. Similar to a namespace, it is used to group data that is related in some way.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.geoserver.openapi.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WorkspaceSummary
 */
@JsonPropertyOrder({
  WorkspaceSummary.JSON_PROPERTY_NAME,
  WorkspaceSummary.JSON_PROPERTY_ISOLATED,
  WorkspaceSummary.JSON_PROPERTY_DATA_STORES,
  WorkspaceSummary.JSON_PROPERTY_COVERAGE_STORES,
  WorkspaceSummary.JSON_PROPERTY_WMS_STORES
})

public class WorkspaceSummary {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ISOLATED = "isolated";
  private Boolean isolated = false;

  public static final String JSON_PROPERTY_DATA_STORES = "dataStores";
  private String dataStores;

  public static final String JSON_PROPERTY_COVERAGE_STORES = "coverageStores";
  private String coverageStores;

  public static final String JSON_PROPERTY_WMS_STORES = "wmsStores";
  private String wmsStores;


  public WorkspaceSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of workspace
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of workspace")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkspaceSummary isolated(Boolean isolated) {
    
    this.isolated = isolated;
    return this;
  }

   /**
   * Get isolated
   * @return isolated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsolated() {
    return isolated;
  }


  public void setIsolated(Boolean isolated) {
    this.isolated = isolated;
  }


  public WorkspaceSummary dataStores(String dataStores) {
    
    this.dataStores = dataStores;
    return this;
  }

   /**
   * URL to Datas tores in this workspace
   * @return dataStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to Datas tores in this workspace")
  @JsonProperty(JSON_PROPERTY_DATA_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataStores() {
    return dataStores;
  }


  public void setDataStores(String dataStores) {
    this.dataStores = dataStores;
  }


  public WorkspaceSummary coverageStores(String coverageStores) {
    
    this.coverageStores = coverageStores;
    return this;
  }

   /**
   * URL to Coverage stores in this workspace
   * @return coverageStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to Coverage stores in this workspace")
  @JsonProperty(JSON_PROPERTY_COVERAGE_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverageStores() {
    return coverageStores;
  }


  public void setCoverageStores(String coverageStores) {
    this.coverageStores = coverageStores;
  }


  public WorkspaceSummary wmsStores(String wmsStores) {
    
    this.wmsStores = wmsStores;
    return this;
  }

   /**
   * URL to WMS stores in this workspace
   * @return wmsStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to WMS stores in this workspace")
  @JsonProperty(JSON_PROPERTY_WMS_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWmsStores() {
    return wmsStores;
  }


  public void setWmsStores(String wmsStores) {
    this.wmsStores = wmsStores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSummary workspaceSummary = (WorkspaceSummary) o;
    return Objects.equals(this.name, workspaceSummary.name) &&
        Objects.equals(this.isolated, workspaceSummary.isolated) &&
        Objects.equals(this.dataStores, workspaceSummary.dataStores) &&
        Objects.equals(this.coverageStores, workspaceSummary.coverageStores) &&
        Objects.equals(this.wmsStores, workspaceSummary.wmsStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isolated, dataStores, coverageStores, wmsStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isolated: ").append(toIndentedString(isolated)).append("\n");
    sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
    sb.append("    coverageStores: ").append(toIndentedString(coverageStores)).append("\n");
    sb.append("    wmsStores: ").append(toIndentedString(wmsStores)).append("\n");
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

