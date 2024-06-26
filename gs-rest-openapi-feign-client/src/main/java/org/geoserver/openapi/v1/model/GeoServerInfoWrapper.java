/*
 * GeoServer Global Config
 * Global configuration settings
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
 * GeoServerInfoWrapper
 */
@JsonPropertyOrder({
  GeoServerInfoWrapper.JSON_PROPERTY_GLOBAL
})

public class GeoServerInfoWrapper {
  public static final String JSON_PROPERTY_GLOBAL = "global";
  private org.geoserver.openapi.model.config.GeoServerInfo global;


  public GeoServerInfoWrapper global(org.geoserver.openapi.model.config.GeoServerInfo global) {
    
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public org.geoserver.openapi.model.config.GeoServerInfo getGlobal() {
    return global;
  }


  public void setGlobal(org.geoserver.openapi.model.config.GeoServerInfo global) {
    this.global = global;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoServerInfoWrapper geoServerInfoWrapper = (GeoServerInfoWrapper) o;
    return Objects.equals(this.global, geoServerInfoWrapper.global);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoServerInfoWrapper {\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
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

