package TirelifePackage;

import java.util.Scanner;

public class Tirelife {
	public static Tirelife tire = new Tirelife();
	public static int calculated_life = 0;
	public static String weather = "";
	public static boolean tyres_are_new;
	public static boolean tyres_vibrating;
	public static boolean tyres_grainy;

	public static int track_distance = 0;
	public static int n_of_turns = 0;
	public static boolean racetrack_condition = false;

	public static int lap_used = 0;
	public static float max_speed = 0;
	public static float min_speed = 0;

	public static int num_of_laps = 0;
	public static float weight_of_client = 0;

	public static String tire_chosen;

	public static String type = "";

	public static float tire_pressure = 0;

//    Method that will take Int input from user and will check if user entered correct input .
//    Like it was expecting integer and user have entered integer . It has not entered String
	int getInput() {

		int inp = -1;
		while (true) {
			try {
				Scanner input = new Scanner(System.in);

				inp = input.nextInt();
				return inp;

			} catch (Exception e) {
				System.out.println("Invalid Input");
			}

		}

	}

	// Method that will take Float input from user and will check if user entered
	// correct input . Like it was expecting Float and user have entered Float . It
	// has not entered String
	float getFloatInput() {

		float inp = -1;
		while (true) {
			try {
				Scanner input = new Scanner(System.in);

				inp = input.nextFloat();
				return inp;

			} catch (Exception e) {
				System.out.println("Invalid Input");
			}

		}

	}

	// Method that will take string input from user and will check if user entered
	// correct input .
	String getStringInput() {

		String inp = "";
		while (true) {
			try {
				Scanner input = new Scanner(System.in);

				inp = input.nextLine();
				return inp;

			} catch (Exception e) {
				System.out.println("Invalid Input");
			}

		}

	}

