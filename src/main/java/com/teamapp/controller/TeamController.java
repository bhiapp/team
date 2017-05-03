package com.teamapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamapp.model.Team;
import com.teamapp.repository.TeamRepository;

@RestController
@RequestMapping("teams")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping
	public List<Team> getTeams() {
		return teamRepository.findAll();
	}

	@PostMapping
	public Team createTeam(@RequestBody Team team) {
		return teamRepository.save(team);
	}

	@PutMapping
	public Team updateTeam(@RequestBody Team team) {
		return teamRepository.save(team);
	}

	@DeleteMapping(path = "/{teamId}")
	public ResponseEntity<HttpStatus> deleteTeam(@PathVariable("teamId") Long teamId) {
		teamRepository.delete(teamId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}
