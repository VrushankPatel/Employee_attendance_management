package com.encryptionengine;

import java.security.NoSuchAlgorithmException;

public class CryptoUtilitiy {

    Encrypter e;
    Decrypter d;
    MessageDigestEncoder md;

    public CryptoUtilitiy() {
        try {
            this.md = new MessageDigestEncoder();
        } catch (NoSuchAlgorithmException nsae) {
        }
        e = new Encrypter();
        d = new Decrypter();
    }

    public String encrypt(String plaintext, String key) {
        e = new Encrypter();
        return e.encrypter(plaintext, md.md5(key));
    }

    public String decrypt(String ciphertext, String key) {
        d = new Decrypter();
        return d.decrypt(ciphertext, md.md5(key));
    }

}
