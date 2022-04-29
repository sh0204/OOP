import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        Car car = Car.getInstance();
        for (int battery =100; battery>0; battery-=battery*0.1){
            car.drive();
            car.dispDistance();
            car.dispBattery();
        }

    }

}

