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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.GormDeletedAt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ModelsBurnTask
 */
@JsonPropertyOrder({
  ModelsBurnTask.JSON_PROPERTY_AMOUNT,
  ModelsBurnTask.JSON_PROPERTY_APP_ID,
  ModelsBurnTask.JSON_PROPERTY_CHAIN_ID,
  ModelsBurnTask.JSON_PROPERTY_CHAIN_TYPE,
  ModelsBurnTask.JSON_PROPERTY_CONTRACT,
  ModelsBurnTask.JSON_PROPERTY_CONTRACT_TYPE,
  ModelsBurnTask.JSON_PROPERTY_CREATED_AT,
  ModelsBurnTask.JSON_PROPERTY_DELETED_AT,
  ModelsBurnTask.JSON_PROPERTY_ERROR,
  ModelsBurnTask.JSON_PROPERTY_HASH,
  ModelsBurnTask.JSON_PROPERTY_ID,
  ModelsBurnTask.JSON_PROPERTY_STATUS,
  ModelsBurnTask.JSON_PROPERTY_TOKEN_ID,
  ModelsBurnTask.JSON_PROPERTY_TX_ID,
  ModelsBurnTask.JSON_PROPERTY_UPDATED_AT,
  ModelsBurnTask.JSON_PROPERTY_USER
})
@JsonTypeName("models.BurnTask")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsBurnTask {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private Integer appId;

  public static final String JSON_PROPERTY_CHAIN_ID = "chain_id";
  private Integer chainId;

  public static final String JSON_PROPERTY_CHAIN_TYPE = "chain_type";
  private Integer chainType;

  public static final String JSON_PROPERTY_CONTRACT = "contract";
  private String contract;

  public static final String JSON_PROPERTY_CONTRACT_TYPE = "contract_type";
  private Integer contractType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private GormDeletedAt deletedAt;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_TOKEN_ID = "token_id";
  private String tokenId;

  public static final String JSON_PROPERTY_TX_ID = "tx_id";
  private Integer txId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public ModelsBurnTask() {
  }

  public ModelsBurnTask amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ModelsBurnTask appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public ModelsBurnTask chainId(Integer chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChainId() {
    return chainId;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainId(Integer chainId) {
    this.chainId = chainId;
  }


  public ModelsBurnTask chainType(Integer chainType) {
    
    this.chainType = chainType;
    return this;
  }

   /**
   * Get chainType
   * @return chainType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChainType() {
    return chainType;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainType(Integer chainType) {
    this.chainType = chainType;
  }


  public ModelsBurnTask contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContract() {
    return contract;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContract(String contract) {
    this.contract = contract;
  }


  public ModelsBurnTask contractType(Integer contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContractType() {
    return contractType;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractType(Integer contractType) {
    this.contractType = contractType;
  }


  public ModelsBurnTask createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ModelsBurnTask deletedAt(GormDeletedAt deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GormDeletedAt getDeletedAt() {
    return deletedAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedAt(GormDeletedAt deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ModelsBurnTask error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public ModelsBurnTask hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(String hash) {
    this.hash = hash;
  }


  public ModelsBurnTask id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ModelsBurnTask status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 0-pending, 1-success, 2-failed
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-pending, 1-success, 2-failed")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public ModelsBurnTask tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public ModelsBurnTask txId(Integer txId) {
    
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTxId() {
    return txId;
  }


  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxId(Integer txId) {
    this.txId = txId;
  }


  public ModelsBurnTask updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ModelsBurnTask user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsBurnTask modelsBurnTask = (ModelsBurnTask) o;
    return Objects.equals(this.amount, modelsBurnTask.amount) &&
        Objects.equals(this.appId, modelsBurnTask.appId) &&
        Objects.equals(this.chainId, modelsBurnTask.chainId) &&
        Objects.equals(this.chainType, modelsBurnTask.chainType) &&
        Objects.equals(this.contract, modelsBurnTask.contract) &&
        Objects.equals(this.contractType, modelsBurnTask.contractType) &&
        Objects.equals(this.createdAt, modelsBurnTask.createdAt) &&
        Objects.equals(this.deletedAt, modelsBurnTask.deletedAt) &&
        Objects.equals(this.error, modelsBurnTask.error) &&
        Objects.equals(this.hash, modelsBurnTask.hash) &&
        Objects.equals(this.id, modelsBurnTask.id) &&
        Objects.equals(this.status, modelsBurnTask.status) &&
        Objects.equals(this.tokenId, modelsBurnTask.tokenId) &&
        Objects.equals(this.txId, modelsBurnTask.txId) &&
        Objects.equals(this.updatedAt, modelsBurnTask.updatedAt) &&
        Objects.equals(this.user, modelsBurnTask.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appId, chainId, chainType, contract, contractType, createdAt, deletedAt, error, hash, id, status, tokenId, txId, updatedAt, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsBurnTask {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    chainType: ").append(toIndentedString(chainType)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
