public class Customer {

    private String name;
    private String phone;
    private  Car car;

    public Customer(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }


}
