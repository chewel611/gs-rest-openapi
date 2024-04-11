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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.geoserver.openapi.v1.model.CoverageDimensionsWrapper;
import org.geoserver.openapi.v1.model.CoverageResponseAllOf;
import org.geoserver.openapi.v1.model.EnvelopeResponse;
import org.geoserver.openapi.v1.model.GridInfoResponse;
import org.geoserver.openapi.v1.model.MetadataLinks;
import org.geoserver.openapi.v1.model.NamedLink;
import org.geoserver.openapi.v1.model.ResourceResponse;
import org.geoserver.openapi.v1.model.ResourceResponseKeywords;
import org.geoserver.openapi.v1.model.StringArrayResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CoverageResponse
 */
@JsonPropertyOrder({
  CoverageResponse.JSON_PROPERTY_NAME,
  CoverageResponse.JSON_PROPERTY_NATIVE_NAME,
  CoverageResponse.JSON_PROPERTY_ALIAS,
  CoverageResponse.JSON_PROPERTY_NAMESPACE,
  CoverageResponse.JSON_PROPERTY_TITLE,
  CoverageResponse.JSON_PROPERTY_ABSTRACT,
  CoverageResponse.JSON_PROPERTY_DESCRIPTION,
  CoverageResponse.JSON_PROPERTY_ENABLED,
  CoverageResponse.JSON_PROPERTY_ADVERTISED,
  CoverageResponse.JSON_PROPERTY_KEYWORDS,
  CoverageResponse.JSON_PROPERTY_METADATA_LINKS,
  CoverageResponse.JSON_PROPERTY_NATIVE_BOUNDING_BOX,
  CoverageResponse.JSON_PROPERTY_LAT_LON_BOUNDING_BOX,
  CoverageResponse.JSON_PROPERTY_SRS,
  CoverageResponse.JSON_PROPERTY_NATIVE_C_R_S,
  CoverageResponse.JSON_PROPERTY_PROJECTION_POLICY,
  CoverageResponse.JSON_PROPERTY_METADATA,
  CoverageResponse.JSON_PROPERTY_STORE,
  CoverageResponse.JSON_PROPERTY_SERVICE_CONFIGURATION,
  CoverageResponse.JSON_PROPERTY_DISABLED_SERVICES,
  CoverageResponse.JSON_PROPERTY_NATIVE_COVERAGE_NAME,
  CoverageResponse.JSON_PROPERTY_NATIVE_FORMAT,
  CoverageResponse.JSON_PROPERTY_SUPPORTED_FORMATS,
  CoverageResponse.JSON_PROPERTY_REQUEST_S_R_S,
  CoverageResponse.JSON_PROPERTY_RESPONSE_S_R_S,
  CoverageResponse.JSON_PROPERTY_DEFAULT_INTERPOLATION_METHOD,
  CoverageResponse.JSON_PROPERTY_INTERPOLATION_METHODS,
  CoverageResponse.JSON_PROPERTY_PARAMETERS,
  CoverageResponse.JSON_PROPERTY_DIMENSIONS,
  CoverageResponse.JSON_PROPERTY_GRID
})

public class CoverageResponse {
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
  private org.geoserver.openapi.model.catalog.MetadataMap metadata;

  public static final String JSON_PROPERTY_STORE = "store";
  private NamedLink store;

  public static final String JSON_PROPERTY_SERVICE_CONFIGURATION = "serviceConfiguration";
  private Boolean serviceConfiguration;

  public static final String JSON_PROPERTY_DISABLED_SERVICES = "disabledServices";
  private StringArrayResponse disabledServices;

  public static final String JSON_PROPERTY_NATIVE_COVERAGE_NAME = "nativeCoverageName";
  private String nativeCoverageName;

  public static final String JSON_PROPERTY_NATIVE_FORMAT = "nativeFormat";
  private String nativeFormat;

  public static final String JSON_PROPERTY_SUPPORTED_FORMATS = "supportedFormats";
  private StringArrayResponse supportedFormats;

  public static final String JSON_PROPERTY_REQUEST_S_R_S = "requestSRS";
  private StringArrayResponse requestSRS;

  public static final String JSON_PROPERTY_RESPONSE_S_R_S = "responseSRS";
  private StringArrayResponse responseSRS;

  public static final String JSON_PROPERTY_DEFAULT_INTERPOLATION_METHOD = "defaultInterpolationMethod";
  private String defaultInterpolationMethod;

  public static final String JSON_PROPERTY_INTERPOLATION_METHODS = "interpolationMethods";
  private StringArrayResponse interpolationMethods;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private Map<String, Object> parameters = null;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private CoverageDimensionsWrapper dimensions;

