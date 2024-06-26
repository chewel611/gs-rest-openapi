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
 * The namespace URI of the resource. Example would be an application schema namespace URI.
 */
@ApiModel(description = "The namespace URI of the resource. Example would be an application schema namespace URI.")
@JsonPropertyOrder({
  NamespaceInfo.JSON_PROPERTY_PREFIX,
  NamespaceInfo.JSON_PROPERTY_URI,
  NamespaceInfo.JSON_PROPERTY_ISOLATED
})

public class NamespaceInfo {
  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ISOLATED = "isolated";
  private Boolean isolated;


  public NamespaceInfo prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * The name of the namespace.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the namespace.")
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public NamespaceInfo uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URL to the namespace.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the namespace.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NamespaceInfo isolated(Boolean isolated) {
    
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
    NamespaceInfo namespaceInfo = (NamespaceInfo) o;
    return Objects.equals(this.prefix, namespaceInfo.prefix) &&
        Objects.equals(this.uri, namespaceInfo.uri) &&
        Objects.equals(this.isolated, namespaceInfo.isolated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, uri, isolated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceInfo {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

