package acl.master1.game1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

	Integer idPlayer;
	
	Integer idAclUser; // From User micro service
	
	List<CardDTO> hand;
}
