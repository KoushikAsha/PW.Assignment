import java.util.Scanner;

public class NumberToWord {
    public static String NumToWord(int n){
        if(n==0){
            return "Zero";
        }
        if(n<0){
            return "Minus" + NumToWord(Math.abs(n));
        }
        String word="";
        if(n/100000>0){
            word=word+NumToWord(n/100000) + " Lake";
            n=n%100000;
        }
        if(n/1000>0){
            word=word+NumToWord(n/1000) + " Thousand";
            n=n%1000;
        }
        if(n/100>0){
            word=word+NumToWord(n/100) + " Hundred";
            n=n%100;
        }
        if(n>0){
            String[] unitMaps={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
            "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
            "Nineteen"};
            String[] tensMaps={"Zero","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty"
            ,"Ninety"};
            if(n<20){
                word=word + " " + unitMaps[n];
            }else {
                word=word + " "+ tensMaps[n/10];
                if(n%10>0){
                    word=word + " " + unitMaps[n%10];
                }
            }
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount -");
        int Amount=sc.nextInt();
        String res=NumToWord(Amount);
        System.out.println(res);
    }
}
