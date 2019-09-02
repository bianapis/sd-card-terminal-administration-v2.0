package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord
 */
public class CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord   {
  private String cardPOSDeviceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the POS device (e.g. testing, in production, help inventory, under repair, replaced/terminated) 
   * @return cardPOSDeviceStatus
  **/

  public String getCardPOSDeviceStatus() {
    return cardPOSDeviceStatus;
  }

  public void setCardPOSDeviceStatus(String cardPOSDeviceStatus) {
    this.cardPOSDeviceStatus = cardPOSDeviceStatus;
  }


}

