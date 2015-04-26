package fr.iutvalence.loewb.boats;

import fr.iutvalence.loewb.battleship.Boat;
import fr.iutvalence.loewb.battleship.Coordinates;

public class AircraftCarrier extends Boat
{
	public AircraftCarrier()
	{
		this.size = 5;
		this.horizontal = true;
		this.coordinates = new Coordinates(0,0);
	}
}