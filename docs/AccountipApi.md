# AccountipApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPRouterAllocateIP**](AccountipApi.md#iPRouterAllocateIP) | **POST** /account/ip/allocate | 
[**iPRouterCount**](AccountipApi.md#iPRouterCount) | **GET** /account/ip/count | 
[**iPRouterDelete**](AccountipApi.md#iPRouterDelete) | **DELETE** /account/ip/{ipid} | 
[**iPRouterGet**](AccountipApi.md#iPRouterGet) | **GET** /account/ip/{ipid} | 
[**iPRouterGetAll**](AccountipApi.md#iPRouterGetAll) | **GET** /account/ip/ | 
[**iPRouterUpdate**](AccountipApi.md#iPRouterUpdate) | **PUT** /account/ip/{ipid} | 


<a name="iPRouterAllocateIP"></a>
# **iPRouterAllocateIP**
> List&lt;ModelsIP&gt; iPRouterAllocateIP(xAccountApiKey)



Allocate IP To Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsIP> result = apiInstance.iPRouterAllocateIP(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterAllocateIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsIP&gt;**](ModelsIP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPRouterCount"></a>
# **iPRouterCount**
> ModelsCountStat iPRouterCount(xAccountApiKey, search)



Count Total AccountIPs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String search = "search_example"; // String | search term
try {
    ModelsCountStat result = apiInstance.iPRouterCount(xAccountApiKey, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **search** | **String**| search term | [optional]

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPRouterDelete"></a>
# **iPRouterDelete**
> ModelsDeleteResponse iPRouterDelete(xAccountApiKey, ipid)



Delete IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | The IPId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.iPRouterDelete(xAccountApiKey, ipid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| The IPId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPRouterGet"></a>
# **iPRouterGet**
> ModelsIP iPRouterGet(xAccountApiKey, ipid)



Find IP by IPId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
try {
    ModelsIP result = apiInstance.iPRouterGet(xAccountApiKey, ipid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |

### Return type

[**ModelsIP**](ModelsIP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPRouterGetAll"></a>
# **iPRouterGetAll**
> List&lt;ModelsIP&gt; iPRouterGetAll(xAccountApiKey, offset, limit, search)



Get All IPs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsIP> result = apiInstance.iPRouterGetAll(xAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **offset** | **Long**| offset | [optional]
 **limit** | **Long**| limit | [optional]
 **search** | **String**| search term | [optional]

### Return type

[**List&lt;ModelsIP&gt;**](ModelsIP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPRouterUpdate"></a>
# **iPRouterUpdate**
> ModelsIP iPRouterUpdate(xAccountApiKey, ipid, body)



Update an IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipApi;


AccountipApi apiInstance = new AccountipApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | The IP you want to update
ModelsIIP body = new ModelsIIP(); // ModelsIIP | The IP Email Provider Settings
try {
    ModelsIP result = apiInstance.iPRouterUpdate(xAccountApiKey, ipid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipApi#iPRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| The IP you want to update |
 **body** | [**ModelsIIP**](ModelsIIP.md)| The IP Email Provider Settings |

### Return type

[**ModelsIP**](ModelsIP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

