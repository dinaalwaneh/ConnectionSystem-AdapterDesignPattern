package ass3;

public class SCP implements protocol{


	//private instance of type SingConnection :
	private static SCP Scp=null;
	
	// constructor
	private SCP() {
	}
	
	public static SCP getInstance() {
		
		if(Scp==null) {
			Scp=new SCP();
			System.out.println("Create a new connection");
			return Scp;
		}
		else {
			System.out.println("This Connection Already Exists");
			return Scp;
		}
	}
	
	public static boolean release() {
		
		if(Scp==null) {
			System.out.println("This Connection doesn't founded : ");
		}
		else {
			Scp=null;
			System.out.println("This Connection Has Been Deleted : ");
			return true ;
		}
		
		return false;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Sending" + message + " Via SCP Protocaol");
	}

	

}
