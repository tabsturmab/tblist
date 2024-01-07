package com.tadsturmab.tblist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tadsturmab.tblist.dto.GameListDTO;
import com.tadsturmab.tblist.dto.GameMinDTO;
import com.tadsturmab.tblist.entities.GameList;
import com.tadsturmab.tblist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
		
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
