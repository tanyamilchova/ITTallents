package main.Pretest.Taskss;

public class SumOfNumsInString {
    // . Write a method that takes a string as input and returns the sum of all numbers (not digits) in
    //that string.
    //Example input: 2 beers or not 12.3 beers.
    //Output: 14.3

    public static double findSum(String str){
        int countDecimal=0;
        double sum=0;
        double temp=0;
        boolean decimal=false;
        for (int i = 1; i < str.length(); i++) {
            if(i==1 && Character.isDigit(str.charAt(0))){
                temp+=Double.parseDouble(String.valueOf(str.charAt(0)));
            }
            char prev=str.charAt(i-1);
            char current=str.charAt(i);
            if(Character.isDigit(current)){
                double currentDouble=Double.parseDouble(String.valueOf(str.charAt(i)));

                if(Character.isDigit(prev)){
                    if(decimal){
                        countDecimal++;
                        temp=temp+currentDouble/decCount(countDecimal);
                    }else {
                        temp=temp*10+currentDouble;
                    }
                }else {
                    if(! decimal){
                        temp=temp+currentDouble;
                    }
                    else {
                        countDecimal++;
                        temp=temp+currentDouble/decCount(countDecimal);
                    }
//                    if(prev!='.'){
//                        temp=temp+currentDouble;
//                    }
//                    else {
//                        countDecimal++;
//                        temp=temp+currentDouble/decCount(countDecimal);
//                    }
                }
                if(i==str.length()-1  ){
                    sum+=temp;
                }


            }else{
                if(current!='.'){
                    sum+=temp;
                    temp=0;
                    countDecimal=0;
                    decimal=false;
                }else {
                    if(Character.isDigit(prev)) {
                        decimal = true;
                    }
                }
            }
        }

        return sum;
    }

    private static double decCount(int countDecimal) {
        int start=1;
        for (int i = 0; i < countDecimal; i++) {
            start*=10;
        }
        return start;
    }

    public static void main(String[] args) {
//        String str="2 b 12.3 be.100";
        String str = "125h1.2";
        System.out.println(decCount(2));
        System.out.println( findSum(str));
    }
}
