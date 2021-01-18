package TirelifePackage;

public class Calculation {
	public static int calculate(int calculated_life, int track_distance, int n_of_turns, boolean racetrack_condition, float tire_pressure, int num_of_laps, int lap_used, float weight_of_client)
	{
//      deducting track_distance from calculated_life . if it's 2km , it will deduct 2 from the calculated_life
		calculated_life = calculated_life - track_distance;

//      deducting 0.5 of number of turns from the calculated_life 
		calculated_life = (int) Math.rint(calculated_life - (n_of_turns * 0.5));

//       If racetrack condition is Good we will deduct 1 
		if (racetrack_condition) {
			calculated_life = calculated_life - 1;
		} else {
//       If racetrack condition is Bad we will deduct 3 
			calculated_life = calculated_life - 3;
		}
//       A loop that will deduct 5 from calculated_life with the increment of 10 like starting from 70 , 80 so on

		for (int i = 70; i <= weight_of_client; i = i + 10) {
			calculated_life = calculated_life - 5;

		}

//       If tire pressure is in range then it will output an error
		if ((2.5 > tire_pressure) || (tire_pressure < 0.5)) {

		} else {
//           If it is not then it will deduct 10
			calculated_life = calculated_life - 10;

		}
//Deducting number0 of laps from calculated_life
		calculated_life = calculated_life - num_of_laps;
//Deducting laps It has already used, from calculated_life if it's an old tire

		calculated_life = calculated_life - lap_used;
		
		return calculated_life;
	}
}
