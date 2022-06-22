package com.codedifferently.assessment01.part01;

public class BasicStringUtils {

    static String convertString(String s){
        int counter = 0;
        int holdN = s.length();
        char ch[] = s.toCharArray();
        int c = 0;

        for (int i = 0; i < holdN; i++){
            if (i == 0){
                ch[i] = Character.toUpperCase(ch[i]);
                if (ch[i] == ' ') {
                    counter++;
                    ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                    continue;
                }
                else {
                    ch[c++] = ch[i];
                }
            }
        }
        return String.valueOf(ch,0, holdN - counter);
    }


    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */

    public static String camelCase(String str){return null;}

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        if (str == null) {
            return str;
        }

        String output = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }

        return output;
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        return null;
    }

    public static String removeFirstAndLastCharacter(String str){
        str = str.substring(1, str.length() - 1);

        // Return the modified string
        return str;
    }
}
