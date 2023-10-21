package J07072;

public class Ten implements Comparable<Ten> {

    private String ten;

    public Ten(String ten) {
        String a[] = ten.trim().split("\\s+");
        this.ten = "";
        this.ten += a[a.length - 1].substring(0, 1).toUpperCase()
                + a[a.length - 1].substring(1).toLowerCase() + " ";
        this.ten += a[0].substring(0, 1).toUpperCase()
                + a[0].substring(1).toLowerCase() + " ";
        for (int i = 1; i < a.length - 1; i++) {
            this.ten += a[i].substring(0, 1).toUpperCase()
                    + a[i].substring(1).toLowerCase() + " ";
        }
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(Ten o) {
        return this.getTen().compareTo(o.getTen());
    }

    @Override
    public String toString() {
        String a[] = ten.split("\\s+");
        String ans = "";
        ans += a[1] + " ";
        for (int i = 2; i < a.length; i++) {
            ans += a[i] + " ";
        }
        ans += a[0];
        return ans;
    }
}
