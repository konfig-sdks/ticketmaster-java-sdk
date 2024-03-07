

# Attraction

Attraction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description&#39;s of the entity |  [optional] |
|**additionalInfo** | **String** | Additional information of the entity |  [optional] |
|**classifications** | [**List&lt;Classification&gt;**](Classification.md) | Attraction&#39;s classifications |  [optional] |
|**externalLinks** | **Map&lt;String, List&lt;ExternalLink&gt;&gt;** | List of external links |  [optional] |
|**id** | **String** | Unique id of the entity in the discovery API |  |
|**images** | [**Set&lt;Image&gt;**](Image.md) | Images of the entity |  [optional] |
|**locale** | **String** | Locale in which the content is returned |  [optional] |
|**name** | **String** | Name of the entity |  [optional] |
|**test** | **Boolean** | Indicate if this is a test entity, by default test entities won&#39;t appear in discovery API |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the entity |  |
|**upcomingEvents** | **Map&lt;String, Integer&gt;** | number of upcoming events |  [optional] |
|**url** | **String** | URL of a web site detail page of the entity |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |
| VENUE | &quot;venue&quot; |
| ATTRACTION | &quot;attraction&quot; |



