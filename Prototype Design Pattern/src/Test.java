public class Test {

    public static void main(String[] args) {

        Mobile iPhone13MroMax = new Mobile("Apple", "13 Pro Max", "12 MP", "4352 mAh", 500000.0, "2021, September 14");

        System.out.println(iPhone13MroMax);


        Mobile iPhone14MroMax = iPhone13MroMax.clone();
        iPhone14MroMax.setCamera("48 MP");
        iPhone14MroMax.setPrice(700000.0);
        iPhone14MroMax.setModel("14 Pro Max");
        iPhone14MroMax.setYear("2022, September 14");

        System.out.println(iPhone14MroMax);

    }

}
