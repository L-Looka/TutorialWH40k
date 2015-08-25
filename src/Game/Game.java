package Game;

import Units.Infantry;
import Units.SmInfantry;

public class Game {
	
	public static void printHeader (Infantry x){
		String [] y = x.Header();
		for (String name : y){
			System.out.print(name+" ");
		}
		System.out.println();
	}
	public static void print (Infantry x){
		String [] y = x.toPrint();
		for (String name : y){
			System.out.print(name+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		
		SmInfantry tact = new SmInfantry("Tactical",4,4,4,4,1,4,1,8,3,"WS");
		
		System.out.println(tact.AcuteSenses());
		printHeader (tact);
		print (tact);
		
		
		
		
		
	}



}
