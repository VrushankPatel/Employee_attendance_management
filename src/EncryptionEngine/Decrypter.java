package EncryptionEngine;

import java.util.Arrays;

public class Decrypter {    
    private int temp,cipher[],k[],s[],keyi[],i,j,z;
    private char keyc[];
    StringBuffer decrypted; 
    String key;
    public Decrypter() {        
        decrypted = new StringBuffer();
        temp=0;
        k=new int[2048];
        s=new int[2048];                 
    }
    
    public String decrypt(String encrypted,String key2){       
        key = key2;
        keyc=key.toCharArray();
        keyi=new int[key.length()];
        cipher = Arrays.asList(encrypted.split("-")).stream().mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<key.length();i++){
            keyi[i]=(int)keyc[i];
        }
        for(int i=0;i<2047;i++){
            s[i]=i;
            k[i]=keyi[i%key.length()];
        }
        j=0;
        for(int i=0;i<2047;i++){
            j=(j+s[i]+k[i])%2048;
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        i=0;
        z=0;
        j=0;        
        for(int l=0;l<cipher.length;l++){
            i=(l+1)%2048;
            j=(j+s[i])%2048;
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            z=s[(s[i]+s[j])%2048];            
            decrypted.append(((char)(z^cipher[l])));
        }
        return String.valueOf(decrypted);
    }    
}
