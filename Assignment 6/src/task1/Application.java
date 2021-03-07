package task1;

public class Application {
    public static void main(String[] args) {
        Database dbms = Database.getInstance();
        dbms.query("SELECT id, first, last, age FROM Employees");

        Database bar = Database.getInstance();
        bar.query("SELECT id, first, last, age FROM Employees");

    }
}
