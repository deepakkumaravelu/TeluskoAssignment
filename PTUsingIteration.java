import java.util.Scanner;
//Pascal Triangle using Iteration
public class PTUsingIteration {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no of rows: ");
	        int rows = sc.nextInt();
	        for (int out = 0; out < rows; out++) {
	            int number = 1;
	            for (int j = 0; j < rows - out; j++) {
	                System.out.print(" "); 
	            }
	            for (int in = 0; in <= out; in++) {
	                System.out.print(number + " ");
	                number = number*(out-in)/(in+1); 
	            }
	            System.out.println();
	        }
	    }
	}
