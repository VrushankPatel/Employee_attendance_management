package com.encryptionengine;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MessageDigestEncoder {
    MessageDigest m;
    public MessageDigestEncoder() throws NoSuchAlgorithmException {
        m=MessageDigest.getInstance("MD5");
    }    
    public String md5(String get){
        try{                            
            m.update(get.getBytes(),0,get.length());
            //System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
            return new BigInteger(1,m.digest()).toString(16);
        }
        catch(Exception e){
            return "";
        }
    }
}
