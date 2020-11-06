# AccounteventApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventRouterCountAllEventsFromAAccountForAGivenTimeRange**](AccounteventApi.md#eventRouterCountAllEventsFromAAccountForAGivenTimeRange) | **GET** /account/event/count | 
[**eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange**](AccounteventApi.md#eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange) | **GET** /account/event/node/count | 
[**eventRouterGet**](AccounteventApi.md#eventRouterGet) | **GET** /account/event/{eventId} | 
[**eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange**](AccounteventApi.md#eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange) | **GET** /account/event/node/timestampkeys | 
[**eventRouterGetAllEventsOfAAccountFromASpecificNode**](AccounteventApi.md#eventRouterGetAllEventsOfAAccountFromASpecificNode) | **POST** /account/event/node | 
[**eventRouterGetEventInNode**](AccounteventApi.md#eventRouterGetEventInNode) | **GET** /account/event/node/{eventId} | 


<a name="eventRouterCountAllEventsFromAAccountForAGivenTimeRange"></a>
# **eventRouterCountAllEventsFromAAccountForAGivenTimeRange**
> ModelsCountStat eventRouterCountAllEventsFromAAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId)



Count all events from a account for a given time-range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String search = "search_example"; // String | search term
String type = "type_example"; // String | search type
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
String source = "source_example"; // String | data source from which to get timestamp keys subaccount or ip
String sourceId = "sourceId_example"; // String | source id from which to get timestamp keys subaccount or ip
try {
    ModelsCountStat result = apiInstance.eventRouterCountAllEventsFromAAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterCountAllEventsFromAAccountForAGivenTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **search** | **String**| search term | [optional]
 **type** | **String**| search type | [optional]
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]
 **source** | **String**| data source from which to get timestamp keys subaccount or ip | [optional]
 **sourceId** | **String**| source id from which to get timestamp keys subaccount or ip | [optional]

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange"></a>
# **eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange**
> ModelsCountStat eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId)



Count all events from a node of a sub-account for a given time-range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String search = "search_example"; // String | search term
String type = "type_example"; // String | search type
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
String source = "source_example"; // String | data source from which to get timestamp keys subaccount or ip
String sourceId = "sourceId_example"; // String | source id from which to get timestamp keys subaccount or ip
try {
    ModelsCountStat result = apiInstance.eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterCountAllEventsFromANodeOfASubAccountForAGivenTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **search** | **String**| search term | [optional]
 **type** | **String**| search type | [optional]
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]
 **source** | **String**| data source from which to get timestamp keys subaccount or ip | [optional]
 **sourceId** | **String**| source id from which to get timestamp keys subaccount or ip | [optional]

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventRouterGet"></a>
# **eventRouterGet**
> ModelsQEvent eventRouterGet(xAccountApiKey, eventId)



Find Event By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String eventId = "eventId_example"; // String | the eventId that you want to retrieve
try {
    ModelsQEvent result = apiInstance.eventRouterGet(xAccountApiKey, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **eventId** | **String**| the eventId that you want to retrieve |

### Return type

[**ModelsQEvent**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange"></a>
# **eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange**
> List&lt;ModelsQEvent&gt; eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId)



Find all events of a sub-account from a specific node for a give time-range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String search = "search_example"; // String | search term
String type = "type_example"; // String | search type
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
String source = "source_example"; // String | data source from which to get timestamp keys subaccount or ip
String sourceId = "sourceId_example"; // String | source id from which to get timestamp keys subaccount or ip
try {
    List<ModelsQEvent> result = apiInstance.eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange(xAccountApiKey, search, type, from, to, source, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterGetAllEventTimestampKeysOfASubAccountFromASpecificNodeForAGivenTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **search** | **String**| search term | [optional]
 **type** | **String**| search type | [optional]
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]
 **source** | **String**| data source from which to get timestamp keys subaccount or ip | [optional]
 **sourceId** | **String**| source id from which to get timestamp keys subaccount or ip | [optional]

### Return type

[**List&lt;ModelsQEvent&gt;**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventRouterGetAllEventsOfAAccountFromASpecificNode"></a>
# **eventRouterGetAllEventsOfAAccountFromASpecificNode**
> List&lt;ModelsQEvent&gt; eventRouterGetAllEventsOfAAccountFromASpecificNode(xAccountApiKey)



Find all events of a account from a specific node

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsQEvent> result = apiInstance.eventRouterGetAllEventsOfAAccountFromASpecificNode(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterGetAllEventsOfAAccountFromASpecificNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsQEvent&gt;**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventRouterGetEventInNode"></a>
# **eventRouterGetEventInNode**
> ModelsQEvent eventRouterGetEventInNode(xAccountApiKey, eventId)



Find Event From Node by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounteventApi;


AccounteventApi apiInstance = new AccounteventApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String eventId = "eventId_example"; // String | the eventId that you want to retrieve
try {
    ModelsQEvent result = apiInstance.eventRouterGetEventInNode(xAccountApiKey, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounteventApi#eventRouterGetEventInNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **eventId** | **String**| the eventId that you want to retrieve |

### Return type

[**ModelsQEvent**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

