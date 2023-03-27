import java.util.Scanner;

public class flight {
	static Scanner input = new Scanner(System.in);

	private static seat[][] seats = new seat[10][5];

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i <= 3 && j > 2) {
					break;
				} else {
					seats[i][j] = new seat(i * 10 + j);
				}
			}
		}
		
		seat seatNumber = new seat(0);
		int seat = seatNumber.setSeatnumber();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i <= 3 && j > 2) {
					break;
				} else {
					if (seat == seats[i][j].getSeatnumber()) {
						
						
					}
						
						if (seats[i][j].getreserved() == true) {
							System.out.println("this seat is reserved");

						} else {
							seats[i][j].setreserved();
							System.out.println("succful reserved");

						}
					}
				}

		
		
		
		
		

		
	}

}