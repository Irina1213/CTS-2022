package Builder;

public class User {

	//Builder-creational DP
	
	//mandatory
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	
	//optional
	private String phoneNo;
	private String address;
	private String birthdate;
	
	public User (UserBuilder u) {
		//mandatory
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		
	    //optional
		this.address = u.address;
		this.birthdate = u.birthdate;
		this.phoneNo =u.phoneNo;
	}
	
	public class UserBuilder {
		
		//mandatory
		private String username;
		private String email;
		private String firstName;
		private String lastName;
		
		//optional
		private String phoneNo;
		private String address;
		private String birthdate;
		
		public UserBuilder(String username, String email, String firstName, String lastName) {
			
			this.username = username;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder birthdate (String birthdate) {
			this.birthdate = birthdate;
			return this;
			
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
			
		}
		
		public UserBuilder phoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
			
		}
		
		public User build() {
			
			User  u = new User(this);
			return u;
		}
	}
	

	

}
