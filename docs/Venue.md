

# Venue

Venue

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description&#39;s of the entity |  [optional] |
|**accessibleSeatingDetail** | **String** | Venue accessible seating detail |  [optional] |
|**additionalInfo** | **String** | Additional information of the entity |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**boxOfficeInfo** | [**VenueBoxOfficeInfo**](VenueBoxOfficeInfo.md) |  |  [optional] |
|**city** | [**City**](City.md) |  |  [optional] |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**currency** | **String** | Default currency of ticket prices for events in this venue |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**dma** | [**List&lt;Dma&gt;**](Dma.md) | The list of associated DMAs (Designated Market Areas) of the venue |  [optional] |
|**externalLinks** | **Map&lt;String, List&lt;ExternalLink&gt;&gt;** | List of external links |  [optional] |
|**generalInfo** | [**VenueGeneralInfo**](VenueGeneralInfo.md) |  |  [optional] |
|**id** | **String** | Unique id of the entity in the discovery API |  |
|**images** | [**Set&lt;Image&gt;**](Image.md) | Images of the entity |  [optional] |
|**locale** | **String** | Locale in which the content is returned |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**markets** | [**List&lt;Market&gt;**](Market.md) | Markets of the venue |  [optional] |
|**name** | **String** | Name of the entity |  [optional] |
|**parkingDetail** | **String** | Venue parking info |  [optional] |
|**postalCode** | **String** | Postal code / zipcode of the venue |  [optional] |
|**social** | [**Social**](Social.md) |  |  [optional] |
|**state** | [**State**](State.md) |  |  [optional] |
|**test** | **Boolean** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API |  [optional] |
|**timezone** | **String** | Timezone of the venue |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the entity |  |
|**units** | **String** |  |  [optional] |
|**upcomingEvents** | **Map&lt;String, Integer&gt;** | number of upcoming events |  [optional] |
|**url** | **String** | URL of a web site detail page of the entity |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |
| VENUE | &quot;venue&quot; |
| ATTRACTION | &quot;attraction&quot; |



