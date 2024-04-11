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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StyleInfo
 */
@JsonPropertyOrder({
  StyleInfo.JSON_PROPERTY_NAME,
  StyleInfo.JSON_PROPERTY_WORKSPACE,
  StyleInfo.JSON_PROPERTY_FORMAT,
  StyleInfo.JSON_PROPERTY_FORMAT_VERSION,
  StyleInfo.JSON_PROPERTY_LANGUAGE_VERSION,
  StyleInfo.JSON_PROPERTY_FILENAME,
  StyleInfo.JSON_PROPERTY_LEGEND,
  StyleInfo.JSON_PROPERTY_METADATA
})

public class StyleInfo {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private WorkspaceInfo workspace;

  /**
   * The styling language/format for the style, for example: \&quot;sld\&quot;
   */
  public enum FormatEnum {
    SLD("sld"),
    
    MBSTYLE("mbstyle");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  private FormatEnum format;

  public static final String JSON_PROPERTY_FORMAT_VERSION = "formatVersion";
  private Version formatVersion;

  public static final String JSON_PROPERTY_LANGUAGE_VERSION = "languageVersion";
  private Version languageVersion;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private LegendInfo legend;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MetadataList metadata;


  public StyleInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the style. This value is unique among all styles and can be used to identify the style.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the style. This value is unique among all styles and can be used to identify the style.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StyleInfo workspace(WorkspaceInfo workspace) {
    
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkspaceInfo getWorkspace() {
    return workspace;
  }


  public void setWorkspace(WorkspaceInfo workspace) {
    this.workspace = workspace;
  }


  public StyleInfo format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * The styling language/format for the style, for example: \&quot;sld\&quot;
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The styling language/format for the style, for example: \"sld\"")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public StyleInfo formatVersion(Version formatVersion) {
    
    this.formatVersion = formatVersion;
    return this;
  }

   /**
   * Get formatVersion
   * @return formatVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Version getFormatVersion() {
    return formatVersion;
  }


  public void setFormatVersion(Version formatVersion) {
    this.formatVersion = formatVersion;
  }


  public StyleInfo languageVersion(Version languageVersion) {
    
    this.languageVersion = languageVersion;
    return this;
  }

   /**
   * Get languageVersion
   * @return languageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Version getLanguageVersion() {
    return languageVersion;
  }


  public void setLanguageVersion(Version languageVersion) {
    this.languageVersion = languageVersion;
  }


  public StyleInfo filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * name of the file the style originates from.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the file the style originates from.")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public StyleInfo legend(LegendInfo legend) {
    
    this.legend = legend;
    return this;
  }

   /**
   * Get legend
   * @return legend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegendInfo getLegend() {
    return legend;
  }


  public void setLegend(LegendInfo legend) {
    this.legend = legend;
  }


  public StyleInfo metadata(MetadataList metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataList getMetadata() {
    return metadata;
  }


  public void setMetadata(MetadataList metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StyleInfo styleInfo = (StyleInfo) o;
    return Objects.equals(this.name, styleInfo.name) &&
        Objects.equals(this.workspace, styleInfo.workspace) &&
        Objects.equals(this.format, styleInfo.format) &&
        Objects.equals(this.formatVersion, styleInfo.formatVersion) &&
        Objects.equals(this.languageVersion, styleInfo.languageVersion) &&
        Objects.equals(this.filename, styleInfo.filename) &&
        Objects.equals(this.legend, styleInfo.legend) &&
        Objects.equals(this.metadata, styleInfo.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, workspace, format, formatVersion, languageVersion, filename, legend, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

