package us.runmble.core.controller.runmble;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import us.runmble.core.domain.runmble.Runmble;
import us.runmble.core.domain.runmble.RunmbleDto;
import us.runmble.core.service.RunmbleService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/runmbles")
public class RunmbleController {

	private final RunmbleService runmbleService;

	@PostMapping
	public ResponseEntity<Runmble> createRunmble(@RequestBody RunmbleDto runmbleDto) {
		Runmble runmble = runmbleService.createRunmble(runmbleDto);

		return ResponseEntity.ok().build();
	}
}
