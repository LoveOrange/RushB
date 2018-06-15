package com.linsama.rushb;

import java.math.BigInteger;

public class Q43 {
    public String multiply(String num1, String num2) {
        return new BigInteger(num1).multiply(new BigInteger(num2)).toString();
    }
}
