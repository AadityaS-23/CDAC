package seatManagement;

import java.util.Scanner;

public class SeatArrangement {
	private String[][] seats; // 2D arr

	// Const to initialize the seating arrangement

	public SeatArrangement(int r, int c) {
		seats = new String[r][c]; // 2d arr created

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				seats[i][j] = "A"; // seat is available
			}
		}
	}

// > method to book seat
	private void bookSeat(int r, int c) {
		if (seats[r][c].equals("A")) { // check is seat is available
			seats[r][c] = "X"; // occupied
			System.out.println("Seat booked successfully!");
		} else {
			System.out.println("Seat occupied!");
		}
	}

// > method to cancel a seat
	private void cancelSeat(int r, int c) {
		if (seats[r][c].equals("X")) { // check if seat is occupied
			seats[r][c] = "A"; // marks seat as A
		} else {
			System.out.println("Seat is not booked yet.");
		}
	}

	// Method to check if a seat is available
	public void checkAvailability(int row, int col) {
		if (seats[row][col].equals("A")) {
			System.out.println("Seat is available.");
		} else {
			System.out.println("Seat is occupied.");
		}
	}

	// Method to display the current seating chart
	public void displaySeatingChart() {
		System.out.println("Current Seating Chart:");
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " "); // Display A for available, X for occupied
			}
			System.out.println(); // Move to next row
		}
	}

	// Main method to test the functionalty
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SeatArrangement s = new SeatArrangement(5, 6);

		s.displaySeatingChart(); // show initial chart

		System.out.println("Booking seat @ row 1,column 2>>>>> ");
		s.bookSeat(0, 1); // books seat at r1 , c2
		s.displaySeatingChart(); // dsplay the chart after booking

		System.out.println("Cancelling seat @ row 1,column 2>>>>>> ");
		s.cancelSeat(0, 1); // cancels seat at r1,c2
		s.displaySeatingChart(); // displau the chart after cancelling

		System.out.println("Checking the availability @ row 2,column 3>>>>>");
		s.checkAvailability(1, 2); // check avail of seat at r2 ,c3
	}

}
