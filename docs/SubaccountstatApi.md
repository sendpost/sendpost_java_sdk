# SubaccountstatApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subAccountStatRouterGetAllAggregateSubAccountStats**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregateSubAccountStats) | **GET** /subaccount/stat/aggregate | 
[**subAccountStatRouterGetAllAggregateSubAccountStatsByGroup**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregateSubAccountStatsByGroup) | **GET** /subaccount/stat/aggregate/group | 
[**subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount) | **GET** /subaccount/stat/aggregate/groups | 
[**subAccountStatRouterGetAllAggregatedIPStatsForASubAccount**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregatedIPStatsForASubAccount) | **GET** /subaccount/stat/aggregate/ips | 
[**subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount) | **GET** /subaccount/stat/aggregate/ip/{ipid}/providers | 
[**subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount**](SubaccountstatApi.md#subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount) | **GET** /subaccount/stat/aggregate/providers | 
[**subAccountStatRouterGetAllSubAccountStats**](SubaccountstatApi.md#subAccountStatRouterGetAllSubAccountStats) | **GET** /subaccount/stat/ | 
[**subAccountStatRouterGetAllSubAccountStatsByGroup**](SubaccountstatApi.md#subAccountStatRouterGetAllSubAccountStatsByGroup) | **GET** /subaccount/stat/group | 


<a name="subAccountStatRouterGetAllAggregateSubAccountStats"></a>
# **subAccountStatRouterGetAllAggregateSubAccountStats**
> ModelsStat subAccountStatRouterGetAllAggregateSubAccountStats(xSubAccountApiKey, from, to)



Get All Aggregate Sub-Account Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.subAccountStatRouterGetAllAggregateSubAccountStats(xSubAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregateSubAccountStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**ModelsStat**](ModelsStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllAggregateSubAccountStatsByGroup"></a>
# **subAccountStatRouterGetAllAggregateSubAccountStatsByGroup**
> ModelsStat subAccountStatRouterGetAllAggregateSubAccountStatsByGroup(xSubAccountApiKey, group, from, to)



Get All Aggregate Sub-Account Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String group = "group_example"; // String | the group whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.subAccountStatRouterGetAllAggregateSubAccountStatsByGroup(xSubAccountApiKey, group, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregateSubAccountStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
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

<a name="subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount"></a>
# **subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount**
> List&lt;ModelsAGStat&gt; subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount(xSubAccountApiKey, from, to)



Get All Aggregated Group Stats for a Sub-Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsAGStat> result = apiInstance.subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount(xSubAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregatedGroupStatsForASubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsAGStat&gt;**](ModelsAGStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllAggregatedIPStatsForASubAccount"></a>
# **subAccountStatRouterGetAllAggregatedIPStatsForASubAccount**
> List&lt;ModelsAIPStat&gt; subAccountStatRouterGetAllAggregatedIPStatsForASubAccount(xSubAccountApiKey, from, to)



Get All Aggregated IP Stats for a Sub-Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsAIPStat> result = apiInstance.subAccountStatRouterGetAllAggregatedIPStatsForASubAccount(xSubAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregatedIPStatsForASubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsAIPStat&gt;**](ModelsAIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount"></a>
# **subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount**
> List&lt;ModelsPIPStat&gt; subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount(xSubAccountApiKey, ipid, from, to)



Get All Aggregated Provider Stats for a Specific IP of a Sub-Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsPIPStat> result = apiInstance.subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount(xSubAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregatedProviderStatsForASpecificIPOfASubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsPIPStat&gt;**](ModelsPIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount"></a>
# **subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount**
> List&lt;ModelsPIPStat&gt; subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount(xSubAccountApiKey, from, to)



Get All Aggregated Provider Stats for a Sub-Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsPIPStat> result = apiInstance.subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount(xSubAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllAggregatedProviderStatsForASubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsPIPStat&gt;**](ModelsPIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllSubAccountStats"></a>
# **subAccountStatRouterGetAllSubAccountStats**
> List&lt;ModelsRStat&gt; subAccountStatRouterGetAllSubAccountStats(xSubAccountApiKey, from, to)



Get All Sub-Account Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRStat> result = apiInstance.subAccountStatRouterGetAllSubAccountStats(xSubAccountApiKey, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllSubAccountStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRStat&gt;**](ModelsRStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subAccountStatRouterGetAllSubAccountStatsByGroup"></a>
# **subAccountStatRouterGetAllSubAccountStatsByGroup**
> List&lt;ModelsRStat&gt; subAccountStatRouterGetAllSubAccountStatsByGroup(xSubAccountApiKey, group, from, to)



Get All Sub-Account Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubaccountstatApi;


SubaccountstatApi apiInstance = new SubaccountstatApi();
String xSubAccountApiKey = "xSubAccountApiKey_example"; // String | Sub-Account API Key
String group = "group_example"; // String | the tag whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRStat> result = apiInstance.subAccountStatRouterGetAllSubAccountStatsByGroup(xSubAccountApiKey, group, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountstatApi#subAccountStatRouterGetAllSubAccountStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSubAccountApiKey** | **String**| Sub-Account API Key |
 **group** | **String**| the tag whose stats you want |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRStat&gt;**](ModelsRStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

