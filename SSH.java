package ass3;

class SSH implements protocol{

	
	//private instance of type SingConnection :
	private static SSH Ssh=null;
	
 
	// constructor
	private SSH() {
	}
	
	public static SSH getInstance() {
		
		if(Ssh==null) {
			Ssh=new SSH();
			System.out.println("Create a new connection");
			return Ssh;
			
		}
		else {
			System.out.println("This Connection Already Exists");
			return Ssh;
		}
	}
	
	public static boolean release() {
		
		if(Ssh==null) {
			System.out.println("This Connection doesn't founded : ");
		}
		else {
			Ssh=null;
			System.out.println("This Connection Has Been Deleted : ");
			return true ;
		}
		
		return false;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Sending" + message + " Via SSH Protocaol");
	}

	
}
