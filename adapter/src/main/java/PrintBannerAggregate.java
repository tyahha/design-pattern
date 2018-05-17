import banner.Banner;
import print.Print;

public class PrintBannerAggregate implements Print {
    private Banner b;
    public PrintBannerAggregate(String string) {
        this.b = new Banner(string);
    }
    @Override
    public void printWeak() {
        b.showWithParen();
    }

    @Override
    public void printStrong() {
        b.showWithAster();
    }
}
