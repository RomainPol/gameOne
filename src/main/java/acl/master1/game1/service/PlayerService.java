package acl.master1.game1.service;

import acl.master1.game1.dto.PlayerDTO;
import acl.master1.game1.mapper.PlayerMapper;
import acl.master1.game1.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private PlayerMapper playerMapper;
	
	public PlayerDTO findById(Integer id) {
		return playerMapper.convert(playerRepository.findByIdPlayer(id));
	}
	
	public List<PlayerDTO> findAll(){
		return playerMapper.convert(playerRepository.findAll());
	}
	
	public PlayerDTO save(PlayerDTO playerDTO) {
		return playerMapper.convert(playerRepository.save(playerMapper.convert(playerDTO)));
	}
	

}
