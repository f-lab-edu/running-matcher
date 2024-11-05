package us.runmble.core.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import us.runmble.core.domain.runmble.Runmble;
import us.runmble.core.domain.runmble.RunmbleDto;
import us.runmble.core.repository.runmble.RunmbleRepository;

@Service
@RequiredArgsConstructor
public class RunmbleServiceImpl implements RunmbleService {

	private final RunmbleRepository runmbleRepository;

	@Override
	public Runmble createRunmble(RunmbleDto runmbleDto) {
		Runmble runmble = new Runmble(runmbleDto);
		return runmbleRepository.save(runmble);
	}
}
