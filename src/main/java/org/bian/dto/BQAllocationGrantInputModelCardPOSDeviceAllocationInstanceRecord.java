package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationGrantInputModelCardPOSDeviceAllocationInstanceRecord
 */
public class BQAllocationGrantInputModelCardPOSDeviceAllocationInstanceRecord   {
  private String cardPOSDeviceReference = null;

  private String cardPOSDeviceIdentifier = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identification for the POS device 
   * @return cardPOSDeviceReference
  **/

  public String getCardPOSDeviceReference() {
    return cardPOSDeviceReference;
  }

  public void setCardPOSDeviceReference(String cardPOSDeviceReference) {
    this.cardPOSDeviceReference = cardPOSDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any unique identification properties (e.g. serial number) 
   * @return cardPOSDeviceIdentifier
  **/

  public String getCardPOSDeviceIdentifier() {
    return cardPOSDeviceIdentifier;
  }

  public void setCardPOSDeviceIdentifier(String cardPOSDeviceIdentifier) {
    this.cardPOSDeviceIdentifier = cardPOSDeviceIdentifier;
  }


}

