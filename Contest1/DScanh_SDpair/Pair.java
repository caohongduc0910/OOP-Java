
package DScanh_SDpair;

public class Pair<F, S> {

    private F fi;
    private S se;

    public Pair(F fi, S se) {
        this.fi = fi;
        this.se = se;
    }

    public void setFi(F fi) {
        this.fi = fi;
    }

    public void setSe(S se) {
        this.se = se;
    }
    

    @Override
    public String toString() {
        return "(" + fi + "," + se + ")";
    }

}
