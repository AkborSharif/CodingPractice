package com.company.akbor.interviewProblems;

public class rotationalCipherString {
    public static String encrypt(String text, int rotationFactor){

        if (rotationFactor>26){
            rotationFactor = rotationFactor%26;
        }
        if (rotationFactor<0){
            rotationFactor = (rotationFactor%26)+26;
        }

        String cipherText = "";
        for (char c: text.toCharArray()) {
            if (!Character.isLetterOrDigit(c)){
                cipherText += c;
            }
            if (Character.isDigit(c)){
                cipherText += (Integer.parseInt(String.valueOf(c))+rotationFactor)%10;
            }
            if (Character.isLetter(c)) {
               if (Character.isUpperCase(c)) {
                   int hexNum = c + rotationFactor;
                   if (hexNum > 90) {
                       cipherText += (char) ((c + rotationFactor) - 26);
                       // char ch = (char)(((int)text.charAt(i) +  s - 65) % 26 + 65);
                   } else {
                       cipherText += (char) (c + rotationFactor);
                   }
               }
                else if (Character.isLowerCase(c)) {
                    int hexNum = c + rotationFactor;
                    if (hexNum > 122) {
                        cipherText += (char) ((c + rotationFactor) - 26);
                        // char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                    } else {
                        cipherText += (char) (c + rotationFactor);
                    }
                }
            }
        }

        return cipherText;
    }
    public static void main(String[] args) {
        String text = "Zebra-493";
        //text = "29-8AZz";
        System.out.println(encrypt(text, 3));
    }
}
