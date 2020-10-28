# AccountmessageApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageRouterGet**](AccountmessageApi.md#messageRouterGet) | **GET** /account/message/{messageId} | 
[**messageRouterGetAllEventsForAMessageId**](AccountmessageApi.md#messageRouterGetAllEventsForAMessageId) | **GET** /account/message/{messageId}/events | 
[**messageRouterGetAllEventsForAMessageIdFromANode**](AccountmessageApi.md#messageRouterGetAllEventsForAMessageIdFromANode) | **GET** /account/message/node/{messageId}/events | 
[**messageRouterGetMessageFromNode**](AccountmessageApi.md#messageRouterGetMessageFromNode) | **GET** /account/message/node/{messageId} | 


<a name="messageRouterGet"></a>
# **messageRouterGet**
> ModelsQEmailMessage messageRouterGet(xAccountApiKey, messageId)



Find Message By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmessageApi;


AccountmessageApi apiInstance = new AccountmessageApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Sub-Account API Key
String messageId = "messageId_example"; // String | the messageId that you want to retrieve
try {
    ModelsQEmailMessage result = apiInstance.messageRouterGet(xAccountApiKey, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmessageApi#messageRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Sub-Account API Key |
 **messageId** | **String**| the messageId that you want to retrieve |

### Return type

[**ModelsQEmailMessage**](ModelsQEmailMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageRouterGetAllEventsForAMessageId"></a>
# **messageRouterGetAllEventsForAMessageId**
> List&lt;ModelsQEvent&gt; messageRouterGetAllEventsForAMessageId(xAccountApiKey, messageId)



Find all events associated with a message id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmessageApi;


AccountmessageApi apiInstance = new AccountmessageApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String messageId = "messageId_example"; // String | the messageId that you want to retrieve
try {
    List<ModelsQEvent> result = apiInstance.messageRouterGetAllEventsForAMessageId(xAccountApiKey, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmessageApi#messageRouterGetAllEventsForAMessageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **messageId** | **String**| the messageId that you want to retrieve |

### Return type

[**List&lt;ModelsQEvent&gt;**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageRouterGetAllEventsForAMessageIdFromANode"></a>
# **messageRouterGetAllEventsForAMessageIdFromANode**
> List&lt;ModelsQEvent&gt; messageRouterGetAllEventsForAMessageIdFromANode(xAccountApiKey, messageId)



Find all message events associated with a message id from a specific node

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmessageApi;


AccountmessageApi apiInstance = new AccountmessageApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String messageId = "messageId_example"; // String | the messageId that you want to retrieve
try {
    List<ModelsQEvent> result = apiInstance.messageRouterGetAllEventsForAMessageIdFromANode(xAccountApiKey, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmessageApi#messageRouterGetAllEventsForAMessageIdFromANode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **messageId** | **String**| the messageId that you want to retrieve |

### Return type

[**List&lt;ModelsQEvent&gt;**](ModelsQEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageRouterGetMessageFromNode"></a>
# **messageRouterGetMessageFromNode**
> ModelsQEmailMessage messageRouterGetMessageFromNode(xAccountApiKey, messageId)



Find Message from node by specific Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountmessageApi;


AccountmessageApi apiInstance = new AccountmessageApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String messageId = "messageId_example"; // String | the messageId that you want to retrieve
try {
    ModelsQEmailMessage result = apiInstance.messageRouterGetMessageFromNode(xAccountApiKey, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountmessageApi#messageRouterGetMessageFromNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **messageId** | **String**| the messageId that you want to retrieve |

### Return type

[**ModelsQEmailMessage**](ModelsQEmailMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

