package acl.master1.game1.mapper;

import acl.master1.game1.dto.PlayerDTO;
import acl.master1.game1.entity.Player;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {

	PlayerDTO convert(Player player);
	
	List<PlayerDTO> convert(List<Player> players);
	
	Player convert(PlayerDTO playerDTO); 
}
