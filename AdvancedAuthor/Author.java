package AdvancedAuthor;
//we are  making 1 author
public class Author {
	
	private String name;
	private int age;
	private String email;
	private char gender;
	
	public Author(String name, int age, String email, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.gender = gender;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
}
