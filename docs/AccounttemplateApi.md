# AccounttemplateApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountTemplateRouterCreate**](AccounttemplateApi.md#accountTemplateRouterCreate) | **POST** /account/template/ | 
[**accountTemplateRouterDelete**](AccounttemplateApi.md#accountTemplateRouterDelete) | **DELETE** /account/template/{templateid} | 
[**accountTemplateRouterGet**](AccounttemplateApi.md#accountTemplateRouterGet) | **GET** /account/template/{templateid} | 
[**accountTemplateRouterGetAll**](AccounttemplateApi.md#accountTemplateRouterGetAll) | **GET** /account/template/ | 
[**accountTemplateRouterUpdate**](AccounttemplateApi.md#accountTemplateRouterUpdate) | **PUT** /account/template/{templateid} | 


<a name="accountTemplateRouterCreate"></a>
# **accountTemplateRouterCreate**
> ModelsAccountTemplate accountTemplateRouterCreate(xAccountApiKey, body)



Create a new template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttemplateApi;


AccounttemplateApi apiInstance = new AccounttemplateApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsAccountTemplate body = new ModelsAccountTemplate(); // ModelsAccountTemplate | The AccountTemplate content
try {
    ModelsAccountTemplate result = apiInstance.accountTemplateRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttemplateApi#accountTemplateRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsAccountTemplate**](ModelsAccountTemplate.md)| The AccountTemplate content |

### Return type

[**ModelsAccountTemplate**](ModelsAccountTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountTemplateRouterDelete"></a>
# **accountTemplateRouterDelete**
> ModelsDeleteResponse accountTemplateRouterDelete(xAccountApiKey, templateid)



Delete AccountTemplate

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttemplateApi;


AccounttemplateApi apiInstance = new AccounttemplateApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long templateid = 789L; // Long | The id of the template you want to delete
try {
    ModelsDeleteResponse result = apiInstance.accountTemplateRouterDelete(xAccountApiKey, templateid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttemplateApi#accountTemplateRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **templateid** | **Long**| The id of the template you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountTemplateRouterGet"></a>
# **accountTemplateRouterGet**
> ModelsAccountTemplate accountTemplateRouterGet(xAccountApiKey, templateid)



Get single template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttemplateApi;


AccounttemplateApi apiInstance = new AccounttemplateApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long templateid = 789L; // Long | ID of the template required
try {
    ModelsAccountTemplate result = apiInstance.accountTemplateRouterGet(xAccountApiKey, templateid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttemplateApi#accountTemplateRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **templateid** | **Long**| ID of the template required |

### Return type

[**ModelsAccountTemplate**](ModelsAccountTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountTemplateRouterGetAll"></a>
# **accountTemplateRouterGetAll**
> List&lt;ModelsAccountTemplate&gt; accountTemplateRouterGetAll(xAccountApiKey)



Get all templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttemplateApi;


AccounttemplateApi apiInstance = new AccounttemplateApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsAccountTemplate> result = apiInstance.accountTemplateRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttemplateApi#accountTemplateRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsAccountTemplate&gt;**](ModelsAccountTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountTemplateRouterUpdate"></a>
# **accountTemplateRouterUpdate**
> ModelsAccountTemplate accountTemplateRouterUpdate(xAccountApiKey, templateid, body)



update template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccounttemplateApi;


AccounttemplateApi apiInstance = new AccounttemplateApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long templateid = 789L; // Long | The id of the template you want to update
ModelsAccountTemplate body = new ModelsAccountTemplate(); // ModelsAccountTemplate | The template content
try {
    ModelsAccountTemplate result = apiInstance.accountTemplateRouterUpdate(xAccountApiKey, templateid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccounttemplateApi#accountTemplateRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **templateid** | **Long**| The id of the template you want to update |
 **body** | [**ModelsAccountTemplate**](ModelsAccountTemplate.md)| The template content |

### Return type

[**ModelsAccountTemplate**](ModelsAccountTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

