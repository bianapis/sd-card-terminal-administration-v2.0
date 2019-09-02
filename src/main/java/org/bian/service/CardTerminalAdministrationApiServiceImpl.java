/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardTerminalAdministrationApiServiceImpl implements CardTerminalAdministrationApiService {

	public SDCardTerminalAdministrationActivateOutputModel activate(SDCardTerminalAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDCardTerminalAdministrationActivateOutputModel.json",new TypeReference<SDCardTerminalAdministrationActivateOutputModel>(){});
	}
	
	public BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQAllocationCaptureOutputModel.json",new TypeReference<BQAllocationCaptureOutputModel>(){});
	}
	
	public SDCardTerminalAdministrationConfigureOutputModel configure(String sdReferenceId, SDCardTerminalAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDCardTerminalAdministrationConfigureOutputModel.json",new TypeReference<SDCardTerminalAdministrationConfigureOutputModel>(){});
	}
	
	public BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request){
		return JsonReader.read("control-BQAllocationControlOutputModel.json",new TypeReference<BQAllocationControlOutputModel>(){});
	}
	
	public BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQAllocationExchangeOutputModel.json",new TypeReference<BQAllocationExchangeOutputModel>(){});
	}
	
	public SDCardTerminalAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCardTerminalAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardTerminalAdministrationFeedbackOutputModel.json",new TypeReference<SDCardTerminalAdministrationFeedbackOutputModel>(){});
	}
	
	public BQAllocationGrantOutputModel grantAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationGrantInputModel request){
		return JsonReader.read("grant-BQAllocationGrantOutputModel.json",new TypeReference<BQAllocationGrantOutputModel>(){});
	}
	
	public CRCardPOSDeviceAllocationInitiateOutputModel initiate(String sdReferenceId, CRCardPOSDeviceAllocationInitiateInputModel request){
		return JsonReader.read("initiate-CRCardPOSDeviceAllocationInitiateOutputModel.json",new TypeReference<CRCardPOSDeviceAllocationInitiateOutputModel>(){});
	}
	
	public BQAllocationInitiateOutputModel initiateAllocation(String sdReferenceId, String crReferenceId, BQAllocationInitiateInputModel request){
		return JsonReader.read("initiate-BQAllocationInitiateOutputModel.json",new TypeReference<BQAllocationInitiateOutputModel>(){});
	}
	
	public CRCardPOSDeviceAllocationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardPOSDeviceAllocationRequestInputModel request){
		return JsonReader.read("request-CRCardPOSDeviceAllocationRequestOutputModel.json",new TypeReference<CRCardPOSDeviceAllocationRequestOutputModel>(){});
	}
	
	public BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAllocationRetrieveOutputModel.json",new TypeReference<BQAllocationRetrieveOutputModel>(){});
	}
	
	public CRCardPOSDeviceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardPOSDeviceAllocationRetrieveOutputModel.json",new TypeReference<CRCardPOSDeviceAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardTerminalAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardTerminalAdministrationRetrieveOutputModel.json",new TypeReference<SDCardTerminalAdministrationRetrieveOutputModel>(){});
	}
	
	public CRCardPOSDeviceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardPOSDeviceAllocationUpdateInputModel request){
		return JsonReader.read("update-CRCardPOSDeviceAllocationUpdateOutputModel.json",new TypeReference<CRCardPOSDeviceAllocationUpdateOutputModel>(){});
	}
	
	public BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request){
		return JsonReader.read("update-BQAllocationUpdateOutputModel.json",new TypeReference<BQAllocationUpdateOutputModel>(){});
	}
	
}
