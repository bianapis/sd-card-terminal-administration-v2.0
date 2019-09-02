/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class CardTerminalAdministrationApiController {

	@Autowired
	CardTerminalAdministrationApiService service;
	
	@Allocate.Activate
	public BianResponse<SDCardTerminalAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDCardTerminalAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Capture
	public BianResponse<BQAllocationCaptureOutputModel> captureAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDCardTerminalAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardTerminalAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Control
	public BianResponse<BQAllocationControlOutputModel> controlAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Exchange
	public BianResponse<BQAllocationExchangeOutputModel> exchangeAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDCardTerminalAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardTerminalAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Grant
	public BianResponse<BQAllocationGrantOutputModel> grantAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Initiate
	public BianResponse<CRCardPOSDeviceAllocationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCardPOSDeviceAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Initiate
	public BianResponse<BQAllocationInitiateOutputModel> initiateAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAllocation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Request
	public BianResponse<CRCardPOSDeviceAllocationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardPOSDeviceAllocationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Retrieve
	public BianResponse<BQAllocationRetrieveOutputModel> retrieveAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAllocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRCardPOSDeviceAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDCardTerminalAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRCardPOSDeviceAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCardPOSDeviceAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Update
	public BianResponse<BQAllocationUpdateOutputModel> updateAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
