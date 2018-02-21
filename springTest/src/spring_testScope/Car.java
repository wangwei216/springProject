package spring_testScope;

public class Car {

        private  String brand;
        private double price;
        private double zhouchang;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", zhouchang=" + zhouchang +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getZhouchang() {
        return zhouchang;
    }

    public void setZhouchang(double zhouchang) {
        this.zhouchang = zhouchang;
    }

    public Car(String brand, double price, double zhouchang) {

        this.brand = brand;
        this.price = price;
        this.zhouchang = zhouchang;
    }
}
