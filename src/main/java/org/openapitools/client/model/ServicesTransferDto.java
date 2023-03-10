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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServicesTransferDto
 */
@JsonPropertyOrder({
  ServicesTransferDto.JSON_PROPERTY_AMOUNT,
  ServicesTransferDto.JSON_PROPERTY_CHAIN,
  ServicesTransferDto.JSON_PROPERTY_CONTRACT_ADDRESS,
  ServicesTransferDto.JSON_PROPERTY_CONTRACT_TYPE,
  ServicesTransferDto.JSON_PROPERTY_TOKEN_ID,
  ServicesTransferDto.JSON_PROPERTY_TRANSFER_FROM_ADDRESS,
  ServicesTransferDto.JSON_PROPERTY_TRANSFER_TO_ADDRESS
})
@JsonTypeName("services.TransferDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesTransferDto {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  /**
   * Gets or Sets chain
   */
  public enum ChainEnum {
    CONFLUX("conflux"),
    
    CONFLUX_TEST("conflux_test");

    private String value;

    ChainEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChainEnum fromValue(String value) {
      for (ChainEnum b : ChainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHAIN = "chain";
  private ChainEnum chain;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contract_address";
  private String contractAddress;

  /**
   * Gets or Sets contractType
   */
  public enum ContractTypeEnum {
    ERC721("erc721"),
    
    ERC1155("erc1155");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContractTypeEnum fromValue(String value) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTRACT_TYPE = "contract_type";
  private ContractTypeEnum contractType;

  public static final String JSON_PROPERTY_TOKEN_ID = "token_id";
  private String tokenId;

  public static final String JSON_PROPERTY_TRANSFER_FROM_ADDRESS = "transfer_from_address";
  private String transferFromAddress;

  public static final String JSON_PROPERTY_TRANSFER_TO_ADDRESS = "transfer_to_address";
  private String transferToAddress;

  public ServicesTransferDto() {
  }

  public ServicesTransferDto amount(Integer amount) {
    
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


  public ServicesTransferDto chain(ChainEnum chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChainEnum getChain() {
    return chain;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChain(ChainEnum chain) {
    this.chain = chain;
  }


  public ServicesTransferDto contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContractAddress() {
    return contractAddress;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public ServicesTransferDto contractType(ContractTypeEnum contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContractTypeEnum getContractType() {
    return contractType;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }


  public ServicesTransferDto tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public ServicesTransferDto transferFromAddress(String transferFromAddress) {
    
    this.transferFromAddress = transferFromAddress;
    return this;
  }

   /**
   * Get transferFromAddress
   * @return transferFromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFER_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransferFromAddress() {
    return transferFromAddress;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferFromAddress(String transferFromAddress) {
    this.transferFromAddress = transferFromAddress;
  }


  public ServicesTransferDto transferToAddress(String transferToAddress) {
    
    this.transferToAddress = transferToAddress;
    return this;
  }

   /**
   * Get transferToAddress
   * @return transferToAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFER_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransferToAddress() {
    return transferToAddress;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferToAddress(String transferToAddress) {
    this.transferToAddress = transferToAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesTransferDto servicesTransferDto = (ServicesTransferDto) o;
    return Objects.equals(this.amount, servicesTransferDto.amount) &&
        Objects.equals(this.chain, servicesTransferDto.chain) &&
        Objects.equals(this.contractAddress, servicesTransferDto.contractAddress) &&
        Objects.equals(this.contractType, servicesTransferDto.contractType) &&
        Objects.equals(this.tokenId, servicesTransferDto.tokenId) &&
        Objects.equals(this.transferFromAddress, servicesTransferDto.transferFromAddress) &&
        Objects.equals(this.transferToAddress, servicesTransferDto.transferToAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chain, contractAddress, contractType, tokenId, transferFromAddress, transferToAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesTransferDto {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    transferFromAddress: ").append(toIndentedString(transferFromAddress)).append("\n");
    sb.append("    transferToAddress: ").append(toIndentedString(transferToAddress)).append("\n");
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

