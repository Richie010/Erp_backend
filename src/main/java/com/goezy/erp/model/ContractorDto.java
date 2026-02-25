package com.goezy.erp.model;

import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class ContractorDto {
	
	private Long custid;
	private String firstname;
	private String lastname;
	private String email;
	private Long mobile;
	private String address1;
	private String address2;
	private String destination;
	private String country;
	private Date dateofjoin;
	private Date dateofbirth;
	private String loginid;
	private String password;
	private String entitytype;
	private Long appid;

	

}
