package acl.master1.game1.repository;

import acl.master1.game1.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

	Player findByIdPlayer(Integer id);
	
	List<Player> findAll();
}
