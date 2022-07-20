package CommonProperties;

public class WashingMachine {

    private static volatile WashingMachine washingMachine;

    private WashingMachine(){}

    public static WashingMachine getWashingMachine() {
        if (washingMachine == null){
            synchronized (WashingMachine.class){
                if (washingMachine == null)
                    washingMachine = new WashingMachine();
            }
        }
        return washingMachine;
    }

    public void wash(String s){
        System.out.println("The washing machine is now used by the "+s +".\n");
    }
}
