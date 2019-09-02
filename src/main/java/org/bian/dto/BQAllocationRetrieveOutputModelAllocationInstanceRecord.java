package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveOutputModelAllocationInstanceRecord
 */
public class BQAllocationRetrieveOutputModelAllocationInstanceRecord   {
  private String merchantReference = null;

  private String merchantType = null;

  private String merchantLocation = null;

  private String cardPOSDeviceConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card merchant registered with the device 
   * @return merchantReference
  **/

  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of merchant (e.g. retailer, hotel) 
   * @return merchantType
  **/

  public String getMerchantType() {
    return merchantType;
  }

  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The physical location/address of the retailer and the device 
   * @return merchantLocation
  **/

  public String getMerchantLocation() {
    return merchantLocation;
  }

  public void setMerchantLocation(String merchantLocation) {
    this.merchantLocation = merchantLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration defines its operational characteristics/capabilities e.g. (PIN pad, transaction capture, tip handling, transaction descriptive, manual entry, security keys, balancing, receipt options/text, communication options, card types, currencies, etc.) 
   * @return cardPOSDeviceConfiguration
  **/

  public String getCardPOSDeviceConfiguration() {
    return cardPOSDeviceConfiguration;
  }

  public void setCardPOSDeviceConfiguration(String cardPOSDeviceConfiguration) {
    this.cardPOSDeviceConfiguration = cardPOSDeviceConfiguration;
  }


}

