# TransfersApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchTransferNft**](TransfersApi.md#batchTransferNft) | **POST** /transfers/customizable/batch | Batch Transfer NFTs |
| [**getTransferDetail**](TransfersApi.md#getTransferDetail) | **GET** /transfers/{id} | Transfer NFT detail |
| [**listTransfer**](TransfersApi.md#listTransfer) | **GET** /transfers/ | Obtain the transferred NFTs list |
| [**transferNft**](TransfersApi.md#transferNft) | **POST** /transfers/customizable | Transfer NFT |



## batchTransferNft

> List&lt;ModelsTransferTask&gt; batchTransferNft(authorization, transferBatchDto)

Batch Transfer NFTs

Transfer several NFTs once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesTransferBatchDto transferBatchDto = new ServicesTransferBatchDto(); // ServicesTransferBatchDto | transfer_batch_dto
        try {
            List<ModelsTransferTask> result = apiInstance.batchTransferNft(authorization, transferBatchDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#batchTransferNft");
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
| **transferBatchDto** | [**ServicesTransferBatchDto**](ServicesTransferBatchDto.md)| transfer_batch_dto | |

### Return type

[**List&lt;ModelsTransferTask&gt;**](ModelsTransferTask.md)

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


## getTransferDetail

> ModelsTransferTask getTransferDetail(authorization, id)

Transfer NFT detail

Get NFT Transfer detail info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer id = 56; // Integer | id
        try {
            ModelsTransferTask result = apiInstance.getTransferDetail(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#getTransferDetail");
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

[**ModelsTransferTask**](ModelsTransferTask.md)

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


## listTransfer

> ModelsTransferTaskQueryResult listTransfer(authorization, page, limit)

Obtain the transferred NFTs list

Get the NFT list containing the transferred NFT information.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        Integer page = 56; // Integer | page
        Integer limit = 56; // Integer | limit
        try {
            ModelsTransferTaskQueryResult result = apiInstance.listTransfer(authorization, page, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#listTransfer");
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
| **page** | **Integer**| page | [optional] |
| **limit** | **Integer**| limit | [optional] |

### Return type

[**ModelsTransferTaskQueryResult**](ModelsTransferTaskQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server error |  -  |


## transferNft

> ModelsTransferTask transferNft(authorization, transferDto)

Transfer NFT

Transfer NFT by admin

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        TransfersApi apiInstance = new TransfersApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        ServicesTransferDto transferDto = new ServicesTransferDto(); // ServicesTransferDto | transfer_dto
        try {
            ModelsTransferTask result = apiInstance.transferNft(authorization, transferDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#transferNft");
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
| **transferDto** | [**ServicesTransferDto**](ServicesTransferDto.md)| transfer_dto | |

### Return type

[**ModelsTransferTask**](ModelsTransferTask.md)

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

