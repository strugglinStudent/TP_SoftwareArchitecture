package DIP;
import java.io.IOException;

public class EncodingModuleClient
{
    public void encode (EncodingModule  encodingModule ) throws IOException {
    	encodingModule.encode();
    }
	
	public static void main(String[] args) throws IOException
    {
		EncodingModuleClient encodingModuleClient = new EncodingModuleClient();
		encodingModuleClient.encode(new ModuleWithFiles());
		encodingModuleClient.encode(new ModuleBasedOnNetworkAndDatabase());
    }
}

