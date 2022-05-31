package caseStudy.searchMicroservices.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document (collection = "userDetails")
public class UserDetailsmodel {
	
	
	@Id
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetailsmodel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserDetailsmodel() {
		
	}
	
	
	

}
