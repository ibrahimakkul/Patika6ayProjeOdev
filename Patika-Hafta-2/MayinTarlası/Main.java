import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to MineSweeper Game!");
		
		System.out.print("Select the number of rows: ");
		int rows= scan.nextInt();
		
		System.out.print("Select the number of columns: ");
		int columns= scan.nextInt();
		
		MineSweeper mineSweeper = new MineSweeper(rows,columns);
		
	}

}