package database.isaac;

public class UserInterface {
	private IOProperties io = new IOProperties();
	
	public void displayHelpWelcome() {
		io.getProperties("welcome");
	}

	public void displayHelpAdd() {
		io.getProperties("add");
	}
	
	public void displayHelpDelete() {
		io.getProperties("delete");
	}

	public void displayHelpUpdate() {
		io.getProperties("update");
	}

	public void displayHelpQuery() {
		io.getProperties("query");
	}
	
	public void displayHelpShow() {
		io.getProperties("show");
	}
	
	public void displayHelpShowTable() {
		io.getProperties("tables");
	}
	
	public void displayHelpQuit() {
		io.getProperties("quit");
	}

	public void displayHelpError() {
		io.getProperties("error");
	}
	
	public void displayTableHead() {
		io.getProperties("tablehead");
	}
	
	public void displayQueryFail() {
		io.getProperties("queryfail");
	}
	
	public void displayMembExit() {
		io.getProperties("membexist");
	}
	
	public void displayUserInfo(User user) {
		System.out.println("id:"+user.getId()+"  name:"+user.getName()+"  age:"+user.getAge()+"  gender:"+
				user.getGender()+"  salary:"+user.getSalary());
	}
}
