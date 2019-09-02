package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationCaptureInputModelCaptureRecordType;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationCaptureInputModel
 */
public class BQAllocationCaptureInputModel   {
  private CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String cardPOSDeviceAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private Object allocationCaptureActionTaskRecord = null;

  private BQAllocationCaptureInputModelCaptureRecordType captureRecordType = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card POS Device Allocation instance 
   * @return cardPOSDeviceAllocationInstanceReference
  **/

  public String getCardPOSDeviceAllocationInstanceReference() {
    return cardPOSDeviceAllocationInstanceReference;
  }

  public void setCardPOSDeviceAllocationInstanceReference(String cardPOSDeviceAllocationInstanceReference) {
    this.cardPOSDeviceAllocationInstanceReference = cardPOSDeviceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Allocation instance 
   * @return allocationInstanceReference
  **/

  public String getAllocationInstanceReference() {
    return allocationInstanceReference;
  }

  public void setAllocationInstanceReference(String allocationInstanceReference) {
    this.allocationInstanceReference = allocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return allocationCaptureActionTaskRecord
  **/

  public Object getAllocationCaptureActionTaskRecord() {
    return allocationCaptureActionTaskRecord;
  }

  public void setAllocationCaptureActionTaskRecord(Object allocationCaptureActionTaskRecord) {
    this.allocationCaptureActionTaskRecord = allocationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQAllocationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQAllocationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

