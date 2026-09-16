
public class seat {

	private int seatNumber;
	private boolean reserved = false;

	public seat(int seatNumber) {
		this.setSeatNumber(seatNumber);
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public boolean getReserved() {
		return reserved;
	}

	public static boolean isValid(int seatNumber) {
		boolean isValid = true;
		// here call the saved values in the initialize seats.and compare it with the
		// entered seatNumber
		seat seats[][] = flight.getSeats();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seatNumber != seats[i][j].getSeatNumber()) {
					isValid = false;
				} else {
					isValid = true;
					break;
				}
			}
		}
		return isValid;
	}

	public void printInfo() {
		if (getReserved() == false) {
			System.out.print("seatnumber" + getSeatNumber() + ": is empty" + "    ");
		} else {
			System.out.print("seatnumber" + getSeatNumber() + ":is reserved" + "   ");
		}

	}

}
