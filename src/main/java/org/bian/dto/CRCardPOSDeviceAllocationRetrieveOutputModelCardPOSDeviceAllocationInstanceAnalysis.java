package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis
 */
public class CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceAnalysis   {
  private String cardPOSDeviceAllocationInstanceAnalysisData = null;

  private String cardPOSDeviceAllocationInstanceAnalysisReportType = null;

  private Object cardPOSDeviceAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardPOSDeviceAllocationInstanceAnalysisData
  **/

  public String getCardPOSDeviceAllocationInstanceAnalysisData() {
    return cardPOSDeviceAllocationInstanceAnalysisData;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysisData(String cardPOSDeviceAllocationInstanceAnalysisData) {
    this.cardPOSDeviceAllocationInstanceAnalysisData = cardPOSDeviceAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardPOSDeviceAllocationInstanceAnalysisReportType
  **/

  public String getCardPOSDeviceAllocationInstanceAnalysisReportType() {
    return cardPOSDeviceAllocationInstanceAnalysisReportType;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysisReportType(String cardPOSDeviceAllocationInstanceAnalysisReportType) {
    this.cardPOSDeviceAllocationInstanceAnalysisReportType = cardPOSDeviceAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardPOSDeviceAllocationInstanceAnalysisReport
  **/

  public Object getCardPOSDeviceAllocationInstanceAnalysisReport() {
    return cardPOSDeviceAllocationInstanceAnalysisReport;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysisReport(Object cardPOSDeviceAllocationInstanceAnalysisReport) {
    this.cardPOSDeviceAllocationInstanceAnalysisReport = cardPOSDeviceAllocationInstanceAnalysisReport;
  }


}

