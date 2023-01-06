# LoginApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginApp**](LoginApi.md#loginApp) | **POST** /login | App login |
| [**refreshAuth**](LoginApi.md#refreshAuth) | **GET** /refresh_token | Refresh JWT |



## loginApp

> MiddlewaresLoginResp loginApp(appLoginInfo)

App login

Login the app to get the JWT according to the app_id and app_secret

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        LoginApi apiInstance = new LoginApi(defaultClient);
        MiddlewaresAppLogin appLoginInfo = new MiddlewaresAppLogin(); // MiddlewaresAppLogin | login info, contain app_id and app_secret
        try {
            MiddlewaresLoginResp result = apiInstance.loginApp(appLoginInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#loginApp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appLoginInfo** | [**MiddlewaresAppLogin**](MiddlewaresAppLogin.md)| login info, contain app_id and app_secret | |

### Return type

[**MiddlewaresLoginResp**](MiddlewaresLoginResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | auth token |  -  |
| **401** | Unauthorized |  -  |


## refreshAuth

> MiddlewaresLoginResp refreshAuth(authorization)

Refresh JWT

Obtain a new JWT

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        LoginApi apiInstance = new LoginApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer openapi_token
        try {
            MiddlewaresLoginResp result = apiInstance.refreshAuth(authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#refreshAuth");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer openapi_token | |

### Return type

[**MiddlewaresLoginResp**](MiddlewaresLoginResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | refreshed auth token |  -  |
| **401** | Unauthorized |  -  |

