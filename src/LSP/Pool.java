package LSP;

import java.util.ArrayList;

public class Pool
{
    public void run()
    {
    	Duck donaldDuck = new Duck();
    	ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck);
        quack(electricDuck);
        swim(donaldDuck);
        swim(electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
        	duck.quack();
        	}  
    }
    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
        	if(!duck.isOn())duck.turnOn();
        	duck.quack();
        	}  
    }
    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
        	duck.swim();
        }
    }
    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
        	if(!duck.isOn())duck.turnOn();
         	duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
