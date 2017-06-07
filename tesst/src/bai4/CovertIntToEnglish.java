package bai4;

/**
 * Created by bui on 07-Jun-17.
 */
public class CovertIntToEnglish {
    public static final String[] NUMBER_DONVI = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static final String[] NUMBER_10 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static final String[] NUMBER_CHUC = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

   static public String CovertIntToEnglish(int num) {

        String result =  CovertInt(num%1000);
        num = num/1000;
        if(num > 0 && num%1000>0){
            result = CovertInt(num%1000) + "Thousand " + result;
        }
        num = num/1000;
        if(num > 0 && num%1000>0){
            result = CovertInt(num%1000) + "Million " + result;
        }
        num = num/1000;
        if(num > 0){
            result = CovertInt(num%1000) + "Billion " + result;
        }
        return result ;
    }

    static public String CovertInt(int num) {

        String result = "";
        if (num > 999) {
            result += NUMBER_DONVI[num / 1000] + " Thousand ";
        }
        num = num % 1000;
        if (num > 99) {
            result += NUMBER_DONVI[num / 100] + " Hundred ";
        }
        num = num % 100;
        if (num < 20 && num > 9) {
            result += NUMBER_10[num % 10] + " ";
        } else {
            if (num > 19) {
                result += NUMBER_CHUC[num / 10] + " ";
            }
            num = num % 10;
            if (num > 0)
                result += NUMBER_DONVI[num] + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 2435;
        System.out.printf(" Number " + num + " to " + CovertIntToEnglish(num));
    }
}
