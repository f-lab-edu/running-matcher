package us.runmble.core.domain.runmble;

public enum RunmbleStatus {
	PENDING("대기 중"), MATCHED("매칭 성공"), CANCELED("매칭 취소"), TIMEOUT("매칭 만료");

	private final String value;

	RunmbleStatus(String value) {
		this.value = value;
	}
}
