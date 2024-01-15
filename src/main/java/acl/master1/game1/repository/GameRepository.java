package acl.master1.game1.repository;

import acl.master1.game1.entity.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> {

	Game findByGameId(Integer id);
	
	List<Game> findAll();


	@Query("select g from Game g where g.playerId =: aclUserId")
	List<Game> findAllGameByAclUserId(Integer aclUserId);

	@Query("SELECT g FROM Game g WHERE g.state ='PROGRESS'")
	Game findGameInProgressByAclUserId(Integer aclUserId);

	@Query("SELECT g FROM Game g WHERE score =(SELECT min(score) FROM Game)")
	List<Game> findBestGameOfAclUserId(Integer aclUserId);
}
