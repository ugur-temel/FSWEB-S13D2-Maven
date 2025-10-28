package org.example;

public class Main {

        public static boolean isPalindrome(int number){
            String numberStr = String.valueOf(Math.abs(number));
            String reversedNum = new StringBuilder(numberStr).reverse().toString();
            return numberStr.equals(reversedNum);
        }

        public static boolean isPerfectNumber(int number){
            if(number < 1){
                return false;
            }
            int sum = 0;
            for(int i=1; i<=number/2; i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            return sum == number;
        }

        public static String numberToWords(int number){
            if(number<0){
                return "Invalid Value";
            }

            String numberStr = String.valueOf(number);
            String result = "";

            for(int i=0; i<numberStr.length(); i++){
                char c = numberStr.charAt(i);
                switch (c){
                    case '0': result += "Zero "; break;
                    case '1': result += "One "; break;
                    case '2': result += "Two "; break;
                    case '3': result += "Three "; break;
                    case '4': result += "Four "; break;
                    case '5': result += "Five "; break;
                    case '6': result += "Six "; break;
                    case '7': result += "Seven "; break;
                    case '8': result += "Eight "; break;
                    case '9': result += "Nine "; break;
                }
            }
            return  result.trim();
        }

}
