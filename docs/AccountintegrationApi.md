# AccountintegrationApi

All URIs are relative to *https://api.sendpost.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountIntegrationRouterCount**](AccountintegrationApi.md#accountIntegrationRouterCount) | **GET** /account/integration/count | 
[**accountIntegrationRouterCreate**](AccountintegrationApi.md#accountIntegrationRouterCreate) | **POST** /account/integration/{itype} | 
[**accountIntegrationRouterDelete**](AccountintegrationApi.md#accountIntegrationRouterDelete) | **DELETE** /account/integration/{itype} | 
[**accountIntegrationRouterDisableGlockappsIPMonitoring**](AccountintegrationApi.md#accountIntegrationRouterDisableGlockappsIPMonitoring) | **DELETE** /account/integration/glockapps/monitor/{ipid} | 
[**accountIntegrationRouterEnableGlockappsIPMonitoring**](AccountintegrationApi.md#accountIntegrationRouterEnableGlockappsIPMonitoring) | **POST** /account/integration/glockapps/monitor/{ipid} | 
[**accountIntegrationRouterGetAll**](AccountintegrationApi.md#accountIntegrationRouterGetAll) | **GET** /account/integration/ | 
[**accountIntegrationRouterGetMonitoredIPStats**](AccountintegrationApi.md#accountIntegrationRouterGetMonitoredIPStats) | **GET** /account/integration/glockapps/monitor/stat/{ipid} | 
[**accountIntegrationRouterUpdate**](AccountintegrationApi.md#accountIntegrationRouterUpdate) | **PUT** /account/integration/{itype} | 


<a name="accountIntegrationRouterCount"></a>
# **accountIntegrationRouterCount**
> ModelsCountStat accountIntegrationRouterCount(xAccountApiKey)



Count Total AccountIntegrations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    ModelsCountStat result = apiInstance.accountIntegrationRouterCount(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**ModelsCountStat**](ModelsCountStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterCreate"></a>
# **accountIntegrationRouterCreate**
> ModelsIntegration accountIntegrationRouterCreate(xAccountApiKey, itype, body)



Create Integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String itype = "itype_example"; // String | The integration type you want to create
ModelsEIntegration body = new ModelsEIntegration(); // ModelsEIntegration | The Integration content
try {
    ModelsIntegration result = apiInstance.accountIntegrationRouterCreate(xAccountApiKey, itype, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **itype** | **String**| The integration type you want to create |
 **body** | [**ModelsEIntegration**](ModelsEIntegration.md)| The Integration content |

### Return type

[**ModelsIntegration**](ModelsIntegration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterDelete"></a>
# **accountIntegrationRouterDelete**
> ModelsDeleteResponse accountIntegrationRouterDelete(xAccountApiKey, itype)



Delete Integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String itype = "itype_example"; // String | The integration type you want to update
try {
    ModelsDeleteResponse result = apiInstance.accountIntegrationRouterDelete(xAccountApiKey, itype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **itype** | **String**| The integration type you want to update |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterDisableGlockappsIPMonitoring"></a>
# **accountIntegrationRouterDisableGlockappsIPMonitoring**
> ModelsDeleteResponse accountIntegrationRouterDisableGlockappsIPMonitoring(xAccountApiKey, ipid)



Disable IP Monitoring for a single IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to disable monitoring for
try {
    ModelsDeleteResponse result = apiInstance.accountIntegrationRouterDisableGlockappsIPMonitoring(xAccountApiKey, ipid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterDisableGlockappsIPMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to disable monitoring for |

### Return type

[**ModelsDeleteResponse**](ModelsDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterEnableGlockappsIPMonitoring"></a>
# **accountIntegrationRouterEnableGlockappsIPMonitoring**
> ModelsResponse accountIntegrationRouterEnableGlockappsIPMonitoring(xAccountApiKey, ipid)



Enable IP Monitoring for a single IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId you want to enable monitoring for
try {
    ModelsResponse result = apiInstance.accountIntegrationRouterEnableGlockappsIPMonitoring(xAccountApiKey, ipid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterEnableGlockappsIPMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId you want to enable monitoring for |

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterGetAll"></a>
# **accountIntegrationRouterGetAll**
> List&lt;ModelsIntegration&gt; accountIntegrationRouterGetAll(xAccountApiKey)



Get All Integrations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
try {
    List<ModelsIntegration> result = apiInstance.accountIntegrationRouterGetAll(xAccountApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |

### Return type

[**List&lt;ModelsIntegration&gt;**](ModelsIntegration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterGetMonitoredIPStats"></a>
# **accountIntegrationRouterGetMonitoredIPStats**
> List&lt;ModelsRGlockappsMonitorStat&gt; accountIntegrationRouterGetMonitoredIPStats(xAccountApiKey, ipid, from, to)



Get Monitored IP Stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
Long ipid = 789L; // Long | the IPId for which you want monitored stats
String from = "from_example"; // String | from date
String to = "to_example"; // String | to date
try {
    List<ModelsRGlockappsMonitorStat> result = apiInstance.accountIntegrationRouterGetMonitoredIPStats(xAccountApiKey, ipid, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterGetMonitoredIPStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **ipid** | **Long**| the IPId for which you want monitored stats |
 **from** | **String**| from date | [optional]
 **to** | **String**| to date | [optional]

### Return type

[**List&lt;ModelsRGlockappsMonitorStat&gt;**](ModelsRGlockappsMonitorStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIntegrationRouterUpdate"></a>
# **accountIntegrationRouterUpdate**
> ModelsIntegration accountIntegrationRouterUpdate(xAccountApiKey, itype, body)



Update Integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountintegrationApi;


AccountintegrationApi apiInstance = new AccountintegrationApi();
String xAccountApiKey = "xAccountApiKey_example"; // String | Account API Key
String itype = "itype_example"; // String | The integration type you want to update
ModelsEIntegration body = new ModelsEIntegration(); // ModelsEIntegration | The Integration content
try {
    ModelsIntegration result = apiInstance.accountIntegrationRouterUpdate(xAccountApiKey, itype, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountintegrationApi#accountIntegrationRouterUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountApiKey** | **String**| Account API Key |
 **itype** | **String**| The integration type you want to update |
 **body** | [**ModelsEIntegration**](ModelsEIntegration.md)| The Integration content |

### Return type

[**ModelsIntegration**](ModelsIntegration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

