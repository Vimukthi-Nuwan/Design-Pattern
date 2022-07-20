package Residents;

import CommonProperties.WashingMachine;

public class MadhushankaFamily {

    public void start(){

        WashingMachine washingMachine = WashingMachine.getWashingMachine();
        System.out.println(washingMachine);
        washingMachine.wash("Madhushanka's family");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
