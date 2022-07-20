package Residents;

import CommonProperties.WashingMachine;

public class VimukthiFamily {

    public void start(){


        WashingMachine washingMachine = WashingMachine.getWashingMachine();
        System.out.println(washingMachine);
        washingMachine.wash("Vimukthi's family");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
