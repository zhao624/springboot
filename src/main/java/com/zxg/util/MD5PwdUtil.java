package com.zxg.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;


/**
 * MD5PwdUtil<br/>
 * 创建人:zhaoxugui<br/>
 * 时间：2017年11月2日-下午4:23:45 <br/>
 *
 * @version 1.0.0<br/>
 */
public class MD5PwdUtil {

    public static String md5Base64(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return base64Encode(base64Encode(md5.digest(str.getBytes())).getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String base64Encode(byte[] b) {
        if (b == null) {
            return null;
        }
        return new BASE64Encoder().encode(b);
    }

    public static void main(String[] args) {
        System.out.println(MD5PwdUtil.md5Base64("123456"));
    }
}
