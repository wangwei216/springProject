package spring_test02;

public class Car {

    private String place;
    private  int price;
    private  int maxSpeed;
    private String brand;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", place='" + place + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    public Car(String brand, String place, int  price) {
        this.brand = brand;
        this.place = place;
        this.price = price;
    }


}
