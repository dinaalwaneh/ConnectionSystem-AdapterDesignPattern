package ass3;

import java.util.ArrayList;
import java.util.List;

 

public class Connection {

	
	static protocol p1,p2,p3,p4,p5,p6;
	
	// definition all protocols as static variable
	public static final String HTTP = "HTTP";
	public static final String SSH = "SSH";
	public static final String TELNET = "TELNET";
	public static final String SCP = "SCP";
	public static final String FTP = "FTP";
	public static final String TFTP = "TFTP";

	public static int Connection_count = 0;
	public static List<String> list = new ArrayList<String>();

	public static protocol getInstance(String ConnectionProtocol) {

		 
		
		if(ConnectionProtocol==SSH) {
			 
			if((Connection_count<3||(list.contains("SSH")))) {
				if(p1==null) {
				    p1=((SSH)p1).getInstance();
					Connection_count++;
					list.add("SSH");
					
				}
			 
				else
				{
					System.out.println("object SSH has been founded :) ");
				}
				
			}
			else
			{
				System.out.println("connection is more than 3 :");
				
			}
			
				
			return p1;
		}else if(ConnectionProtocol==TELNET) {
			if((Connection_count<3||(list.contains(TELNET)))) {
				if(p2==null) {
				    p2=((TELNET)p2).getInstance();
					Connection_count++;
					list.add("TELNET");
				}
				else
				{
					System.out.println("object TELNET has been founded :) ");
				}
		}
		else
		{
			System.out.println("Sorry, You Can't Create More Than 3 Conncetions!:");
			
		}
		
			
			 return p2;
			
		}else if(ConnectionProtocol==HTTP) {
			if((Connection_count<3||(list.contains(HTTP)))) {
				if(p3==null) {
					p3=((HTTP)p3).getInstance();
					Connection_count++;
					list.add(HTTP);
				}
				else
				{
					System.out.println("object HTTP has been founded :) ");
				}
			    
				
		}
		else
		{
			System.out.println("Sorry, You Can't Create More Than 3 Conncetions!:");
			
		}
		
			
			 return p3;
		}else if(ConnectionProtocol==FTP) {
			if((Connection_count<3||(list.contains(FTP)))) {
				if(p4==null) {
					p4=((FTP)p4).getInstance();
					Connection_count++;
					list.add(FTP);
				}
				else
				{
					System.out.println("object FTP has been founded :) ");
				}
			    
				
		}
		else
		{
			System.out.println("Sorry, You Can't Create More Than 3 Conncetions!:");
			
		}
		
			
			 return p4;
		}else if(ConnectionProtocol==SCP) {
			if((Connection_count<3||(list.contains(SCP)))) {
				if(p5==null) {
					p5=((SCP)p5).getInstance();
					Connection_count++;
					list.add(SCP);
				}
				else
				{
					System.out.println("object SCP has been founded :) ");
				}
			    
				
		}
		else
		{
			System.out.println("Sorry, You Can't Create More Than 3 Conncetions!:");
			
		}
		
			
			 return p5;
		}else if(ConnectionProtocol==TFTP) {
			if((Connection_count<3||(list.contains(TFTP)))) {
				if(p6==null) {
					
					protocol ftpConnection2 = new TFTPAdapter(TFTPProtocol.getTFTPInstance());
					p6=ftpConnection2;
					Connection_count++;
					list.add(TFTP);
				}
				else
				{
					System.out.println("object TFTP has been founded :) ");
				}
			    
				
		}
		else
		{
			System.out.println("Sorry, You Can't Create More Than 3 Conncetions!:");
			
		}
		
			
			 return p6;
		}else {
			System.out.println("protocol is not founded :( ");
		}
		 
		return null;
		
	}
	
	//delete specific connection and return true :
	public static boolean release(String ConnectionProtocol) {
			 
			if(ConnectionProtocol==SSH) {

				((SSH) p1).release();
				 
				if(p1!=null) {
					
					list.remove("SSH");
					Connection_count--;
					return true;
				  
				}
				
				
			}else if(ConnectionProtocol==TELNET) {
				
				((TELNET) p2).release();
				 
				if(p2!=null) {
	
					list.remove("TELNET");
					Connection_count--;
				 
					return true;
				  
				}
				
				
			}else if(ConnectionProtocol==HTTP) {
				
				((HTTP) p3).release();
				if(p3!=null) {
	
					list.remove("HTTP");
					Connection_count--;
					return true;
				  
				}
				
				
			}else if(ConnectionProtocol==FTP) {
				((FTP) p4).release();
				if(p4!=null) {
					 
					list.remove("FTP");
					Connection_count--;
					return true;
				  
				}
				
				
			}else if(ConnectionProtocol==SCP) {
				
				((SCP) p5).release();
				if(p5!=null) {

					list.remove("SCP");
					Connection_count--;
					return true;
				  
				}
				
			 
				
			}else if(ConnectionProtocol==TFTP) {
				if(p6!=null) {
					
					((TFTPAdapter) p6).k.releaseTFTP();
					 
					list.remove("TFTP");
					Connection_count--;
					return true;
				  
				}
				else {
					System.out.println("This Connection doesn't founded : ");
				}
				
			}
			
			return false ;
			
		}
	
	
}
