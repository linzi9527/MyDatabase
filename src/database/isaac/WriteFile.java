package database.isaac;

import java.io.*;

public class WriteFile {
	private FileWriter fileWriter = null;
	public void write(String buffer, boolean doAppend) {
		try {
			fileWriter = new FileWriter("./resources/Data.txt",doAppend);
			fileWriter.append(buffer+"\n");	// /home/hadoop/eclipse-workspace/MyDatabase
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
