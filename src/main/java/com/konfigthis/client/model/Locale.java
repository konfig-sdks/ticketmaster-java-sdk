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
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Locale
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Locale {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISPLAY_COUNTRY = "displayCountry";
  @SerializedName(SERIALIZED_NAME_DISPLAY_COUNTRY)
  private String displayCountry;

  public static final String SERIALIZED_NAME_DISPLAY_LANGUAGE = "displayLanguage";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LANGUAGE)
  private String displayLanguage;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DISPLAY_SCRIPT = "displayScript";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SCRIPT)
  private String displayScript;

  public static final String SERIALIZED_NAME_DISPLAY_VARIANT = "displayVariant";
  @SerializedName(SERIALIZED_NAME_DISPLAY_VARIANT)
  private String displayVariant;

  public static final String SERIALIZED_NAME_EXTENSION_KEYS = "extensionKeys";
  @SerializedName(SERIALIZED_NAME_EXTENSION_KEYS)
  private Set<String> extensionKeys = null;

  public static final String SERIALIZED_NAME_ISO3_COUNTRY = "iso3Country";
  @SerializedName(SERIALIZED_NAME_ISO3_COUNTRY)
  private String iso3Country;

  public static final String SERIALIZED_NAME_ISO3_LANGUAGE = "iso3Language";
  @SerializedName(SERIALIZED_NAME_ISO3_LANGUAGE)
  private String iso3Language;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_UNICODE_LOCALE_ATTRIBUTES = "unicodeLocaleAttributes";
  @SerializedName(SERIALIZED_NAME_UNICODE_LOCALE_ATTRIBUTES)
  private Set<String> unicodeLocaleAttributes = null;

  public static final String SERIALIZED_NAME_UNICODE_LOCALE_KEYS = "unicodeLocaleKeys";
  @SerializedName(SERIALIZED_NAME_UNICODE_LOCALE_KEYS)
  private Set<String> unicodeLocaleKeys = null;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public Locale() {
  }

  public Locale country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Locale displayCountry(String displayCountry) {
    
    
    
    
    this.displayCountry = displayCountry;
    return this;
  }

   /**
   * Get displayCountry
   * @return displayCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayCountry() {
    return displayCountry;
  }


  public void setDisplayCountry(String displayCountry) {
    
    
    
    this.displayCountry = displayCountry;
  }


  public Locale displayLanguage(String displayLanguage) {
    
    
    
    
    this.displayLanguage = displayLanguage;
    return this;
  }

   /**
   * Get displayLanguage
   * @return displayLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayLanguage() {
    return displayLanguage;
  }


  public void setDisplayLanguage(String displayLanguage) {
    
    
    
    this.displayLanguage = displayLanguage;
  }


  public Locale displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public Locale displayScript(String displayScript) {
    
    
    
    
    this.displayScript = displayScript;
    return this;
  }

   /**
   * Get displayScript
   * @return displayScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayScript() {
    return displayScript;
  }


  public void setDisplayScript(String displayScript) {
    
    
    
    this.displayScript = displayScript;
  }


  public Locale displayVariant(String displayVariant) {
    
    
    
    
    this.displayVariant = displayVariant;
    return this;
  }

   /**
   * Get displayVariant
   * @return displayVariant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayVariant() {
    return displayVariant;
  }


  public void setDisplayVariant(String displayVariant) {
    
    
    
    this.displayVariant = displayVariant;
  }


  public Locale extensionKeys(Set<String> extensionKeys) {
    
    
    
    
    this.extensionKeys = extensionKeys;
    return this;
  }

  public Locale addExtensionKeysItem(String extensionKeysItem) {
    if (this.extensionKeys == null) {
      this.extensionKeys = new LinkedHashSet<>();
    }
    this.extensionKeys.add(extensionKeysItem);
    return this;
  }

   /**
   * Get extensionKeys
   * @return extensionKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getExtensionKeys() {
    return extensionKeys;
  }


  public void setExtensionKeys(Set<String> extensionKeys) {
    
    
    
    this.extensionKeys = extensionKeys;
  }


  public Locale iso3Country(String iso3Country) {
    
    
    
    
    this.iso3Country = iso3Country;
    return this;
  }

   /**
   * Get iso3Country
   * @return iso3Country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIso3Country() {
    return iso3Country;
  }


  public void setIso3Country(String iso3Country) {
    
    
    
    this.iso3Country = iso3Country;
  }


  public Locale iso3Language(String iso3Language) {
    
    
    
    
    this.iso3Language = iso3Language;
    return this;
  }

   /**
   * Get iso3Language
   * @return iso3Language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIso3Language() {
    return iso3Language;
  }


  public void setIso3Language(String iso3Language) {
    
    
    
    this.iso3Language = iso3Language;
  }


  public Locale language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public Locale script(String script) {
    
    
    
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScript() {
    return script;
  }


  public void setScript(String script) {
    
    
    
    this.script = script;
  }


  public Locale unicodeLocaleAttributes(Set<String> unicodeLocaleAttributes) {
    
    
    
    
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
    return this;
  }

  public Locale addUnicodeLocaleAttributesItem(String unicodeLocaleAttributesItem) {
    if (this.unicodeLocaleAttributes == null) {
      this.unicodeLocaleAttributes = new LinkedHashSet<>();
    }
    this.unicodeLocaleAttributes.add(unicodeLocaleAttributesItem);
    return this;
  }

   /**
   * Get unicodeLocaleAttributes
   * @return unicodeLocaleAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getUnicodeLocaleAttributes() {
    return unicodeLocaleAttributes;
  }


  public void setUnicodeLocaleAttributes(Set<String> unicodeLocaleAttributes) {
    
    
    
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
  }


  public Locale unicodeLocaleKeys(Set<String> unicodeLocaleKeys) {
    
    
    
    
    this.unicodeLocaleKeys = unicodeLocaleKeys;
    return this;
  }

  public Locale addUnicodeLocaleKeysItem(String unicodeLocaleKeysItem) {
    if (this.unicodeLocaleKeys == null) {
      this.unicodeLocaleKeys = new LinkedHashSet<>();
    }
    this.unicodeLocaleKeys.add(unicodeLocaleKeysItem);
    return this;
  }

   /**
   * Get unicodeLocaleKeys
   * @return unicodeLocaleKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getUnicodeLocaleKeys() {
    return unicodeLocaleKeys;
  }


  public void setUnicodeLocaleKeys(Set<String> unicodeLocaleKeys) {
    
    
    
    this.unicodeLocaleKeys = unicodeLocaleKeys;
  }


  public Locale variant(String variant) {
    
    
    
    
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariant() {
    return variant;
  }


  public void setVariant(String variant) {
    
    
    
    this.variant = variant;
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
   * @return the Locale instance itself
   */
  public Locale putAdditionalProperty(String key, Object value) {
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
    Locale locale = (Locale) o;
    return Objects.equals(this.country, locale.country) &&
        Objects.equals(this.displayCountry, locale.displayCountry) &&
        Objects.equals(this.displayLanguage, locale.displayLanguage) &&
        Objects.equals(this.displayName, locale.displayName) &&
        Objects.equals(this.displayScript, locale.displayScript) &&
        Objects.equals(this.displayVariant, locale.displayVariant) &&
        Objects.equals(this.extensionKeys, locale.extensionKeys) &&
        Objects.equals(this.iso3Country, locale.iso3Country) &&
        Objects.equals(this.iso3Language, locale.iso3Language) &&
        Objects.equals(this.language, locale.language) &&
        Objects.equals(this.script, locale.script) &&
        Objects.equals(this.unicodeLocaleAttributes, locale.unicodeLocaleAttributes) &&
        Objects.equals(this.unicodeLocaleKeys, locale.unicodeLocaleKeys) &&
        Objects.equals(this.variant, locale.variant)&&
        Objects.equals(this.additionalProperties, locale.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, displayCountry, displayLanguage, displayName, displayScript, displayVariant, extensionKeys, iso3Country, iso3Language, language, script, unicodeLocaleAttributes, unicodeLocaleKeys, variant, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locale {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    displayCountry: ").append(toIndentedString(displayCountry)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayScript: ").append(toIndentedString(displayScript)).append("\n");
    sb.append("    displayVariant: ").append(toIndentedString(displayVariant)).append("\n");
    sb.append("    extensionKeys: ").append(toIndentedString(extensionKeys)).append("\n");
    sb.append("    iso3Country: ").append(toIndentedString(iso3Country)).append("\n");
    sb.append("    iso3Language: ").append(toIndentedString(iso3Language)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    unicodeLocaleAttributes: ").append(toIndentedString(unicodeLocaleAttributes)).append("\n");
    sb.append("    unicodeLocaleKeys: ").append(toIndentedString(unicodeLocaleKeys)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("displayCountry");
    openapiFields.add("displayLanguage");
    openapiFields.add("displayName");
    openapiFields.add("displayScript");
    openapiFields.add("displayVariant");
    openapiFields.add("extensionKeys");
    openapiFields.add("iso3Country");
    openapiFields.add("iso3Language");
    openapiFields.add("language");
    openapiFields.add("script");
    openapiFields.add("unicodeLocaleAttributes");
    openapiFields.add("unicodeLocaleKeys");
    openapiFields.add("variant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Locale
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Locale.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Locale is not found in the empty JSON string", Locale.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("displayCountry") != null && !jsonObj.get("displayCountry").isJsonNull()) && !jsonObj.get("displayCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayCountry").toString()));
      }
      if ((jsonObj.get("displayLanguage") != null && !jsonObj.get("displayLanguage").isJsonNull()) && !jsonObj.get("displayLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayLanguage").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("displayScript") != null && !jsonObj.get("displayScript").isJsonNull()) && !jsonObj.get("displayScript").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayScript` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayScript").toString()));
      }
      if ((jsonObj.get("displayVariant") != null && !jsonObj.get("displayVariant").isJsonNull()) && !jsonObj.get("displayVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayVariant").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensionKeys") != null && !jsonObj.get("extensionKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionKeys` to be an array in the JSON string but got `%s`", jsonObj.get("extensionKeys").toString()));
      }
      if ((jsonObj.get("iso3Country") != null && !jsonObj.get("iso3Country").isJsonNull()) && !jsonObj.get("iso3Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso3Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso3Country").toString()));
      }
      if ((jsonObj.get("iso3Language") != null && !jsonObj.get("iso3Language").isJsonNull()) && !jsonObj.get("iso3Language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso3Language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso3Language").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("script") != null && !jsonObj.get("script").isJsonNull()) && !jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unicodeLocaleAttributes") != null && !jsonObj.get("unicodeLocaleAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unicodeLocaleAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("unicodeLocaleAttributes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unicodeLocaleKeys") != null && !jsonObj.get("unicodeLocaleKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unicodeLocaleKeys` to be an array in the JSON string but got `%s`", jsonObj.get("unicodeLocaleKeys").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Locale.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Locale' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Locale> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Locale.class));

       return (TypeAdapter<T>) new TypeAdapter<Locale>() {
           @Override
           public void write(JsonWriter out, Locale value) throws IOException {
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
           public Locale read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Locale instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Locale given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Locale
  * @throws IOException if the JSON string is invalid with respect to Locale
  */
  public static Locale fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Locale.class);
  }

 /**
  * Convert an instance of Locale to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

