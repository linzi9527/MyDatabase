package database.isaac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	private BufferedReader bufferedReader;
	
	public Input() {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getInputLine() {
		String inputLine = null;
		try {
			inputLine = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputLine;
	}
}
