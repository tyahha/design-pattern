import banner.Banner;
import print.Print;

public class PrintBannerInheritance extends Banner implements Print {
    public PrintBannerInheritance(String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithAster();
    }
}
