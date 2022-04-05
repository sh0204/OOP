public class Car {

    int distance=0 ;
    int battery=100;
    public static Car instance = new Car();
    public static Car getInstance() {
        return instance;
    }

    public Car() {
        this.battery = battery;
        this.distance = distance;
    }
    public void drive() {
        distance +=1;
        battery -= battery*0.1;

    }
    public void dispDistance() {
        System.out.println("주행거리: "+distance +" km");
    }

    public void dispBattery() {
        System.out.println("배터리: "+battery+ " %");
    }

}
