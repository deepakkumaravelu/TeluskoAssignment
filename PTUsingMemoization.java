import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Pascal Triangle using Memoization
public class PTUsingMemoization {
    private static Map<String, Integer> cache = new HashMap<>();
    public static int calPascal(int r, int c) {
        String key=r+" "+c;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int result;
        if (c==0||c==r) {
            result=1;
        } else {
            result=calPascal(r - 1, c - 1) + calPascal(r - 1, c);
        } cache.put(key,result);
        return result;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        for (int i=0; i<rows;i++) {
            for (int j=0; j<rows-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) {
                System.out.print(calPascal(i, j) + " ");
            }
            System.out.println();
        }
    }
}
