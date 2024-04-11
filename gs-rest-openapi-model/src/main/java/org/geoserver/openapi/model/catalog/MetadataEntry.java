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
 * MetadataEntry
 */
@JsonPropertyOrder({
  MetadataEntry.JSON_PROPERTY_AT_KEY,
  MetadataEntry.JSON_PROPERTY_VALUE
})

public class MetadataEntry {
  public static final String JSON_PROPERTY_AT_KEY = "@key";
  private String atKey;

  public static final String JSON_PROPERTY_VALUE = "$";
  private String value;


  public MetadataEntry atKey(String atKey) {
    
    this.atKey = atKey;
    return this;
  }

   /**
   * Get atKey
   * @return atKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtKey() {
    return atKey;
  }


  public void setAtKey(String atKey) {
    this.atKey = atKey;
  }


  public MetadataEntry value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataEntry metadataEntry = (MetadataEntry) o;
    return Objects.equals(this.atKey, metadataEntry.atKey) &&
        Objects.equals(this.value, metadataEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atKey, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataEntry {\n");
    sb.append("    atKey: ").append(toIndentedString(atKey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
