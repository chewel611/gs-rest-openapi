/*
 * GeoServer Catalog Model
 * GeoServer Catalog Model Objects
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.geoserver.openapi.model.catalog;

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
 * WorkspaceInfo
 */
@JsonPropertyOrder({
  WorkspaceInfo.JSON_PROPERTY_NAME,
  WorkspaceInfo.JSON_PROPERTY_ISOLATED
})

public class WorkspaceInfo {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ISOLATED = "isolated";
  private Boolean isolated;


  public WorkspaceInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the workspace
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the workspace")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkspaceInfo isolated(Boolean isolated) {
    
    this.isolated = isolated;
    return this;
  }

   /**
   * Isolated workspaces content is only visible and queryable in the context of a virtual service bound to the isolated workspace.
   * @return isolated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Isolated workspaces content is only visible and queryable in the context of a virtual service bound to the isolated workspace.")
  @JsonProperty(JSON_PROPERTY_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsolated() {
    return isolated;
  }


  public void setIsolated(Boolean isolated) {
    this.isolated = isolated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceInfo workspaceInfo = (WorkspaceInfo) o;
    return Objects.equals(this.name, workspaceInfo.name) &&
        Objects.equals(this.isolated, workspaceInfo.isolated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isolated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isolated: ").append(toIndentedString(isolated)).append("\n");
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

