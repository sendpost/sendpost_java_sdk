# AccountipstatApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPStatRouterGetAllAggregateIPStats**](AccountipstatApi.md#iPStatRouterGetAllAggregateIPStats) | **GET** /account/ip/stat/{ipid}/aggregate | 
[**iPStatRouterGetAllAggregateIPStatsByGroup**](AccountipstatApi.md#iPStatRouterGetAllAggregateIPStatsByGroup) | **GET** /account/ip/stat/{ipid}/aggregate/provider | 
[**iPStatRouterGetAllAggregatedProviderStatsForAIP**](AccountipstatApi.md#iPStatRouterGetAllAggregatedProviderStatsForAIP) | **GET** /account/ip/stat/{ipid}/aggregate/providers | 
[**iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP**](AccountipstatApi.md#iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP) | **GET** /account/ip/stat/{ipid}/aggregate/sid/{sid}/providers | 
[**iPStatRouterGetAllAggregatedSubAccountStatsForAnIP**](AccountipstatApi.md#iPStatRouterGetAllAggregatedSubAccountStatsForAnIP) | **GET** /account/ip/stat/{ipid}/aggregate/subaccounts | 
[**iPStatRouterGetAllIPStats**](AccountipstatApi.md#iPStatRouterGetAllIPStats) | **GET** /account/ip/stat/{ipid} | 
[**iPStatRouterGetAllIPStatsByGroup**](AccountipstatApi.md#iPStatRouterGetAllIPStatsByGroup) | **GET** /account/ip/stat/{ipid}/provider | 


<a name="iPStatRouterGetAllAggregateIPStats"></a>
# **iPStatRouterGetAllAggregateIPStats**
> ModelsStat iPStatRouterGetAllAggregateIPStats(xAccountApiKey, ipid, from, to)



Get All Aggregate Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.iPStatRouterGetAllAggregateIPStats(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllAggregateIPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**ModelsStat**](ModelsStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPStatRouterGetAllAggregateIPStatsByGroup"></a>
# **iPStatRouterGetAllAggregateIPStatsByGroup**
> ModelsStat iPStatRouterGetAllAggregateIPStatsByGroup(xAccountApiKey, ipid, provider, from, to)



Get All Aggregate Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String provider = "provider_example"; // String | the group whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    ModelsStat result = apiInstance.iPStatRouterGetAllAggregateIPStatsByGroup(xAccountApiKey, ipid, provider, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllAggregateIPStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **provider** | **String**| the group whose stats you want |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**ModelsStat**](ModelsStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPStatRouterGetAllAggregatedProviderStatsForAIP"></a>
# **iPStatRouterGetAllAggregatedProviderStatsForAIP**
> List&lt;ModelsPIPStat&gt; iPStatRouterGetAllAggregatedProviderStatsForAIP(xAccountApiKey, ipid, from, to)



Get All Aggregated Provider Stats for a IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsPIPStat> result = apiInstance.iPStatRouterGetAllAggregatedProviderStatsForAIP(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllAggregatedProviderStatsForAIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
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

<a name="iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP"></a>
# **iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP**
> List&lt;ModelsPIPStat&gt; iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP(xAccountApiKey, ipid, sid, from, to)



Get All Aggregated Provider Stats for a Specific Sub-Account of a IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
Long sid = 789L; // Long | the Sub Account Id you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsPIPStat> result = apiInstance.iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP(xAccountApiKey, ipid, sid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllAggregatedProviderStatsForASpecificSubAccountOfAIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **sid** | **Long**| the Sub Account Id you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsPIPStat&gt;**](ModelsPIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPStatRouterGetAllAggregatedSubAccountStatsForAnIP"></a>
# **iPStatRouterGetAllAggregatedSubAccountStatsForAnIP**
> List&lt;ModelsSIPStat&gt; iPStatRouterGetAllAggregatedSubAccountStatsForAnIP(xAccountApiKey, ipid, from, to)



Get All Aggregated Sub-Account Stats for an IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSIPStat> result = apiInstance.iPStatRouterGetAllAggregatedSubAccountStatsForAnIP(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllAggregatedSubAccountStatsForAnIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSIPStat&gt;**](ModelsSIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPStatRouterGetAllIPStats"></a>
# **iPStatRouterGetAllIPStats**
> List&lt;ModelsRIPStat&gt; iPStatRouterGetAllIPStats(xAccountApiKey, ipid, from, to)



Get All IP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRIPStat> result = apiInstance.iPStatRouterGetAllIPStats(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllIPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRIPStat&gt;**](ModelsRIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="iPStatRouterGetAllIPStatsByGroup"></a>
# **iPStatRouterGetAllIPStatsByGroup**
> List&lt;ModelsRIPStat&gt; iPStatRouterGetAllIPStatsByGroup(ipid, xAccountApiKey, provider, from, to)



Get All IP Stats by Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountipstatApi;


AccountipstatApi apiInstance = new AccountipstatApi();
Long ipid = 789L; // Long | the IPId you want to get
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String provider = "provider_example"; // String | the provider whose stats you want
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRIPStat> result = apiInstance.iPStatRouterGetAllIPStatsByGroup(ipid, xAccountApiKey, provider, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountipstatApi#iPStatRouterGetAllIPStatsByGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipid** | **Long**| the IPId you want to get |
 **xAccountApiKey** | **String**| Account API Key |
 **provider** | **String**| the provider whose stats you want |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRIPStat&gt;**](ModelsRIPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

