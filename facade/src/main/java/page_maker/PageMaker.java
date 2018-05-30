package page_maker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }
    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties props = Database.getProperties("maildata");
            String userName = props.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph(userName + "のページへようこそ");
            writer.paragraph("メール待ってますね");
            writer.mailTo(mailAddr, userName);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
