package ass3;

import java.util.List;


public class Main {

	public static void main(String[] args) {
	
	Connection connection=new Connection();
	
	protocol telnetConnection1 = Connection.getInstance(connection.TELNET);
	
	protocol telnetConnection2 = Connection.getInstance(connection.TELNET);
	
	protocol sshConnection1 = Connection.getInstance(connection.SSH);
	
	protocol httpConnection1 = Connection.getInstance(connection.HTTP);
	
	protocol scpConnection1 = Connection.getInstance(connection.SCP);
	
	protocol sshConnection2 = Connection.getInstance(connection.SSH);
	
	boolean isReleased=connection.release(connection.TELNET);
	 
	
	
	//******************************PART 2*****************************//
	protocol tftpConnection1 = Connection.getInstance(connection.TFTP);
	
	//******************************PART 2*****************************//
	protocol tftpConnection2 = Connection.getInstance(connection.TFTP);
	
	//protocol ftpConnection1 = Connection.getInstance(connection.FTP);
	List<String> currentConnecrion=Connection.list;
	
	System.out.println(currentConnecrion);
 
	
	sshConnection1.send(" Hello world ");
	
	//******************************PART 2*****************************//
	tftpConnection1.send(" Hello world ");
	
	boolean isReleased1=connection.release(connection.TFTP);
	
	System.out.println(currentConnecrion);
	}
}
