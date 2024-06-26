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
 * A legend for a layer
 */
@ApiModel(description = "A legend for a layer")
@JsonPropertyOrder({
  LegendInfo.JSON_PROPERTY_WIDTH,
  LegendInfo.JSON_PROPERTY_HEIGHT,
  LegendInfo.JSON_PROPERTY_FORMAT,
  LegendInfo.JSON_PROPERTY_ONLINE_RESOURCE
})

public class LegendInfo {
  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_ONLINE_RESOURCE = "onlineResource";
  private String onlineResource;


  public LegendInfo width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of the legend
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of the legend")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public LegendInfo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the legend
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the legend")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public LegendInfo format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format of the legend.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Format of the legend.")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public LegendInfo onlineResource(String onlineResource) {
    
    this.onlineResource = onlineResource;
    return this;
  }

   /**
   * Online resource of the legend.
   * @return onlineResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Online resource of the legend.")
  @JsonProperty(JSON_PROPERTY_ONLINE_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOnlineResource() {
    return onlineResource;
  }


  public void setOnlineResource(String onlineResource) {
    this.onlineResource = onlineResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegendInfo legendInfo = (LegendInfo) o;
    return Objects.equals(this.width, legendInfo.width) &&
        Objects.equals(this.height, legendInfo.height) &&
        Objects.equals(this.format, legendInfo.format) &&
        Objects.equals(this.onlineResource, legendInfo.onlineResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, format, onlineResource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegendInfo {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    onlineResource: ").append(toIndentedString(onlineResource)).append("\n");
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

