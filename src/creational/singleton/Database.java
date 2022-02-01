package creational.singleton;

public class Database {
    private static Database instance;
    private int num = 0;

    private Database() {
        System.out.println("Инициализация подключения к серверу БД");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sqlCommand) {
        System.out.println("Выполнена " + ++num + " команда по счету\n" +
                "Команда: " + sqlCommand);
    }
}