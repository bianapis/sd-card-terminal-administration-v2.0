package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis
 */
public class CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceAnalysis   {
  private String cardPOSDeviceAllocationInstanceAnalysisReference = null;

  private String cardPOSDeviceAllocationInstanceAnalysisReportType = null;

  private String cardPOSDeviceAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardPOSDeviceAllocationInstanceAnalysisReference
  **/

  public String getCardPOSDeviceAllocationInstanceAnalysisReference() {
    return cardPOSDeviceAllocationInstanceAnalysisReference;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysisReference(String cardPOSDeviceAllocationInstanceAnalysisReference) {
    this.cardPOSDeviceAllocationInstanceAnalysisReference = cardPOSDeviceAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardPOSDeviceAllocationInstanceAnalysisParameters
  **/

  public String getCardPOSDeviceAllocationInstanceAnalysisParameters() {
    return cardPOSDeviceAllocationInstanceAnalysisParameters;
  }

  public void setCardPOSDeviceAllocationInstanceAnalysisParameters(String cardPOSDeviceAllocationInstanceAnalysisParameters) {
    this.cardPOSDeviceAllocationInstanceAnalysisParameters = cardPOSDeviceAllocationInstanceAnalysisParameters;
  }


}

