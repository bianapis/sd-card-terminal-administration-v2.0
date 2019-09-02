package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationInitiateInputModelAllocationInstanceRecord;
import org.bian.dto.BQAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationInitiateInputModel
 */
public class BQAllocationInitiateInputModel   {
  private BQAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String cardPOSDeviceAllocationInstanceReference = null;

  private Object allocationInitiateActionRecord = null;

  private BQAllocationInitiateInputModelAllocationInstanceRecord allocationInstanceRecord = null;


  /**
   * Get cardPOSDeviceAllocationInstanceRecord
   * @return cardPOSDeviceAllocationInstanceRecord
  **/

  public BQAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(BQAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
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
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationInitiateInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationInitiateInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


}

