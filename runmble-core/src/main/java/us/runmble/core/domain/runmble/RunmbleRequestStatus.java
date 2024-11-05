package us.runmble.core.domain.runmble;

public enum RunmbleRequestStatus {
	PENDING("대기 중"), ACCEPTED("수락됨"), REJECTED("거절됨");
	private final String message;

	RunmbleRequestStatus(String message) {
		this.message = message;
	}
}
