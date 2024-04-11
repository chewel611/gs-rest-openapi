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
 * SettingsInfoWrapper
 */
@JsonPropertyOrder({
  SettingsInfoWrapper.JSON_PROPERTY_SETTINGS
})

public class SettingsInfoWrapper {
  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private org.geoserver.openapi.model.config.SettingsInfo settings;


  public SettingsInfoWrapper settings(org.geoserver.openapi.model.config.SettingsInfo settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public org.geoserver.openapi.model.config.SettingsInfo getSettings() {
    return settings;
  }


  public void setSettings(org.geoserver.openapi.model.config.SettingsInfo settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsInfoWrapper settingsInfoWrapper = (SettingsInfoWrapper) o;
    return Objects.equals(this.settings, settingsInfoWrapper.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsInfoWrapper {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
