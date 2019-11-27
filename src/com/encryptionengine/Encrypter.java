package com.encryptionengine;

public class Encrypter {
    private int temp,k[],s[],keyi[],ptexti[];
    private char keyc[],decrypt[],ptextc[];    
    private StringBuffer cipher;
    String ptext,key;
    public Encrypter() {        
        cipher = new StringBuffer();                         
        temp=0;
        k=new int[2048];
        s=new int[2048];                 
        decrypt=new char[8];        
    }
    
    public String encrypter(String plaintext,String key2){        
        ptext = plaintext;
        key = key2;
        keyc=key.toCharArray();
        keyi=new int[key.length()];
        ptexti=new int[ptext.length()];
        ptextc = ptext.toCharArray();   
        for(int i=0;i<ptext.length();i++){
            ptexti[i]=(int)ptextc[i];
        }
        for(int i=0;i<key.length();i++){
            keyi[i]=(int)keyc[i];
        }
        for(int i=0;i<2047;i++){
            s[i]=i;
            k[i]=keyi[i%key.length()];
        }
        int j=0;
        for(int i=0;i<2047;i++){
            j=(j+s[i]+k[i])%2048;
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        int i=0,z=0;
        j=0;        
        for(int l=0;l<ptext.length();l++){
            i=(l+1)%2048;
            j=(j+s[i])%2048;
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            z=s[(s[i]+s[j])%2048];
            cipher.append(String.valueOf(z^ptexti[l])+"-");
        }        
        return String.valueOf(cipher);
    }
}
