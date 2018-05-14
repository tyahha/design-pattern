import print.Print;

public class Main {
    public static void main(String[] args) {
        Print pi = new PrintBannerInheritance("inheritance");
        Print pa = new PrintBannerAggregate("aggregate");

        Print[] a =  new Print[2];
        a[0] = pi;
        a[1] = pa;

        for (Print anA : a) {
            anA.printWeak();
            anA.printStrong();
        }
    }
}
