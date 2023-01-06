# BurnsApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**burnNft**](BurnsApi.md#burnNft) | **POST** /burns | Burn NFT |
| [**getBurnDetail**](BurnsApi.md#getBurnDetail) | **GET** /burns/{id} | Burn NFT detail |
| [**getBurnList**](BurnsApi.md#getBurnList) | **GET** /burns | Obtain the burned NFTs list |



## burnNft

> ModelsBurnTask burnNft(authorization, burnDto)

Burn NFT

Burn NFT by admin

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BurnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        BurnsApi apiInstance = new BurnsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesBurnDto burnDto = new ServicesBurnDto(); // ServicesBurnDto | burn_dto
        try {
            ModelsBurnTask result = apiInstance.burnNft(authorization, burnDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BurnsApi#burnNft");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **burnDto** | [**ServicesBurnDto**](ServicesBurnDto.md)| burn_dto | |

### Return type

[**ModelsBurnTask**](ModelsBurnTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |


## getBurnDetail

> ModelsBurnTask getBurnDetail(authorization, id)

Burn NFT detail

Get NFT Burn detail info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BurnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        BurnsApi apiInstance = new BurnsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer id = 56; // Integer | id
        try {
            ModelsBurnTask result = apiInstance.getBurnDetail(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BurnsApi#getBurnDetail");
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
| **authorization** | **String**| Bearer Open_JWT | |
| **id** | **Integer**| id | |

### Return type

[**ModelsBurnTask**](ModelsBurnTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |


## getBurnList

> ModelsBurnTaskQueryResult getBurnList(authorization)

Obtain the burned NFTs list

Get the NFT burned list information.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BurnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        BurnsApi apiInstance = new BurnsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        try {
            ModelsBurnTaskQueryResult result = apiInstance.getBurnList(authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BurnsApi#getBurnList");
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
| **authorization** | **String**| Bearer Open_JWT | |

### Return type

[**ModelsBurnTaskQueryResult**](ModelsBurnTaskQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |

