package SimpleDatabaseBefore;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDatabase db = new SimpleDatabase(new FileReader("/Users/zx7y-kmr/OneDrive/Refactoring/RemoveControlFlag/SimpleDatabaseBefore/dbfile.txt"));
            Iterator<String> it = db.iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("KEY: \"" + key + "\"");
                System.out.println("VALUE: \"" + db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
