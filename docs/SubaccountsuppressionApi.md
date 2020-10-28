# SubaccountsuppressionApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**suppressionRouterCount**](SubaccountsuppressionApi.md#suppressionRouterCount) | **GET** /subaccount/suppression/count | 
[**suppressionRouterCreateSuppressions**](SubaccountsuppressionApi.md#suppressionRouterCreateSuppressions) | **POST** /subaccount/suppression/ | 
[**suppressionRouterCreateSuppressionsInSuppressionFilter**](SubaccountsuppressionApi.md#suppressionRouterCreateSuppressionsInSuppressionFilter) | **POST** /subaccount/suppression/filter | 
[**suppressionRouterDeleteSuppression**](SubaccountsuppressionApi.md#suppressionRouterDeleteSuppression) | **DELETE** /subaccount/suppression/ | 
[**suppressionRouterDeleteSuppressionsInSuppressionFilter**](SubaccountsuppressionApi.md#suppressionRouterDeleteSuppressionsInSuppressionFilter) | **DELETE** /subaccount/suppression/filter | 
[**suppressionRouterGetAllSuppressions**](SubaccountsuppressionApi.md#suppressionRouterGetAllSuppressions) | **GET** /subaccount/suppression/ | 


<a name="suppressionRouterCount"></a>
# **suppressionRouterCount**
> ModelsCountStat suppressionRouterCount(xSubAccountApiKey)



Count Total Suppressions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
try {
    ModelsCountStat result = apiInstance.suppressionRouterCount(xSubAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterCount");
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

<a name="suppressionRouterCreateSuppressions"></a>
# **suppressionRouterCreateSuppressions**
> ModelsSuppression suppressionRouterCreateSuppressions(xSubAccountApiKey, body)



Add Email Addresses To Suppression List

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsRSuppression body = new ModelsRSuppression(); // ModelsRSuppression | Suppression content
try {
    ModelsSuppression result = apiInstance.suppressionRouterCreateSuppressions(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterCreateSuppressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsRSuppression**](ModelsRSuppression.md)| Suppression content |

### Return type

[**ModelsSuppression**](ModelsSuppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressionRouterCreateSuppressionsInSuppressionFilter"></a>
# **suppressionRouterCreateSuppressionsInSuppressionFilter**
> suppressionRouterCreateSuppressionsInSuppressionFilter(body)



Add Email Addresses To Suppression Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
ModelsSuppression body = new ModelsSuppression(); // ModelsSuppression | Add suppressions to suppression filter
try {
    apiInstance.suppressionRouterCreateSuppressionsInSuppressionFilter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterCreateSuppressionsInSuppressionFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsSuppression**](ModelsSuppression.md)| Add suppressions to suppression filter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressionRouterDeleteSuppression"></a>
# **suppressionRouterDeleteSuppression**
> ModelsSuppression suppressionRouterDeleteSuppression(xSubAccountApiKey, body)



Delete specific emails which are in suppression list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsRDSuppression body = new ModelsRDSuppression(); // ModelsRDSuppression | Suppression content
try {
    ModelsSuppression result = apiInstance.suppressionRouterDeleteSuppression(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterDeleteSuppression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsRDSuppression**](ModelsRDSuppression.md)| Suppression content |

### Return type

[**ModelsSuppression**](ModelsSuppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressionRouterDeleteSuppressionsInSuppressionFilter"></a>
# **suppressionRouterDeleteSuppressionsInSuppressionFilter**
> suppressionRouterDeleteSuppressionsInSuppressionFilter(body)



Delete specific emails which are in suppression list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
ModelsSuppression body = new ModelsSuppression(); // ModelsSuppression | Suppression content
try {
    apiInstance.suppressionRouterDeleteSuppressionsInSuppressionFilter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterDeleteSuppressionsInSuppressionFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsSuppression**](ModelsSuppression.md)| Suppression content |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressionRouterGetAllSuppressions"></a>
# **suppressionRouterGetAllSuppressions**
> List&lt;ModelsSuppression&gt; suppressionRouterGetAllSuppressions(xSubAccountApiKey, offset, limit, search)



Get all suppressions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountsuppressionApi;


SubaccountsuppressionApi apiInstance = new SubaccountsuppressionApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search
try {
    List<ModelsSuppression> result = apiInstance.suppressionRouterGetAllSuppressions(xSubAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsuppressionApi#suppressionRouterGetAllSuppressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **offset** | **Long**| offset | [optional]
 **limit** | **Long**| limit | [optional]
 **search** | **String**| search | [optional]

### Return type

[**List&lt;ModelsSuppression&gt;**](ModelsSuppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

