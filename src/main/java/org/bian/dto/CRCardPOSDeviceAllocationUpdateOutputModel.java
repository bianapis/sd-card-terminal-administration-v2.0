package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationUpdateOutputModel
 */
public class CRCardPOSDeviceAllocationUpdateOutputModel   {
  private CRCardPOSDeviceAllocationUpdateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String cardPOSDeviceAllocationUpdateActionTaskReference = null;

  private Object cardPOSDeviceAllocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardPOSDeviceAllocationUpdateActionTaskReference
  **/

  public String getCardPOSDeviceAllocationUpdateActionTaskReference() {
    return cardPOSDeviceAllocationUpdateActionTaskReference;
  }

  public void setCardPOSDeviceAllocationUpdateActionTaskReference(String cardPOSDeviceAllocationUpdateActionTaskReference) {
    this.cardPOSDeviceAllocationUpdateActionTaskReference = cardPOSDeviceAllocationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

