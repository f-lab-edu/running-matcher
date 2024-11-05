package us.runmble.core.service;

import us.runmble.core.domain.runmble.Runmble;
import us.runmble.core.domain.runmble.RunmbleDto;

public interface RunmbleService {
	Runmble createRunmble(RunmbleDto runmbleDto);
}
