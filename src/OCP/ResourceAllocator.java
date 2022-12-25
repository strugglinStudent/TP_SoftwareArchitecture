package OCP;

public class ResourceAllocator 
{
	

    public int allocate(Resources resourcetype)
    {
        int resourceId;
        
            resourceId = resourcetype.findFreeSlot();
            resourcetype.markSlotBusy(resourceId);
            
        return resourceId;
    }

    public void free(Resources resourceType, int resourceId)
    {
        	 resourceType.markSlotFree(resourceId);
       
    }
}    

    