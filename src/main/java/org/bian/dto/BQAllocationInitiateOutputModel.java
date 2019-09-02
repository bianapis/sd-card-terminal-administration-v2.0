package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationInitiateOutputModel
 */
public class BQAllocationInitiateOutputModel   {
  private CRCardPOSDeviceAllocationInitiateOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String allocationInstanceReference = null;

  private String allocationInitiateActionReference = null;

  private Object allocationInitiateActionRecord = null;

  private String allocationInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return allocationInitiateActionReference
  **/

  public String getAllocationInitiateActionReference() {
    return allocationInitiateActionReference;
  }

  public void setAllocationInitiateActionReference(String allocationInitiateActionReference) {
    this.allocationInitiateActionReference = allocationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return allocationInitiateActionRecord
  **/

  public Object getAllocationInitiateActionRecord() {
    return allocationInitiateActionRecord;
  }

  public void setAllocationInitiateActionRecord(Object allocationInitiateActionRecord) {
    this.allocationInitiateActionRecord = allocationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Allocation instance (e.g. initialised, pending, active) 
   * @return allocationInstanceStatus
  **/

  public String getAllocationInstanceStatus() {
    return allocationInstanceStatus;
  }

  public void setAllocationInstanceStatus(String allocationInstanceStatus) {
    this.allocationInstanceStatus = allocationInstanceStatus;
  }


}

