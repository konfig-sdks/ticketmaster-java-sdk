

# Event

Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**info** | **String** | Any information related to the event |  [optional] |
|**description** | **String** | Description&#39;s of the entity |  [optional] |
|**accessibility** | [**Accessibility**](Accessibility.md) |  |  [optional] |
|**additionalInfo** | **String** | Additional information of the entity |  [optional] |
|**classifications** | [**List&lt;Classification&gt;**](Classification.md) | Event&#39;s classifications |  [optional] |
|**dates** | [**EventDates**](EventDates.md) |  |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**externalLinks** | **Map&lt;String, List&lt;ExternalLink&gt;&gt;** | List of external links |  [optional] |
|**id** | **String** | Unique id of the entity in the discovery API |  |
|**images** | [**Set&lt;Image&gt;**](Image.md) | Images of the entity |  [optional] |
|**locale** | **String** | Locale in which the content is returned |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**name** | **String** | Name of the entity |  [optional] |
|**outlets** | [**List&lt;Outlet&gt;**](Outlet.md) | Related outlets informations |  [optional] |
|**place** | [**Place**](Place.md) |  |  [optional] |
|**pleaseNote** | **String** | Any notes related to the event |  [optional] |
|**priceRanges** | [**Set&lt;PriceRange&gt;**](PriceRange.md) | Price ranges of this event |  [optional] |
|**products** | [**List&lt;Product&gt;**](Product.md) | Related products informations |  [optional] |
|**promoter** | [**Promoter**](Promoter.md) |  |  [optional] |
|**promoters** | [**List&lt;Promoter&gt;**](Promoter.md) | Event&#39;s promoters |  [optional] |
|**sales** | [**EventSalesDates**](EventSalesDates.md) |  |  [optional] |
|**seatmap** | [**SeatMap**](SeatMap.md) |  |  [optional] |
|**test** | **Boolean** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the entity |  |
|**units** | **String** |  |  [optional] |
|**url** | **String** | URL of a web site detail page of the entity |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |
| VENUE | &quot;venue&quot; |
| ATTRACTION | &quot;attraction&quot; |



