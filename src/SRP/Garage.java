package SRP;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private ArrayList<Car> _carsDb = new ArrayList<Car>();


    public  void addCars (Car... newCars )   
    {
        for (Car newcar : newCars) {
        _carsDb.add(newcar);
        }

    }
    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
    
    public ArrayList<Car> getCarsDb()
    {
        return _carsDb;
    }
}
