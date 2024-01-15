package acl.master1.game1.service;

import acl.master1.game1.dto.GameDTO;
import acl.master1.game1.entity.Game;
import acl.master1.game1.mapper.GameMapper;
import acl.master1.game1.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

	@Autowired 
	private GameRepository gameRepository;
	@Autowired
	private CardService cardService;
	
	@Autowired
	private GameMapper gameMapper;

	public GameDTO findById(Integer id) {
		return gameMapper.convert(gameRepository.findByGameId(id));
	}
	
	public List<GameDTO> findAll(){
		return gameMapper.convert(gameRepository.findAll());
	}

	public List<GameDTO> findAllGameByAclUserId(Integer aclUserId) {
		return gameMapper.convert(gameRepository.findAllGameByAclUserId(aclUserId));
	}

	public GameDTO findGameInProgressByAclUserId(Integer aclUserId) {
		return gameMapper.convert(gameRepository.findGameInProgressByAclUserId(aclUserId));
	}

	public List<GameDTO> findBestGameOfAclUserId(Integer aclUserId) {
		return gameMapper.convert(gameRepository.findAllGameByAclUserId(aclUserId));
	}

	public GameDTO save(GameDTO gameDTO) {
		return gameMapper.convert(gameRepository.save(gameMapper.convert(gameDTO)));
	}
}