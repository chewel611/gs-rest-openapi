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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import org.geoserver.openapi.model.catalog.MetadataList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ResourceResponse
 */
@JsonPropertyOrder({
  ResourceResponse.JSON_PROPERTY_NAME,
  ResourceResponse.JSON_PROPERTY_NATIVE_NAME,
  ResourceResponse.JSON_PROPERTY_ALIAS,
  ResourceResponse.JSON_PROPERTY_NAMESPACE,
  ResourceResponse.JSON_PROPERTY_TITLE,
  ResourceResponse.JSON_PROPERTY_ABSTRACT,
  ResourceResponse.JSON_PROPERTY_DESCRIPTION,
  ResourceResponse.JSON_PROPERTY_ENABLED,
  ResourceResponse.JSON_PROPERTY_ADVERTISED,
  ResourceResponse.JSON_PROPERTY_KEYWORDS,
  ResourceResponse.JSON_PROPERTY_METADATA_LINKS,
  ResourceResponse.JSON_PROPERTY_NATIVE_BOUNDING_BOX,
  ResourceResponse.JSON_PROPERTY_LAT_LON_BOUNDING_BOX,
  ResourceResponse.JSON_PROPERTY_SRS,
  ResourceResponse.JSON_PROPERTY_NATIVE_C_R_S,
  ResourceResponse.JSON_PROPERTY_PROJECTION_POLICY,
  ResourceResponse.JSON_PROPERTY_METADATA,
  ResourceResponse.JSON_PROPERTY_STORE,
  ResourceResponse.JSON_PROPERTY_SERVICE_CONFIGURATION,
  ResourceResponse.JSON_PROPERTY_DISABLED_SERVICES
})

public class ResourceResponse {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NATIVE_NAME = "nativeName";
  private String nativeName;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private List<String> alias = null;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private NamedLink namespace;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ABSTRACT = "abstract";
  private String _abstract;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ADVERTISED = "advertised";
  private Boolean advertised;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private ResourceResponseKeywords keywords;

  public static final String JSON_PROPERTY_METADATA_LINKS = "metadataLinks";
  private MetadataLinks metadataLinks;

  public static final String JSON_PROPERTY_NATIVE_BOUNDING_BOX = "nativeBoundingBox";
  private EnvelopeResponse nativeBoundingBox;

  public static final String JSON_PROPERTY_LAT_LON_BOUNDING_BOX = "latLonBoundingBox";
  private EnvelopeResponse latLonBoundingBox;

  public static final String JSON_PROPERTY_SRS = "srs";
  private String srs;

  public static final String JSON_PROPERTY_NATIVE_C_R_S = "nativeCRS";
  private Object nativeCRS;

  public static final String JSON_PROPERTY_PROJECTION_POLICY = "projectionPolicy";
  private org.geoserver.openapi.model.catalog.ProjectionPolicy projectionPolicy;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MetadataList metadata;

  public static final String JSON_PROPERTY_STORE = "store";
  private NamedLink store;

  public static final String JSON_PROPERTY_SERVICE_CONFIGURATION = "serviceConfiguration";
  private Boolean serviceConfiguration;

  public static final String JSON_PROPERTY_DISABLED_SERVICES = "disabledServices";
  private StringArrayResponse disabledServices;


  public ResourceResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResourceResponse nativeName(String nativeName) {
    
    this.nativeName = nativeName;
    return this;
  }

