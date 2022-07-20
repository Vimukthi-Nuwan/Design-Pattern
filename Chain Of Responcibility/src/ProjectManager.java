public class ProjectManager extends ExpensesFilter{

    @Override
    public void Filter(Expenses expenses) {

        if (expenses.employeeID != null && expenses.location != null){
            System.out.println("ProjectManager : He/She is a valid employee. \n");
            this.expensesFilter.Filter(expenses);
        }else
            System.out.println("Not a valid employee.");

    }

}
