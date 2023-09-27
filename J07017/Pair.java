/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07017;

/**
 *
 * @author CAO DUC
 */
public class Pair<F, S> {

    private F fi;
    private S se;

    public Pair(F fi, S se) {
        this.fi = fi;
        this.se = se;
    }

    public boolean prime(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;           
    }

    public boolean isPrime() {
        int x = Integer.parseInt(fi.toString());
        int y = Integer.parseInt(se.toString());
        if(prime(x) && prime(y))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return fi + " " + se;
    }

}
