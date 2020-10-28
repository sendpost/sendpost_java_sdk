# SubaccountsenderApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**senderRouterCount**](SubaccountsenderApi.md#senderRouterCount) | **GET** /subaccount/sender/count | 
[**senderRouterCreate**](SubaccountsenderApi.md#senderRouterCreate) | **POST** /subaccount/sender/ | 
[**senderRouterDelete**](SubaccountsenderApi.md#senderRouterDelete) | **DELETE** /subaccount/sender/{senderId} | 
[**senderRouterGet**](SubaccountsenderApi.md#senderRouterGet) | **GET** /subaccount/sender/{senderId} | 
[**senderRouterGetAll**](SubaccountsenderApi.md#senderRouterGetAll) | **GET** /subaccount/sender/ | 
[**senderRouterUpdate**](SubaccountsenderApi.md#senderRouterUpdate) | **PUT** /subaccount/sender/{senderId} | 


<a name="senderRouterCount"></a>
# **senderRouterCount**
> ModelsCountStat senderRouterCount(xSubAccountApiKey)



Count Total Senders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
try {
    ModelsCountStat result = apiInstance.senderRouterCount(xSubAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="senderRouterCreate"></a>
# **senderRouterCreate**
> ModelsSender senderRouterCreate(xSubAccountApiKey, body)



Create Sender

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsESender body = new ModelsESender(); // ModelsESender | The Sender content
try {
    ModelsSender result = apiInstance.senderRouterCreate(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsESender**](ModelsESender.md)| The Sender content |

### Return type

[**ModelsSender**](ModelsSender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="senderRouterDelete"></a>
# **senderRouterDelete**
> ModelsDeleteResponse senderRouterDelete(xSubAccountApiKey, senderId)



Delete Sender

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long senderId = 789L; // Long | The SenderId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.senderRouterDelete(xSubAccountApiKey, senderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **senderId** | **Long**| The SenderId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="senderRouterGet"></a>
# **senderRouterGet**
> ModelsSender senderRouterGet(xSubAccountApiKey, senderId)



Find Sender by SenderId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long senderId = 789L; // Long | the SenderId you want to get
try {
    ModelsSender result = apiInstance.senderRouterGet(xSubAccountApiKey, senderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **senderId** | **Long**| the SenderId you want to get |

### Return type

[**ModelsSender**](ModelsSender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="senderRouterGetAll"></a>
# **senderRouterGetAll**
> List&lt;ModelsSender&gt; senderRouterGetAll(xSubAccountApiKey, offset, limit, search)



Get All Senders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsSender> result = apiInstance.senderRouterGetAll(xSubAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **offset** | **Long**| offset | [optional]
 **limit** | **Long**| limit | [optional]
 **search** | **String**| search term | [optional]

### Return type

[**List&lt;ModelsSender&gt;**](ModelsSender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="senderRouterUpdate"></a>
# **senderRouterUpdate**
> ModelsSender senderRouterUpdate(xSubAccountApiKey, senderId, body)



Update Sender

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsenderApi;


SubaccountsenderApi apiInstance = new SubaccountsenderApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long senderId = 789L; // Long | The SenderId you want to update
ModelsESender body = new ModelsESender(); // ModelsESender | The body
try {
    ModelsSender result = apiInstance.senderRouterUpdate(xSubAccountApiKey, senderId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsenderApi#senderRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **senderId** | **Long**| The SenderId you want to update |
 **body** | [**ModelsESender**](ModelsESender.md)| The body |

### Return type

[**ModelsSender**](ModelsSender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

