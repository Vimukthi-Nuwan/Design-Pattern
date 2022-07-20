
public class Auditor extends ExpensesFilter{
    @Override
    public void Filter(Expenses expenses) {
        if (expenses.expensesType != null && expenses.description != null && expenses.date != null
        && expenses.amount != 0){
            if (expenses.amount <= 2500){
                System.out.println("The auditor passes the expenses.");
            }else{
                expenses.amount = 2500;
                System.out.println("The auditor updates the expenses to 2500.");
                System.out.println("The auditor passes the expenses.");
            }
        }else
            System.out.println("The auditor does not pass the expenses.");
    }
}
