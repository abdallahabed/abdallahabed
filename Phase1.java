import java.util.Scanner;

//Abdallah Aabed
//In this class 
public class Phase1 {
	// false means the seat is not reserved, true marks the seat as reserved

	static Scanner input = new Scanner(System.in);
	// make the variable static(global) because we use it in all the methods.
	static boolean SeatNumber11, SeatNumber12, SeatNumber21, SeatNumber22, SeatNumber31, SeatNumber32, SeatNumber41,
			SeatNumber42, SeatNumber51, SeatNumber52 = false;
	static int SeatNumber;

	public static void main(String[] args) {
		displayMenu();
	}

	public static void printMenu() {
		System.out.println("Choose from menu:");
		System.out.println("1.  Reserve a new empty seat.");
		System.out.println("2.  Delete a reserved seat.");
		System.out.println("3.  Delete all reserved seats.");
		System.out.println("4.  Print out number of reserved seats.");
		System.out.println("5.  Quite.");
	}

	public static void displayMenu() {
		printMenu();
		int chose = input.nextInt();
		// this switch is for what process user want to do --- reserve seat,delete
		// ........
		switch (chose) {
		default:
			System.out.println("Please enter a valid number");
			displayMenu();
			break;
		case 1:
			System.out.println(" <------------------------------>");
			System.out.println("      Seat reservation           ");
			System.out.println(" <------------------------------>");
			System.out.println("    11    12    21    22    31");
			System.out.println("    32    41    42    51    52");
			reserveSeat();
			displayMenu();
			break;
		case 2:
			deleteAreservedSeat();
			displayMenu();
			break;
		case 3:
			deleteAllReservedSeats();
			displayMenu();
			break;
		case 4:
			numberOfReservedSears();
			displayMenu();
			break;
		case 5:
			System.exit(5);
		}
	}

	public static void reserveSeat() {
		System.out.println("enter a seat number to reserve :");
		SeatNumber = input.nextInt();
		// here we check seat number if it valid or not (seats number 11,12,21,22......)
		switch (SeatNumber) {
		default:
			System.out.println("Please enter a valid number");
			reserveSeat();
			break;
		case 11:
			if (SeatNumber11 == false) { // avalible
				SeatNumber11 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber11 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 12:
			if (SeatNumber12 == false) { // available
				SeatNumber12 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber12 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 21:
			if (SeatNumber21 == false) { // available
				SeatNumber21 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber21 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 22:
			if (SeatNumber22 == false) { // available
				SeatNumber22 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber22 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 31:
			if (SeatNumber31 == false) { // available
				SeatNumber31 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber31 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 32:
			if (SeatNumber32 == false) { // available
				SeatNumber32 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber32 = true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 41:
			if (SeatNumber41 == false) { // available
				SeatNumber41 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber41 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 42:
			if (SeatNumber42 == false) { // available
				SeatNumber42 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber42 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 51:
			if (SeatNumber51 == false) { // available
				SeatNumber51 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber51 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		case 52:
			if (SeatNumber52 == false) { // available
				SeatNumber52 = true;
				System.out.println("seat succsefully reserved");
			} else if (SeatNumber52 == true) { // not availabe
				System.out.println("seat not available");
				reserveSeat();
			}
			break;
		}
	}

	public static void deleteAreservedSeat() {
		/*
		 * This method enables user to delete a resrvetion, using switch cases, the
		 * deafult will ask to re enter, the zero case if the user has changed their
		 * mind of deletion they could exit otherwise they will be trapped in a loop
		 */
		System.out.println("enter the number of seat you want to delete or zero to exit:");
		SeatNumber = input.nextInt();
		/*
		 * if valid mark as 0 if not valid recursion ........ deleteAreservedSeat();
		 */

		// here it check if seat number is reserved (=1)if it is then turn it to
		// zero.wich mean not reserved
		switch (SeatNumber) {
		default:
			System.out.println("Please enter a valid number");
			deleteAreservedSeat();
			break;
		case 0:
			// Exit
			break;
		case 11:
			if (SeatNumber11 == true) { // not available ...... seat is reserved
				SeatNumber11 = false; // it become available
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber11 == false) { // not reserved
				System.out.println("seat not reserverd");
				deleteAreservedSeat();
			}
			break;
		case 12:
			if (SeatNumber12 == true) { // available
				SeatNumber12 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber12 == false) { // not available
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 21:
			if (SeatNumber21 == true) { // available
				SeatNumber21 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber21 == false) { // not available
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 22:
			if (SeatNumber22 == true) { // available
				SeatNumber22 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber22 == false) { // not available
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 31:
			if (SeatNumber31 == true) { // available
				SeatNumber31 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber31 == false) { // not available
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 32:
			if (SeatNumber32 == true) { // available
				SeatNumber32 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber32 == false) { // not available
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 41:
			if (SeatNumber41 == true) { // available
				SeatNumber41 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber41 == false) { // not availabe
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 42:
			if (SeatNumber42 == true) { // available
				SeatNumber42 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber42 == false) { // not availabe
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 51:
			if (SeatNumber51 == true) { // available
				SeatNumber51 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber51 == false) { // not availabe
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		case 52:
			if (SeatNumber52 == true) { // available
				SeatNumber52 = false;
				System.out.println("you have successfully deleted the reservetion");
			} else if (SeatNumber52 == false) { // not availabe
				System.out.println("seat not reserver");
				deleteAreservedSeat();
			}
			break;
		}
	}

	public static void deleteAllReservedSeats() {
		// mark it as zero which mean its not reserved
		SeatNumber11 = false;
		SeatNumber12 = false;
		SeatNumber21 = false;
		SeatNumber22 = false;
		SeatNumber31 = false;
		SeatNumber32 = false;
		SeatNumber41 = false;
		SeatNumber42 = false;
		SeatNumber51 = false;
		SeatNumber52 = false;
		System.out.println("all seats are deleted");
	}

	public static void numberOfReservedSears() {
		int count = 0;
		// we know if the seat is marked as one thats mean its reserved
		// so for every case the seat is marked as one increment count to know number of
		// reserved seats.
		if (SeatNumber11 == true) {
			count++;
		}
		if (SeatNumber12 == true) {
			count++;
		}
		if (SeatNumber21 == true) {
			count++;
		}
		if (SeatNumber22 == true) {
			count++;
		}
		if (SeatNumber31 == true) {
			count++;
		}
		if (SeatNumber32 == true) {
			count++;
		}
		if (SeatNumber41 == true) {
			count++;
		}
		if (SeatNumber42 == true) {
			count++;
		}
		if (SeatNumber51 == true) {
			count++;
		}
		if (SeatNumber52 == true) {
			count++;
		}
		System.out.println("number of reserved seats is " + count);
	}
}