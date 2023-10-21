
package Bai1_PhepToanCoBan;

import java.math.BigInteger;

public class SoNguyen implements Comparable<SoNguyen>{
    private BigInteger a;

    public SoNguyen(String a) {
        this.a = new BigInteger(a);
    }

    public BigInteger getA() {
        return a;
    }
    
    @Override
    public int compareTo(SoNguyen o) {
        return (int) this.a.compareTo(o.a);
    }
    
}
