package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationRequestInputModelCardPOSDeviceAllocationInstanceRecord;
import org.bian.dto.CRCardPOSDeviceAllocationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRequestInputModel
 */
public class CRCardPOSDeviceAllocationRequestInputModel   {
  private String cardTerminalAdministrationServicingSessionReference = null;

  private String cardPOSDeviceAllocationInstanceReference = null;

  private CRCardPOSDeviceAllocationRequestInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private Object cardPOSDeviceAllocationRequestActionTaskRecord = null;

  private CRCardPOSDeviceAllocationRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCardPOSDeviceAllocationRequestInputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationRequestInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return cardPOSDeviceAllocationRequestActionTaskRecord
  **/

  public Object getCardPOSDeviceAllocationRequestActionTaskRecord() {
    return cardPOSDeviceAllocationRequestActionTaskRecord;
  }

  public void setCardPOSDeviceAllocationRequestActionTaskRecord(Object cardPOSDeviceAllocationRequestActionTaskRecord) {
    this.cardPOSDeviceAllocationRequestActionTaskRecord = cardPOSDeviceAllocationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCardPOSDeviceAllocationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCardPOSDeviceAllocationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

