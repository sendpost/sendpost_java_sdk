# AccountlabelApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelRouterCount**](AccountlabelApi.md#labelRouterCount) | **GET** /account/label/count | 
[**labelRouterCreate**](AccountlabelApi.md#labelRouterCreate) | **POST** /account/label/ | 
[**labelRouterDelete**](AccountlabelApi.md#labelRouterDelete) | **DELETE** /account/label/{labelId} | 
[**labelRouterGet**](AccountlabelApi.md#labelRouterGet) | **GET** /account/label/{labelId} | 
[**labelRouterGetAll**](AccountlabelApi.md#labelRouterGetAll) | **GET** /account/label/ | 
[**labelRouterUpdate**](AccountlabelApi.md#labelRouterUpdate) | **PUT** /account/label/{labelId} | 


<a name="labelRouterCount"></a>
# **labelRouterCount**
> ModelsCountStat labelRouterCount(xAccountApiKey)



Count Total Labels

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsCountStat result = apiInstance.labelRouterCount(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterCount");
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

<a name="labelRouterCreate"></a>
# **labelRouterCreate**
> ModelsLabel labelRouterCreate(xAccountApiKey, body)



Create Label

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsLabel body = new ModelsLabel(); // ModelsLabel | The Label content
try {
    ModelsLabel result = apiInstance.labelRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsLabel**](ModelsLabel.md)| The Label content |

### Return type

[**ModelsLabel**](ModelsLabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="labelRouterDelete"></a>
# **labelRouterDelete**
> ModelsDeleteResponse labelRouterDelete(xAccountApiKey, labelId)



Delete Label

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long labelId = 789L; // Long | The LabelId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.labelRouterDelete(xAccountApiKey, labelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **labelId** | **Long**| The LabelId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="labelRouterGet"></a>
# **labelRouterGet**
> ModelsLabel labelRouterGet(xAccountApiKey, labelId)



Find Label by LabelId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long labelId = 789L; // Long | the LabelId you want to get
try {
    ModelsLabel result = apiInstance.labelRouterGet(xAccountApiKey, labelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **labelId** | **Long**| the LabelId you want to get |

### Return type

[**ModelsLabel**](ModelsLabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="labelRouterGetAll"></a>
# **labelRouterGetAll**
> List&lt;ModelsLabel&gt; labelRouterGetAll(xAccountApiKey)



Get All Labels

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsLabel> result = apiInstance.labelRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsLabel&gt;**](ModelsLabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="labelRouterUpdate"></a>
# **labelRouterUpdate**
> ModelsLabel labelRouterUpdate(xAccountApiKey, labelId, body)



Update Label

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountlabelApi;


AccountlabelApi apiInstance = new AccountlabelApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long labelId = 789L; // Long | The LabelId you want to update
ModelsLabel body = new ModelsLabel(); // ModelsLabel | The body
try {
    ModelsLabel result = apiInstance.labelRouterUpdate(xAccountApiKey, labelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountlabelApi#labelRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **labelId** | **Long**| The LabelId you want to update |
 **body** | [**ModelsLabel**](ModelsLabel.md)| The body |

### Return type

[**ModelsLabel**](ModelsLabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

