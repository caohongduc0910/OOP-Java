/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J08011;

/**
 *
 * @author CAO DUC
 */
public class Pair<F, L> implements Comparable<Pair>{
    
    private F f;
    private L l;

    public Pair(F f, L l) {
        this.f = f;
        this.l = l;
    }

    public F getF() {
        return f;
    }

    public L getL() {
        return l;
    }


    public void setL(L l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return f + " " + l;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.valueOf(o.l.toString()) - Integer.valueOf(this.l.toString());
    }
 
}
