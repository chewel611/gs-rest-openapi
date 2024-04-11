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
import org.geoserver.openapi.v1.model.CoverageListWrapper;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CoveragesResponse
 */
@JsonPropertyOrder({
  CoveragesResponse.JSON_PROPERTY_COVERAGE_STORES
})

public class CoveragesResponse {
  public static final String JSON_PROPERTY_COVERAGE_STORES = "coverageStores";
  private CoverageListWrapper coverageStores;


  public CoveragesResponse coverageStores(CoverageListWrapper coverageStores) {
    
    this.coverageStores = coverageStores;
    return this;
  }

   /**
   * Get coverageStores
   * @return coverageStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoverageListWrapper getCoverageStores() {
    return coverageStores;
  }


  public void setCoverageStores(CoverageListWrapper coverageStores) {
    this.coverageStores = coverageStores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoveragesResponse coveragesResponse = (CoveragesResponse) o;
    return Objects.equals(this.coverageStores, coveragesResponse.coverageStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoveragesResponse {\n");
    sb.append("    coverageStores: ").append(toIndentedString(coverageStores)).append("\n");
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
