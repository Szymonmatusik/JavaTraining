package TutorialCourseOOP;

//TutorialCourseOOP.Vehicle class from which all others vehicle-dependent classes inherits
public abstract class Vehicle {

    String vehicleType;
    abstract void go();
    abstract void stop();
}
