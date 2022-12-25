package LSP;

public class ElectronicDuck 
{
    private static boolean _on = false;

   
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }
    public boolean isOn()
    {
        return _on;
    }
    
    public void turnOff()
    {
        _on = false;
    }
}
