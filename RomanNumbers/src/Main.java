import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        String romanNumber;
        System.out.print("Unesite broj: ");
        number=scanner.nextInt();
        romanNumber = numberToRoman(number);
        System.out.println("Rimski broj je: " + romanNumber);


    }
    static String numberToRoman(int number){
        int[] numbers = {1,4,9,10,40,50,90,100,400,500,900,1000};
        String[] romanNumbers = {"I", "IV", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        String romanNumber = "";
        int i = numbers.length;
        while (number > 0){
            if (numbers[i-1] <= number ){
                romanNumber += romanNumbers[i-1];
                number -= numbers[i-1];
            }
            else{
                i = i - 1;
            }

        }
        return  romanNumber;
    }
}
