package com.northeaster.soapex;

import com.northeaster.soapex.ws.RandomNumberGeneratorServiceImpl;
import org.junit.Test;

import javax.xml.ws.Endpoint;

/**
 * Created by MURAT YILMAZ on 4/11/2016.
 */
public class SoapExTest {

    @Test
    public void SoapExTest() throws InterruptedException {
        String applicationUrl = "http://localhost:9999";
        Endpoint.publish(applicationUrl + "/ws/randomNumberGenerator", new RandomNumberGeneratorServiceImpl());
        Thread.sleep(100000);
    }
}
