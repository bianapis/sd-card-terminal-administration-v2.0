package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationInitiateInputModel
 */
public class CRCardPOSDeviceAllocationInitiateInputModel   {
  private String cardTerminalAdministrationServicingSessionReference = null;

  private Object cardPOSDeviceAllocationInitiateActionRecord = null;

  private String cardPOSDeviceAllocationInstanceStatus = null;

  private CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardTerminalAdministrationServicingSessionReference
  **/

  public String getCardTerminalAdministrationServicingSessionReference() {
    return cardTerminalAdministrationServicingSessionReference;
  }

  public void setCardTerminalAdministrationServicingSessionReference(String cardTerminalAdministrationServicingSessionReference) {
    this.cardTerminalAdministrationServicingSessionReference = cardTerminalAdministrationServicingSessionReference;
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

  public CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


}

