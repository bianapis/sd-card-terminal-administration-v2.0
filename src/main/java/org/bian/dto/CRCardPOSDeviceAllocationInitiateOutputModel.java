package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationInitiateOutputModel
 */
public class CRCardPOSDeviceAllocationInitiateOutputModel   {
  private String cardPOSDeviceAllocationInstanceReference = null;

  private String cardPOSDeviceAllocationInitiateActionReference = null;

  private Object cardPOSDeviceAllocationInitiateActionRecord = null;

  private String cardPOSDeviceAllocationInstanceStatus = null;

  private CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card POS Device Allocation instance 
   * @return cardPOSDeviceAllocationInstanceReference
  **/

  public String getCardPOSDeviceAllocationInstanceReference() {
    return cardPOSDeviceAllocationInstanceReference;
  }

  public void setCardPOSDeviceAllocationInstanceReference(String cardPOSDeviceAllocationInstanceReference) {
    this.cardPOSDeviceAllocationInstanceReference = cardPOSDeviceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardPOSDeviceAllocationInitiateActionReference
  **/

  public String getCardPOSDeviceAllocationInitiateActionReference() {
    return cardPOSDeviceAllocationInitiateActionReference;
  }

  public void setCardPOSDeviceAllocationInitiateActionReference(String cardPOSDeviceAllocationInitiateActionReference) {
    this.cardPOSDeviceAllocationInitiateActionReference = cardPOSDeviceAllocationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardPOSDeviceAllocationInitiateActionRecord
  **/

  public Object getCardPOSDeviceAllocationInitiateActionRecord() {
    return cardPOSDeviceAllocationInitiateActionRecord;
  }

  public void setCardPOSDeviceAllocationInitiateActionRecord(Object cardPOSDeviceAllocationInitiateActionRecord) {
    this.cardPOSDeviceAllocationInitiateActionRecord = cardPOSDeviceAllocationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card POS Device Allocation instance (e.g. initialised, pending, active) 
   * @return cardPOSDeviceAllocationInstanceStatus
  **/

  public String getCardPOSDeviceAllocationInstanceStatus() {
    return cardPOSDeviceAllocationInstanceStatus;
  }

  public void setCardPOSDeviceAllocationInstanceStatus(String cardPOSDeviceAllocationInstanceStatus) {
    this.cardPOSDeviceAllocationInstanceStatus = cardPOSDeviceAllocationInstanceStatus;
  }


  /**
   * Get cardPOSDeviceAllocationInstanceRecord
   * @return cardPOSDeviceAllocationInstanceRecord
  **/

  public CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


}

