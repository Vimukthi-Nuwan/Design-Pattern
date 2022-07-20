public class Mobile implements MobilePrototype{

    private String Brand;
    private String Model;
    private String Camera;
    private String Battery;
    private Double Price;
    private String Year;

    public Mobile(String brand, String model, String camera, String battery, Double price, String year) {
        this.Brand = brand;
        this.Model = model;
        this.Camera = camera;
        this.Battery = battery;
        this.Price = price;
        this.Year = year;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        this.Camera = camera;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        this.Battery = battery;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    @Override
    public Mobile clone() {
        return new Mobile(this.Brand, this.Model, this.Camera, this.Battery, this.Price, this.Year);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Camera='" + Camera + '\'' +
                ", Battery='" + Battery + '\'' +
                ", Price=' Rs." + Price + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
