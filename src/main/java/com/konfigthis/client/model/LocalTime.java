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
import com.konfigthis.client.model.Chronology;
import com.konfigthis.client.model.DateTimeField;
import com.konfigthis.client.model.DateTimeFieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * LocalTime
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocalTime {
  public static final String SERIALIZED_NAME_CHRONOLOGY = "chronology";
  @SerializedName(SERIALIZED_NAME_CHRONOLOGY)
  private Chronology chronology;

  public static final String SERIALIZED_NAME_FIELD_TYPES = "fieldTypes";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPES)
  private List<DateTimeFieldType> fieldTypes = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<DateTimeField> fields = null;

  public static final String SERIALIZED_NAME_HOUR_OF_DAY = "hourOfDay";
  @SerializedName(SERIALIZED_NAME_HOUR_OF_DAY)
  private Integer hourOfDay;

  public static final String SERIALIZED_NAME_MILLIS_OF_DAY = "millisOfDay";
  @SerializedName(SERIALIZED_NAME_MILLIS_OF_DAY)
  private Integer millisOfDay;

  public static final String SERIALIZED_NAME_MILLIS_OF_SECOND = "millisOfSecond";
  @SerializedName(SERIALIZED_NAME_MILLIS_OF_SECOND)
  private Integer millisOfSecond;

  public static final String SERIALIZED_NAME_MINUTE_OF_HOUR = "minuteOfHour";
  @SerializedName(SERIALIZED_NAME_MINUTE_OF_HOUR)
  private Integer minuteOfHour;

  public static final String SERIALIZED_NAME_SECOND_OF_MINUTE = "secondOfMinute";
  @SerializedName(SERIALIZED_NAME_SECOND_OF_MINUTE)
  private Integer secondOfMinute;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = null;

  public LocalTime() {
  }

  public LocalTime chronology(Chronology chronology) {
    
    
    
    
    this.chronology = chronology;
    return this;
  }

   /**
   * Get chronology
   * @return chronology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Chronology getChronology() {
    return chronology;
  }


  public void setChronology(Chronology chronology) {
    
    
    
    this.chronology = chronology;
  }


  public LocalTime fieldTypes(List<DateTimeFieldType> fieldTypes) {
    
    
    
    
    this.fieldTypes = fieldTypes;
    return this;
  }

  public LocalTime addFieldTypesItem(DateTimeFieldType fieldTypesItem) {
    if (this.fieldTypes == null) {
      this.fieldTypes = new ArrayList<>();
    }
    this.fieldTypes.add(fieldTypesItem);
    return this;
  }

   /**
   * Get fieldTypes
   * @return fieldTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DateTimeFieldType> getFieldTypes() {
    return fieldTypes;
  }


  public void setFieldTypes(List<DateTimeFieldType> fieldTypes) {
    
    
    
    this.fieldTypes = fieldTypes;
  }


  public LocalTime fields(List<DateTimeField> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public LocalTime addFieldsItem(DateTimeField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DateTimeField> getFields() {
    return fields;
  }


  public void setFields(List<DateTimeField> fields) {
    
    
    
    this.fields = fields;
  }


  public LocalTime hourOfDay(Integer hourOfDay) {
    
    
    
    
    this.hourOfDay = hourOfDay;
    return this;
  }

   /**
   * Get hourOfDay
   * @return hourOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHourOfDay() {
    return hourOfDay;
  }


  public void setHourOfDay(Integer hourOfDay) {
    
    
    
    this.hourOfDay = hourOfDay;
  }


  public LocalTime millisOfDay(Integer millisOfDay) {
    
    
    
    
    this.millisOfDay = millisOfDay;
    return this;
  }

   /**
   * Get millisOfDay
   * @return millisOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMillisOfDay() {
    return millisOfDay;
  }


  public void setMillisOfDay(Integer millisOfDay) {
    
    
    
    this.millisOfDay = millisOfDay;
  }


  public LocalTime millisOfSecond(Integer millisOfSecond) {
    
    
    
    
    this.millisOfSecond = millisOfSecond;
    return this;
  }

   /**
   * Get millisOfSecond
   * @return millisOfSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMillisOfSecond() {
    return millisOfSecond;
  }


  public void setMillisOfSecond(Integer millisOfSecond) {
    
    
    
    this.millisOfSecond = millisOfSecond;
  }


  public LocalTime minuteOfHour(Integer minuteOfHour) {
    
    
    
    
    this.minuteOfHour = minuteOfHour;
    return this;
  }

   /**
   * Get minuteOfHour
   * @return minuteOfHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinuteOfHour() {
    return minuteOfHour;
  }


  public void setMinuteOfHour(Integer minuteOfHour) {
    
    
    
    this.minuteOfHour = minuteOfHour;
  }


  public LocalTime secondOfMinute(Integer secondOfMinute) {
    
    
    
    
    this.secondOfMinute = secondOfMinute;
    return this;
  }

   /**
   * Get secondOfMinute
   * @return secondOfMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSecondOfMinute() {
    return secondOfMinute;
  }


  public void setSecondOfMinute(Integer secondOfMinute) {
    
    
    
    this.secondOfMinute = secondOfMinute;
  }


  public LocalTime values(List<Integer> values) {
    
    
    
    
    this.values = values;
    return this;
  }

  public LocalTime addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getValues() {
    return values;
  }


  public void setValues(List<Integer> values) {
    
    
    
    this.values = values;
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
   * @return the LocalTime instance itself
   */
  public LocalTime putAdditionalProperty(String key, Object value) {
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
    LocalTime localTime = (LocalTime) o;
    return Objects.equals(this.chronology, localTime.chronology) &&
        Objects.equals(this.fieldTypes, localTime.fieldTypes) &&
        Objects.equals(this.fields, localTime.fields) &&
        Objects.equals(this.hourOfDay, localTime.hourOfDay) &&
        Objects.equals(this.millisOfDay, localTime.millisOfDay) &&
        Objects.equals(this.millisOfSecond, localTime.millisOfSecond) &&
        Objects.equals(this.minuteOfHour, localTime.minuteOfHour) &&
        Objects.equals(this.secondOfMinute, localTime.secondOfMinute) &&
        Objects.equals(this.values, localTime.values)&&
        Objects.equals(this.additionalProperties, localTime.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chronology, fieldTypes, fields, hourOfDay, millisOfDay, millisOfSecond, minuteOfHour, secondOfMinute, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTime {\n");
    sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
    sb.append("    fieldTypes: ").append(toIndentedString(fieldTypes)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("    millisOfDay: ").append(toIndentedString(millisOfDay)).append("\n");
    sb.append("    millisOfSecond: ").append(toIndentedString(millisOfSecond)).append("\n");
    sb.append("    minuteOfHour: ").append(toIndentedString(minuteOfHour)).append("\n");
    sb.append("    secondOfMinute: ").append(toIndentedString(secondOfMinute)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("chronology");
    openapiFields.add("fieldTypes");
    openapiFields.add("fields");
    openapiFields.add("hourOfDay");
    openapiFields.add("millisOfDay");
    openapiFields.add("millisOfSecond");
    openapiFields.add("minuteOfHour");
    openapiFields.add("secondOfMinute");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocalTime
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocalTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalTime is not found in the empty JSON string", LocalTime.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `chronology`
      if (jsonObj.get("chronology") != null && !jsonObj.get("chronology").isJsonNull()) {
        Chronology.validateJsonObject(jsonObj.getAsJsonObject("chronology"));
      }
      if (jsonObj.get("fieldTypes") != null && !jsonObj.get("fieldTypes").isJsonNull()) {
        JsonArray jsonArrayfieldTypes = jsonObj.getAsJsonArray("fieldTypes");
        if (jsonArrayfieldTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldTypes` to be an array in the JSON string but got `%s`", jsonObj.get("fieldTypes").toString()));
          }

          // validate the optional field `fieldTypes` (array)
          for (int i = 0; i < jsonArrayfieldTypes.size(); i++) {
            DateTimeFieldType.validateJsonObject(jsonArrayfieldTypes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            DateTimeField.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalTime.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalTime>() {
           @Override
           public void write(JsonWriter out, LocalTime value) throws IOException {
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
           public LocalTime read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocalTime instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocalTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalTime
  * @throws IOException if the JSON string is invalid with respect to LocalTime
  */
  public static LocalTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalTime.class);
  }

 /**
  * Convert an instance of LocalTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

