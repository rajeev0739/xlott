package com.vuclip.stub.xlott.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vuclip.stub.util.StubUtil;



@RestController
public class Receiver {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/ott/services/getSMSMOSDP",method= {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<String> processXLOttMO(HttpServletRequest request,HttpServletResponse response) {
		ResponseEntity<String> httpSuccessResponse=new ResponseEntity<String>("Success",HttpStatus.OK);
		
		logger.debug("\n Inside Xlcom ottSMSMO  :: \n");
		
		logger.debug(StubUtil.getCoreUInfoData(request,"").toString());

		logger.debug("\n \n Returning Xlcom ott smsmo  Response :: "+"Success"+"\n");

		return httpSuccessResponse;
	}
	
	@RequestMapping(value="/ott/services/receiveDRNotification",method= {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<String> processXLOttNotification(HttpServletRequest request,HttpServletResponse response) {
		ResponseEntity<String> httpSuccessResponse=new ResponseEntity<String>("Success",HttpStatus.OK);
		
		logger.debug("\n Inside Xlcom ottNotification :: \n");
		
		logger.debug(StubUtil.getCoreUInfoData(request,"").toString());

		logger.debug("\n Returning Xlcom ott Notification  Response :: "+"Success"+"\n");

		return httpSuccessResponse;
	}

}
