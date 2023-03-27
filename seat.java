import java.util.Scanner;

public class seat {
	Scanner input = new Scanner(System.in);
	private int seatNumber;
	private boolean reserved = false;

	public seat(int seatNumber) {
		this.seatNumber = seatNumber;

	}

	public void setSeatnumber() {
		int seatNumber = input.nextInt();
		if(seatNumber == this.seatNumber) {
			if(getreserved() == true) {
				System.out.println("this seat is reserved try another one.");
			}
			else {
				System.out.println("you have succfuly reseved");
				setreserved();
			}
		}
		
		

	}

	public int getSeatnumber() {

		return seatNumber;
	}

	public void setreserved() {
		reserved = true;

	}

	public boolean getreserved() {
		return reserved;

	}
	
	
	
		
	}
	
	
	
	
	
	

}
