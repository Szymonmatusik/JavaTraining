package TutorialCourseOOP;

public class CarEncapsulation {

    private String make;
    private String model;
    private int year;

    CarEncapsulation(String make, String model, int year){
        setMake(make);
        setModel(model);
        setYear(year);

    }
    CarEncapsulation(CarEncapsulation car){
        this.copy(car);
    }

    //getter function for make
    public String getMake(){
        return make;
    }
    //getter function for model
    public String getModel(){
        return model;
    }
    //getter function for year
    public int getYear(){
        return year;
    }

    //Setter for the make attribute
    public void setMake(String make){
        this.make = make;
    }
    //Setter for the model attribute
    public void setModel(String model){
        this.model = model;
    }
    //Setter for the year attribute
    public void setYear(int year){
        this.year = year;
    }

    //method to made to copy objects using encapsulation
    private void copy(CarEncapsulation car){
        /* Very simple implementation
        this.make = car.make;
        this.model = car.model;
        this.year = car.year;
         */

        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
