package com.northeaster.soapex.ws;

import com.northeaster.soapex.core.RandomNumberGenerator;

import javax.jws.WebService;

/**
 * Created by MURAT YILMAZ on 4/11/2016.
 */
@WebService(endpointInterface = "com.northeaster.soapex.ws.RandomNumberGeneratorService")
public class RandomNumberGeneratorServiceImpl implements RandomNumberGeneratorService{

    public int generateRandonNumber() {
        return RandomNumberGenerator.generateRandomNumber();
    }
}
