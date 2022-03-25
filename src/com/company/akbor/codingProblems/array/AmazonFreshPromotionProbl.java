package com.company.akbor.codingProblems.array;

public class AmazonFreshPromotionProbl {

    private static int freshPromotion(String[] shoppingCart, String[][] codeList){
        if(codeList.length == 0) return 1;
        if(codeList[0].length == 0) return 1;

        String firstItemInCodeList = codeList[0][0];

        for(int i=0; i<shoppingCart.length; i++){
            String itemInCart = shoppingCart[i];
            if(itemInCart.equalsIgnoreCase(firstItemInCodeList) || firstItemInCodeList.equalsIgnoreCase("anything")){
                if(checkPattern(shoppingCart, i, codeList)){
                    return 1;
                }
            }
        }
        return 0;
    }

    private static boolean checkPattern(String[] shoppingCart, int cartIndex, String[][] codeList){
        for(String[] codeSubList : codeList){
            for(String item : codeSubList){
                if(cartIndex >= shoppingCart.length || (!shoppingCart[cartIndex].equalsIgnoreCase(item) && !item.equalsIgnoreCase("anything"))){
                    return false;
                }
                cartIndex++;
            }
        }
        return true;
    }
        public static void main(String[] args) {
            String[][] codeArray1 = {{"Banana", "anything", "apple"}, {"anything", "orange", "kiwi", "banana"}};
            String[][] codeArray2 = {{"anything", "anything"}, {"banana", "papaya", "anything", "blueberries"}};
            String[][] codeArray3 = {};
            String[][] codeArray4 = {{}};

            String[] cartArray1 = {"Banana", "mango", "apple", "cherry", "orange", "kiwi", "banana"};
            String[] cartArray2 = {"Banana", "mango", "banana", "papaya", "blueberries", "blueberries"};
            String[] cartArray3 = {"Banana", "mango", "pineapple", "papaya", "blueberries", "blueberries"};
            String[] cartArray4 = {"Banana", "mango", "banana", "papaya", "blackberries", "blueberries"};
            String[] cartArray5 = {"Banana", "Banana", "Banana", "mango", "apple", "cherry", "orange", "kiwi", "banana"};

            System.out.println(freshPromotion(cartArray1, codeArray1));
            System.out.println(freshPromotion(cartArray2, codeArray2));
            System.out.println(freshPromotion(cartArray3, codeArray3));
            System.out.println(freshPromotion(cartArray4, codeArray4));
            System.out.println(freshPromotion(cartArray5, codeArray1));

            System.out.println(freshPromotion(cartArray1, codeArray2));
            System.out.println(freshPromotion(cartArray2, codeArray1));
            System.out.println(freshPromotion(cartArray3, codeArray2));
            System.out.println(freshPromotion(cartArray4, codeArray1));
        }

}
