package etkinlik;

import java.util.Scanner;

public class etkinlik {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sicaklik;
		
		System.out.print("Enter the temperature :");
		sicaklik = input.nextInt();
		
		if(sicaklik < 5) {
			System.out.print("You can ski !");
		}
		else if(sicaklik >= 5 && sicaklik < 15) {
			System.out.print("You can go to the theater !");
		}
		else if(sicaklik >= 15 && sicaklik < 25) {
			System.out.print("You can BBQ !");
		}
        
		else {
			System.out.print("You can swiming !"); 
			
		}
		
		
		
	}

}
