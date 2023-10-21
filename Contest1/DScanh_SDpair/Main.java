
package DScanh_SDpair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
        List <Pair> v = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[i][j] == 1){
                    Pair x = new Pair(i+1, j+1);
                    System.out.println(x);
                }
            }
        }
    }
}
