package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis;
import org.bian.dto.CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord;
import org.bian.dto.CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveOutputModel
 */
public class CRCardPOSDeviceAllocationRetrieveOutputModel   {
  private CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord = null;

  private String cardPOSDeviceAllocationRetrieveActionTaskReference = null;

  private Object cardPOSDeviceAllocationRetrieveActionTaskRecord = null;

  private String cardPOSDeviceAllocationRetrieveActionResponse = null;

  private CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord cardPOSDeviceAllocationInstanceReportRecord = null;

  private CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis cardPOSDeviceAllocationInstanceAnalysis = null;


  /**
   * Get cardPOSDeviceAllocationInstanceRecord
   * @return cardPOSDeviceAllocationInstanceRecord
  **/

  public CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord getCardPOSDeviceAllocationInstanceRecord() {
    return cardPOSDeviceAllocationInstanceRecord;
  }

  public void setCardPOSDeviceAllocationInstanceRecord(CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord cardPOSDeviceAllocationInstanceRecord) {
    this.cardPOSDeviceAllocationInstanceRecord = cardPOSDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card POS Device Allocation instance retrieve service call 
   * @return cardPOSDeviceAllocationRetrieveActionTaskReference
  **/

  public String getCardPOSDeviceAllocationRetrieveActionTaskReference() {
    return cardPOSDeviceAllocationRetrieveActionTaskReference;
  }

  public void setCardPOSDeviceAllocationRetrieveActionTaskReference(String cardPOSDeviceAllocationRetrieveActionTaskReference) {
    this.cardPOSDeviceAllocationRetrieveActionTaskReference = cardPOSDeviceAllocationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardPOSDeviceAllocationRetrieveActionResponse
  **/

  public String getCardPOSDeviceAllocationRetrieveActionResponse() {
    return cardPOSDeviceAllocationRetrieveActionResponse;
  }

  public void setCardPOSDeviceAllocationRetrieveActionResponse(String cardPOSDeviceAllocationRetrieveActionResponse) {
    this.cardPOSDeviceAllocationRetrieveActionResponse = cardPOSDeviceAllocationRetrieveActionResponse;
  }


  /**
   * Get cardPOSDeviceAllocationInstanceReportRecord
   * @return cardPOSDeviceAllocationInstanceReportRecord
  **/

  public CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord getCardPOSDeviceAllocationInstanceReportRecord() {
    return cardPOSDeviceAllocationInstanceReportRecord;
  }

  public void setCardPOSDeviceAllocationInstanceReportRecord(CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord cardPOSDeviceAllocationInstanceReportRecord) {
    this.cardPOSDeviceAllocationInstanceReportRecord = cardPOSDeviceAllocationInstanceReportRecord;
  }


  /**
   * Get cardPOSDeviceAllocationInstanceAnalysis
   * @return cardPOSDeviceAllocationInstanceAnalysis
  **/

  public CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis getCardPOSDeviceAllocationInstanceAnalysis() {
    return cardPOSDeviceAllocationInstanceAnalysis;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysis(CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis cardPOSDeviceAllocationInstanceAnalysis) {
    this.cardPOSDeviceAllocationInstanceAnalysis = cardPOSDeviceAllocationInstanceAnalysis;
  }


}

