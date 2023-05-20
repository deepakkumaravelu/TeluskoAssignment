import java.util.Scanner;
//Pascal Triangle using Recursion
public class PTUsingRecursion {
	public static int calPascal(int r, int c) {
        if (c==0||c==r) {
            return 1;
        } else {
            return calPascal(r-1,c-1) + calPascal(r-1,c);
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        for (int i=0;i<rows;i++) {
            for (int j=0;j<rows-i;j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i;j++) {
                System.out.print(calPascal(i, j) + " ");
            }
            System.out.println();
        }
    } 
}
