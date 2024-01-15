package acl.master1.game1.mapper;

import acl.master1.game1.dto.CardDTO;
import acl.master1.game1.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CardMapper {

	CardDTO convert(Card card); 
	
	List<CardDTO> convert(List<Card> cards);
	
	Card convert(CardDTO cardDTO);
}
