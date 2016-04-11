package com.northeaster.soapex.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by MURAT YILMAZ on 4/11/2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
public interface RandomNumberGeneratorService {

    @WebMethod
    int generateRandonNumber();
}
