# AccounttagApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tagRouterCreate**](AccounttagApi.md#tagRouterCreate) | **POST** /account/tag/ | 
[**tagRouterDelete**](AccounttagApi.md#tagRouterDelete) | **DELETE** /account/tag/{tagid} | 
[**tagRouterGetAll**](AccounttagApi.md#tagRouterGetAll) | **GET** /account/tag/ | 


<a name="tagRouterCreate"></a>
# **tagRouterCreate**
> ModelsTag tagRouterCreate(xAccountApiKey, body)



Create Tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttagApi;


AccounttagApi apiInstance = new AccounttagApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsTag body = new ModelsTag(); // ModelsTag | The Tag content
try {
    ModelsTag result = apiInstance.tagRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttagApi#tagRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsTag**](ModelsTag.md)| The Tag content |

### Return type

[**ModelsTag**](ModelsTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagRouterDelete"></a>
# **tagRouterDelete**
> ModelsDeleteResponse tagRouterDelete(xAccountApiKey, tagid)



Delete Tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttagApi;


AccounttagApi apiInstance = new AccounttagApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long tagid = 789L; // Long | The AccountTagId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.tagRouterDelete(xAccountApiKey, tagid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttagApi#tagRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **tagid** | **Long**| The AccountTagId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tagRouterGetAll"></a>
# **tagRouterGetAll**
> List&lt;ModelsTag&gt; tagRouterGetAll(xAccountApiKey)



Get All Tags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttagApi;


AccounttagApi apiInstance = new AccounttagApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsTag> result = apiInstance.tagRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttagApi#tagRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsTag&gt;**](ModelsTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

