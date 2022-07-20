import java.util.Date;

public class Test {

    public static void main(String[] args) {

        ProjectManager projectManager = new ProjectManager();
        Auditor auditor = new Auditor();

        projectManager.nextFilter(auditor);

        Expenses expenses = new Expenses("8156478", "Sri Lanka", "Internet Bill", "WFH Internet Claim", new Date(), 2600);
        projectManager.Filter(expenses);


    }

}
