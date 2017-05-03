package com.teamapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamapp.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
