//Vehicle class from which all others vehicle-dependent classes inherits
public class Vehicle {

    double speed;
    String vehicle;

    void go(){
        System.out.println("This vehicle is " + this.vehicle + " and it's moving.");
    }
    void stop(){
        System.out.println("This vehicle is " + this.vehicle +  " and it's stopped.");
    }
}
