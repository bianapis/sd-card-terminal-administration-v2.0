package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord
 */
public class CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord   {
  private String cardPOSRepairDetails = null;

  private String cardPOSRepairDates = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the repair or maintenance work done (includes costs as appropriate) 
   * @return cardPOSRepairDetails
  **/

  public String getCardPOSRepairDetails() {
    return cardPOSRepairDetails;
  }

  public void setCardPOSRepairDetails(String cardPOSRepairDetails) {
    this.cardPOSRepairDetails = cardPOSRepairDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Key dates and times relating to the repair (e.g. reported, scheduled, effort, returned to service) 
   * @return cardPOSRepairDates
  **/

  public String getCardPOSRepairDates() {
    return cardPOSRepairDates;
  }

  public void setCardPOSRepairDates(String cardPOSRepairDates) {
    this.cardPOSRepairDates = cardPOSRepairDates;
  }


}

