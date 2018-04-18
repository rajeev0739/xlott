package com.vuclip.stub.util;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class StubUtil {
         public final static StringBuilder getCoreUInfoData(HttpServletRequest request,String requestBody){
		 
			StringBuilder responseData = new StringBuilder();

			Enumeration e = request.getParameterNames();

			responseData.append("\n =====================================================================");
			responseData.append("\n Timestamp   :"+new Date(System.currentTimeMillis()));
			responseData.append("\n Request url :"+request.getRequestURL());
			
			responseData.append("\n--------------------------Parameter----------------------------------\n");
			
			while (e.hasMoreElements()){
				String name = (String)e.nextElement();
				String[] values = request.getParameterValues(name);
				for (int i=0; i<values.length; i++){
					responseData.append("\n"+name+" : "+values[i]);
				}
			}
			responseData.append("\n---------------------------Header------------------------------------\n");
			e = request.getHeaderNames();
			
			while (e.hasMoreElements()){
				String name = (String)e.nextElement();
				@SuppressWarnings("rawtypes")
				Enumeration values = request.getHeaders(name);
				while (values.hasMoreElements()){
					String value = (String)values.nextElement();
					responseData.append("\n"+name+" : "+value);
				}
			}
			
/*			responseData.append("\n---------------------------Body------------------------------------\n");
			responseData.append(requestBody);*/
			return responseData;
		}

		 
	 }

