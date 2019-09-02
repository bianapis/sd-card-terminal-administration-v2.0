package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord;

import javax.validation.Valid;
  
/**
 * CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord
 */
public class CRCardPOSDeviceAllocationRetrieveOutputModelCardPOSDeviceAllocationInstanceRecord   {
  private String cardPOSDeviceReference = null;

  private String cardPOSDeviceIdentifier = null;

  private String cardPOSDeviceType = null;

  private String cardPOSDeviceSoftwareType = null;

  private String cardPOSDeviceSoftwareVersion = null;

  private String cardPOSDeviceAcquiredDate = null;

  private CRCardPOSDeviceAllocationInitiateInputModelCardPOSDeviceAllocationInstanceRecordCardPOSRepairRecord cardPOSRepairRecord = null;

  private String cardPOSDeviceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identification for the POS device 
   * @return cardPOSDeviceReference
  **/

  public String getCardPOSDeviceReference() {
    return cardPOSDeviceReference;
  }

  public void setCardPOSDeviceReference(String cardPOSDeviceReference) {
    this.cardPOSDeviceReference = cardPOSDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any unique identification properties (e.g. serial number) 
   * @return cardPOSDeviceIdentifier
  **/

  public String getCardPOSDeviceIdentifier() {
    return cardPOSDeviceIdentifier;
  }

  public void setCardPOSDeviceIdentifier(String cardPOSDeviceIdentifier) {
    this.cardPOSDeviceIdentifier = cardPOSDeviceIdentifier;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific make and type of device 
   * @return cardPOSDeviceType
  **/

  public String getCardPOSDeviceType() {
    return cardPOSDeviceType;
  }

  public void setCardPOSDeviceType(String cardPOSDeviceType) {
    this.cardPOSDeviceType = cardPOSDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of software running on the device 
   * @return cardPOSDeviceSoftwareType
  **/

  public String getCardPOSDeviceSoftwareType() {
    return cardPOSDeviceSoftwareType;
  }

  public void setCardPOSDeviceSoftwareType(String cardPOSDeviceSoftwareType) {
    this.cardPOSDeviceSoftwareType = cardPOSDeviceSoftwareType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of the software on the device 
   * @return cardPOSDeviceSoftwareVersion
  **/

  public String getCardPOSDeviceSoftwareVersion() {
    return cardPOSDeviceSoftwareVersion;
  }

  public void setCardPOSDeviceSoftwareVersion(String cardPOSDeviceSoftwareVersion) {
    this.cardPOSDeviceSoftwareVersion = cardPOSDeviceSoftwareVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info:  Date device first obtained, used for maintenance and amortization 
   * @return cardPOSDeviceAcquiredDate
  **/

  public String getCardPOSDeviceAcquiredDate() {
    return cardPOSDeviceAcquiredDate;
  }

  public void setCardPOSDeviceAcquiredDate(String cardPOSDeviceAcquiredDate) {
    this.cardPOSDeviceAcquiredDate = cardPOSDeviceAcquiredDate;
  }


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

