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
import com.konfigthis.client.model.DateTimeFieldType;
import com.konfigthis.client.model.DurationField;
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
 * DateTimeField
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DateTimeField {
  public static final String SERIALIZED_NAME_DURATION_FIELD = "durationField";
  @SerializedName(SERIALIZED_NAME_DURATION_FIELD)
  private DurationField durationField;

  public static final String SERIALIZED_NAME_LEAP_DURATION_FIELD = "leapDurationField";
  @SerializedName(SERIALIZED_NAME_LEAP_DURATION_FIELD)
  private DurationField leapDurationField;

  public static final String SERIALIZED_NAME_LENIENT = "lenient";
  @SerializedName(SERIALIZED_NAME_LENIENT)
  private Boolean lenient = false;

  public static final String SERIALIZED_NAME_MAXIMUM_VALUE = "maximumValue";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_VALUE)
  private Integer maximumValue;

  public static final String SERIALIZED_NAME_MINIMUM_VALUE = "minimumValue";
  @SerializedName(SERIALIZED_NAME_MINIMUM_VALUE)
  private Integer minimumValue;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RANGE_DURATION_FIELD = "rangeDurationField";
  @SerializedName(SERIALIZED_NAME_RANGE_DURATION_FIELD)
  private DurationField rangeDurationField;

  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private Boolean supported = false;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DateTimeFieldType type;

  public DateTimeField() {
  }

  public DateTimeField durationField(DurationField durationField) {
    
    
    
    
    this.durationField = durationField;
    return this;
  }

   /**
   * Get durationField
   * @return durationField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DurationField getDurationField() {
    return durationField;
  }


  public void setDurationField(DurationField durationField) {
    
    
    
    this.durationField = durationField;
  }


  public DateTimeField leapDurationField(DurationField leapDurationField) {
    
    
    
    
    this.leapDurationField = leapDurationField;
    return this;
  }

   /**
   * Get leapDurationField
   * @return leapDurationField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DurationField getLeapDurationField() {
    return leapDurationField;
  }


  public void setLeapDurationField(DurationField leapDurationField) {
    
    
    
    this.leapDurationField = leapDurationField;
  }


  public DateTimeField lenient(Boolean lenient) {
    
    
    
    
    this.lenient = lenient;
    return this;
  }

   /**
   * Get lenient
   * @return lenient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getLenient() {
    return lenient;
  }


  public void setLenient(Boolean lenient) {
    
    
    
    this.lenient = lenient;
  }


  public DateTimeField maximumValue(Integer maximumValue) {
    
    
    
    
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Get maximumValue
   * @return maximumValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaximumValue() {
    return maximumValue;
  }


  public void setMaximumValue(Integer maximumValue) {
    
    
    
    this.maximumValue = maximumValue;
  }


  public DateTimeField minimumValue(Integer minimumValue) {
    
    
    
    
    this.minimumValue = minimumValue;
    return this;
  }

   /**
   * Get minimumValue
   * @return minimumValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinimumValue() {
    return minimumValue;
  }


  public void setMinimumValue(Integer minimumValue) {
    
    
    
    this.minimumValue = minimumValue;
  }


  public DateTimeField name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DateTimeField rangeDurationField(DurationField rangeDurationField) {
    
    
    
    
    this.rangeDurationField = rangeDurationField;
    return this;
  }

   /**
   * Get rangeDurationField
   * @return rangeDurationField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DurationField getRangeDurationField() {
    return rangeDurationField;
  }


  public void setRangeDurationField(DurationField rangeDurationField) {
    
    
    
    this.rangeDurationField = rangeDurationField;
  }


  public DateTimeField supported(Boolean supported) {
    
    
    
    
    this.supported = supported;
    return this;
  }

   /**
   * Get supported
   * @return supported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSupported() {
    return supported;
  }


  public void setSupported(Boolean supported) {
    
    
    
    this.supported = supported;
  }


  public DateTimeField type(DateTimeFieldType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeFieldType getType() {
    return type;
  }


  public void setType(DateTimeFieldType type) {
    
    
    
    this.type = type;
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
   * @return the DateTimeField instance itself
   */
  public DateTimeField putAdditionalProperty(String key, Object value) {
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
    DateTimeField dateTimeField = (DateTimeField) o;
    return Objects.equals(this.durationField, dateTimeField.durationField) &&
        Objects.equals(this.leapDurationField, dateTimeField.leapDurationField) &&
        Objects.equals(this.lenient, dateTimeField.lenient) &&
        Objects.equals(this.maximumValue, dateTimeField.maximumValue) &&
        Objects.equals(this.minimumValue, dateTimeField.minimumValue) &&
        Objects.equals(this.name, dateTimeField.name) &&
        Objects.equals(this.rangeDurationField, dateTimeField.rangeDurationField) &&
        Objects.equals(this.supported, dateTimeField.supported) &&
        Objects.equals(this.type, dateTimeField.type)&&
        Objects.equals(this.additionalProperties, dateTimeField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationField, leapDurationField, lenient, maximumValue, minimumValue, name, rangeDurationField, supported, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeField {\n");
    sb.append("    durationField: ").append(toIndentedString(durationField)).append("\n");
    sb.append("    leapDurationField: ").append(toIndentedString(leapDurationField)).append("\n");
    sb.append("    lenient: ").append(toIndentedString(lenient)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rangeDurationField: ").append(toIndentedString(rangeDurationField)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("durationField");
    openapiFields.add("leapDurationField");
    openapiFields.add("lenient");
    openapiFields.add("maximumValue");
    openapiFields.add("minimumValue");
    openapiFields.add("name");
    openapiFields.add("rangeDurationField");
    openapiFields.add("supported");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DateTimeField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DateTimeField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DateTimeField is not found in the empty JSON string", DateTimeField.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `durationField`
      if (jsonObj.get("durationField") != null && !jsonObj.get("durationField").isJsonNull()) {
        DurationField.validateJsonObject(jsonObj.getAsJsonObject("durationField"));
      }
      // validate the optional field `leapDurationField`
      if (jsonObj.get("leapDurationField") != null && !jsonObj.get("leapDurationField").isJsonNull()) {
        DurationField.validateJsonObject(jsonObj.getAsJsonObject("leapDurationField"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `rangeDurationField`
      if (jsonObj.get("rangeDurationField") != null && !jsonObj.get("rangeDurationField").isJsonNull()) {
        DurationField.validateJsonObject(jsonObj.getAsJsonObject("rangeDurationField"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        DateTimeFieldType.validateJsonObject(jsonObj.getAsJsonObject("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DateTimeField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DateTimeField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DateTimeField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DateTimeField.class));

       return (TypeAdapter<T>) new TypeAdapter<DateTimeField>() {
           @Override
           public void write(JsonWriter out, DateTimeField value) throws IOException {
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
           public DateTimeField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DateTimeField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DateTimeField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateTimeField
  * @throws IOException if the JSON string is invalid with respect to DateTimeField
  */
  public static DateTimeField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateTimeField.class);
  }

 /**
  * Convert an instance of DateTimeField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

