package us.runmble.core.domain.runmble;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("runmbles")
public class Runmble {
	@Id
	private Long id;
	private String r1;
	private String r2;
	private String r3;
	private String runningTime;
	private String runningIntensity;
	private LocalDateTime startTime;
	private RunmbleStatus status;
	private Long userId;
}
