/*
 * GeoServer Data Stores
 * A data store contains vector format spatial data. It can be a file (such as a shapefile), a database (such as PostGIS), or a server (such as a remote Web Feature Service).
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
 * DataStoreInfoWrapper
 */
@JsonPropertyOrder({
  DataStoreInfoWrapper.JSON_PROPERTY_DATA_STORE
})

public class DataStoreInfoWrapper {
  public static final String JSON_PROPERTY_DATA_STORE = "dataStore";
  private org.geoserver.openapi.model.catalog.DataStoreInfo dataStore;


  public DataStoreInfoWrapper dataStore(org.geoserver.openapi.model.catalog.DataStoreInfo dataStore) {
    
    this.dataStore = dataStore;
    return this;
  }

   /**
   * Get dataStore
   * @return dataStore
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_STORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public org.geoserver.openapi.model.catalog.DataStoreInfo getDataStore() {
    return dataStore;
  }


  public void setDataStore(org.geoserver.openapi.model.catalog.DataStoreInfo dataStore) {
    this.dataStore = dataStore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStoreInfoWrapper dataStoreInfoWrapper = (DataStoreInfoWrapper) o;
    return Objects.equals(this.dataStore, dataStoreInfoWrapper.dataStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStoreInfoWrapper {\n");
    sb.append("    dataStore: ").append(toIndentedString(dataStore)).append("\n");
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
