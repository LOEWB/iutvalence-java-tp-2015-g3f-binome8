package fr.iutvalence.loewb.battleship;

/** Small application initializing a player, moving a boat, and displaying it on the console*/
public class Main 
{	
	/** Application entry point*/
	public static void main (String args[])
	{
		Player p1 = new Player("Joueur 1",1);
		Player p2 = new Player("Joueur 2",2);
		//P1 places his boats
		p1.placeBoat(p1.getAircraftCarrier(), new Coordinates(0,0));
		p1.placeBoat(p1.getBattleship(), new Coordinates(2,0));
		p1.placeBoat(p1.getPetroleBoat(), new Coordinates(6,0));
		p1.placeBoat(p1.getSubmarine(), new Coordinates(8,0));
		p1.placeBoat(p1.getDestroyer(), new Coordinates(4,3));
		p1.moveBoat(p1.getDestroyer(), new Coordinates(4,4));
		p1.rotationBoat(p1.getDestroyer());
		//P2 places his boats
		p2.placeBoat(p2.getAircraftCarrier(), new Coordinates(0,0));
		p2.placeBoat(p2.getBattleship(), new Coordinates(2,0));
		p2.placeBoat(p2.getPetroleBoat(), new Coordinates(6,0));
		p2.placeBoat(p2.getSubmarine(), new Coordinates(8,0));
		p2.placeBoat(p2.getDestroyer(), new Coordinates(4,0));
		System.out.println(p1.getBoatGrid());
		//System.out.println(p2.getBoatGrid());
	}
}