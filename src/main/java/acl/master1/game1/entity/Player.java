package acl.master1.game1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer idPlayer;
	
	@Column
	Integer idAclUser; // From User micro service
	
	@OneToMany(cascade = CascadeType.MERGE)
	List<Card> hand;
	
	
}