   /**
   * Get nativeName
   * @return nativeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNativeName() {
    return nativeName;
  }


  public void setNativeName(String nativeName) {
    this.nativeName = nativeName;
  }


  public ResourceResponse alias(List<String> alias) {
    
    this.alias = alias;
    return this;
  }

  public ResourceResponse addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<>();
    }
    this.alias.add(aliasItem);
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAlias() {
    return alias;
  }


  public void setAlias(List<String> alias) {
    this.alias = alias;
  }


  public ResourceResponse namespace(NamedLink namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NamedLink getNamespace() {
    return namespace;
  }


  public void setNamespace(NamedLink namespace) {
    this.namespace = namespace;
  }


  public ResourceResponse title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ResourceResponse _abstract(String _abstract) {
    
    this._abstract = _abstract;
    return this;
  }

   /**
   * Get _abstract
   * @return _abstract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ABSTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbstract() {
    return _abstract;
  }


  public void setAbstract(String _abstract) {
    this._abstract = _abstract;
  }


  public ResourceResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ResourceResponse enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ResourceResponse advertised(Boolean advertised) {
    
    this.advertised = advertised;
    return this;
  }

   /**
   * Get advertised
   * @return advertised
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVERTISED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdvertised() {
    return advertised;
  }


  public void setAdvertised(Boolean advertised) {
    this.advertised = advertised;
  }


  public ResourceResponse keywords(ResourceResponseKeywords keywords) {
    
    this.keywords = keywords;
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceResponseKeywords getKeywords() {
    return keywords;
  }


  public void setKeywords(ResourceResponseKeywords keywords) {
    this.keywords = keywords;
  }


  public ResourceResponse metadataLinks(MetadataLinks metadataLinks) {
    
    this.metadataLinks = metadataLinks;
    return this;
  }

   /**
   * Get metadataLinks
   * @return metadataLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataLinks getMetadataLinks() {
    return metadataLinks;
  }


  public void setMetadataLinks(MetadataLinks metadataLinks) {
    this.metadataLinks = metadataLinks;
  }


  public ResourceResponse nativeBoundingBox(EnvelopeResponse nativeBoundingBox) {
    
    this.nativeBoundingBox = nativeBoundingBox;
    return this;
  }

   /**
   * Get nativeBoundingBox
   * @return nativeBoundingBox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_BOUNDING_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnvelopeResponse getNativeBoundingBox() {
    return nativeBoundingBox;
  }


  public void setNativeBoundingBox(EnvelopeResponse nativeBoundingBox) {
    this.nativeBoundingBox = nativeBoundingBox;
  }


  public ResourceResponse latLonBoundingBox(EnvelopeResponse latLonBoundingBox) {
    
    this.latLonBoundingBox = latLonBoundingBox;
    return this;
  }

   /**
   * Get latLonBoundingBox
   * @return latLonBoundingBox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAT_LON_BOUNDING_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnvelopeResponse getLatLonBoundingBox() {
    return latLonBoundingBox;
  }


  public void setLatLonBoundingBox(EnvelopeResponse latLonBoundingBox) {
    this.latLonBoundingBox = latLonBoundingBox;
  }


  public ResourceResponse srs(String srs) {
    
    this.srs = srs;
    return this;
  }

   /**
   * Get srs
   * @return srs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrs() {
    return srs;
  }


  public void setSrs(String srs) {
    this.srs = srs;
  }


  public ResourceResponse nativeCRS(Object nativeCRS) {
    
    this.nativeCRS = nativeCRS;
    return this;
  }

   /**
   * left as a free form object because geoserver returns a  plain string if it is a geographic crs (e.g. \&quot;EPSG:4326\&quot;) or an object like this: {\&quot;@class\&quot;:\&quot;projected\&quot;,\&quot;$\&quot;:\&quot;EPSG:26986\&quot;}
   * @return nativeCRS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "left as a free form object because geoserver returns a  plain string if it is a geographic crs (e.g. \"EPSG:4326\") or an object like this: {\"@class\":\"projected\",\"$\":\"EPSG:26986\"}")
  @JsonProperty(JSON_PROPERTY_NATIVE_C_R_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getNativeCRS() {
    return nativeCRS;
  }


  public void setNativeCRS(Object nativeCRS) {
    this.nativeCRS = nativeCRS;
  }


  public ResourceResponse projectionPolicy(org.geoserver.openapi.model.catalog.ProjectionPolicy projectionPolicy) {
    
    this.projectionPolicy = projectionPolicy;
    return this;
  }

   /**
   * Get projectionPolicy
   * @return projectionPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROJECTION_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public org.geoserver.openapi.model.catalog.ProjectionPolicy getProjectionPolicy() {
    return projectionPolicy;
  }


  public void setProjectionPolicy(org.geoserver.openapi.model.catalog.ProjectionPolicy projectionPolicy) {
    this.projectionPolicy = projectionPolicy;
  }


  public ResourceResponse metadata(MetadataList metadata) {
    
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


  public ResourceResponse store(NamedLink store) {
    
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NamedLink getStore() {
    return store;
  }


  public void setStore(NamedLink store) {
    this.store = store;
  }


  public ResourceResponse serviceConfiguration(Boolean serviceConfiguration) {
    
    this.serviceConfiguration = serviceConfiguration;
    return this;
  }

   /**
   * Get serviceConfiguration
   * @return serviceConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getServiceConfiguration() {
    return serviceConfiguration;
  }


  public void setServiceConfiguration(Boolean serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }


  public ResourceResponse disabledServices(StringArrayResponse disabledServices) {
    
    this.disabledServices = disabledServices;
    return this;
  }

   /**
   * Get disabledServices
   * @return disabledServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayResponse getDisabledServices() {
    return disabledServices;
  }


  public void setDisabledServices(StringArrayResponse disabledServices) {
    this.disabledServices = disabledServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceResponse resourceResponse = (ResourceResponse) o;
    return Objects.equals(this.name, resourceResponse.name) &&
        Objects.equals(this.nativeName, resourceResponse.nativeName) &&
        Objects.equals(this.alias, resourceResponse.alias) &&
        Objects.equals(this.namespace, resourceResponse.namespace) &&
        Objects.equals(this.title, resourceResponse.title) &&
        Objects.equals(this._abstract, resourceResponse._abstract) &&
        Objects.equals(this.description, resourceResponse.description) &&
        Objects.equals(this.enabled, resourceResponse.enabled) &&
        Objects.equals(this.advertised, resourceResponse.advertised) &&
        Objects.equals(this.keywords, resourceResponse.keywords) &&
        Objects.equals(this.metadataLinks, resourceResponse.metadataLinks) &&
        Objects.equals(this.nativeBoundingBox, resourceResponse.nativeBoundingBox) &&
        Objects.equals(this.latLonBoundingBox, resourceResponse.latLonBoundingBox) &&
        Objects.equals(this.srs, resourceResponse.srs) &&
        Objects.equals(this.nativeCRS, resourceResponse.nativeCRS) &&
        Objects.equals(this.projectionPolicy, resourceResponse.projectionPolicy) &&
        Objects.equals(this.metadata, resourceResponse.metadata) &&
        Objects.equals(this.store, resourceResponse.store) &&
        Objects.equals(this.serviceConfiguration, resourceResponse.serviceConfiguration) &&
        Objects.equals(this.disabledServices, resourceResponse.disabledServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nativeName, alias, namespace, title, _abstract, description, enabled, advertised, keywords, metadataLinks, nativeBoundingBox, latLonBoundingBox, srs, nativeCRS, projectionPolicy, metadata, store, serviceConfiguration, disabledServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nativeName: ").append(toIndentedString(nativeName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    advertised: ").append(toIndentedString(advertised)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadataLinks: ").append(toIndentedString(metadataLinks)).append("\n");
    sb.append("    nativeBoundingBox: ").append(toIndentedString(nativeBoundingBox)).append("\n");
    sb.append("    latLonBoundingBox: ").append(toIndentedString(latLonBoundingBox)).append("\n");
    sb.append("    srs: ").append(toIndentedString(srs)).append("\n");
    sb.append("    nativeCRS: ").append(toIndentedString(nativeCRS)).append("\n");
    sb.append("    projectionPolicy: ").append(toIndentedString(projectionPolicy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    serviceConfiguration: ").append(toIndentedString(serviceConfiguration)).append("\n");
    sb.append("    disabledServices: ").append(toIndentedString(disabledServices)).append("\n");
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

