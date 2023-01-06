# NftsApi

All URIs are relative to *http://api.nftrainbow.cn/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**nFTInfo**](NftsApi.md#nFTInfo) | **GET** /nft/{address}/{token_id} | Get NFT info, mainly owner and metadata |



## nFTInfo

> ServicesNFT nFTInfo(authorization, address, tokenId)

Get NFT info, mainly owner and metadata

Get NFT info, mainly owner and metadata

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.nftrainbow.cn/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Open_JWT
        String address = "address_example"; // String | address
        String tokenId = "tokenId_example"; // String | token_id
        try {
            ServicesNFT result = apiInstance.nFTInfo(authorization, address, tokenId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#nFTInfo");
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
| **address** | **String**| address | |
| **tokenId** | **String**| token_id | |

### Return type

[**ServicesNFT**](ServicesNFT.md)

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

