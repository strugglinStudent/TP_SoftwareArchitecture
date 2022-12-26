package SRP;
import java.util.*;

public class CarManager
{
	Garage garage = new Garage(); 
	
	public  void addCars (Car... newCars ) {
		garage.addCars(newCars);
	}
	
    public Car getFromDb(final String carId)
    {
    	return garage.getFromDb(carId);
    }

    public String getCarsNames()
    {
    	return garage.getCarsNames();
    }
    
	
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : garage.getCarsDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

    
    
    
    

    public static void main(String[] args)
    {
    CarManager manager = new CarManager();
    manager.addCars(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"), new Car("3", "Megane", "Renault")) ;
    manager.getBestCar().getName();
    }


}