	public static void main(String[] args) {

//        Declaring variables , objects
//		Tirelife tire = new Tirelife();
//		int calculated_life = 0;
//
//		String weather = "";
//		boolean tyres_are_new;
//		boolean tyres_vibrating;
//		boolean tyres_grainy;
//
//		int track_distance = 0;
//		int n_of_turns = 0;
//		boolean racetrack_condition = false;
//
//		int lap_used = 0;
//		float max_speed = 0;
//		float min_speed = 0;
//
//		int num_of_laps = 0;
//		float weight_of_client = 0;
//
//		String tire_chosen;
//
//		String type = "";
//
//		float tire_pressure = 0;

//        Asking user to input weather
		System.out.println("Please Enter Weather : ");
		System.out.println("0. Sunny");
		System.out.println("1. Rainy");

		while (true) {
			int choice = tire.getInput();

			if (choice == 0) {
//                If user chooses sunny 
				weather = "Sunny";

				System.out.println("\n" + "Equip Slicks" + "\n");

				break;
			} else if (choice == 1) {
//                If user chooses Rainy 

				weather = "Rainy";

				System.out.println("\n" + "Equip Wet Tires" + "\n");

				break;
			}
//            If user selected any other value other than 0 or 1 
			System.out.println("Invalid Input ");

		}

//        Asking user to input about tire 
		System.out.println("Please Enter  ");
		System.out.println("0. Yes, Tires are New");
		System.out.println("1. No, Tires are not New");

		while (true) {
			int ch = tire.getInput();

			if (ch == 0) {

//                If tire is new 
				tyres_are_new = true;

				break;
//                it will break the loop and will move to the next section 

			} else if (ch == 1) {

				// If tire is old

				tyres_are_new = false;

//                Asking user if it vibrates 
				System.out.println("\n" + "Check If tyres are Vibrating" + "\n");
				System.out.println("0. Yes");
				System.out.println("1. No");

				while (true) {
					int check_if_tyres_vibrating = tire.getInput();

					if (check_if_tyres_vibrating == 0) {
//                    	Now I will enter 0 and it will break the loop 
//                        If it is vibrating , it will say to equip new tire
						tyres_vibrating = true;
						System.out.println("\n" + "Equip New Tires" + "\n");
						break;
					} else if (check_if_tyres_vibrating == 1) {
//                        if it's not vibrating , it will check for if it looks grainy
						tyres_vibrating = false;

						System.out.println("\n" + "Check If tyres looks grainy" + "\n");
						System.out.println("0. Yes");
						System.out.println("1. No");

						while (true) {
//                            
							int check_if_tyres_looks_grainy = tire.getInput();
							if (check_if_tyres_looks_grainy == 0) {
//								if it looks grainy , it will ask for to equip new tire
//                            	if I will enter 0 it will break the loop 
								tyres_grainy = true;
								System.out.println("\n" + "Equip New Tires" + "\n");

								break;
							} else if (check_if_tyres_looks_grainy == 1) {

//                                If it's not vibrating nor grainy . it will ask for to enter how many laps it has been used 
								tyres_grainy = false;
								System.out.println("\n" + "How many laps it has been used ");
								lap_used = tire.getInput();
								if (lap_used > 90 || lap_used < 10) {
									System.out.println("Invalid Input! Please try again " + "\n");
									lap_used = tire.getInput();
								}
								break;
							}
							System.out.println("Invalid Input ");

						}
						break;
					}
					System.out.println("Invalid Input ");
				}

				break;
			}
//            if user will choose incorrect option , it will say Invalid input 
			System.out.println("Invalid Input");
		}

		System.out.println("\n" + "Input Track Distance, n of turns, racetrack condition" + "\n");

		while (true) {
			System.out.println("Please Enter Track Distance (km) : " + "\n");
			track_distance = (int) tire.getInput();
			if (track_distance > 2.5 || track_distance < 0.9) {
				System.out.println("Invalid Input! Please try again " + "\n");
				track_distance = tire.getInput();
			} else
				break;

		}
		while (true) {
			System.out.println("Please Enter Number of turns  : " + "\n");
			n_of_turns = tire.getInput();
			if (n_of_turns > 50 || n_of_turns < 10) {
				System.out.println("Invalid Input! PLease try again " + "\n");
				n_of_turns = tire.getInput();
			} else
				break;

		}

		System.out.println("Please Enter racetrack condition : " + "\n");
		System.out.println("0. Good Maintained Track");
		System.out.println("1. Badly Maintained Track");

		while (true) {
			int c = tire.getInput();
			if (c == 0) {
				racetrack_condition = true;
				break;
			} else if (c == 1) {
				racetrack_condition = false;
				break;
			}
			System.out.println("Invalid Input " + "\n");

		}

		while (true) {
			System.out.println("Please Enter Max Speed : " + "\n");
			max_speed = tire.getInput();
			if (max_speed > 150 || (max_speed) < 50) {
				System.out.println("Invalid Input ! " + "\n");
			} else
				break;
		}

		while (true) {
			System.out.println("Please Enter Min Speed : " + "\n");
			min_speed = tire.getInput();
			if (min_speed > 49 || min_speed < 10) {
				System.out.println("Invalid Input ! " + "\n");
			} else
				break;
		}

		while (true) {
			System.out.println("Please Enter Number Of Laps : " + "\n");
			num_of_laps = tire.getInput();
			if (num_of_laps > 100 || num_of_laps < 5) {
				System.out.println("Invalid Input ! ");
			} else
				break;
		}

		while (true) {
			System.out.println("Please Enter Weight Of Client (kg) : " + "\n");
			weight_of_client = tire.getInput();
			if (weight_of_client > 150 || weight_of_client < 20) {
				System.out.println("Invalid Input ! " + "\n");
			} else
				break;
		}

		System.out.println("Please Choose Tire : ");
		System.out.println("0. Bridgestone");
		System.out.println("1. MG Tires");
		System.out.println("2. Komet");

		while (true) {
			int tire_type = tire.getInput();
			switch (tire_type) {
//                Assigning value to calculate_life on the basis of user selection 
			case 0:
				type = "Bridgestone";
				calculated_life = 150;
				break;
			case 1:
				type = "MG Tires";
				calculated_life = 120;

				break;
			case 2:
				type = "Komet";
				calculated_life = 100;

				break;
			default:
				System.out.println("Invalid Input ! " + "\n");
			}
			if (!"".equals(type)) {
				break;
			}
		}
		while (true) {
			System.out.println("Please Enter Tire Pressure : " + "\n");
			tire_pressure = tire.getFloatInput();
			if (tire_pressure > 2.5 || tire_pressure < 0.5) {
				System.out.println("Invalid Input ! ");
			} else
				break;
		}

//        deducting track_distance from calculated_life . if it's 2km , it will deduct 2 from the calculated_life
		calculated_life = calculated_life - track_distance;

//       deducting 0.5 of number of turns from the calculated_life 
		calculated_life = (int) Math.rint(calculated_life - (n_of_turns * 0.5));

//        If racetrack condition is Good we will deduct 1 
		if (racetrack_condition) {
			calculated_life = calculated_life - 1;
		} else {
//        If racetrack condition is Bad we will deduct 3 
			calculated_life = calculated_life - 3;
		}
//        A loop that will deduct 5 from calculated_life with the increment of 10 like starting from 70 , 80 so on

		for (int i = 70; i <= weight_of_client; i = i + 10) {
			calculated_life = calculated_life - 5;

		}

//        If tire pressure is in range then it will output an error
		if ((2.5 > tire_pressure) || (tire_pressure < 0.5)) {

		} else {
//            If it is not then it will deduct 10
			calculated_life = calculated_life - 10;

		}
//Deducting number0 of laps from calculated_life
		calculated_life = calculated_life - num_of_laps;
//Deducting laps It has already used, from calculated_life if it's an old tire

		calculated_life = calculated_life - lap_used;
//Printing results here 
		System.out.println("Tire Life Span : " + calculated_life);

	}
}
