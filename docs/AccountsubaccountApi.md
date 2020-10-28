# AccountsubaccountApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subAccountRouterCount**](AccountsubaccountApi.md#subAccountRouterCount) | **GET** /account/subaccount/count | 
[**subAccountRouterCreate**](AccountsubaccountApi.md#subAccountRouterCreate) | **POST** /account/subaccount/ | 
[**subAccountRouterDelete**](AccountsubaccountApi.md#subAccountRouterDelete) | **DELETE** /account/subaccount/{subAccountId} | 
[**subAccountRouterGet**](AccountsubaccountApi.md#subAccountRouterGet) | **GET** /account/subaccount/{subAccountId} | 
[**subAccountRouterGetAll**](AccountsubaccountApi.md#subAccountRouterGetAll) | **GET** /account/subaccount/ | 
[**subAccountRouterUpdate**](AccountsubaccountApi.md#subAccountRouterUpdate) | **PUT** /account/subaccount/{subAccountId} | 


<a name="subAccountRouterCount"></a>
# **subAccountRouterCount**
> ModelsCountStat subAccountRouterCount(xAccountApiKey, filterBy, filterValue, search)



Count Total Subaccounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String filterBy = "filterBy_example"; // String | filterBy
Long filterValue = 789L; // Long | filterValue
String search = "search_example"; // String | search term
try {
    ModelsCountStat result = apiInstance.subAccountRouterCount(xAccountApiKey, filterBy, filterValue, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **filterBy** | **String**| filterBy | [optional]
 **filterValue** | **Long**| filterValue | [optional]
 **search** | **String**| search term | [optional]

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountRouterCreate"></a>
# **subAccountRouterCreate**
> ModelsSubAccount subAccountRouterCreate(xAccountApiKey, body)



Create SubAccount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
ModelsESubAccount body = new ModelsESubAccount(); // ModelsESubAccount | The SubAccount content
try {
    ModelsSubAccount result = apiInstance.subAccountRouterCreate(xAccountApiKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **body** | [**ModelsESubAccount**](ModelsESubAccount.md)| The SubAccount content |

### Return type

[**ModelsSubAccount**](ModelsSubAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountRouterDelete"></a>
# **subAccountRouterDelete**
> ModelsDeleteResponse subAccountRouterDelete(xAccountApiKey, subAccountId)



Delete SubAccount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long subAccountId = 789L; // Long | The SubAccountId you want to delete
try {
    ModelsDeleteResponse result = apiInstance.subAccountRouterDelete(xAccountApiKey, subAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **subAccountId** | **Long**| The SubAccountId you want to delete |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountRouterGet"></a>
# **subAccountRouterGet**
> ModelsSubAccount subAccountRouterGet(xAccountApiKey, subAccountId)



Find SubAccount by SubAccountId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long subAccountId = 789L; // Long | the SubAccountId you want to get
try {
    ModelsSubAccount result = apiInstance.subAccountRouterGet(xAccountApiKey, subAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **subAccountId** | **Long**| the SubAccountId you want to get |

### Return type

[**ModelsSubAccount**](ModelsSubAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountRouterGetAll"></a>
# **subAccountRouterGetAll**
> List&lt;ModelsSubAccount&gt; subAccountRouterGetAll(xAccountApiKey, offset, limit, filterBy, filterValue, search)



Get All SubAccounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long offset = 789L; // Long | offset
Long limit = 789L; // Long | limit
String filterBy = "filterBy_example"; // String | filterBy
Long filterValue = 789L; // Long | filterValue
String search = "search_example"; // String | search term
try {
    List<ModelsSubAccount> result = apiInstance.subAccountRouterGetAll(xAccountApiKey, offset, limit, filterBy, filterValue, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **offset** | **Long**| offset | [optional]
 **limit** | **Long**| limit | [optional]
 **filterBy** | **String**| filterBy | [optional]
 **filterValue** | **Long**| filterValue | [optional]
 **search** | **String**| search term | [optional]

### Return type

[**List&lt;ModelsSubAccount&gt;**](ModelsSubAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountRouterUpdate"></a>
# **subAccountRouterUpdate**
> ModelsSubAccount subAccountRouterUpdate(xAccountApiKey, subAccountId, body)



Update SubAccount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsubaccountApi;


AccountsubaccountApi apiInstance = new AccountsubaccountApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long subAccountId = 789L; // Long | The SubAccountId you want to update
ModelsESubAccount body = new ModelsESubAccount(); // ModelsESubAccount | The body
try {
    ModelsSubAccount result = apiInstance.subAccountRouterUpdate(xAccountApiKey, subAccountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsubaccountApi#subAccountRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **subAccountId** | **Long**| The SubAccountId you want to update |
 **body** | [**ModelsESubAccount**](ModelsESubAccount.md)| The body |

### Return type

[**ModelsSubAccount**](ModelsSubAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

