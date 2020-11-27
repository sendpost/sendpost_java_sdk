# AccountincidentApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incidentRouterAdd**](AccountincidentApi.md#incidentRouterAdd) | **POST** /account/incident/{incidentId}/comment | 
[**incidentRouterCount**](AccountincidentApi.md#incidentRouterCount) | **GET** /account/incident/count | 
[**incidentRouterCreate**](AccountincidentApi.md#incidentRouterCreate) | **POST** /account/incident/ | 
[**incidentRouterGetAll**](AccountincidentApi.md#incidentRouterGetAll) | **GET** /account/incident/ | 
[**incidentRouterGetAllComments**](AccountincidentApi.md#incidentRouterGetAllComments) | **GET** /account/incident/{incidentId}/comment | 
[**incidentRouterGetIncident**](AccountincidentApi.md#incidentRouterGetIncident) | **GET** /account/incident/{incidentId} | 
[**incidentRouterUpdate**](AccountincidentApi.md#incidentRouterUpdate) | **PUT** /account/incident/{incidentId} | 


<a name="incidentRouterAdd"></a>
# **incidentRouterAdd**
> ModelsComment incidentRouterAdd(xAccountApiKey, incidentId, body)



Add comment to Incident

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long incidentId = 789L; // Long | the incident id
ModelsEComment body = new ModelsEComment(); // ModelsEComment | The Comment content
try {
    ModelsComment result = apiInstance.incidentRouterAdd(xAccountApiKey, incidentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **incidentId** | **Long**| the incident id |
 **body** | [**ModelsEComment**](ModelsEComment.md)| The Comment content |

### Return type

[**ModelsComment**](ModelsComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterCount"></a>
# **incidentRouterCount**
> ModelsCountStat incidentRouterCount(xAccountApiKey, status, tag, search)



Count Total Incidents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long status = 789L; // Long | status
Long tag = 789L; // Long | status
String search = "search_example"; // String | search term
try {
    ModelsCountStat result = apiInstance.incidentRouterCount(xAccountApiKey, status, tag, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **status** | **Long**| status | [optional]
 **tag** | **Long**| status | [optional]
 **search** | **String**| search term | [optional]

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterCreate"></a>
# **incidentRouterCreate**
> ModelsIncident incidentRouterCreate(xAccountApiKey, body)



Create Incident

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsEIncident body = new ModelsEIncident(); // ModelsEIncident | The Incident content
try {
    ModelsIncident result = apiInstance.incidentRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsEIncident**](ModelsEIncident.md)| The Incident content |

### Return type

[**ModelsIncident**](ModelsIncident.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterGetAll"></a>
# **incidentRouterGetAll**
> List&lt;ModelsIncident&gt; incidentRouterGetAll(xAccountApiKey, offset, limit, search, status, tag)



Get All Incidents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
Long status = 789L; // Long | status
Long tag = 789L; // Long | status
try {
    List<ModelsIncident> result = apiInstance.incidentRouterGetAll(xAccountApiKey, offset, limit, search, status, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterGetAll");
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
 **status** | **Long**| status | [optional]
 **tag** | **Long**| status | [optional]

### Return type

[**List&lt;ModelsIncident&gt;**](ModelsIncident.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterGetAllComments"></a>
# **incidentRouterGetAllComments**
> List&lt;ModelsComment&gt; incidentRouterGetAllComments(xAccountApiKey, incidentId)



Get All Comments Associated with Incident

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long incidentId = 789L; // Long | the IncidentId you want to get comments for
try {
    List<ModelsComment> result = apiInstance.incidentRouterGetAllComments(xAccountApiKey, incidentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterGetAllComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **incidentId** | **Long**| the IncidentId you want to get comments for |

### Return type

[**List&lt;ModelsComment&gt;**](ModelsComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterGetIncident"></a>
# **incidentRouterGetIncident**
> ModelsIncident incidentRouterGetIncident(xAccountApiKey, incidentId)



Find Incident by incidentId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long incidentId = 789L; // Long | the IncidentId you want to get
try {
    ModelsIncident result = apiInstance.incidentRouterGetIncident(xAccountApiKey, incidentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterGetIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **incidentId** | **Long**| the IncidentId you want to get |

### Return type

[**ModelsIncident**](ModelsIncident.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incidentRouterUpdate"></a>
# **incidentRouterUpdate**
> ModelsIncident incidentRouterUpdate(xAccountApiKey, incidentId, body)



Update Incident

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountincidentApi;


AccountincidentApi apiInstance = new AccountincidentApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long incidentId = 789L; // Long | the Incident Id you want to update
ModelsEIncident body = new ModelsEIncident(); // ModelsEIncident | The Incident content
try {
    ModelsIncident result = apiInstance.incidentRouterUpdate(xAccountApiKey, incidentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountincidentApi#incidentRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **incidentId** | **Long**| the Incident Id you want to update |
 **body** | [**ModelsEIncident**](ModelsEIncident.md)| The Incident content |

### Return type

[**ModelsIncident**](ModelsIncident.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

