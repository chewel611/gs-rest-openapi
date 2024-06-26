/*
 * GeoServer Config Model
 * GeoServer Config Model Objects
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.geoserver.openapi.model.config;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.geoserver.openapi.model.config.ContactInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SettingsInfo
 */
@JsonPropertyOrder({
  SettingsInfo.JSON_PROPERTY_ID,
  SettingsInfo.JSON_PROPERTY_TITLE,
  SettingsInfo.JSON_PROPERTY_CHARSET,
  SettingsInfo.JSON_PROPERTY_NUM_DECIMALS,
  SettingsInfo.JSON_PROPERTY_ONLINE_RESOURCE,
  SettingsInfo.JSON_PROPERTY_PROXY_BASE_URL,
  SettingsInfo.JSON_PROPERTY_SCHEMA_BASE_URL,
  SettingsInfo.JSON_PROPERTY_VERBOSE,
  SettingsInfo.JSON_PROPERTY_LOCAL_WORKSPACE_INCLUDES_PREFIX,
  SettingsInfo.JSON_PROPERTY_SHOW_CREATED_TIME_COLUMNS_IN_ADMIN_LIST,
  SettingsInfo.JSON_PROPERTY_SHOW_MODIFIED_TIME_COLUMNS_IN_ADMIN_LIST,
  SettingsInfo.JSON_PROPERTY_CONTACT
})

public class SettingsInfo {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_CHARSET = "charset";
  private String charset;

  public static final String JSON_PROPERTY_NUM_DECIMALS = "numDecimals";
  private Integer numDecimals;

  public static final String JSON_PROPERTY_ONLINE_RESOURCE = "onlineResource";
  private String onlineResource;

  public static final String JSON_PROPERTY_PROXY_BASE_URL = "proxyBaseUrl";
  private String proxyBaseUrl;

  public static final String JSON_PROPERTY_SCHEMA_BASE_URL = "schemaBaseUrl";
  private String schemaBaseUrl;

  public static final String JSON_PROPERTY_VERBOSE = "verbose";
  private Boolean verbose;

  public static final String JSON_PROPERTY_LOCAL_WORKSPACE_INCLUDES_PREFIX = "localWorkspaceIncludesPrefix";
  private Boolean localWorkspaceIncludesPrefix;

  public static final String JSON_PROPERTY_SHOW_CREATED_TIME_COLUMNS_IN_ADMIN_LIST = "showCreatedTimeColumnsInAdminList";
  private Boolean showCreatedTimeColumnsInAdminList;

  public static final String JSON_PROPERTY_SHOW_MODIFIED_TIME_COLUMNS_IN_ADMIN_LIST = "showModifiedTimeColumnsInAdminList";
  private Boolean showModifiedTimeColumnsInAdminList;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ContactInfo contact;


