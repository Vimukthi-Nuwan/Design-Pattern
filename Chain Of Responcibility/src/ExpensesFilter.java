public abstract class ExpensesFilter {

    protected ExpensesFilter expensesFilter;

    public void nextFilter(ExpensesFilter expensesFilter){
        this.expensesFilter = expensesFilter;
    }

    public abstract void Filter(Expenses expenses);

}
