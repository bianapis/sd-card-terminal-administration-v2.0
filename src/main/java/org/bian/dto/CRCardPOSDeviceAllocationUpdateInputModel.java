package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationUpdateInputModel
 */
public class CRCardPOSDeviceAllocationUpdateInputModel   {
  private String cardTerminalAdministrationServicingSessionReference = null;

  private String cardPOSDeviceAllocationInstanceReference = null;

  private CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private Object cardPOSDeviceAllocationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cardPOSDeviceAllocationInstanceRecord
   * @return cardPOSDeviceAllocationInstanceRecord
  **/

  public CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardPOSDeviceAllocationUpdateActionTaskRecord
  **/

  public Object getCardPOSDeviceAllocationUpdateActionTaskRecord() {
    return cardPOSDeviceAllocationUpdateActionTaskRecord;
  }

  public void setCardPOSDeviceAllocationUpdateActionTaskRecord(Object cardPOSDeviceAllocationUpdateActionTaskRecord) {
    this.cardPOSDeviceAllocationUpdateActionTaskRecord = cardPOSDeviceAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

