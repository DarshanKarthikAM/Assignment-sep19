package com.Number;

public class NumberMain {
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.checkPrime(3));
        System.out.println("Whether Number is polindrome " + num.CheckPolindrome(121));
        System.out.println("Whether Number is polindrome " + num.CheckPolindrome(123));
        System.out.println("Amstrong or not " + num.checkAmstrong(371));
    }
}
