package com.northeaster.soapex.core;

/**
 * Created by MURAT YILMAZ on 4/11/2016.
 */
public class RandomNumberGenerator {

    public static int generateRandomNumber(){
        java.util.Random randomGenerator = new java.util.Random();
        return randomGenerator.nextInt(100);
    }
}
