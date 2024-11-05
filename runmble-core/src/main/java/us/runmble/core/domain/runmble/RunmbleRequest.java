package us.runmble.core.domain.runmble;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("runmble_requests")
public class RunmbleRequest {
	@Id
	private Long id;
	private Long runmbleId;
	private Long requesterId;
	private LocalDateTime requestTime;
	private RunmbleRequestStatus status;
}
