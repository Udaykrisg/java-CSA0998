import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private Date pickupDate;
    private Date returnDate;
    private double pricePerDay;
    private String customerName;
    private String customerContact;

    public Car(String make, String model, double pricePerDay) {
        this.make = make;
        this.model = model;
        this.pickupDate = null;
        this.returnDate = null;
        this.pricePerDay = pricePerDay;
        this.customerName = null;
        this.customerContact = null;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setCustomerDetails(String customerName, String customerContact) {
        this.customerName = customerName;
        this.customerContact = customerContact;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String pickupDateString = pickupDate != null ? dateFormat.format(pickupDate) : "N/A";
        String returnDateString = returnDate != null ? dateFormat.format(returnDate) : "N/A";

        return make + " " + model + " - Pickup Date: " + pickupDateString + ", Return Date: " + returnDateString
                + ", Price Per Day: $" + pricePerDay + ", Rented by: " + customerName + ", Contact: " + customerContact;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return make.equalsIgnoreCase(car.make) && model.equalsIgnoreCase(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model);
    }
}

class CarRentalSystem {
    private ArrayList<Car> cars;
    private ArrayList<Car> rentedCars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        rentedCars = new ArrayList<>();
        initializeCars();
    }

    private void initializeCars() {
        cars.add(new Car("Toyota", "Camry", 50.0));
        cars.add(new Car("Honda", "Accord", 55.0));
        cars.add(new Car("Ford", "Focus", 45.0));
        cars.add(new Car("Audi", "R8", 150.0));
        cars.add(new Car("Ford", "Mustang", 75.0));
        cars.add(new Car("Mercedes", "Maybach", 200.0));
        cars.add(new Car("BMW", "I8", 120.0));
        cars.add(new Car("BMW", "X7", 110.0));
        cars.add(new Car("Dodge", "HellCat", 90.0));
        cars.add(new Car("Dodge", "DEMON", 100.0));
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (!rentedCars.contains(car)) {
                // Display car information without pickup and return dates
                System.out.println(car.getMake() + " " + car.getModel() + " - Price Per Day: $" + car.getPricePerDay());
            }
        }
        System.out.println();
    }

    public void rentCar(String make, String model, Date pickupDate, Date returnDate, String customerName, String customerContact) {
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model) && !rentedCars.contains(car)) {
                car.setPickupDate(pickupDate);
                car.setReturnDate(returnDate);
                car.setCustomerDetails(customerName, customerContact);
                rentedCars.add(car);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("You have successfully rented the car: " + car);
                System.out.println("Please collect the car from our agency.");
                System.out.println("30% advance and required personal details should be submitted at the office at the time of pickup." +
                        "The remaining amount should be paid at the time of return.");
                System.out.println(" ");
                System.out.println(" ");
                // calculateRentalCost(car);
                return;
            }
        }
        System.out.println("Sorry, the requested car is not available for rent.");
    }

    public void returnCar(String make, String model) {
        Car returnedCar = new Car(make, model, 0.0);
        if (rentedCars.contains(returnedCar)) {
            returnedCar = rentedCars.get(rentedCars.indexOf(returnedCar));
            rentedCars.remove(returnedCar);
            System.out.println("Thank you for returning the car: " + returnedCar);
            calculateRentalCost(returnedCar);
        } else {
            // Case-insensitive check
            Car caseInsensitiveCar = new Car(make.toLowerCase(), model.toLowerCase(), 0.0);
            if (rentedCars.contains(caseInsensitiveCar)) {
                caseInsensitiveCar = rentedCars.get(rentedCars.indexOf(caseInsensitiveCar));
                rentedCars.remove(caseInsensitiveCar);
                System.out.println("Thank you for returning the car: " + caseInsensitiveCar);
                calculateRentalCost(caseInsensitiveCar);
            } else {
                System.out.println("Invalid return. The car was not rented from this rental system.");
            }
        }
    }

    private void calculateRentalCost(Car car) {
        if (car.getPickupDate() != null && car.getReturnDate() != null) {
            long diffInMillies = Math.abs(car.getReturnDate().getTime() - car.getPickupDate().getTime());
            long diffInDays = (diffInMillies / (24 * 60 * 60 * 1000));

            double rentalCost = diffInDays * car.getPricePerDay();
            System.out.println("Rental cost: $" + rentalCost);
        }
    }

    public void displayOrders() {
        System.out.println("Rented Cars:");
        for (Car car : rentedCars) {
            System.out.println(car);
        }
        System.out.println();
    }
}

class CarRentalApp {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("       WELCOME TO LUXE CAR RENTALS        ");
            System.out.println("1. Display available cars");
            System.out.println("2. Rent a car");
            System.out.println("3. Return a car");
            System.out.println("4. View orders (Admin)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    carRentalSystem.displayAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter the make of the car you want to rent: ");
                    String makeToRent = scanner.next();
                    System.out.print("Enter the model of the car you want to rent: ");
                    String modelToRent = scanner.next();
                    System.out.print("Enter the pickup date (MM/dd/yyyy): ");
                    String pickupDateString = scanner.next();
                    System.out.print("Enter the return date (MM/dd/yyyy): ");
                    String returnDateString = scanner.next();
                    System.out.print("Enter your name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter your contact number: ");
                    String customerContact = scanner.next();
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                        Date pickupDate = dateFormat.parse(pickupDateString);
                        Date returnDate = dateFormat.parse(returnDateString);

                        carRentalSystem.rentCar(makeToRent, modelToRent, pickupDate, returnDate, customerName, customerContact);
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please enter dates in MM/dd/yyyy format.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the make of the car you are returning: ");
                    String makeToReturn = scanner.next();
                    System.out.print("Enter the model of the car you are returning: ");
                    String modelToReturn = scanner.next();
                    carRentalSystem.returnCar(makeToReturn, modelToReturn);
                    break;
                case 4:
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.next();
                    if (adminPassword.equals("admin")) {
                        carRentalSystem.displayOrders();
                    } else {
                        System.out.println("Invalid password. Access denied.");
                    }
                    break;
                case 5:
                    System.out.println("Thanks for choosing our ");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}