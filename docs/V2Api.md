# V2Api

All URIs are relative to *http://www.ticketmaster.com/discovery/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventSearch**](V2Api.md#eventSearch) | **GET** /discovery/v2/events | Event Search |
| [**findSuggest**](V2Api.md#findSuggest) | **GET** /discovery/v2/suggest | Find Suggest |
| [**findVenues**](V2Api.md#findVenues) | **GET** /discovery/v2/venues | Venue Search |
| [**getAttractionDetails**](V2Api.md#getAttractionDetails) | **GET** /discovery/v2/attractions/{id} | Get Attraction Details |
| [**getClassificationDetails**](V2Api.md#getClassificationDetails) | **GET** /discovery/v2/classifications/{id} | Get Classification Details |
| [**getEventDetails**](V2Api.md#getEventDetails) | **GET** /discovery/v2/events/{id} | Get Event Details |
| [**getEventImages**](V2Api.md#getEventImages) | **GET** /discovery/v2/events/{id}/images | Get Event Images |
| [**getGenreDetails**](V2Api.md#getGenreDetails) | **GET** /discovery/v2/classifications/genres/{id} | Get Genre Details |
| [**getSegmentDetails**](V2Api.md#getSegmentDetails) | **GET** /discovery/v2/classifications/segments/{id} | Get Segment Details |
| [**getSubgenreDetails**](V2Api.md#getSubgenreDetails) | **GET** /discovery/v2/classifications/subgenres/{id} | Get Sub-Genre Details |
| [**getVenueDetails**](V2Api.md#getVenueDetails) | **GET** /discovery/v2/venues/{id} | Get Venue Details |
| [**searchAttractions**](V2Api.md#searchAttractions) | **GET** /discovery/v2/attractions | Attraction Search |
| [**searchClassifications**](V2Api.md#searchClassifications) | **GET** /discovery/v2/classifications | Classification Search |


<a name="eventSearch"></a>
# **eventSearch**
> List&lt;Event&gt; eventSearch().sort(sort).startDateTime(startDateTime).endDateTime(endDateTime).onsaleStartDateTime(onsaleStartDateTime).onsaleOnStartDate(onsaleOnStartDate).onsaleOnAfterStartDate(onsaleOnAfterStartDate).onsaleEndDateTime(onsaleEndDateTime).city(city).countryCode(countryCode).stateCode(stateCode).postalCode(postalCode).venueId(venueId).attractionId(attractionId).segmentId(segmentId).segmentName(segmentName).classificationName(classificationName).classificationId(classificationId).marketId(marketId).promoterId(promoterId).dmaId(dmaId).includeTBA(includeTBA).includeTBD(includeTBD).clientVisibility(clientVisibility).latlong(latlong).radius(radius).unit(unit).geoPoint(geoPoint).keyword(keyword).id(id).source(source).includeTest(includeTest).page(page).size(size).locale(locale).includeLicensedContent(includeLicensedContent).includeSpellcheck(includeSpellcheck).execute();

Event Search

Find events and filter your search by location, date, availability, and much more.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String sort = "relevance,desc"; // Sorting order of the search result. Allowable values : 'name,asc', 'name,desc', 'date,asc', 'date,desc', 'relevance,asc', 'relevance,desc', 'distance,asc', 'name,date,asc', 'name,date,desc', 'date,name,asc', 'date,name,desc','onsaleStartDate,asc', 'id,asc'
    String startDateTime = ""; // Filter events with a start date after this date
    String endDateTime = ""; // Filter events with a start date before this date
    String onsaleStartDateTime = ""; // Filter events with onsale start date after this date
    String onsaleOnStartDate = ""; // Filter events with onsale start date on this date
    String onsaleOnAfterStartDate = ""; // Filter events with onsale range within this date
    String onsaleEndDateTime = ""; // Filter events with onsale end date before this date
    String city = ""; // Filter events by city
    String countryCode = ""; // Filter events by country code
    String stateCode = ""; // Filter events by state code
    String postalCode = ""; // Filter events by postal code / zipcode
    String venueId = ""; // Filter events by venue id
    String attractionId = ""; // Filter events by attraction id
    String segmentId = ""; // Filter events by segment id
    String segmentName = ""; // Filter events by segment name
    List<Object> classificationName = Arrays.asList(null); // Filter events by classification name: name of any segment, genre, sub-genre, type, sub-type
    List<Object> classificationId = Arrays.asList(null); // Filter events by classification id: id of any segment, genre, sub-genre, type, sub-type
    String marketId = ""; // Filter events by market id
    String promoterId = ""; // Filter events by promoter id
    String dmaId = ""; // Filter events by dma id
    String includeTBA = "true"; // True, to include events with date to be announce (TBA)
    String includeTBD = "true"; // True, to include event with a date to be defined (TBD)
    String clientVisibility = ""; // Filter events by clientName
    String latlong = ""; // Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead
    String radius = "50"; // Radius of the area in which we want to search for events.
    String unit = "miles"; // Unit of the radius
    String geoPoint = ""; // filter events by geoHash
    String keyword = ""; // Keyword to search on
    String id = ""; // Filter entities by its id
    String source = "ticketmaster"; // Filter entities by its source name
    String includeTest = "true"; // True if you want to have entities flag as test in the response. Only, if you only wanted test entities
    String page = "0"; // Page number
    String size = "20"; // Page size of the response
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // Yes if you want to display licensed content
    String includeSpellcheck = "true"; // yes, to include spell check suggestions in the response.
    try {
      List<Event> result = client
              .v2
              .eventSearch()
              .sort(sort)
              .startDateTime(startDateTime)
              .endDateTime(endDateTime)
              .onsaleStartDateTime(onsaleStartDateTime)
              .onsaleOnStartDate(onsaleOnStartDate)
              .onsaleOnAfterStartDate(onsaleOnAfterStartDate)
              .onsaleEndDateTime(onsaleEndDateTime)
              .city(city)
              .countryCode(countryCode)
              .stateCode(stateCode)
              .postalCode(postalCode)
              .venueId(venueId)
              .attractionId(attractionId)
              .segmentId(segmentId)
              .segmentName(segmentName)
              .classificationName(classificationName)
              .classificationId(classificationId)
              .marketId(marketId)
              .promoterId(promoterId)
              .dmaId(dmaId)
              .includeTBA(includeTBA)
              .includeTBD(includeTBD)
              .clientVisibility(clientVisibility)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .geoPoint(geoPoint)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#eventSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Event>> response = client
              .v2
              .eventSearch()
              .sort(sort)
              .startDateTime(startDateTime)
              .endDateTime(endDateTime)
              .onsaleStartDateTime(onsaleStartDateTime)
              .onsaleOnStartDate(onsaleOnStartDate)
              .onsaleOnAfterStartDate(onsaleOnAfterStartDate)
              .onsaleEndDateTime(onsaleEndDateTime)
              .city(city)
              .countryCode(countryCode)
              .stateCode(stateCode)
              .postalCode(postalCode)
              .venueId(venueId)
              .attractionId(attractionId)
              .segmentId(segmentId)
              .segmentName(segmentName)
              .classificationName(classificationName)
              .classificationId(classificationId)
              .marketId(marketId)
              .promoterId(promoterId)
              .dmaId(dmaId)
              .includeTBA(includeTBA)
              .includeTBD(includeTBD)
              .clientVisibility(clientVisibility)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .geoPoint(geoPoint)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#eventSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sort** | **String**| Sorting order of the search result. Allowable values : &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;date,asc&#39;, &#39;date,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39;, &#39;distance,asc&#39;, &#39;name,date,asc&#39;, &#39;name,date,desc&#39;, &#39;date,name,asc&#39;, &#39;date,name,desc&#39;,&#39;onsaleStartDate,asc&#39;, &#39;id,asc&#39; | [optional] [default to relevance,desc] |
| **startDateTime** | **String**| Filter events with a start date after this date | [optional] [default to ] |
| **endDateTime** | **String**| Filter events with a start date before this date | [optional] [default to ] |
| **onsaleStartDateTime** | **String**| Filter events with onsale start date after this date | [optional] [default to ] |
| **onsaleOnStartDate** | **String**| Filter events with onsale start date on this date | [optional] [default to ] |
| **onsaleOnAfterStartDate** | **String**| Filter events with onsale range within this date | [optional] [default to ] |
| **onsaleEndDateTime** | **String**| Filter events with onsale end date before this date | [optional] [default to ] |
| **city** | **String**| Filter events by city | [optional] [default to ] |
| **countryCode** | **String**| Filter events by country code | [optional] [default to ] |
| **stateCode** | **String**| Filter events by state code | [optional] [default to ] |
| **postalCode** | **String**| Filter events by postal code / zipcode | [optional] [default to ] |
| **venueId** | **String**| Filter events by venue id | [optional] [default to ] |
| **attractionId** | **String**| Filter events by attraction id | [optional] [default to ] |
| **segmentId** | **String**| Filter events by segment id | [optional] [default to ] |
| **segmentName** | **String**| Filter events by segment name | [optional] [default to ] |
| **classificationName** | [**List&lt;Object&gt;**](Object.md)| Filter events by classification name: name of any segment, genre, sub-genre, type, sub-type | [optional] |
| **classificationId** | [**List&lt;Object&gt;**](Object.md)| Filter events by classification id: id of any segment, genre, sub-genre, type, sub-type | [optional] |
| **marketId** | **String**| Filter events by market id | [optional] [default to ] |
| **promoterId** | **String**| Filter events by promoter id | [optional] [default to ] |
| **dmaId** | **String**| Filter events by dma id | [optional] [default to ] |
| **includeTBA** | **String**| True, to include events with date to be announce (TBA) | [optional] [default to no if date parameter sent, yes otherwise] [enum: true,  no,  only] |
| **includeTBD** | **String**| True, to include event with a date to be defined (TBD) | [optional] [default to no if date parameter sent, yes otherwise] [enum: true,  no,  only] |
| **clientVisibility** | **String**| Filter events by clientName | [optional] [default to ] |
| **latlong** | **String**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to ] |
| **radius** | **String**| Radius of the area in which we want to search for events. | [optional] [default to 50] |
| **unit** | **String**| Unit of the radius | [optional] [default to miles] [enum: miles, km] |
| **geoPoint** | **String**| filter events by geoHash | [optional] [default to ] |
| **keyword** | **String**| Keyword to search on | [optional] [default to ] |
| **id** | **String**| Filter entities by its id | [optional] [default to ] |
| **source** | **String**| Filter entities by its source name | [optional] [default to ] [enum: ticketmaster,  universe,  frontgate,  tmr] |
| **includeTest** | **String**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false] [enum: true,  no,  only] |
| **page** | **String**| Page number | [optional] [default to 0] |
| **size** | **String**| Page size of the response | [optional] [default to 20] |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| Yes if you want to display licensed content | [optional] [default to false] [enum: true,  no] |
| **includeSpellcheck** | **String**| yes, to include spell check suggestions in the response. | [optional] [default to false] [enum: true,  no] |

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="findSuggest"></a>
# **findSuggest**
> String findSuggest().keyword(keyword).source(source).latlong(latlong).radius(radius).unit(unit).size(size).includeFuzzy(includeFuzzy).clientVisibility(clientVisibility).countryCode(countryCode).includeTBA(includeTBA).includeTBD(includeTBD).segmentId(segmentId).geoPoint(geoPoint).locale(locale).includeLicensedContent(includeLicensedContent).includeSpellcheck(includeSpellcheck).execute();

Find Suggest

Find search suggestions and filter your suggestions by location, source, etc.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String keyword = ""; // Keyword to search on
    String source = "ticketmaster"; // Filter entities by its source name
    String latlong = ""; // Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead
    String radius = "100"; // Radius of the area in which we want to search for events.
    String unit = "miles"; // Unit of the radius
    String size = "5"; // Size of every entity returned in the response
    String includeFuzzy = "true"; // yes, to include fuzzy matches in the search. This has performance impact.
    String clientVisibility = ""; // Filter events to clientName
    String countryCode = ""; // Filter suggestions by country code
    String includeTBA = "true"; // True, to include events with date to be announce (TBA)
    String includeTBD = "true"; // True, to include event with a date to be defined (TBD)
    String segmentId = ""; // Filter suggestions by segment id
    String geoPoint = ""; // filter events by geoHash
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // Yes if you want to display licensed content
    String includeSpellcheck = "true"; // yes, to include spell check suggestions in the response.
    try {
      String result = client
              .v2
              .findSuggest()
              .keyword(keyword)
              .source(source)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .size(size)
              .includeFuzzy(includeFuzzy)
              .clientVisibility(clientVisibility)
              .countryCode(countryCode)
              .includeTBA(includeTBA)
              .includeTBD(includeTBD)
              .segmentId(segmentId)
              .geoPoint(geoPoint)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#findSuggest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .v2
              .findSuggest()
              .keyword(keyword)
              .source(source)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .size(size)
              .includeFuzzy(includeFuzzy)
              .clientVisibility(clientVisibility)
              .countryCode(countryCode)
              .includeTBA(includeTBA)
              .includeTBD(includeTBD)
              .segmentId(segmentId)
              .geoPoint(geoPoint)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#findSuggest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyword** | **String**| Keyword to search on | [optional] [default to ] |
| **source** | **String**| Filter entities by its source name | [optional] [default to ] [enum: ticketmaster,  universe,  frontgate,  tmr] |
| **latlong** | **String**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to ] |
| **radius** | **String**| Radius of the area in which we want to search for events. | [optional] [default to 100] |
| **unit** | **String**| Unit of the radius | [optional] [default to miles] [enum: miles, km] |
| **size** | **String**| Size of every entity returned in the response | [optional] [default to 5] |
| **includeFuzzy** | **String**| yes, to include fuzzy matches in the search. This has performance impact. | [optional] [default to false] [enum: true,  no] |
| **clientVisibility** | **String**| Filter events to clientName | [optional] [default to ] |
| **countryCode** | **String**| Filter suggestions by country code | [optional] [default to ] |
| **includeTBA** | **String**| True, to include events with date to be announce (TBA) | [optional] [default to no if date parameter sent, yes otherwise] [enum: true,  no,  only] |
| **includeTBD** | **String**| True, to include event with a date to be defined (TBD) | [optional] [default to no if date parameter sent, yes otherwise] [enum: true,  no,  only] |
| **segmentId** | **String**| Filter suggestions by segment id | [optional] [default to ] |
| **geoPoint** | **String**| filter events by geoHash | [optional] [default to ] |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| Yes if you want to display licensed content | [optional] [default to false] [enum: true,  no] |
| **includeSpellcheck** | **String**| yes, to include spell check suggestions in the response. | [optional] [default to false] [enum: true,  no] |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="findVenues"></a>
# **findVenues**
> List&lt;Venue&gt; findVenues().sort(sort).stateCode(stateCode).countryCode(countryCode).latlong(latlong).radius(radius).unit(unit).geoPoint(geoPoint).keyword(keyword).id(id).source(source).includeTest(includeTest).page(page).size(size).locale(locale).includeLicensedContent(includeLicensedContent).includeSpellcheck(includeSpellcheck).execute();

Venue Search

Find venues and filter your search by name, and much more.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String sort = "relevance,desc"; // Sorting order of the search result. Allowable Values: 'name,asc', 'name,desc', 'relevance,asc', 'relevance,desc', 'distance,asc', 'distance,desc'
    String stateCode = ""; // Filter venues by state / province code
    String countryCode = ""; // Filter venues by country code
    String latlong = ""; // Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead
    String radius = "50"; // Radius of the area in which we want to search for events.
    String unit = "miles"; // Unit of the radius
    String geoPoint = ""; // filter events by geoHash
    String keyword = ""; // Keyword to search on
    String id = ""; // Filter entities by its id
    String source = "ticketmaster"; // Filter entities by its source name
    String includeTest = "true"; // True if you want to have entities flag as test in the response. Only, if you only wanted test entities
    String page = "0"; // Page number
    String size = "20"; // Page size of the response
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // Yes if you want to display licensed content
    String includeSpellcheck = "true"; // yes, to include spell check suggestions in the response.
    try {
      List<Venue> result = client
              .v2
              .findVenues()
              .sort(sort)
              .stateCode(stateCode)
              .countryCode(countryCode)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .geoPoint(geoPoint)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#findVenues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Venue>> response = client
              .v2
              .findVenues()
              .sort(sort)
              .stateCode(stateCode)
              .countryCode(countryCode)
              .latlong(latlong)
              .radius(radius)
              .unit(unit)
              .geoPoint(geoPoint)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#findVenues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sort** | **String**| Sorting order of the search result. Allowable Values: &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39;, &#39;distance,asc&#39;, &#39;distance,desc&#39; | [optional] [default to relevance,desc] |
| **stateCode** | **String**| Filter venues by state / province code | [optional] [default to ] |
| **countryCode** | **String**| Filter venues by country code | [optional] [default to ] |
| **latlong** | **String**| Filter events by latitude and longitude, this filter is deprecated and maybe removed in a future release, please use geoPoint instead | [optional] [default to ] |
| **radius** | **String**| Radius of the area in which we want to search for events. | [optional] [default to 50] |
| **unit** | **String**| Unit of the radius | [optional] [default to miles] [enum: miles, km] |
| **geoPoint** | **String**| filter events by geoHash | [optional] [default to ] |
| **keyword** | **String**| Keyword to search on | [optional] [default to ] |
| **id** | **String**| Filter entities by its id | [optional] [default to ] |
| **source** | **String**| Filter entities by its source name | [optional] [default to ] [enum: ticketmaster,  universe,  frontgate,  tmr] |
| **includeTest** | **String**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false] [enum: true,  no,  only] |
| **page** | **String**| Page number | [optional] [default to 0] |
| **size** | **String**| Page size of the response | [optional] [default to 20] |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| Yes if you want to display licensed content | [optional] [default to false] [enum: true,  no] |
| **includeSpellcheck** | **String**| yes, to include spell check suggestions in the response. | [optional] [default to false] [enum: true,  no] |

### Return type

[**List&lt;Venue&gt;**](Venue.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getAttractionDetails"></a>
# **getAttractionDetails**
> Attraction getAttractionDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Attraction Details

Get details for a specific attraction using the unique identifier for the attraction.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the attraction
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Attraction result = client
              .v2
              .getAttractionDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAdditionalInfo());
      System.out.println(result.getClassifications());
      System.out.println(result.getExternalLinks());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getLocale());
      System.out.println(result.getName());
      System.out.println(result.getTest());
      System.out.println(result.getType());
      System.out.println(result.getUpcomingEvents());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getAttractionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Attraction> response = client
              .v2
              .getAttractionDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getAttractionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the attraction | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Attraction**](Attraction.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getClassificationDetails"></a>
# **getClassificationDetails**
> Classification getClassificationDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Classification Details

Get details for a specific segment, genre, or sub-genre using its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the segment, genre, or sub-genre
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Classification result = client
              .v2
              .getClassificationDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getGenre());
      System.out.println(result.getPrimary());
      System.out.println(result.getSegment());
      System.out.println(result.getSubGenre());
      System.out.println(result.getSubType());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getClassificationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .v2
              .getClassificationDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getClassificationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the segment, genre, or sub-genre | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Classification**](Classification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getEventDetails"></a>
# **getEventDetails**
> Event getEventDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Event Details

Get details for a specific event using the unique identifier for the event. This includes the venue and location, the attraction(s), and the Ticketmaster Website URL for purchasing tickets for the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the event
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Event result = client
              .v2
              .getEventDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getInfo());
      System.out.println(result.getDescription());
      System.out.println(result.getAccessibility());
      System.out.println(result.getAdditionalInfo());
      System.out.println(result.getClassifications());
      System.out.println(result.getDates());
      System.out.println(result.getDistance());
      System.out.println(result.getExternalLinks());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getLocale());
      System.out.println(result.getLocation());
      System.out.println(result.getName());
      System.out.println(result.getOutlets());
      System.out.println(result.getPlace());
      System.out.println(result.getPleaseNote());
      System.out.println(result.getPriceRanges());
      System.out.println(result.getProducts());
      System.out.println(result.getPromoter());
      System.out.println(result.getPromoters());
      System.out.println(result.getSales());
      System.out.println(result.getSeatmap());
      System.out.println(result.getTest());
      System.out.println(result.getType());
      System.out.println(result.getUnits());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getEventDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Event> response = client
              .v2
              .getEventDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getEventDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the event | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Event**](Event.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getEventImages"></a>
# **getEventImages**
> EventImages getEventImages(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Event Images

Get images for a specific event using the unique identifier for the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the event
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      EventImages result = client
              .v2
              .getEventImages(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getEventImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventImages> response = client
              .v2
              .getEventImages(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getEventImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the event | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**EventImages**](EventImages.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getGenreDetails"></a>
# **getGenreDetails**
> Genre getGenreDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Genre Details

Get details for a specific genre using its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the genre
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Genre result = client
              .v2
              .getGenreDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getGenreDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Genre> response = client
              .v2
              .getGenreDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getGenreDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the genre | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Genre**](Genre.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getSegmentDetails"></a>
# **getSegmentDetails**
> Segment getSegmentDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Segment Details

Get details for a specific segment using its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the segment
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Segment result = client
              .v2
              .getSegmentDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSegmentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segment> response = client
              .v2
              .getSegmentDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSegmentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the segment | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Segment**](Segment.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getSubgenreDetails"></a>
# **getSubgenreDetails**
> Level getSubgenreDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Sub-Genre Details

Get details for a specific sub-genre using its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the subgenre
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Level result = client
              .v2
              .getSubgenreDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSubgenreDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Level> response = client
              .v2
              .getSubgenreDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getSubgenreDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the subgenre | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Level**](Level.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getVenueDetails"></a>
# **getVenueDetails**
> Venue getVenueDetails(id).locale(locale).includeLicensedContent(includeLicensedContent).execute();

Get Venue Details

Get details for a specific venue using the unique identifier for the venue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String id = "id_example"; // ID of the venue
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // True if you want to display licensed content
    try {
      Venue result = client
              .v2
              .getVenueDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAccessibleSeatingDetail());
      System.out.println(result.getAdditionalInfo());
      System.out.println(result.getAddress());
      System.out.println(result.getBoxOfficeInfo());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
      System.out.println(result.getCurrency());
      System.out.println(result.getDistance());
      System.out.println(result.getDma());
      System.out.println(result.getExternalLinks());
      System.out.println(result.getGeneralInfo());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getLocale());
      System.out.println(result.getLocation());
      System.out.println(result.getMarkets());
      System.out.println(result.getName());
      System.out.println(result.getParkingDetail());
      System.out.println(result.getPostalCode());
      System.out.println(result.getSocial());
      System.out.println(result.getState());
      System.out.println(result.getTest());
      System.out.println(result.getTimezone());
      System.out.println(result.getType());
      System.out.println(result.getUnits());
      System.out.println(result.getUpcomingEvents());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getVenueDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Venue> response = client
              .v2
              .getVenueDetails(id)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#getVenueDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the venue | |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| True if you want to display licensed content | [optional] [default to false] [enum: true,  no] |

### Return type

[**Venue**](Venue.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="searchAttractions"></a>
# **searchAttractions**
> List&lt;Attraction&gt; searchAttractions().sort(sort).classificationName(classificationName).classificationId(classificationId).keyword(keyword).id(id).source(source).includeTest(includeTest).page(page).size(size).locale(locale).includeLicensedContent(includeLicensedContent).includeSpellcheck(includeSpellcheck).execute();

Attraction Search

Find attractions (artists, sports, packages, plays and so on) and filter your search by name, and much more.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String sort = "relevance,desc"; // Sorting order of the search result. Allowable Values : 'name,asc', 'name,desc', 'relevance,asc', 'relevance,desc'
    List<Object> classificationName = Arrays.asList(null); // Filter attractions by classification name: name of any segment, genre, sub-genre, type, sub-type
    List<Object> classificationId = Arrays.asList(null); // Filter attractions by classification id: id of any segment, genre, sub-genre, type, sub-type
    String keyword = ""; // Keyword to search on
    String id = ""; // Filter entities by its id
    String source = "ticketmaster"; // Filter entities by its source name
    String includeTest = "true"; // True if you want to have entities flag as test in the response. Only, if you only wanted test entities
    String page = "0"; // Page number
    String size = "20"; // Page size of the response
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // Yes if you want to display licensed content
    String includeSpellcheck = "true"; // yes, to include spell check suggestions in the response.
    try {
      List<Attraction> result = client
              .v2
              .searchAttractions()
              .sort(sort)
              .classificationName(classificationName)
              .classificationId(classificationId)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#searchAttractions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Attraction>> response = client
              .v2
              .searchAttractions()
              .sort(sort)
              .classificationName(classificationName)
              .classificationId(classificationId)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#searchAttractions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sort** | **String**| Sorting order of the search result. Allowable Values : &#39;name,asc&#39;, &#39;name,desc&#39;, &#39;relevance,asc&#39;, &#39;relevance,desc&#39; | [optional] [default to relevance,desc] |
| **classificationName** | [**List&lt;Object&gt;**](Object.md)| Filter attractions by classification name: name of any segment, genre, sub-genre, type, sub-type | [optional] |
| **classificationId** | [**List&lt;Object&gt;**](Object.md)| Filter attractions by classification id: id of any segment, genre, sub-genre, type, sub-type | [optional] |
| **keyword** | **String**| Keyword to search on | [optional] [default to ] |
| **id** | **String**| Filter entities by its id | [optional] [default to ] |
| **source** | **String**| Filter entities by its source name | [optional] [default to ] [enum: ticketmaster,  universe,  frontgate,  tmr] |
| **includeTest** | **String**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false] [enum: true,  no,  only] |
| **page** | **String**| Page number | [optional] [default to 0] |
| **size** | **String**| Page size of the response | [optional] [default to 20] |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| Yes if you want to display licensed content | [optional] [default to false] [enum: true,  no] |
| **includeSpellcheck** | **String**| yes, to include spell check suggestions in the response. | [optional] [default to false] [enum: true,  no] |

### Return type

[**List&lt;Attraction&gt;**](Attraction.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="searchClassifications"></a>
# **searchClassifications**
> List&lt;Classification&gt; searchClassifications().sort(sort).keyword(keyword).id(id).source(source).includeTest(includeTest).page(page).size(size).locale(locale).includeLicensedContent(includeLicensedContent).includeSpellcheck(includeSpellcheck).execute();

Classification Search

Find classifications and filter your search by name, and much more. Classifications help define the nature of attractions and events.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ticketmaster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://www.ticketmaster.com/discovery/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    Ticketmaster client = new Ticketmaster(configuration);
    String sort = "name,asc"; // Sorting order of the search result
    String keyword = ""; // Keyword to search on
    String id = ""; // Filter entities by its id
    String source = "ticketmaster"; // Filter entities by its source name
    String includeTest = "true"; // True if you want to have entities flag as test in the response. Only, if you only wanted test entities
    String page = "0"; // Page number
    String size = "20"; // Page size of the response
    String locale = "en"; // The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only 'en' or 'fr') then the first matching locale is used. When using a '*' it matches all locales. '*' can only be used at the end (e.g. 'en-us,en,*') 
    String includeLicensedContent = "true"; // Yes if you want to display licensed content
    String includeSpellcheck = "true"; // yes, to include spell check suggestions in the response.
    try {
      List<Classification> result = client
              .v2
              .searchClassifications()
              .sort(sort)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#searchClassifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Classification>> response = client
              .v2
              .searchClassifications()
              .sort(sort)
              .keyword(keyword)
              .id(id)
              .source(source)
              .includeTest(includeTest)
              .page(page)
              .size(size)
              .locale(locale)
              .includeLicensedContent(includeLicensedContent)
              .includeSpellcheck(includeSpellcheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2Api#searchClassifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sort** | **String**| Sorting order of the search result | [optional] [default to name,asc] |
| **keyword** | **String**| Keyword to search on | [optional] [default to ] |
| **id** | **String**| Filter entities by its id | [optional] [default to ] |
| **source** | **String**| Filter entities by its source name | [optional] [default to ] [enum: ticketmaster,  universe,  frontgate,  tmr] |
| **includeTest** | **String**| True if you want to have entities flag as test in the response. Only, if you only wanted test entities | [optional] [default to false] [enum: true,  no,  only] |
| **page** | **String**| Page number | [optional] [default to 0] |
| **size** | **String**| Page size of the response | [optional] [default to 20] |
| **locale** | **String**| The locale in ISO code format. Multiple comma-separated values can be provided. When omitting the country part of the code (e.g. only &#39;en&#39; or &#39;fr&#39;) then the first matching locale is used. When using a &#39;*&#39; it matches all locales. &#39;*&#39; can only be used at the end (e.g. &#39;en-us,en,*&#39;)  | [optional] [default to en] |
| **includeLicensedContent** | **String**| Yes if you want to display licensed content | [optional] [default to false] [enum: true,  no] |
| **includeSpellcheck** | **String**| yes, to include spell check suggestions in the response. | [optional] [default to false] [enum: true,  no] |

### Return type

[**List&lt;Classification&gt;**](Classification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

