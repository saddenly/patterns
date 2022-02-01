package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.query("SELECT ...");

        Database database = Database.getInstance();
        database.query("UPDATE ...");
    }
}