  public static final String JSON_PROPERTY_GRID = "grid";
  private GridInfoResponse grid;


  public CoverageResponse name(String name) {
    
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


  public CoverageResponse nativeName(String nativeName) {
    
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


  public CoverageResponse alias(List<String> alias) {
    
    this.alias = alias;
    return this;
  }

  public CoverageResponse addAliasItem(String aliasItem) {
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


  public CoverageResponse namespace(NamedLink namespace) {
    
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


  public CoverageResponse title(String title) {
    
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


  public CoverageResponse _abstract(String _abstract) {
    
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


  public CoverageResponse description(String description) {
    
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


  public CoverageResponse enabled(Boolean enabled) {
    
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


  public CoverageResponse advertised(Boolean advertised) {
    
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


  public CoverageResponse keywords(ResourceResponseKeywords keywords) {
    
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


  public CoverageResponse metadataLinks(MetadataLinks metadataLinks) {
    
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


  public CoverageResponse nativeBoundingBox(EnvelopeResponse nativeBoundingBox) {
    
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


  public CoverageResponse latLonBoundingBox(EnvelopeResponse latLonBoundingBox) {
    
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


  public CoverageResponse srs(String srs) {
    
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


  public CoverageResponse nativeCRS(Object nativeCRS) {
    
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


  public CoverageResponse projectionPolicy(org.geoserver.openapi.model.catalog.ProjectionPolicy projectionPolicy) {
    
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


  public CoverageResponse metadata(org.geoserver.openapi.model.catalog.MetadataMap metadata) {
    
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

  public org.geoserver.openapi.model.catalog.MetadataMap getMetadata() {
    return metadata;
  }


  public void setMetadata(org.geoserver.openapi.model.catalog.MetadataMap metadata) {
    this.metadata = metadata;
  }


  public CoverageResponse store(NamedLink store) {
    
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


  public CoverageResponse serviceConfiguration(Boolean serviceConfiguration) {
    
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


  public CoverageResponse disabledServices(StringArrayResponse disabledServices) {
    
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


  public CoverageResponse nativeCoverageName(String nativeCoverageName) {
    
    this.nativeCoverageName = nativeCoverageName;
    return this;
  }

   /**
   * the native coverage name (used to pick up a specific coverage from within a reader)
   * @return nativeCoverageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the native coverage name (used to pick up a specific coverage from within a reader)")
  @JsonProperty(JSON_PROPERTY_NATIVE_COVERAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNativeCoverageName() {
    return nativeCoverageName;
  }


  public void setNativeCoverageName(String nativeCoverageName) {
    this.nativeCoverageName = nativeCoverageName;
  }


  public CoverageResponse nativeFormat(String nativeFormat) {
    
    this.nativeFormat = nativeFormat;
    return this;
  }

   /**
   * Get nativeFormat
   * @return nativeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNativeFormat() {
    return nativeFormat;
  }


  public void setNativeFormat(String nativeFormat) {
    this.nativeFormat = nativeFormat;
  }


  public CoverageResponse supportedFormats(StringArrayResponse supportedFormats) {
    
    this.supportedFormats = supportedFormats;
    return this;
  }

   /**
   * Get supportedFormats
   * @return supportedFormats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayResponse getSupportedFormats() {
    return supportedFormats;
  }


  public void setSupportedFormats(StringArrayResponse supportedFormats) {
    this.supportedFormats = supportedFormats;
  }


  public CoverageResponse requestSRS(StringArrayResponse requestSRS) {
    
    this.requestSRS = requestSRS;
    return this;
  }

   /**
   * Get requestSRS
   * @return requestSRS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_S_R_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayResponse getRequestSRS() {
    return requestSRS;
  }


  public void setRequestSRS(StringArrayResponse requestSRS) {
    this.requestSRS = requestSRS;
  }


  public CoverageResponse responseSRS(StringArrayResponse responseSRS) {
    
    this.responseSRS = responseSRS;
    return this;
  }

   /**
   * Get responseSRS
   * @return responseSRS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_S_R_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayResponse getResponseSRS() {
    return responseSRS;
  }


  public void setResponseSRS(StringArrayResponse responseSRS) {
    this.responseSRS = responseSRS;
  }


  public CoverageResponse defaultInterpolationMethod(String defaultInterpolationMethod) {
    
    this.defaultInterpolationMethod = defaultInterpolationMethod;
    return this;
  }

   /**
   * Get defaultInterpolationMethod
   * @return defaultInterpolationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_INTERPOLATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultInterpolationMethod() {
    return defaultInterpolationMethod;
  }


  public void setDefaultInterpolationMethod(String defaultInterpolationMethod) {
    this.defaultInterpolationMethod = defaultInterpolationMethod;
  }


  public CoverageResponse interpolationMethods(StringArrayResponse interpolationMethods) {
    
    this.interpolationMethods = interpolationMethods;
    return this;
  }

   /**
   * Get interpolationMethods
   * @return interpolationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERPOLATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayResponse getInterpolationMethods() {
    return interpolationMethods;
  }


  public void setInterpolationMethods(StringArrayResponse interpolationMethods) {
    this.interpolationMethods = interpolationMethods;
  }


  public CoverageResponse parameters(Map<String, Object> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public CoverageResponse putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }


  public CoverageResponse dimensions(CoverageDimensionsWrapper dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoverageDimensionsWrapper getDimensions() {
    return dimensions;
  }


  public void setDimensions(CoverageDimensionsWrapper dimensions) {
    this.dimensions = dimensions;
  }


  public CoverageResponse grid(GridInfoResponse grid) {
    
    this.grid = grid;
    return this;
  }

   /**
   * Get grid
   * @return grid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GRID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GridInfoResponse getGrid() {
    return grid;
  }


  public void setGrid(GridInfoResponse grid) {
    this.grid = grid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageResponse coverageResponse = (CoverageResponse) o;
    return Objects.equals(this.name, coverageResponse.name) &&
        Objects.equals(this.nativeName, coverageResponse.nativeName) &&
        Objects.equals(this.alias, coverageResponse.alias) &&
        Objects.equals(this.namespace, coverageResponse.namespace) &&
        Objects.equals(this.title, coverageResponse.title) &&
        Objects.equals(this._abstract, coverageResponse._abstract) &&
        Objects.equals(this.description, coverageResponse.description) &&
        Objects.equals(this.enabled, coverageResponse.enabled) &&
        Objects.equals(this.advertised, coverageResponse.advertised) &&
        Objects.equals(this.keywords, coverageResponse.keywords) &&
        Objects.equals(this.metadataLinks, coverageResponse.metadataLinks) &&
        Objects.equals(this.nativeBoundingBox, coverageResponse.nativeBoundingBox) &&
        Objects.equals(this.latLonBoundingBox, coverageResponse.latLonBoundingBox) &&
        Objects.equals(this.srs, coverageResponse.srs) &&
        Objects.equals(this.nativeCRS, coverageResponse.nativeCRS) &&
        Objects.equals(this.projectionPolicy, coverageResponse.projectionPolicy) &&
        Objects.equals(this.metadata, coverageResponse.metadata) &&
        Objects.equals(this.store, coverageResponse.store) &&
        Objects.equals(this.serviceConfiguration, coverageResponse.serviceConfiguration) &&
        Objects.equals(this.disabledServices, coverageResponse.disabledServices) &&
        Objects.equals(this.nativeCoverageName, coverageResponse.nativeCoverageName) &&
        Objects.equals(this.nativeFormat, coverageResponse.nativeFormat) &&
        Objects.equals(this.supportedFormats, coverageResponse.supportedFormats) &&
        Objects.equals(this.requestSRS, coverageResponse.requestSRS) &&
        Objects.equals(this.responseSRS, coverageResponse.responseSRS) &&
        Objects.equals(this.defaultInterpolationMethod, coverageResponse.defaultInterpolationMethod) &&
        Objects.equals(this.interpolationMethods, coverageResponse.interpolationMethods) &&
        Objects.equals(this.parameters, coverageResponse.parameters) &&
        Objects.equals(this.dimensions, coverageResponse.dimensions) &&
        Objects.equals(this.grid, coverageResponse.grid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nativeName, alias, namespace, title, _abstract, description, enabled, advertised, keywords, metadataLinks, nativeBoundingBox, latLonBoundingBox, srs, nativeCRS, projectionPolicy, metadata, store, serviceConfiguration, disabledServices, nativeCoverageName, nativeFormat, supportedFormats, requestSRS, responseSRS, defaultInterpolationMethod, interpolationMethods, parameters, dimensions, grid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageResponse {\n");
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
    sb.append("    nativeCoverageName: ").append(toIndentedString(nativeCoverageName)).append("\n");
    sb.append("    nativeFormat: ").append(toIndentedString(nativeFormat)).append("\n");
    sb.append("    supportedFormats: ").append(toIndentedString(supportedFormats)).append("\n");
    sb.append("    requestSRS: ").append(toIndentedString(requestSRS)).append("\n");
    sb.append("    responseSRS: ").append(toIndentedString(responseSRS)).append("\n");
    sb.append("    defaultInterpolationMethod: ").append(toIndentedString(defaultInterpolationMethod)).append("\n");
    sb.append("    interpolationMethods: ").append(toIndentedString(interpolationMethods)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
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
