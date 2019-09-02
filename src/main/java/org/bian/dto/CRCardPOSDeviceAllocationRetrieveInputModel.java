package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis;
import org.bian.dto.CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveInputModel
 */
public class CRCardPOSDeviceAllocationRetrieveInputModel   {
  private Object cardPOSDeviceAllocationRetrieveActionTaskRecord = null;

  private String cardPOSDeviceAllocationRetrieveActionRequest = null;

  private CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord cardPOSDeviceAllocationInstanceReportRecord = null;

  private CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis cardPOSDeviceAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardPOSDeviceAllocationRetrieveActionTaskRecord
  **/

  public Object getCardPOSDeviceAllocationRetrieveActionTaskRecord() {
    return cardPOSDeviceAllocationRetrieveActionTaskRecord;
  }

  public void setCardPOSDeviceAllocationRetrieveActionTaskRecord(Object cardPOSDeviceAllocationRetrieveActionTaskRecord) {
    this.cardPOSDeviceAllocationRetrieveActionTaskRecord = cardPOSDeviceAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardPOSDeviceAllocationRetrieveActionRequest
  **/

  public String getCardPOSDeviceAllocationRetrieveActionRequest() {
    return cardPOSDeviceAllocationRetrieveActionRequest;
  }

  public void setCardPOSDeviceAllocationRetrieveActionRequest(String cardPOSDeviceAllocationRetrieveActionRequest) {
    this.cardPOSDeviceAllocationRetrieveActionRequest = cardPOSDeviceAllocationRetrieveActionRequest;
  }


  /**
   * Get cardPOSDeviceAllocationInstanceReportRecord
   * @return cardPOSDeviceAllocationInstanceReportRecord
  **/

  public CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord getCardPOSDeviceAllocationInstanceReportRecord() {
    return cardPOSDeviceAllocationInstanceReportRecord;
  }

  public void setCardPOSDeviceAllocationInstanceReportRecord(CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord cardPOSDeviceAllocationInstanceReportRecord) {
    this.cardPOSDeviceAllocationInstanceReportRecord = cardPOSDeviceAllocationInstanceReportRecord;
  }


  /**
   * Get cardPOSDeviceAllocationInstanceAnalysis
   * @return cardPOSDeviceAllocationInstanceAnalysis
  **/

  public CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis getCardPOSDeviceAllocationInstanceAnalysis() {
    return cardPOSDeviceAllocationInstanceAnalysis;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysis(CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis cardPOSDeviceAllocationInstanceAnalysis) {
    this.cardPOSDeviceAllocationInstanceAnalysis = cardPOSDeviceAllocationInstanceAnalysis;
  }


}

