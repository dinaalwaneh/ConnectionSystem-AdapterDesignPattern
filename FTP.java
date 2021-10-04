package ass3;

public class FTP implements protocol{

	//private instance of type SingConnection :
	private static FTP Ftp=null;
	
	// constructor
	private FTP() {
	}
	
	public static FTP getInstance() {
		
		if(Ftp==null) {
			Ftp=new FTP();
			System.out.println("Create a new connection");
			return Ftp;
		}
		else {
			System.out.println("This Connection Already Exists");
			return Ftp;
		}
	}
	
	public static boolean release() {
		
		if(Ftp==null) {
			System.out.println("This Connection doesn't founded : ");
		}
		else {
			Ftp=null;
			System.out.println("This Connection Has Been Deleted : ");
			return true ;
		}
		
		return false;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Sending" + message + " Via FTP Protocaol");
	}

	
}
