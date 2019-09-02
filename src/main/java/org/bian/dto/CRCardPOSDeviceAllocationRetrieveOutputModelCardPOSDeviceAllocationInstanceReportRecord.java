package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord
 */
public class CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceReportRecord   {
  private String cardPOSDeviceAllocationInstanceReportData = null;

  private String cardPOSDeviceAllocationInstanceReportType = null;

  private Object cardPOSDeviceAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardPOSDeviceAllocationInstanceReportData
  **/

  public String getCardPOSDeviceAllocationInstanceReportData() {
    return cardPOSDeviceAllocationInstanceReportData;
  }

  public void setCardPOSDeviceAllocationInstanceReportData(String cardPOSDeviceAllocationInstanceReportData) {
    this.cardPOSDeviceAllocationInstanceReportData = cardPOSDeviceAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardPOSDeviceAllocationInstanceReportType
  **/

  public String getCardPOSDeviceAllocationInstanceReportType() {
    return cardPOSDeviceAllocationInstanceReportType;
  }

  public void setCardPOSDeviceAllocationInstanceReportType(String cardPOSDeviceAllocationInstanceReportType) {
    this.cardPOSDeviceAllocationInstanceReportType = cardPOSDeviceAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardPOSDeviceAllocationInstanceReport
  **/

  public Object getCardPOSDeviceAllocationInstanceReport() {
    return cardPOSDeviceAllocationInstanceReport;
  }

  public void setCardPOSDeviceAllocationInstanceReport(Object cardPOSDeviceAllocationInstanceReport) {
    this.cardPOSDeviceAllocationInstanceReport = cardPOSDeviceAllocationInstanceReport;
  }


}

