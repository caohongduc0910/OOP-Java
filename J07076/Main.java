package J07076;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[][] = new int[m][n];
            int temp[] = new int[m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                    if(j == k - 1){
                        temp[i] = a[i][j];
                    }
                }
            }
            Arrays.sort(temp);
            for(int i = 0; i<m; i++){
                a[i][k-1] = temp[i]; 
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
