# AccountwebhookApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountWebhookRouterCount**](AccountwebhookApi.md#accountWebhookRouterCount) | **GET** /account/webhook/count | 
[**accountWebhookRouterCreate**](AccountwebhookApi.md#accountWebhookRouterCreate) | **POST** /account/webhook/ | 
[**accountWebhookRouterCreateAccountWebhookInAccountWebhookCache**](AccountwebhookApi.md#accountWebhookRouterCreateAccountWebhookInAccountWebhookCache) | **POST** /account/webhook/cache | 
[**accountWebhookRouterDelete**](AccountwebhookApi.md#accountWebhookRouterDelete) | **DELETE** /account/webhook/{webhookId} | 
[**accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache**](AccountwebhookApi.md#accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache) | **DELETE** /account/webhook/cache | 
[**accountWebhookRouterGet**](AccountwebhookApi.md#accountWebhookRouterGet) | **GET** /account/webhook/{webhookId} | 
[**accountWebhookRouterGetAll**](AccountwebhookApi.md#accountWebhookRouterGetAll) | **GET** /account/webhook/ | 
[**accountWebhookRouterUpdate**](AccountwebhookApi.md#accountWebhookRouterUpdate) | **PUT** /account/webhook/{webhookId} | 


<a name="accountWebhookRouterCount"></a>
# **accountWebhookRouterCount**
> ModelsCountStat accountWebhookRouterCount(xAccountApiKey)



Count Total AccountWebhooks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsCountStat result = apiInstance.accountWebhookRouterCount(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterCount");
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

<a name="accountWebhookRouterCreate"></a>
# **accountWebhookRouterCreate**
> ModelsAccountWebhook accountWebhookRouterCreate(xAccountApiKey, body)



Create AccountWebhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsEWebhook body = new ModelsEWebhook(); // ModelsEWebhook | The AccountWebhook content
try {
    ModelsAccountWebhook result = apiInstance.accountWebhookRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsEWebhook**](ModelsEWebhook.md)| The AccountWebhook content |

### Return type

[**ModelsAccountWebhook**](ModelsAccountWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterCreateAccountWebhookInAccountWebhookCache"></a>
# **accountWebhookRouterCreateAccountWebhookInAccountWebhookCache**
> accountWebhookRouterCreateAccountWebhookInAccountWebhookCache(body)



Add Account Webhook To AccountWebhook Cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
ModelsAccountWebhook body = new ModelsAccountWebhook(); // ModelsAccountWebhook | Add account webhook to cache
try {
    apiInstance.accountWebhookRouterCreateAccountWebhookInAccountWebhookCache(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterCreateAccountWebhookInAccountWebhookCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsAccountWebhook**](ModelsAccountWebhook.md)| Add account webhook to cache |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterDelete"></a>
# **accountWebhookRouterDelete**
> ModelsDeleteResponse accountWebhookRouterDelete(xAccountApiKey, webhookId)



Delete AccountWebhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long webhookId = 789L; // Long | The AccountWebhookId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.accountWebhookRouterDelete(xAccountApiKey, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **webhookId** | **Long**| The AccountWebhookId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache"></a>
# **accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache**
> accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache(body)



Delete Account Webhook which is in AccountWebhook Cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
ModelsAccountWebhook body = new ModelsAccountWebhook(); // ModelsAccountWebhook | AccountWebhook content
try {
    apiInstance.accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterDeleteAccountWebhookInAccountWebhookCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelsAccountWebhook**](ModelsAccountWebhook.md)| AccountWebhook content |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterGet"></a>
# **accountWebhookRouterGet**
> ModelsAccountWebhook accountWebhookRouterGet(xAccountApiKey, webhookId)



Find AccountWebhook by AccountWebhookId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long webhookId = 789L; // Long | the AccountWebhookId you want to get
try {
    ModelsAccountWebhook result = apiInstance.accountWebhookRouterGet(xAccountApiKey, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **webhookId** | **Long**| the AccountWebhookId you want to get |

### Return type

[**ModelsAccountWebhook**](ModelsAccountWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterGetAll"></a>
# **accountWebhookRouterGetAll**
> List&lt;ModelsAccountWebhook&gt; accountWebhookRouterGetAll(xAccountApiKey, offset, limit, search)



Get All AccountWebhooks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search
try {
    List<ModelsAccountWebhook> result = apiInstance.accountWebhookRouterGetAll(xAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **offset** | **Long**| offset | [optional]
 **limit** | **Long**| limit | [optional]
 **search** | **String**| search | [optional]

### Return type

[**List&lt;ModelsAccountWebhook&gt;**](ModelsAccountWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountWebhookRouterUpdate"></a>
# **accountWebhookRouterUpdate**
> ModelsAccountWebhook accountWebhookRouterUpdate(xAccountApiKey, webhookId, body)



Update AccountWebhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountwebhookApi;


AccountwebhookApi apiInstance = new AccountwebhookApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long webhookId = 789L; // Long | The AccountWebhookId you want to update
ModelsEWebhook body = new ModelsEWebhook(); // ModelsEWebhook | The body
try {
    ModelsAccountWebhook result = apiInstance.accountWebhookRouterUpdate(xAccountApiKey, webhookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountwebhookApi#accountWebhookRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **webhookId** | **Long**| The AccountWebhookId you want to update |
 **body** | [**ModelsEWebhook**](ModelsEWebhook.md)| The body |

### Return type

[**ModelsAccountWebhook**](ModelsAccountWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

