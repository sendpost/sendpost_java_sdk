# AccountstatApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountStatRouterGetAllAccountStats**](AccountstatApi.md#accountStatRouterGetAllAccountStats) | **GET** /account/stat/ | 
[**accountStatRouterGetAllAccountStatsByGroup**](AccountstatApi.md#accountStatRouterGetAllAccountStatsByGroup) | **GET** /account/stat/group | 
[**accountStatRouterGetAllAggregateAccountStats**](AccountstatApi.md#accountStatRouterGetAllAggregateAccountStats) | **GET** /account/stat/aggregate | 
[**accountStatRouterGetAllAggregateAccountStatsByGroup**](AccountstatApi.md#accountStatRouterGetAllAggregateAccountStatsByGroup) | **GET** /account/stat/aggregate/group | 


<a name="accountStatRouterGetAllAccountStats"></a>
# **accountStatRouterGetAllAccountStats**
> List&lt;ModelsRStat&gt; accountStatRouterGetAllAccountStats(xAccountApiKey, from, to)



Get All Account Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountstatApi;


AccountstatApi apiInstance = new AccountstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRStat> result = apiInstance.accountStatRouterGetAllAccountStats(xAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountstatApi#accountStatRouterGetAllAccountStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRStat&gt;**](ModelsRStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountStatRouterGetAllAccountStatsByGroup"></a>
# **accountStatRouterGetAllAccountStatsByGroup**
> List&lt;ModelsRStat&gt; accountStatRouterGetAllAccountStatsByGroup(xAccountApiKey, group, from, to)



Get All Account Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountstatApi;


AccountstatApi apiInstance = new AccountstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Sub-Account API Key
String group = "group_example"; // String | the group whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRStat> result = apiInstance.accountStatRouterGetAllAccountStatsByGroup(xAccountApiKey, group, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountstatApi#accountStatRouterGetAllAccountStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Sub-Account API Key |
 **group** | **String**| the group whose stats you want |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRStat&gt;**](ModelsRStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountStatRouterGetAllAggregateAccountStats"></a>
# **accountStatRouterGetAllAggregateAccountStats**
> ModelsStat accountStatRouterGetAllAggregateAccountStats(xAccountApiKey, from, to)



Get All Aggregate Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountstatApi;


AccountstatApi apiInstance = new AccountstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.accountStatRouterGetAllAggregateAccountStats(xAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountstatApi#accountStatRouterGetAllAggregateAccountStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**ModelsStat**](ModelsStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountStatRouterGetAllAggregateAccountStatsByGroup"></a>
# **accountStatRouterGetAllAggregateAccountStatsByGroup**
> ModelsStat accountStatRouterGetAllAggregateAccountStatsByGroup(xAccountApiKey, group, from, to)



Get All Aggregate Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountstatApi;


AccountstatApi apiInstance = new AccountstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Sub-Account API Key
String group = "group_example"; // String | the group whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.accountStatRouterGetAllAggregateAccountStatsByGroup(xAccountApiKey, group, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountstatApi#accountStatRouterGetAllAggregateAccountStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Sub-Account API Key |
 **group** | **String**| the group whose stats you want |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**ModelsStat**](ModelsStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

