# SubaccountdomainApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainRouterCount**](SubaccountdomainApi.md#domainRouterCount) | **GET** /subaccount/domain/count | 
[**domainRouterCreate**](SubaccountdomainApi.md#domainRouterCreate) | **POST** /subaccount/domain/ | 
[**domainRouterDelete**](SubaccountdomainApi.md#domainRouterDelete) | **DELETE** /subaccount/domain/{domainId} | 
[**domainRouterGet**](SubaccountdomainApi.md#domainRouterGet) | **GET** /subaccount/domain/{domainId} | 
[**domainRouterGetAll**](SubaccountdomainApi.md#domainRouterGetAll) | **GET** /subaccount/domain/ | 
[**domainRouterUpdate**](SubaccountdomainApi.md#domainRouterUpdate) | **PUT** /subaccount/domain/{domainId} | 
[**domainRouterVerify**](SubaccountdomainApi.md#domainRouterVerify) | **POST** /subaccount/domain/{domainId}/verify | 
[**domainRouterVerifyByToken**](SubaccountdomainApi.md#domainRouterVerifyByToken) | **POST** /subaccount/domain/{domainId}/verify/email/{token} | 
[**domainRouterVerifyRequest**](SubaccountdomainApi.md#domainRouterVerifyRequest) | **POST** /subaccount/domain/{domainId}/verify/email | 


<a name="domainRouterCount"></a>
# **domainRouterCount**
> ModelsCountStat domainRouterCount(xSubAccountApiKey)



Count Total Domains

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
try {
    ModelsCountStat result = apiInstance.domainRouterCount(xSubAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterCount");
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

<a name="domainRouterCreate"></a>
# **domainRouterCreate**
> ModelsDomain domainRouterCreate(xSubAccountApiKey, body)



Create Domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
ModelsEDomain body = new ModelsEDomain(); // ModelsEDomain | The Domain content
try {
    ModelsDomain result = apiInstance.domainRouterCreate(xSubAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **body** | [**ModelsEDomain**](ModelsEDomain.md)| The Domain content |

### Return type

[**ModelsDomain**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterDelete"></a>
# **domainRouterDelete**
> ModelsDeleteResponse domainRouterDelete(xSubAccountApiKey, domainId)



Delete Domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | The DomainId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.domainRouterDelete(xSubAccountApiKey, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| The DomainId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterGet"></a>
# **domainRouterGet**
> ModelsDomain domainRouterGet(xSubAccountApiKey, domainId)



Find Domain by DomainId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | the DomainId you want to get
try {
    ModelsDomain result = apiInstance.domainRouterGet(xSubAccountApiKey, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| the DomainId you want to get |

### Return type

[**ModelsDomain**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterGetAll"></a>
# **domainRouterGetAll**
> List&lt;ModelsDomain&gt; domainRouterGetAll(xSubAccountApiKey, offset, limit, search)



Get All Domains

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String search = "search_example"; // String | search term
try {
    List<ModelsDomain> result = apiInstance.domainRouterGetAll(xSubAccountApiKey, offset, limit, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterGetAll");
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

[**List&lt;ModelsDomain&gt;**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterUpdate"></a>
# **domainRouterUpdate**
> ModelsDomain domainRouterUpdate(xSubAccountApiKey, domainId, body)



Update Domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | The DomainId you want to update
ModelsEDomain body = new ModelsEDomain(); // ModelsEDomain | The body
try {
    ModelsDomain result = apiInstance.domainRouterUpdate(xSubAccountApiKey, domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| The DomainId you want to update |
 **body** | [**ModelsEDomain**](ModelsEDomain.md)| The body |

### Return type

[**ModelsDomain**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterVerify"></a>
# **domainRouterVerify**
> ModelsDomain domainRouterVerify(xSubAccountApiKey, domainId)



Verify Domain By Domain Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | the DomainId you want to get
try {
    ModelsDomain result = apiInstance.domainRouterVerify(xSubAccountApiKey, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| the DomainId you want to get |

### Return type

[**ModelsDomain**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterVerifyByToken"></a>
# **domainRouterVerifyByToken**
> ModelsDomain domainRouterVerifyByToken(xSubAccountApiKey, domainId, token)



Verify Domain By Signed Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | the DomainId you want to get
String token = "token_example"; // String | The signed token used to verify
try {
    ModelsDomain result = apiInstance.domainRouterVerifyByToken(xSubAccountApiKey, domainId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterVerifyByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| the DomainId you want to get |
 **token** | **String**| The signed token used to verify |

### Return type

[**ModelsDomain**](ModelsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainRouterVerifyRequest"></a>
# **domainRouterVerifyRequest**
> domainRouterVerifyRequest(xSubAccountApiKey, domainId, body)



Verify Domain By Email Request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountdomainApi;


SubaccountdomainApi apiInstance = new SubaccountdomainApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long domainId = 789L; // Long | the DomainId you want to get
ModelsVerifyByTokenRequest body = new ModelsVerifyByTokenRequest(); // ModelsVerifyByTokenRequest | The Email to be used to verify
try {
    apiInstance.domainRouterVerifyRequest(xSubAccountApiKey, domainId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountdomainApi#domainRouterVerifyRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **domainId** | **Long**| the DomainId you want to get |
 **body** | [**ModelsVerifyByTokenRequest**](ModelsVerifyByTokenRequest.md)| The Email to be used to verify |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

