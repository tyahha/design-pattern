package page_maker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }
    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}
