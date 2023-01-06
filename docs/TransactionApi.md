# TransactionApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransactionByID**](TransactionApi.md#getTransactionByID) | **GET** /tx/{id} | Get transaction informantion by ID |



## getTransactionByID

> ServicesTxResp getTransactionByID(authorization, id)

Get transaction informantion by ID

Get transaction informantion by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String id = "id_example"; // String | Transaction ID
        try {
            ServicesTxResp result = apiInstance.getTransactionByID(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#getTransactionByID");
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
| **id** | **String**| Transaction ID | |

### Return type

[**ServicesTxResp**](ServicesTxResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction informantion |  -  |
| **400** | Invalid request |  -  |
| **500** | Internal Server error |  -  |
| **599** | Businesss error |  -  |

