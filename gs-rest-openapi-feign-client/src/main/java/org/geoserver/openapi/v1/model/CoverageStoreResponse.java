/*
 * GeoServer CoverageStores
 * A coverage store describes how access a raster data source.
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
import org.geoserver.openapi.v1.model.NamedLink;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CoverageStoreResponse
 */
@JsonPropertyOrder({
  CoverageStoreResponse.JSON_PROPERTY_NAME,
  CoverageStoreResponse.JSON_PROPERTY_DESCRIPTION,
  CoverageStoreResponse.JSON_PROPERTY_TYPE,
  CoverageStoreResponse.JSON_PROPERTY_ENABLED,
  CoverageStoreResponse.JSON_PROPERTY_WORKSPACE,
  CoverageStoreResponse.JSON_PROPERTY_URL,
  CoverageStoreResponse.JSON_PROPERTY_COVERAGES
})

public class CoverageStoreResponse {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private NamedLink workspace;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_COVERAGES = "coverages";
  private String coverages;


  public CoverageStoreResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the coverage store
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the coverage store")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CoverageStoreResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the coverage store
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the coverage store")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CoverageStoreResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of coverage store
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of coverage store")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CoverageStoreResponse enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the store is enabled, or not
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the store is enabled, or not")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CoverageStoreResponse workspace(NamedLink workspace) {
    
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NamedLink getWorkspace() {
    return workspace;
  }


  public void setWorkspace(NamedLink workspace) {
    this.workspace = workspace;
  }


  public CoverageStoreResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Location of the raster data source (often, but not necessarily, a file). Can be relative to the data directory.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location of the raster data source (often, but not necessarily, a file). Can be relative to the data directory.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CoverageStoreResponse coverages(String coverages) {
    
    this.coverages = coverages;
    return this;
  }

   /**
   * URL to the list of coverages contained in this store
   * @return coverages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://localhost:8080/geoserver/rest/workspaces/sf/coveragestores/sfdem/coverages.json", value = "URL to the list of coverages contained in this store")
  @JsonProperty(JSON_PROPERTY_COVERAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverages() {
    return coverages;
  }


  public void setCoverages(String coverages) {
    this.coverages = coverages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageStoreResponse coverageStoreResponse = (CoverageStoreResponse) o;
    return Objects.equals(this.name, coverageStoreResponse.name) &&
        Objects.equals(this.description, coverageStoreResponse.description) &&
        Objects.equals(this.type, coverageStoreResponse.type) &&
        Objects.equals(this.enabled, coverageStoreResponse.enabled) &&
        Objects.equals(this.workspace, coverageStoreResponse.workspace) &&
        Objects.equals(this.url, coverageStoreResponse.url) &&
        Objects.equals(this.coverages, coverageStoreResponse.coverages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, enabled, workspace, url, coverages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageStoreResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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

