import java.util.Date;

public class Expenses {

    String employeeID;
    String location;
    String expensesType;
    String description;
    Date date;
    double amount;

    public Expenses(String employeeID, String location, String expensesType, String description, Date date, double amount) {
        this.employeeID = employeeID;
        this.location = location;
        this.expensesType = expensesType;
        this.description = description;
        this.date = date;
        this.amount = amount;
    }
}
