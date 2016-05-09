/**
 * 
 */
package com.ldominguez.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author ldominguez
 *
 */
@WebService
@SOAPBinding(style = Style.RPC, use=Use.LITERAL, parameterStyle= ParameterStyle.WRAPPED)
public class TestService {
	
	/**
	 * 
	 * @param endPoint
	 * @param xmlBody
	 * @return
	 */
	@WebMethod(action="getMessage")
	public String getMessage() {
		return "Hola Mundo!!";
	}
	

}
