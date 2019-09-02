package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord
 */
public class CRCardPOSDeviceAllocationRetrieveInputModelCardPOSDeviceAllocationInstanceReportRecord   {
  private String cardPOSDeviceAllocationInstanceReportReference = null;

  private String cardPOSDeviceAllocationInstanceReportType = null;

  private String cardPOSDeviceAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardPOSDeviceAllocationInstanceReportReference
  **/

  public String getCardPOSDeviceAllocationInstanceReportReference() {
    return cardPOSDeviceAllocationInstanceReportReference;
  }

  public void setCardPOSDeviceAllocationInstanceReportReference(String cardPOSDeviceAllocationInstanceReportReference) {
    this.cardPOSDeviceAllocationInstanceReportReference = cardPOSDeviceAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardPOSDeviceAllocationInstanceReportParameters
  **/

  public String getCardPOSDeviceAllocationInstanceReportParameters() {
    return cardPOSDeviceAllocationInstanceReportParameters;
  }

  public void setCardPOSDeviceAllocationInstanceReportParameters(String cardPOSDeviceAllocationInstanceReportParameters) {
    this.cardPOSDeviceAllocationInstanceReportParameters = cardPOSDeviceAllocationInstanceReportParameters;
  }


}

