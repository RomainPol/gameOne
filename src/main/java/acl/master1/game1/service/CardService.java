package acl.master1.game1.service;


import acl.master1.game1.dto.CardDTO;
import acl.master1.game1.mapper.CardMapper;
import acl.master1.game1.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Autowired
	private CardMapper cardMapper;
	
	public CardDTO findById(Integer id) {
		return cardMapper.convert(cardRepository.findByIdCard(id));
	}
	
	public List<CardDTO> findAll(){
		return cardMapper.convert(cardRepository.findAll());
	}
	
	public CardDTO save(CardDTO cardDTO) {
		return cardMapper.convert(cardRepository.save(cardMapper.convert(cardDTO)));
	}

}
