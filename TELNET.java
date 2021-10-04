package ass3;

public class TELNET implements protocol{

	//private instance of type SingConnection :
	private static TELNET Telnet=null;
	
	// constructor
	private TELNET() {
	}
	
	public static TELNET getInstance() {
		
		if(Telnet==null) {
			Telnet=new TELNET();
			System.out.println("Create a new connection");

			return Telnet;
		}
		else {
			System.out.println("This Connection Already Exists");
			return Telnet;
		}
	}
	
	public static boolean release() {
		
		if(Telnet==null) {
			System.out.println("This Connection doesn't founded : ");
		}
		else {
			Telnet=null;
			System.out.println("This Connection Has Been Deleted : ");
			return true ;
		}
		
		return false;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Sending" + message + " Via TELNET Protocaol");
	}

	

}
