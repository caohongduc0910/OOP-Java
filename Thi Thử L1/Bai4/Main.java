
package Bai4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        List <MonThi> monthi = new ArrayList<>();
        List <CaThi> cathi = new ArrayList<>();
        List <LichThi> lichthi = new ArrayList<>();
        while(t-- > 0){
            monthi.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(sc.nextLine()); 
        while(t-- > 0){
            cathi.add(new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(sc.nextLine()); 
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            String maca = a[0];
            String mamon = a[1];
            String manhom = a[2];
            int sosv = Integer.parseInt(a[3]);
            MonThi mt = new MonThi();
            CaThi ct = new CaThi();
            for(MonThi x : monthi){
                if(mamon.equals(x.getMaMon())){
                    mt = x;
                    break;
                }
            }
            for(CaThi x : cathi){
                if(maca.equals(x.getMaCa())){
                    ct = x;
                    break;
                }
            }
            lichthi.add(new LichThi(mt, ct, manhom, sosv));
        }
        Collections.sort(lichthi);
        for(LichThi x : lichthi){
            System.out.println(x);
        }
        
    }
}
