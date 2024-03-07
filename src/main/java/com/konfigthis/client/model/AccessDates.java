/*
 * Discovery API
 * The Ticketmaster Discovery API allows you to search for events, attractions, or venues.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Event&#39;s Access Date
 */
@ApiModel(description = "Event's Access Date")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccessDates {
  public static final String SERIALIZED_NAME_END_APPROXIMATE = "endApproximate";
  @SerializedName(SERIALIZED_NAME_END_APPROXIMATE)
  private Boolean endApproximate = false;

  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_START_APPROXIMATE = "startApproximate";
  @SerializedName(SERIALIZED_NAME_START_APPROXIMATE)
  private Boolean startApproximate = false;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public AccessDates() {
  }

  public AccessDates endApproximate(Boolean endApproximate) {
    
    
    
    
    this.endApproximate = endApproximate;
    return this;
  }

   /**
   * Boolean flag to indicate whether or not the access end date is approximated
   * @return endApproximate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean flag to indicate whether or not the access end date is approximated")

  public Boolean getEndApproximate() {
    return endApproximate;
  }


  public void setEndApproximate(Boolean endApproximate) {
    
    
    
    this.endApproximate = endApproximate;
  }


  public AccessDates endDateTime(OffsetDateTime endDateTime) {
    
    
    
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Event&#39;s end access time
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event's end access time")

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    
    
    
    this.endDateTime = endDateTime;
  }


  public AccessDates startApproximate(Boolean startApproximate) {
    
    
    
    
    this.startApproximate = startApproximate;
    return this;
  }

   /**
   * Boolean flag to indicate whether or not the access start date is approximated
   * @return startApproximate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Boolean flag to indicate whether or not the access start date is approximated")

  public Boolean getStartApproximate() {
    return startApproximate;
  }


  public void setStartApproximate(Boolean startApproximate) {
    
    
    
    this.startApproximate = startApproximate;
  }


  public AccessDates startDateTime(OffsetDateTime startDateTime) {
    
    
    
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Event&#39;s start access time
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event's start access time")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    
    
    
    this.startDateTime = startDateTime;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AccessDates instance itself
   */
  public AccessDates putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessDates accessDates = (AccessDates) o;
    return Objects.equals(this.endApproximate, accessDates.endApproximate) &&
        Objects.equals(this.endDateTime, accessDates.endDateTime) &&
        Objects.equals(this.startApproximate, accessDates.startApproximate) &&
        Objects.equals(this.startDateTime, accessDates.startDateTime)&&
        Objects.equals(this.additionalProperties, accessDates.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endApproximate, endDateTime, startApproximate, startDateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessDates {\n");
    sb.append("    endApproximate: ").append(toIndentedString(endApproximate)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startApproximate: ").append(toIndentedString(startApproximate)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("endApproximate");
    openapiFields.add("endDateTime");
    openapiFields.add("startApproximate");
    openapiFields.add("startDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessDates
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessDates.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessDates is not found in the empty JSON string", AccessDates.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessDates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessDates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessDates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessDates.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessDates>() {
           @Override
           public void write(JsonWriter out, AccessDates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessDates read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessDates instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessDates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessDates
  * @throws IOException if the JSON string is invalid with respect to AccessDates
  */
  public static AccessDates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessDates.class);
  }

 /**
  * Convert an instance of AccessDates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
