package acl.master1.game1.mapper;

import acl.master1.game1.dto.GameDTO;
import acl.master1.game1.entity.Game;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper {

	GameDTO convert(Game game);
	
	List<GameDTO> convert(List<Game> games);
	
	Game convert(GameDTO gameDTO);
} 
