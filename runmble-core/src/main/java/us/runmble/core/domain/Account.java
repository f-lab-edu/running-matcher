package us.runmble.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import us.runmble.core.domain.user.User;

@Table("accounts")
public class Account {
	@Id
	private Long id;
	private String email;
	private String provider;
	private String providerId;
	private User user;
}
