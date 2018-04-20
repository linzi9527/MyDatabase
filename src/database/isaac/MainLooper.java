package database.isaac;

public class MainLooper {
	private boolean flag = true;
	private Input ip = null;
	private CheckCmd checkCmd = null;

	public MainLooper() {
		super();
		ip = new Input();
	}
	
	public void loop() {
		ip = new Input();
		checkCmd = new CheckCmd();
		int checkReturn;
		String ipStream;
		while(flag) {
			ipStream = ip.getInputLine();
			checkReturn = checkCmd.check(ipStream);
			if(checkReturn == -1) {
				flag = false;
			}
			
		}
	}
}
