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
 * Venue box office information
 */
@ApiModel(description = "Venue box office information")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VenueBoxOfficeInfo {
  public static final String SERIALIZED_NAME_ACCEPTED_PAYMENT_DETAIL = "acceptedPaymentDetail";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_PAYMENT_DETAIL)
  private String acceptedPaymentDetail;

  public static final String SERIALIZED_NAME_OPEN_HOURS_DETAIL = "openHoursDetail";
  @SerializedName(SERIALIZED_NAME_OPEN_HOURS_DETAIL)
  private String openHoursDetail;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_DETAIL = "phoneNumberDetail";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_DETAIL)
  private String phoneNumberDetail;

  public static final String SERIALIZED_NAME_WILL_CALL_DETAIL = "willCallDetail";
  @SerializedName(SERIALIZED_NAME_WILL_CALL_DETAIL)
  private String willCallDetail;

  public VenueBoxOfficeInfo() {
  }

  public VenueBoxOfficeInfo acceptedPaymentDetail(String acceptedPaymentDetail) {
    
    
    
    
    this.acceptedPaymentDetail = acceptedPaymentDetail;
    return this;
  }

   /**
   * Venue box office accepted payment details
   * @return acceptedPaymentDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venue box office accepted payment details")

  public String getAcceptedPaymentDetail() {
    return acceptedPaymentDetail;
  }


  public void setAcceptedPaymentDetail(String acceptedPaymentDetail) {
    
    
    
    this.acceptedPaymentDetail = acceptedPaymentDetail;
  }


  public VenueBoxOfficeInfo openHoursDetail(String openHoursDetail) {
    
    
    
    
    this.openHoursDetail = openHoursDetail;
    return this;
  }

   /**
   * Venue box office opening hours
   * @return openHoursDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venue box office opening hours")

  public String getOpenHoursDetail() {
    return openHoursDetail;
  }


  public void setOpenHoursDetail(String openHoursDetail) {
    
    
    
    this.openHoursDetail = openHoursDetail;
  }


  public VenueBoxOfficeInfo phoneNumberDetail(String phoneNumberDetail) {
    
    
    
    
    this.phoneNumberDetail = phoneNumberDetail;
    return this;
  }

   /**
   * Venue box office phone number
   * @return phoneNumberDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venue box office phone number")

  public String getPhoneNumberDetail() {
    return phoneNumberDetail;
  }


  public void setPhoneNumberDetail(String phoneNumberDetail) {
    
    
    
    this.phoneNumberDetail = phoneNumberDetail;
  }


  public VenueBoxOfficeInfo willCallDetail(String willCallDetail) {
    
    
    
    
    this.willCallDetail = willCallDetail;
    return this;
  }

   /**
   * Venue box office will call details
   * @return willCallDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venue box office will call details")

  public String getWillCallDetail() {
    return willCallDetail;
  }


  public void setWillCallDetail(String willCallDetail) {
    
    
    
    this.willCallDetail = willCallDetail;
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
   * @return the VenueBoxOfficeInfo instance itself
   */
  public VenueBoxOfficeInfo putAdditionalProperty(String key, Object value) {
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
    VenueBoxOfficeInfo venueBoxOfficeInfo = (VenueBoxOfficeInfo) o;
    return Objects.equals(this.acceptedPaymentDetail, venueBoxOfficeInfo.acceptedPaymentDetail) &&
        Objects.equals(this.openHoursDetail, venueBoxOfficeInfo.openHoursDetail) &&
        Objects.equals(this.phoneNumberDetail, venueBoxOfficeInfo.phoneNumberDetail) &&
        Objects.equals(this.willCallDetail, venueBoxOfficeInfo.willCallDetail)&&
        Objects.equals(this.additionalProperties, venueBoxOfficeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedPaymentDetail, openHoursDetail, phoneNumberDetail, willCallDetail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VenueBoxOfficeInfo {\n");
    sb.append("    acceptedPaymentDetail: ").append(toIndentedString(acceptedPaymentDetail)).append("\n");
    sb.append("    openHoursDetail: ").append(toIndentedString(openHoursDetail)).append("\n");
    sb.append("    phoneNumberDetail: ").append(toIndentedString(phoneNumberDetail)).append("\n");
    sb.append("    willCallDetail: ").append(toIndentedString(willCallDetail)).append("\n");
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
    openapiFields.add("acceptedPaymentDetail");
    openapiFields.add("openHoursDetail");
    openapiFields.add("phoneNumberDetail");
    openapiFields.add("willCallDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VenueBoxOfficeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VenueBoxOfficeInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VenueBoxOfficeInfo is not found in the empty JSON string", VenueBoxOfficeInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("acceptedPaymentDetail") != null && !jsonObj.get("acceptedPaymentDetail").isJsonNull()) && !jsonObj.get("acceptedPaymentDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedPaymentDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptedPaymentDetail").toString()));
      }
      if ((jsonObj.get("openHoursDetail") != null && !jsonObj.get("openHoursDetail").isJsonNull()) && !jsonObj.get("openHoursDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `openHoursDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("openHoursDetail").toString()));
      }
      if ((jsonObj.get("phoneNumberDetail") != null && !jsonObj.get("phoneNumberDetail").isJsonNull()) && !jsonObj.get("phoneNumberDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberDetail").toString()));
      }
      if ((jsonObj.get("willCallDetail") != null && !jsonObj.get("willCallDetail").isJsonNull()) && !jsonObj.get("willCallDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `willCallDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("willCallDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VenueBoxOfficeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VenueBoxOfficeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VenueBoxOfficeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VenueBoxOfficeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VenueBoxOfficeInfo>() {
           @Override
           public void write(JsonWriter out, VenueBoxOfficeInfo value) throws IOException {
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
           public VenueBoxOfficeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VenueBoxOfficeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VenueBoxOfficeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VenueBoxOfficeInfo
  * @throws IOException if the JSON string is invalid with respect to VenueBoxOfficeInfo
  */
  public static VenueBoxOfficeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VenueBoxOfficeInfo.class);
  }

 /**
  * Convert an instance of VenueBoxOfficeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

