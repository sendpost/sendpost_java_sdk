# SystemApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemTemplateRouterGetAllSystemTemplates**](SystemApi.md#systemTemplateRouterGetAllSystemTemplates) | **GET** /system/template | 


<a name="systemTemplateRouterGetAllSystemTemplates"></a>
# **systemTemplateRouterGetAllSystemTemplates**
> List&lt;ModelsSystemTemplate&gt; systemTemplateRouterGetAllSystemTemplates(xAccountApiKey)



Get all System Templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsSystemTemplate> result = apiInstance.systemTemplateRouterGetAllSystemTemplates(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemTemplateRouterGetAllSystemTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsSystemTemplate&gt;**](ModelsSystemTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

