package in.kunal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "member")
public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotEmpty(message = "*Please select member type")
	@NotNull(message = "*Please select member type")
	@Column(name = "type")
	private String type;
	
	@NotEmpty(message = "*Please enter fisrt name")
	@NotNull(message = "*Please enter fisrt name")
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty(message = "*Please enter middle name")
	@NotNull(message = "*Please enter middle name")
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@NotEmpty(message = "*Please select gender")
	@NotNull(message = "*Please select gender")
	@Column(name = "gender")
	private String gender;
	
	@NotNull(message = "*Please enter birth date")
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "joining_date")
	private Date joiningDate;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "email")
	private String email;

	public Member(Long id,
			@NotEmpty(message = "*Please select member type") @NotNull(message = "*Please select member type") String type,
			@NotEmpty(message = "*Please enter fisrt name") @NotNull(message = "*Please enter fisrt name") String firstName,
			@NotEmpty(message = "*Please enter middle name") @NotNull(message = "*Please enter middle name") String middleName,
			String lastName,
			@NotEmpty(message = "*Please select gender") @NotNull(message = "*Please select gender") String gender,
			@NotNull(message = "*Please enter birth date") LocalDate dateOfBirth, Date joiningDate, String contact,
			String email) {
		super();
		this.id = id;
		this.type = type;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		this.contact = contact;
		this.email = email;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
