package acl.master1.game1.entity;

import acl.master1.game1.dto.CardDTO;
import acl.master1.game1.enums.GameState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer gameId;
	
	@Column
	Integer score;
	
	@Enumerated(EnumType.STRING)
	GameState state;
	
	@Column
	Integer playerId;
	
	@ManyToMany
	List<Card> pile;



}
