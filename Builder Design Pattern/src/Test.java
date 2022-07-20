public class Test {

    public static void main(String[] args) {

        HotelPackages.Builder builder = new HotelPackages.Builder(2,2,0, true, true, true);
        HotelPackages hotelPackage = builder.build();

        System.out.println(hotelPackage +"\n\n");

        HotelPackages hotelPackage2 = builder.setPool(true).setExtra_Activities(true).build();
        System.out.println(hotelPackage2);

    }

}
