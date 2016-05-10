package invoker;

import handler.ExecutionHandler;

public class Request {
	
	public static void main(String[] args){
		while(true){
			ExecutionHandler.requestForAccess(6000); // Request 6 Seconds Access
		}
	}
}
