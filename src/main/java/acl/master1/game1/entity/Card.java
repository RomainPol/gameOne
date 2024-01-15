package acl.master1.game1.entity;

import acl.master1.game1.enums.Symbol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer idCard;
	
	@Column 
	String value; // Can be One (1) or King (K)
	
	@Enumerated(EnumType.STRING)
	Symbol symbol;
	
	@Column 
	Integer point; // Card value One (1) is 11 points

	@Column
	String path;
}

