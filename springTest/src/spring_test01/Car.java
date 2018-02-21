package spring_test01;

public class Car {

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

    private String brand;
    private String place;
    private  int price;
    private  int maxSpeed;


    public Car(String brand, String place, int  price) {
        this.brand = brand;
        this.place = place;
        this.price = price;
    }


    public  void shuchu(){
        System.out.println("wangwei  wangwei");
    }

}
