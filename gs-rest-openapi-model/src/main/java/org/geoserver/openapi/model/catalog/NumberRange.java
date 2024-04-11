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
 * a range of numbers
 */
@ApiModel(description = "a range of numbers")
@JsonPropertyOrder({
  NumberRange.JSON_PROPERTY_MIN,
  NumberRange.JSON_PROPERTY_MAX
})

public class NumberRange {
  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;


  public NumberRange min(Double min) {
    
    this.min = min;
    return this;
  }

   /**
   * min range value
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "min range value")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    this.min = min;
  }


  public NumberRange max(Double max) {
    
    this.max = max;
    return this;
  }

   /**
   * max range value
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "max range value")
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberRange numberRange = (NumberRange) o;
    return Objects.equals(this.min, numberRange.min) &&
        Objects.equals(this.max, numberRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberRange {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
