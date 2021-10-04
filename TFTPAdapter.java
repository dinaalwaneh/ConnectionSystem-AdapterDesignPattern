package ass3;


//******************************PART 2*****************************//
public class TFTPAdapter implements protocol{

		
	TFTPProtocol k=null;
	public TFTPAdapter(TFTPProtocol k) {
		this.k=k;
	}

	@Override
	public void send(String message) {
		
			this.k.sendMessage(message);
	}
	
}
