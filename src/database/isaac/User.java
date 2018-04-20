package database.isaac;

public class User {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
public User() {
		super();
		// TODO Auto-generated constructor stub
	}

public void getAll(int id, String name, int age, String gender, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	int getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getGender() {
		return gender;
	}
	
	int getSalary() {
		return salary;
	}

	public String toString() {
		return id + " " + name + " " + age + " " + gender + " " + salary ;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
}
