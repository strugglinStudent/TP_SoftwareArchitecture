package ISP;


public class SensingDoor implements Door,Sensing
{
    private boolean _locked;
    private boolean _opened;
    
    @Override
    public void sensing(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}