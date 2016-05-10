package handler;

public class ExecutionHandler {
	public static void requestForAccess(int accessTime){
		long startTime = System.currentTimeMillis();
		long currentTime = startTime;
		if(!isRequestExceededLimit(currentTime)){
			currentTime = System.currentTimeMillis();
			try {
			    Thread.sleep(accessTime);     //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		else{
			System.out.println("You Exceeded Execution Limit \n");
		}
	}

	private static boolean isRequestExceededLimit(long currentTime) {
		if(currentTime>5000){
			return true;
		}
		else return false;
	}
}
