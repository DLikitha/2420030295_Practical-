package myproject;
import java.util.*;
public class vowel {
      public static void main(String[]args) {
  		Scanner sc= new Scanner(System.in);
  		System.out.println("Enter an alphabet: ");
  		char l = sc.next().charAt(0);
  		
  		if (l =='a'|| l=='e'|| l=='i'||l=='o'|| l=='u'||l =='A'|| l=='E'|| l=='I'||l=='O'|| l=='U') {
  			System.out.println("The given letter is a vowel");
  		}
  		else {
  			System.out.println("The given letter is a consonat");
  		}
      }
}
