package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord
 */
public class CRCardPOSDeviceAllocationRequestOutputModelCardPOSDeviceAllocationInstanceRecord   {
  private CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord cardPOSRepairRecord = null;

  private String cardPOSDeviceStatus = null;


  /**
   * Get cardPOSRepairRecord
   * @return cardPOSRepairRecord
  **/

  public CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord getCardPOSRepairRecord() {
    return cardPOSRepairRecord;
  }

  public void setCardPOSRepairRecord(CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord cardPOSRepairRecord) {
    this.cardPOSRepairRecord = cardPOSRepairRecord;
  }


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

