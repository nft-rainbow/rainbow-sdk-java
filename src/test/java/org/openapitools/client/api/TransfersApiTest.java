/*
 * Rainbow-API
 * The responses of the open api in swagger focus on the data field rather than the code and the message fields
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ModelsTransferTask;
import org.openapitools.client.model.ModelsTransferTaskQueryResult;
import org.openapitools.client.model.RainbowErrorsRainbowErrorDetailInfo;
import org.openapitools.client.model.ServicesTransferBatchDto;
import org.openapitools.client.model.ServicesTransferDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for TransfersApi
 */
@Ignore
public class TransfersApiTest {

    private final TransfersApi api = new TransfersApi();

    
    /**
     * Batch Transfer NFTs
     *
     * Transfer several NFTs once
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchTransferNftTest() throws ApiException {
        String authorization = null;
        ServicesTransferBatchDto transferBatchDto = null;
        List<ModelsTransferTask> response = 
        api.batchTransferNft(authorization, transferBatchDto);
        
        // TODO: test validations
    }
    
    /**
     * Transfer NFT detail
     *
     * Get NFT Transfer detail info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransferDetailTest() throws ApiException {
        String authorization = null;
        Integer id = null;
        ModelsTransferTask response = 
        api.getTransferDetail(authorization, id);
        
        // TODO: test validations
    }
    
    /**
     * Obtain the transferred NFTs list
     *
     * Get the NFT list containing the transferred NFT information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransferTest() throws ApiException {
        String authorization = null;
        Integer page = null;
        Integer limit = null;
        ModelsTransferTaskQueryResult response = 
        api.listTransfer(authorization, page, limit);
        
        // TODO: test validations
    }
    
    /**
     * Transfer NFT
     *
     * Transfer NFT by admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferNftTest() throws ApiException {
        String authorization = null;
        ServicesTransferDto transferDto = null;
        ModelsTransferTask response = 
        api.transferNft(authorization, transferDto);
        
        // TODO: test validations
    }
    
}
