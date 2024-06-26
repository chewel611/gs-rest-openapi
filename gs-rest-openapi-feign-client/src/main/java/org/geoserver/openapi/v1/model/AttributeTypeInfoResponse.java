/*
 * GeoServer Feature Types
 * A feature type is a vector based spatial resource or data set that originates from a data store. In some cases, such as with a shapefile, a feature type has a one-to-one relationship with its data store. In other cases, such as PostGIS, the relationship of feature type to data store is many-to-one, feature types corresponding to a table in the database.
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AttributeTypeInfoResponse
 */
@JsonPropertyOrder({
  AttributeTypeInfoResponse.JSON_PROPERTY_ATTRIBUTE
})

public class AttributeTypeInfoResponse {
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private List<org.geoserver.openapi.model.catalog.AttributeTypeInfo> attribute = null;


  public AttributeTypeInfoResponse attribute(List<org.geoserver.openapi.model.catalog.AttributeTypeInfo> attribute) {
    
    this.attribute = attribute;
    return this;
  }

  public AttributeTypeInfoResponse addAttributeItem(org.geoserver.openapi.model.catalog.AttributeTypeInfo attributeItem) {
    if (this.attribute == null) {
      this.attribute = new ArrayList<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<org.geoserver.openapi.model.catalog.AttributeTypeInfo> getAttribute() {
    return attribute;
  }


  public void setAttribute(List<org.geoserver.openapi.model.catalog.AttributeTypeInfo> attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeTypeInfoResponse attributeTypeInfoResponse = (AttributeTypeInfoResponse) o;
    return Objects.equals(this.attribute, attributeTypeInfoResponse.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeTypeInfoResponse {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

