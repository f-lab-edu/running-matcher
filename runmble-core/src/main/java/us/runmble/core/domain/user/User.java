package us.runmble.core.domain.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import us.runmble.core.domain.Account;

@Table("users")
public class User {
	@Id
	private Long id;
	private String name;
	private final List<Account> accounts = new ArrayList<>();
}



