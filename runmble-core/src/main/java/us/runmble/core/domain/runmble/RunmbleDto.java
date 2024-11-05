package us.runmble.core.domain.runmble;

import java.time.LocalDateTime;

public record RunmbleDto(
	String r1,
	String r2,
	String r3,
	String runningTime,
	String runningIntensity,
	LocalDateTime startTime,
	RunmbleStatus status,
	Long userId
) {
}
