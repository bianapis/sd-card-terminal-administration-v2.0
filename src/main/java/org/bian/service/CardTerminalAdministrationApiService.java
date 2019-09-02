/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTerminalAdministrationApiService {

	SDCardTerminalAdministrationActivateOutputModel activate(SDCardTerminalAdministrationActivateInputModel request);
	
	BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request);
	
	SDCardTerminalAdministrationConfigureOutputModel configure(String sdReferenceId, SDCardTerminalAdministrationConfigureInputModel request);
	
	BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request);
	
	BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request);
	
	SDCardTerminalAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCardTerminalAdministrationFeedbackInputModel request);
	
	BQAllocationGrantOutputModel grantAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationGrantInputModel request);
	
	CRCardPOSDeviceAllocationInitiateOutputModel initiate(String sdReferenceId, CRCardPOSDeviceAllocationInitiateInputModel request);
	
	BQAllocationInitiateOutputModel initiateAllocation(String sdReferenceId, String crReferenceId, BQAllocationInitiateInputModel request);
	
	CRCardPOSDeviceAllocationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardPOSDeviceAllocationRequestInputModel request);
	
	BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCardPOSDeviceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardTerminalAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardPOSDeviceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardPOSDeviceAllocationUpdateInputModel request);
	
	BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request);
	
}
