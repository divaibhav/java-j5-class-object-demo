public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String displayInfo(){
        return "Make - " + make +
                ", Model" + model +
                ", Year - " + year +
                ", Color - " + color ;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        Car car = (Car)obj;
        if(this.make.equals(car.make) &&
            this.model.equals(car.model) &&
                this.year == car.year &&
                this.color.equals(car.color))
            return true;

        return false;
    }




}
