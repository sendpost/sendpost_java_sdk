# AccountsmtpstatApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sMTPStatRouterGetAllAggregateIPProviderSMTPStats**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateIPProviderSMTPStats) | **GET** /account/smtp/stat/ip/{ipid}/provider/{pname}/aggregate | 
[**sMTPStatRouterGetAllAggregateIPSMTPStats**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateIPSMTPStats) | **GET** /account/smtp/stat/ip/{ipid}/aggregate | 
[**sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount) | **GET** /account/smtp/stat/ip/{ipid}/subaccount/{sid}/aggregate | 
[**sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats) | **GET** /account/smtp/stat/subaccount/{sid}/provider/{pname}/aggregate | 
[**sMTPStatRouterGetAllAggregateSubAccountSMTPStats**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateSubAccountSMTPStats) | **GET** /account/smtp/stat/subaccount/{sid}/aggregate | 
[**sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP**](AccountsmtpstatApi.md#sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP) | **GET** /account/smtp/stat/subaccount/{sid}/ip/{ipid}/aggregate | 


<a name="sMTPStatRouterGetAllAggregateIPProviderSMTPStats"></a>
# **sMTPStatRouterGetAllAggregateIPProviderSMTPStats**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateIPProviderSMTPStats(xAccountApiKey, ipid, pname, from, to)



Get All Aggregate IP Provider SMTP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IP ID you want to get
String pname = "pname_example"; // String | the provider name
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateIPProviderSMTPStats(xAccountApiKey, ipid, pname, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateIPProviderSMTPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IP ID you want to get |
 **pname** | **String**| the provider name |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sMTPStatRouterGetAllAggregateIPSMTPStats"></a>
# **sMTPStatRouterGetAllAggregateIPSMTPStats**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateIPSMTPStats(xAccountApiKey, ipid, from, to)



Get All Aggregate IP SMTP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateIPSMTPStats(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateIPSMTPStats");
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

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount"></a>
# **sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount(xAccountApiKey, ipid, sid, from, to)



Get All Aggregate IP SMTP Stats For SubAccount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IP ID you want to get
Long sid = 789L; // Long | the SubAccount ID you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount(xAccountApiKey, ipid, sid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateIPSMTPStatsForSubAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IP ID you want to get |
 **sid** | **Long**| the SubAccount ID you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats"></a>
# **sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats(xAccountApiKey, sid, pname, from, to)



Get All Aggregate SubAccount Provider SMTP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long sid = 789L; // Long | the SubAccount ID you want to get
String pname = "pname_example"; // String | the provider name
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats(xAccountApiKey, sid, pname, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateSubAccountProviderSMTPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **sid** | **Long**| the SubAccount ID you want to get |
 **pname** | **String**| the provider name |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sMTPStatRouterGetAllAggregateSubAccountSMTPStats"></a>
# **sMTPStatRouterGetAllAggregateSubAccountSMTPStats**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateSubAccountSMTPStats(xAccountApiKey, sid, from, to)



Get All Aggregate SubAccount SMTP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long sid = 789L; // Long | the Sub-Account ID you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateSubAccountSMTPStats(xAccountApiKey, sid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateSubAccountSMTPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **sid** | **Long**| the Sub-Account ID you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP"></a>
# **sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP**
> List&lt;ModelsSMTPStat&gt; sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP(xAccountApiKey, sid, ipid, from, to)



Get All Aggregate SubAccount SMTP Stats For IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsmtpstatApi;


AccountsmtpstatApi apiInstance = new AccountsmtpstatApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long sid = 789L; // Long | the Sub-Account ID you want to get
Long ipid = 789L; // Long | the IP  ID you want to get
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsSMTPStat> result = apiInstance.sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP(xAccountApiKey, sid, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsmtpstatApi#sMTPStatRouterGetAllAggregateSubAccountSMTPStatsForIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **sid** | **Long**| the Sub-Account ID you want to get |
 **ipid** | **Long**| the IP  ID you want to get |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsSMTPStat&gt;**](ModelsSMTPStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

