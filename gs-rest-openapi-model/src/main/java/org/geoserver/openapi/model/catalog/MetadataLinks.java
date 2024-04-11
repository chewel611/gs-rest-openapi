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
import java.util.ArrayList;
import java.util.List;
import org.geoserver.openapi.model.catalog.MetadataLinkInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Wraps a collection of metadata links for the resource.
 */
@ApiModel(description = "Wraps a collection of metadata links for the resource.")
@JsonPropertyOrder({
  MetadataLinks.JSON_PROPERTY_METADATA_LINK
})

public class MetadataLinks {
  public static final String JSON_PROPERTY_METADATA_LINK = "metadataLink";
  private List<MetadataLinkInfo> metadataLink = null;


  public MetadataLinks metadataLink(List<MetadataLinkInfo> metadataLink) {
    
    this.metadataLink = metadataLink;
    return this;
  }

  public MetadataLinks addMetadataLinkItem(MetadataLinkInfo metadataLinkItem) {
    if (this.metadataLink == null) {
      this.metadataLink = new ArrayList<>();
    }
    this.metadataLink.add(metadataLinkItem);
    return this;
  }

   /**
   * Get metadataLink
   * @return metadataLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MetadataLinkInfo> getMetadataLink() {
    return metadataLink;
  }


  public void setMetadataLink(List<MetadataLinkInfo> metadataLink) {
    this.metadataLink = metadataLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataLinks metadataLinks = (MetadataLinks) o;
    return Objects.equals(this.metadataLink, metadataLinks.metadataLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataLinks {\n");
    sb.append("    metadataLink: ").append(toIndentedString(metadataLink)).append("\n");
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
