package acl.master1.game1.dto;

import acl.master1.game1.enums.Symbol;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO {

	Integer idCard;
	
	String value;
	
	Symbol symbol;
	
	Integer point;

	String path;
	
}
