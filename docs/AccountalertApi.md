# AccountalertApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alertRouterCount**](AccountalertApi.md#alertRouterCount) | **GET** /account/alert/count | 
[**alertRouterCreateAlert**](AccountalertApi.md#alertRouterCreateAlert) | **POST** /account/alert/ | 
[**alertRouterGetAll**](AccountalertApi.md#alertRouterGetAll) | **GET** /account/alert/ | 
[**alertRouterUpdate**](AccountalertApi.md#alertRouterUpdate) | **PUT** /account/alert/{alertid} | 


<a name="alertRouterCount"></a>
# **alertRouterCount**
> ModelsCountStat alertRouterCount(xAccountApiKey, search)



Count Total Alerts for account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountalertApi;


AccountalertApi apiInstance = new AccountalertApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String search = "search_example"; // String | search term
try {
    ModelsCountStat result = apiInstance.alertRouterCount(xAccountApiKey, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountalertApi#alertRouterCount");
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

<a name="alertRouterCreateAlert"></a>
# **alertRouterCreateAlert**
> ModelsAlert alertRouterCreateAlert(xAccountApiKey, body)



create an alert

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountalertApi;


AccountalertApi apiInstance = new AccountalertApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsAlertRequest body = new ModelsAlertRequest(); // ModelsAlertRequest | The List to br sent
try {
    ModelsAlert result = apiInstance.alertRouterCreateAlert(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountalertApi#alertRouterCreateAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsAlertRequest**](ModelsAlertRequest.md)| The List to br sent |

### Return type

[**ModelsAlert**](ModelsAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="alertRouterGetAll"></a>
# **alertRouterGetAll**
> List&lt;ModelsDetailedAlert&gt; alertRouterGetAll(xAccountApiKey, offset, limit, search)



Get All Alerts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountalertApi;


AccountalertApi apiInstance = new AccountalertApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsDetailedAlert> result = apiInstance.alertRouterGetAll(xAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountalertApi#alertRouterGetAll");
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

[**List&lt;ModelsDetailedAlert&gt;**](ModelsDetailedAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="alertRouterUpdate"></a>
# **alertRouterUpdate**
> Alert alertRouterUpdate(xAccountApiKey, alertid, body)



Update an Alert

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountalertApi;


AccountalertApi apiInstance = new AccountalertApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long alertid = 789L; // Long | The alert you want to update
Alert body = new Alert(); // Alert | The alert  Settings
try {
    Alert result = apiInstance.alertRouterUpdate(xAccountApiKey, alertid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountalertApi#alertRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **alertid** | **Long**| The alert you want to update |
 **body** | [**Alert**](Alert.md)| The alert  Settings |

### Return type

[**Alert**](Alert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

