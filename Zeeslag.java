package Demo;

import java.util.Scanner;

//mijn schip bevindt zich in een zee van 3 rijen van 4 kolommen, te weten op nummer 4, 8, en 12
//de speler moet raden middels invoer van nummers om het schip te laten zinken

public class Zeeslag {

	public static void main(String[] args) {
		System.out.println("Welkom bij Zeeslag. Bom erop los en kijk of je het schip kunt laten zinken! Kies de a tot en met l om te bombarderen!");
		Scanner scInput = new Scanner (System.in);
		Speler speler1 = new Speler();
		Schip schip1 = new Schip();
		Zee zee1 = new Zee();
		
		schip1.varen(zee1);
		
		//sterf krijg allemaal rood
		String invoerUser = scInput.nextLine();
		System.out.println(invoerUser);
		if (invoerUser.equals(4 || 8 || 12)) {
			schip1.gebombardeerdWorden(); 
			System.out.println("Kaboem! Je hebt je eerste doel getroffen!")
		} else {
			(invoerUser.equals(1 || 2 || 3 || 5 || 6 || 7 || 9 || 10 || 11)){
				schip1.missen();
				System.out.println("Plons! Gemist.");
			}
		String invoerUser = scInput.nextLine();
		System.out.println(invoerUser);
		if (invoerUser.equals(4 || 8 || 12)) {
			schip1.gebombardeerdWorden(); 
			System.out.println("Kaboem! Je hebt je tweede doel getroffen! Het schip is bijna gezonken.")
		} else {
			(invoerUser.equals(1 || 2 || 3 || 5 || 6 || 7 || 9 || 10 || 11)){
				schip1.missen();
				System.out.println("Plons! Gemist.");
				
				String invoerUser = scInput.nextLine();
				System.out.println(invoerUser);
				if (invoerUser.equals(4 || 8 || 12)) {
					schip1.gebombardeerdWorden(); 
					System.out.println("Ja! Je hebt het hele schip doen zinken! Je hebt gewonnen.")
					schip1.zinken();
					gezonken = true;
				} else {
					(invoerUser.equals(1 || 2 || 3 || 5 || 6 || 7 || 9 || 10 || 11)){
						schip1.missen();
						System.out.println("Plons! Gemist.");
				
				
	}

}
class Speler{
	
}
class Zee{
	int [][] x = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}{
	for (int i = 0; i < x.i.length;i++) {
		for (int j = 0); j < x.i.length;j++){
			System.out.print(x[i][j] + " ");
		}
		System.out.println();
	}
}
class Schip{
	int scheepsdeel;
	int scheepsdeel = 4;
	int scheepsdeel = 8;
	int scheepsdeel = 12;
	boolean gezonken;
	String naam;
	Schip (String deNaam, int scheepsdeel){
		naam = deNaam;
		this.scheepsdeel = scheepsdeel;
	}
	void geraaktworden (Schip gebombaardeerdSchip){
	}
	void missen (Schip schipgemist) {
	}
	void varen(Zee);
}
class Bom{
	
}