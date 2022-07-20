import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

        MobileOS mobileOS = new MobileOS("Apple", "iOS", "12.0", new Date());
        mobileOS.save();
        System.out.println("Save Mobile OS "+ mobileOS);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mobileOS.Set_OS_Details("Apple", "iOS", "14.0", new Date());
        mobileOS.save();
        System.out.println("Save Mobile OS "+ mobileOS);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mobileOS.Set_OS_Details("Apple", "iOS", "15.5", new Date());
        mobileOS.save();
        System.out.println("Save Mobile OS "+ mobileOS);

        System.out.println("\nLast Update version :- "+ mobileOS);
        mobileOS.downgrade();
        System.out.println("\nRestore it to last saved state");
        System.out.println(mobileOS);


        mobileOS.downgrade();
        System.out.println("\nUndo previous Version\n"+mobileOS);



    }

}
