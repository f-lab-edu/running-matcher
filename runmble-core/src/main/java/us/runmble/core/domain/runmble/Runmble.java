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

	public Runmble(RunmbleDto runmbleDto) {
		this.id = null;
		this.r1 = runmbleDto.r1();
		this.r2 = runmbleDto.r2();
		this.r3 = runmbleDto.r3();
		this.runningTime = runmbleDto.runningTime();
		this.runningIntensity = runmbleDto.runningIntensity();
		this.startTime = runmbleDto.startTime();
		this.status = runmbleDto.status();
		this.userId = runmbleDto.userId();
	}
}
