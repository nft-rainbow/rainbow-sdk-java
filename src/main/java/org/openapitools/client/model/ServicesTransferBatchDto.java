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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ServicesTransferItemDto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServicesTransferBatchDto
 */
@JsonPropertyOrder({
  ServicesTransferBatchDto.JSON_PROPERTY_CHAIN,
  ServicesTransferBatchDto.JSON_PROPERTY_CONTRACT_ADDRESS,
  ServicesTransferBatchDto.JSON_PROPERTY_CONTRACT_TYPE,
  ServicesTransferBatchDto.JSON_PROPERTY_ITEMS
})
@JsonTypeName("services.TransferBatchDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesTransferBatchDto {
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

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ServicesTransferItemDto> items = new ArrayList<>();

  public ServicesTransferBatchDto() {
  }

  public ServicesTransferBatchDto chain(ChainEnum chain) {
    
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


  public ServicesTransferBatchDto contractAddress(String contractAddress) {
    
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


  public ServicesTransferBatchDto contractType(ContractTypeEnum contractType) {
    
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


  public ServicesTransferBatchDto items(List<ServicesTransferItemDto> items) {
    
    this.items = items;
    return this;
  }

  public ServicesTransferBatchDto addItemsItem(ServicesTransferItemDto itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ServicesTransferItemDto> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<ServicesTransferItemDto> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesTransferBatchDto servicesTransferBatchDto = (ServicesTransferBatchDto) o;
    return Objects.equals(this.chain, servicesTransferBatchDto.chain) &&
        Objects.equals(this.contractAddress, servicesTransferBatchDto.contractAddress) &&
        Objects.equals(this.contractType, servicesTransferBatchDto.contractType) &&
        Objects.equals(this.items, servicesTransferBatchDto.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain, contractAddress, contractType, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesTransferBatchDto {\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
