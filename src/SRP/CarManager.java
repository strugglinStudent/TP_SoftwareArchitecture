package SRP;
import java.util.*;

public class CarManager
{
    private List<Car> _carsDb = new ArrayList<Car>();

    public  void addCar (final String carId, String carModel, String carBrand )   
    {
        Car newCar = new Car(carId, carModel, carBrand);
        _carsDb.add(newCar);

    }
    public  void addCars (List<Car> newCars )   
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

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
    

    public static void main(String[] args)
    {
    CarManager manager = new CarManager();
    manager.addCars(Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"), new Car("3", "Megane", "Renault")) );
    }
}

