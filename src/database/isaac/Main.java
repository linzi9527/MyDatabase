package database.isaac;

//Edition 0.6
// #0.5 kill BUG of DELETE #0.6 optimize SHOW & QUIT code 
// Before using it, the directory in QueryFile.java & WriteFile.java may be adjusted.

public class Main {
	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		ui.displayHelpWelcome();
		
		MainLooper mainLooper = new MainLooper();
		mainLooper.loop();
		
		
	}
}
