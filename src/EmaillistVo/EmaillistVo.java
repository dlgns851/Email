package EmaillistVo;

public class EmaillistVo {

	
	private int no;
	private String lastName;
	private String firstname;
	private String email;
	
	
	public EmaillistVo(int no, String lastName, String firstname, String email) {
		super();
		this.no = no;
		this.lastName = lastName;
		this.firstname = firstname;
		this.email = email;
	}
	public EmaillistVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


	
	
}
