package cyclestore.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@NotBlank
	private String userName;
	@NotBlank
	private String password;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String address;
	@Pattern(regexp = "(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
	private String phoneNumber;
	
	private boolean enabled;
	
	public User() {
		
	}
	
	public User(User user) {
		this.userId = user.userId;
		this.userName = user.userName;
		this.password = user.password;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.email = user.email;
		this.address = user.address;
		this.phoneNumber = user.phoneNumber;
		this.enabled = user.enabled;
	}

	
	public Long getUserId() {
		return userId;
	}
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public String toString() {
		return "User [id=" + userId + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", enabled=" + enabled + "]";
	}
	
	
	
}
