package ass3;

//******************************PART 2*****************************//

public class TFTPProtocol {

	private static TFTPProtocol instance; 
	private static boolean connected = false;
	public boolean isConnected() {
		return connected;
	}
	
	
	private TFTPProtocol() {
		connected = true;
	}
	
	
	public static TFTPProtocol getTFTPInstance() {
		
		if(instance==null) {
			instance=new TFTPProtocol();
			System.out.println("Create a new uuuu connection");

			return instance;
		}
		else {
			System.out.println("This Connection uuuuu Already Exists");
			return instance;
		}
		
	}
	
	public boolean releaseTFTP() {
		

		if(instance==null) {
			System.out.println("This Connection doesn't founded : ");
		}
		else {
			instance=null;
			System.out.println("This Connection Has Been Deleted : ");
			return true ;
		}
		
		return false;
		
	}
	
	public void sendMessage(String message) {
		System.out.println("I am sending a " + message + " vi TFTP Protocol");
		
	}
}
