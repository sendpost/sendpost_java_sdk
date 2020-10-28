# AccountippoolApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountIPPoolRouterCount**](AccountippoolApi.md#accountIPPoolRouterCount) | **GET** /account/ippool/count | 
[**accountIPPoolRouterCreate**](AccountippoolApi.md#accountIPPoolRouterCreate) | **POST** /account/ippool/ | 
[**accountIPPoolRouterDelete**](AccountippoolApi.md#accountIPPoolRouterDelete) | **DELETE** /account/ippool/{ippoolid} | 
[**accountIPPoolRouterGet**](AccountippoolApi.md#accountIPPoolRouterGet) | **GET** /account/ippool/{ippoolid} | 
[**accountIPPoolRouterGetAll**](AccountippoolApi.md#accountIPPoolRouterGetAll) | **GET** /account/ippool/ | 
[**accountIPPoolRouterUpdate**](AccountippoolApi.md#accountIPPoolRouterUpdate) | **PUT** /account/ippool/{ippoolid} | 


<a name="accountIPPoolRouterCount"></a>
# **accountIPPoolRouterCount**
> ModelsCountStat accountIPPoolRouterCount(xAccountApiKey)



Count Total AccountIPPools

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsCountStat result = apiInstance.accountIPPoolRouterCount(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIPPoolRouterCreate"></a>
# **accountIPPoolRouterCreate**
> ModelsAccountIPPool accountIPPoolRouterCreate(xAccountApiKey, body)



Create AccountIPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsEIPPool body = new ModelsEIPPool(); // ModelsEIPPool | The AccountIPPool content
try {
    ModelsAccountIPPool result = apiInstance.accountIPPoolRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsEIPPool**](ModelsEIPPool.md)| The AccountIPPool content |

### Return type

[**ModelsAccountIPPool**](ModelsAccountIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIPPoolRouterDelete"></a>
# **accountIPPoolRouterDelete**
> ModelsDeleteResponse accountIPPoolRouterDelete(xAccountApiKey, ippoolid)



Delete AccountIPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ippoolid = 789L; // Long | The AccountIPPoolId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.accountIPPoolRouterDelete(xAccountApiKey, ippoolid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ippoolid** | **Long**| The AccountIPPoolId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIPPoolRouterGet"></a>
# **accountIPPoolRouterGet**
> ModelsAccountIPPool accountIPPoolRouterGet(xAccountApiKey, ippoolid)



Find AccountIPPool by AccountIPPoolId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ippoolid = 789L; // Long | the AccountIPPoolId you want to get
try {
    ModelsAccountIPPool result = apiInstance.accountIPPoolRouterGet(xAccountApiKey, ippoolid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ippoolid** | **Long**| the AccountIPPoolId you want to get |

### Return type

[**ModelsAccountIPPool**](ModelsAccountIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIPPoolRouterGetAll"></a>
# **accountIPPoolRouterGetAll**
> List&lt;ModelsAccountIPPool&gt; accountIPPoolRouterGetAll(xAccountApiKey, offset, limit, search)



Get All AccountIPPools

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsAccountIPPool> result = apiInstance.accountIPPoolRouterGetAll(xAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterGetAll");
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

[**List&lt;ModelsAccountIPPool&gt;**](ModelsAccountIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIPPoolRouterUpdate"></a>
# **accountIPPoolRouterUpdate**
> ModelsAccountIPPool accountIPPoolRouterUpdate(xAccountApiKey, ippoolid, body)



Update AccountIPPool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountippoolApi;


AccountippoolApi apiInstance = new AccountippoolApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ippoolid = 789L; // Long | The AccountIPPoolId you want to update
ModelsEIPPool body = new ModelsEIPPool(); // ModelsEIPPool | The body
try {
    ModelsAccountIPPool result = apiInstance.accountIPPoolRouterUpdate(xAccountApiKey, ippoolid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountippoolApi#accountIPPoolRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ippoolid** | **Long**| The AccountIPPoolId you want to update |
 **body** | [**ModelsEIPPool**](ModelsEIPPool.md)| The body |

### Return type

[**ModelsAccountIPPool**](ModelsAccountIPPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

