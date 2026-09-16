import java.util.*;

public class flight {
	private static seat[][] seats = new seat[9][];
	static Scanner input = new Scanner(System.in);
	// Initialize the class seat so we can use it in all the methods
	static seat Seat;

	public static void main(String[] args) {
		for (int i = 0; i < seats.length; i++) {
			// here we set the value of columns for each row... science its a ragged array
			if (i < 3) {
				// Science first three rows have only two seat we set columns = 2
				seats[i] = new seat[2];
			} else {
				// the rest seat rows have for seats set columns = 4
				seats[i] = new seat[4];
			}
		}
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				/*
				 * here instead of entering seatNumber manually i made a for loop to enter them.
				 * Initialize the seats ....seats[i][j] = new seat((i+1)*10 +(j+1) which equal
				 * the value of seatNumber in this position. seats[0][0] = new seat(11) which
				 * same as new seat((0+1)*10+(0+1)) like seats[0][0] = (0+1) * 10+ (0+1) = 11
				 * ..... same for seats[4][3] = (4+1)*10 +(3+1) which equal 54 and so on for all
				 * seats.....seat[6][0] = (6+1)*10+(0+1) which = 71 ....
				 */
				seats[i][j] = new seat((i + 1) * 10 + (j + 1));
			}
		}
		displayMenu();
	}

	public static void displayMenu() {
		System.out.println("Choose from menu:");
		System.out.println("1.  Reserve a new empty seat.");
		System.out.println("2.  Delete a reserved seat.");
		System.out.println("3.  Delete all reserved seats.");
		System.out.println("4.  Print map .");
		System.out.println("5.  Quite.");
		int choose = input.nextInt();
		switch (choose) {
		default:
			System.out.println("choose a valid number from the list:");
			displayMenu();
			break;
		case 1:
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
			displayinfo();
			break;
		case 5:
			System.exit(0);
		}
	}

	public static void reserveSeat() {
		System.out.println("enter a seat number to reserve :");
		int seatNumber = input.nextInt();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				// see if the entered seatNumber equal a seatNumber in the array
				if (seatNumber == seats[i][j].getSeatNumber()) {
					// check if the seat is reserved.
					if (seats[i][j].getReserved() == false) {
						// make the seat reserved ... set its value to true
						System.out.println("the seat succfully resrved");
						seats[i][j].setReserved(true);
						displayMenu();
					} else {
						System.out.println("this seat is reserved");
						reserveSeat();
					}
				}
			}
		}
		/*
		 * here in case you changed your mind or if all the seats are reserved you will
		 * stuck in a loop until you enter a valid number but all the numbers are
		 * invalid science all the seats are reserved so enter zero to return menu
		 */
		if (seatNumber == 0) {
			displayMenu();
		}

		// here use the isValid method to see if the entered number is valid.
		if (seat.isValid(seatNumber) == false) {
			System.out.println("this seatNumber is not Valid.");
			reserveSeat();
		}
	}

	public static void deleteAreservedSeat() {
		// This method enables user to delete a reservation,
		System.out.println("enter a seat number to delete :");
		int seatNumber = input.nextInt();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seatNumber == seats[i][j].getSeatNumber()) {
					// see if the seat is reserved(true) set it to false to delete the reservation
					if (seats[i][j].getReserved() == true) {
						System.out.println("you have succfully deleted the reservation.");
						seats[i][j].setReserved(false);
						displayMenu();
					} else {
						System.out.println("this seat is not reserved");
						deleteAreservedSeat();
					}
				}
			}
		}
		/*
		 * in case if all the seats are not reserved you will stuck in a loop until you
		 * enter a valid number but all the numbers are invalid science all the seats
		 * are not reserved so enter zero to return menu
		 */
		if (seatNumber == 0) {
			displayMenu();
		}
		if (seat.isValid(seatNumber) == false) {
			// in case the user entered a invalid number.
			System.out.println("please enter a valid number.");
			deleteAreservedSeat();
		}
	}

	public static void deleteAllReservedSeats() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				// delete all the reservation ..... make setReserved = false for all seats
				seats[i][j].setReserved(false);
			}
		}
		System.out.println("you have deleted all the reserved seats.");
	}

	public static void displayinfo() {
		// this to display the flight seat map
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (i < 3) {
					System.out.print("\t\t");
					seats[i][j].printInfo();
				} else {
					seats[i][j].printInfo();
				}
			}
			System.out.println();
		}
		displayMenu();
	}

	// used in method isValid in class seat.
	public static seat[][] getSeats() {
		return seats;
	}
}