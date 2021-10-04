package ass3;

public class HTTP implements protocol{

	//private instance of type SingConnection :
		private static HTTP Http=null;
		
		// constructor
		private HTTP() {
		}
		
		public static HTTP getInstance() {
			
			if(Http==null) {
				Http=new HTTP();
				System.out.println("Create a new connection");
				return Http;
			}
			else {
				System.out.println("This Connection Already Exists");
				return Http;
			}
		}
		
		public static boolean release() {
			
			if(Http==null) {
				System.out.println("This Connection doesn't founded : ");
			}
			else {
				Http=null;
				System.out.println("This Connection Has Been Deleted : ");
				return true ;
			}
			
			return false;
		}
		
		@Override
		public void send(String message) {
			System.out.println("Sending" + message + " Via HTTP Protocaol");
		}

		

}
