class StaticKeywordExample {
    String brand;
    int price;
    static String country = "India";
    
}
public class StaticKeyword{
    public static void main(String[] args) {
        StaticKeywordExample car1 = new StaticKeywordExample();
        car1.brand = "Maruti";
        car1.price = 500000;

        StaticKeywordExample car2 = new StaticKeywordExample();
        car2.brand = "Hyundai";
        car2.price = 700000;

        System.out.println("Car 1: " + car1.brand + ", Price: " + car1.price + ", Country: " + StaticKeywordExample.country);
        System.out.println("Car 2: " + car2.brand + ", Price: " + car2.price + ", Country: " + StaticKeywordExample.country);
    }
}
