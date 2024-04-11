/*
 * GeoServer Coverages
 * A coverage is a raster data set which originates from a coverage store.
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
 * GridRangeInfoResponse
 */
@JsonPropertyOrder({
  GridRangeInfoResponse.JSON_PROPERTY_HIGH,
  GridRangeInfoResponse.JSON_PROPERTY_LOW
})

public class GridRangeInfoResponse {
  public static final String JSON_PROPERTY_HIGH = "high";
  private String high;

  public static final String JSON_PROPERTY_LOW = "low";
  private String low;


  public GridRangeInfoResponse high(String high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHigh() {
    return high;
  }


  public void setHigh(String high) {
    this.high = high;
  }


  public GridRangeInfoResponse low(String low) {
    
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLow() {
    return low;
  }


  public void setLow(String low) {
    this.low = low;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridRangeInfoResponse gridRangeInfoResponse = (GridRangeInfoResponse) o;
    return Objects.equals(this.high, gridRangeInfoResponse.high) &&
        Objects.equals(this.low, gridRangeInfoResponse.low);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridRangeInfoResponse {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
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
