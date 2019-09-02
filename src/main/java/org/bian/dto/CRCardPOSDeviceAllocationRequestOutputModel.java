package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRequestOutputModel
 */
public class CRCardPOSDeviceAllocationRequestOutputModel   {
  private CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String cardPOSDeviceAllocationRequestActionTaskReference = null;

  private Object cardPOSDeviceAllocationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cardPOSDeviceAllocationInstanceRecord
   * @return cardPOSDeviceAllocationInstanceRecord
  **/

  public CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card POS Device Allocation instance request service call 
   * @return cardPOSDeviceAllocationRequestActionTaskReference
  **/

  public String getCardPOSDeviceAllocationRequestActionTaskReference() {
    return cardPOSDeviceAllocationRequestActionTaskReference;
  }

  public void setCardPOSDeviceAllocationRequestActionTaskReference(String cardPOSDeviceAllocationRequestActionTaskReference) {
    this.cardPOSDeviceAllocationRequestActionTaskReference = cardPOSDeviceAllocationRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

