import java.util.Scanner;

public class katapalindrom {
    public static void main(String[] args) throws Exception {
        Scanner userinput =new Scanner(System.in);

        String kata;
        String kataPalindrome ="";
        int panjangKata;

        System.out.println("\t Menentukan Kata Palindrome \n");

        System.out.print(" Masukin kata : ");
        kata = userinput.nextLine();

        panjangKata = kata.length();

        for(int i = panjangKata - 1; i >= 0; i--){
            kataPalindrome = kataPalindrome + kata.charAt(i);
        }
        if (kata.equals(kataPalindrome)){
            System.out.println("\n kata " + kata + "  ini adalah kata Palindrome" );

        }
        else{
            System.out.println("\n kata " + kata + " ini bukan kata Palindrome " );
            userinput.close();
            
        
        }

    }
}