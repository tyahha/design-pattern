import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.ConcreteFactory");
            System.out.println("Example 1: java Main list_factory.ListFactory");
            System.out.println("Example 2: java Main table_factory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://yomiuri.co.jp/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("新聞");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("サーチエンジン");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "佐藤 利徳");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