  public SettingsInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SettingsInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the settings instance
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the settings instance")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SettingsInfo charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * The default character set
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default character set")
  @JsonProperty(JSON_PROPERTY_CHARSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public SettingsInfo numDecimals(Integer numDecimals) {
    
    this.numDecimals = numDecimals;
    return this;
  }

   /**
   * A cap on the number of decimals to use when encoding floating point numbers
   * @return numDecimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A cap on the number of decimals to use when encoding floating point numbers")
  @JsonProperty(JSON_PROPERTY_NUM_DECIMALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumDecimals() {
    return numDecimals;
  }


  public void setNumDecimals(Integer numDecimals) {
    this.numDecimals = numDecimals;
  }


  public SettingsInfo onlineResource(String onlineResource) {
    
    this.onlineResource = onlineResource;
    return this;
  }

   /**
   * Provider web site (used for default contact information, or service provider information if user has not filled in contact details.
   * @return onlineResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provider web site (used for default contact information, or service provider information if user has not filled in contact details.")
  @JsonProperty(JSON_PROPERTY_ONLINE_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOnlineResource() {
    return onlineResource;
  }


  public void setOnlineResource(String onlineResource) {
    this.onlineResource = onlineResource;
  }


  public SettingsInfo proxyBaseUrl(String proxyBaseUrl) {
    
    this.proxyBaseUrl = proxyBaseUrl;
    return this;
  }

   /**
   * The url of a proxy in front of the GeoServer instance. This value is used when a reference back to the GeoServer instance must be made in a response.
   * @return proxyBaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The url of a proxy in front of the GeoServer instance. This value is used when a reference back to the GeoServer instance must be made in a response.")
  @JsonProperty(JSON_PROPERTY_PROXY_BASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProxyBaseUrl() {
    return proxyBaseUrl;
  }


  public void setProxyBaseUrl(String proxyBaseUrl) {
    this.proxyBaseUrl = proxyBaseUrl;
  }


  public SettingsInfo schemaBaseUrl(String schemaBaseUrl) {
    
    this.schemaBaseUrl = schemaBaseUrl;
    return this;
  }

   /**
   * The base url to use when including a reference to an xml schema document in a response.
   * @return schemaBaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base url to use when including a reference to an xml schema document in a response.")
  @JsonProperty(JSON_PROPERTY_SCHEMA_BASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaBaseUrl() {
    return schemaBaseUrl;
  }


  public void setSchemaBaseUrl(String schemaBaseUrl) {
    this.schemaBaseUrl = schemaBaseUrl;
  }


  public SettingsInfo verbose(Boolean verbose) {
    
    this.verbose = verbose;
    return this;
  }

   /**
   * When set to false GeoServer will also take step so to strip out some formating and produce more condensed output.
   * @return verbose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to false GeoServer will also take step so to strip out some formating and produce more condensed output.")
  @JsonProperty(JSON_PROPERTY_VERBOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerbose() {
    return verbose;
  }


  public void setVerbose(Boolean verbose) {
    this.verbose = verbose;
  }


  public SettingsInfo localWorkspaceIncludesPrefix(Boolean localWorkspaceIncludesPrefix) {
    
    this.localWorkspaceIncludesPrefix = localWorkspaceIncludesPrefix;
    return this;
  }

   /**
   * If true local workspace should keep the namespace prefixes in getCapabilities etc...
   * @return localWorkspaceIncludesPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true local workspace should keep the namespace prefixes in getCapabilities etc...")
  @JsonProperty(JSON_PROPERTY_LOCAL_WORKSPACE_INCLUDES_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLocalWorkspaceIncludesPrefix() {
    return localWorkspaceIncludesPrefix;
  }


  public void setLocalWorkspaceIncludesPrefix(Boolean localWorkspaceIncludesPrefix) {
    this.localWorkspaceIncludesPrefix = localWorkspaceIncludesPrefix;
  }


  public SettingsInfo showCreatedTimeColumnsInAdminList(Boolean showCreatedTimeColumnsInAdminList) {
    
    this.showCreatedTimeColumnsInAdminList = showCreatedTimeColumnsInAdminList;
    return this;
  }

   /**
   * Set whether or not a local workspace should keep namespace prefixes in the getCapabilities
   * @return showCreatedTimeColumnsInAdminList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set whether or not a local workspace should keep namespace prefixes in the getCapabilities")
  @JsonProperty(JSON_PROPERTY_SHOW_CREATED_TIME_COLUMNS_IN_ADMIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowCreatedTimeColumnsInAdminList() {
    return showCreatedTimeColumnsInAdminList;
  }


  public void setShowCreatedTimeColumnsInAdminList(Boolean showCreatedTimeColumnsInAdminList) {
    this.showCreatedTimeColumnsInAdminList = showCreatedTimeColumnsInAdminList;
  }


  public SettingsInfo showModifiedTimeColumnsInAdminList(Boolean showModifiedTimeColumnsInAdminList) {
    
    this.showModifiedTimeColumnsInAdminList = showModifiedTimeColumnsInAdminList;
    return this;
  }

   /**
   * Get showModifiedTimeColumnsInAdminList
   * @return showModifiedTimeColumnsInAdminList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOW_MODIFIED_TIME_COLUMNS_IN_ADMIN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowModifiedTimeColumnsInAdminList() {
    return showModifiedTimeColumnsInAdminList;
  }


  public void setShowModifiedTimeColumnsInAdminList(Boolean showModifiedTimeColumnsInAdminList) {
    this.showModifiedTimeColumnsInAdminList = showModifiedTimeColumnsInAdminList;
  }


  public SettingsInfo contact(ContactInfo contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContactInfo getContact() {
    return contact;
  }


  public void setContact(ContactInfo contact) {
    this.contact = contact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsInfo settingsInfo = (SettingsInfo) o;
    return Objects.equals(this.id, settingsInfo.id) &&
        Objects.equals(this.title, settingsInfo.title) &&
        Objects.equals(this.charset, settingsInfo.charset) &&
        Objects.equals(this.numDecimals, settingsInfo.numDecimals) &&
        Objects.equals(this.onlineResource, settingsInfo.onlineResource) &&
        Objects.equals(this.proxyBaseUrl, settingsInfo.proxyBaseUrl) &&
        Objects.equals(this.schemaBaseUrl, settingsInfo.schemaBaseUrl) &&
        Objects.equals(this.verbose, settingsInfo.verbose) &&
        Objects.equals(this.localWorkspaceIncludesPrefix, settingsInfo.localWorkspaceIncludesPrefix) &&
        Objects.equals(this.showCreatedTimeColumnsInAdminList, settingsInfo.showCreatedTimeColumnsInAdminList) &&
        Objects.equals(this.showModifiedTimeColumnsInAdminList, settingsInfo.showModifiedTimeColumnsInAdminList) &&
        Objects.equals(this.contact, settingsInfo.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, charset, numDecimals, onlineResource, proxyBaseUrl, schemaBaseUrl, verbose, localWorkspaceIncludesPrefix, showCreatedTimeColumnsInAdminList, showModifiedTimeColumnsInAdminList, contact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    numDecimals: ").append(toIndentedString(numDecimals)).append("\n");
    sb.append("    onlineResource: ").append(toIndentedString(onlineResource)).append("\n");
    sb.append("    proxyBaseUrl: ").append(toIndentedString(proxyBaseUrl)).append("\n");
    sb.append("    schemaBaseUrl: ").append(toIndentedString(schemaBaseUrl)).append("\n");
    sb.append("    verbose: ").append(toIndentedString(verbose)).append("\n");
    sb.append("    localWorkspaceIncludesPrefix: ").append(toIndentedString(localWorkspaceIncludesPrefix)).append("\n");
    sb.append("    showCreatedTimeColumnsInAdminList: ").append(toIndentedString(showCreatedTimeColumnsInAdminList)).append("\n");
    sb.append("    showModifiedTimeColumnsInAdminList: ").append(toIndentedString(showModifiedTimeColumnsInAdminList)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

