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
 * A metadata link.
 */
@ApiModel(description = "A metadata link.")
@JsonPropertyOrder({
  MetadataLinkInfo.JSON_PROPERTY_ABOUT,
  MetadataLinkInfo.JSON_PROPERTY_CONTENT,
  MetadataLinkInfo.JSON_PROPERTY_METADATA_TYPE,
  MetadataLinkInfo.JSON_PROPERTY_TYPE
})

public class MetadataLinkInfo {
  public static final String JSON_PROPERTY_ABOUT = "about";
  private String about;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_METADATA_TYPE = "metadataType";
  private String metadataType = "ISO19115:2003";

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public MetadataLinkInfo about(String about) {
    
    this.about = about;
    return this;
  }

   /**
   * Human readable title
   * @return about
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human readable title")
  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbout() {
    return about;
  }


  public void setAbout(String about) {
    this.about = about;
  }


  public MetadataLinkInfo content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * URL for the metadata record/resource
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL for the metadata record/resource")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MetadataLinkInfo metadataType(String metadataType) {
    
    this.metadataType = metadataType;
    return this;
  }

   /**
   * Metadata standard (e.g. ISO19115:2003)
   * @return metadataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata standard (e.g. ISO19115:2003)")
  @JsonProperty(JSON_PROPERTY_METADATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetadataType() {
    return metadataType;
  }


  public void setMetadataType(String metadataType) {
    this.metadataType = metadataType;
  }


  public MetadataLinkInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Content-Type (e.g. text/plain, application/xml)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content-Type (e.g. text/plain, application/xml)")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataLinkInfo metadataLinkInfo = (MetadataLinkInfo) o;
    return Objects.equals(this.about, metadataLinkInfo.about) &&
        Objects.equals(this.content, metadataLinkInfo.content) &&
        Objects.equals(this.metadataType, metadataLinkInfo.metadataType) &&
        Objects.equals(this.type, metadataLinkInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, content, metadataType, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataLinkInfo {\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

