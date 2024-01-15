package acl.master1.game1.dto;

import acl.master1.game1.entity.Card;
import acl.master1.game1.enums.GameState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

	Integer gameId;

	Integer playerId;

	Integer score;

	GameState state;

	Card[] pile;
}
