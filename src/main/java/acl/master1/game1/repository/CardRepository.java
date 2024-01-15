package acl.master1.game1.repository;

import acl.master1.game1.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card, Integer> {

	Card findByIdCard(Integer id);
	
	List<Card> findAll();
}
