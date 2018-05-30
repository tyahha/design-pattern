import page_maker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        System.out.println(System.getProperty("user.dir"));
    }
}
