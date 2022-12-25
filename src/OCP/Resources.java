package OCP;

abstract class Resources {

public enum ResourceType
{
    TIME_SLOT,
    SPACE_SLOT
}

public void markSlotFree(int resourceId)
    {
    }

public void markSlotBusy(int resourceId)
    {
    }

public int findFreeSlot()
    {
        return 0;
    }

}