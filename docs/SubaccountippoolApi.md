# SubaccountippoolApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPPoolRouterCount**](SubaccountippoolApi.md#iPPoolRouterCount) | **GET** /subaccount/ippool/count | 
[**iPPoolRouterCreate**](SubaccountippoolApi.md#iPPoolRouterCreate) | **POST** /subaccount/ippool/ | 
[**iPPoolRouterDelete**](SubaccountippoolApi.md#iPPoolRouterDelete) | **DELETE** /subaccount/ippool/{ippoolid} | 
[**iPPoolRouterGet**](SubaccountippoolApi.md#iPPoolRouterGet) | **GET** /subaccount/ippool/{ippoolid} | 
[**iPPoolRouterGetAll**](SubaccountippoolApi.md#iPPoolRouterGetAll) | **GET** /subaccount/ippool/ | 
[**iPPoolRouterUpdate**](SubaccountippoolApi.md#iPPoolRouterUpdate) | **PUT** /subaccount/ippool/{ippoolid} | 


<a name="iPPoolRouterCount"></a>
# **iPPoolRouterCount**
> ModelsCountStat iPPoolRouterCount(xSubAccountApiKey)



Count Total IPPools

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
try {
    ModelsCountStat result = apiInstance.iPPoolRouterCount(xSubAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterCount");
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

<a name="iPPoolRouterCreate"></a>
# **iPPoolRouterCreate**
> ModelsIPPool iPPoolRouterCreate(xSubAccountApiKey, body)



Create IPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsEIPPool body = new ModelsEIPPool(); // ModelsEIPPool | The IPPool content
try {
    ModelsIPPool result = apiInstance.iPPoolRouterCreate(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsEIPPool**](ModelsEIPPool.md)| The IPPool content |

### Return type

[**ModelsIPPool**](ModelsIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPPoolRouterDelete"></a>
# **iPPoolRouterDelete**
> ModelsDeleteResponse iPPoolRouterDelete(xSubAccountApiKey, ippoolid)



Delete IPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long ippoolid = 789L; // Long | The IPPoolId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.iPPoolRouterDelete(xSubAccountApiKey, ippoolid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **ippoolid** | **Long**| The IPPoolId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPPoolRouterGet"></a>
# **iPPoolRouterGet**
> ModelsIPPool iPPoolRouterGet(xSubAccountApiKey, ippoolid)



Find IPPool by IPPoolId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long ippoolid = 789L; // Long | the IPPoolId you want to get
try {
    ModelsIPPool result = apiInstance.iPPoolRouterGet(xSubAccountApiKey, ippoolid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **ippoolid** | **Long**| the IPPoolId you want to get |

### Return type

[**ModelsIPPool**](ModelsIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPPoolRouterGetAll"></a>
# **iPPoolRouterGetAll**
> List&lt;ModelsIPPool&gt; iPPoolRouterGetAll(xSubAccountApiKey, offset, limit, search)



Get All IPPools

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsIPPool> result = apiInstance.iPPoolRouterGetAll(xSubAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterGetAll");
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

[**List&lt;ModelsIPPool&gt;**](ModelsIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPPoolRouterUpdate"></a>
# **iPPoolRouterUpdate**
> ModelsIPPool iPPoolRouterUpdate(xSubAccountApiKey, ippoolid, body)



Update IPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountippoolApi;


SubaccountippoolApi apiInstance = new SubaccountippoolApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long ippoolid = 789L; // Long | The IPPoolId you want to update
ModelsEIPPool body = new ModelsEIPPool(); // ModelsEIPPool | The body
try {
    ModelsIPPool result = apiInstance.iPPoolRouterUpdate(xSubAccountApiKey, ippoolid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountippoolApi#iPPoolRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **ippoolid** | **Long**| The IPPoolId you want to update |
 **body** | [**ModelsEIPPool**](ModelsEIPPool.md)| The body |

### Return type

[**ModelsIPPool**](ModelsIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

