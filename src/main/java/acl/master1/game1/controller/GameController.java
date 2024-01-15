package acl.master1.game1.controller;

import acl.master1.game1.dto.GameDTO;
import acl.master1.game1.entity.Game;
import acl.master1.game1.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
	allowCredentials = "true",
	origins = {"http://localhost:8081", "http://localhost:4200", "http://localhost:8888"},
	methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST})

@RequestMapping({"/game1Jeu"})
@RestController
public class GameController {

	@Autowired
	private GameService gameService;


	@GetMapping({"/{id}"})
	public @ResponseBody
	GameDTO findById(@PathVariable("id") Integer id) {
		return this.gameService.findById(id);
	}

	@GetMapping({"", "/"})
	public @ResponseBody
	List<GameDTO> findAll(){
		return this.gameService.findAll();
	}

	@GetMapping("/load")
	public List<GameDTO> findAllGameByAclUserId(Integer aclUserId) {
		return this.gameService.findAllGameByAclUserId(aclUserId);
	}

	@GetMapping("/progress")
	public GameDTO findGameInProgressByAclUserId(Integer aclUserId) {
		System.out.println("progress reached !");
		System.out.println(this.gameService.findGameInProgressByAclUserId(aclUserId));
		return this.gameService.findGameInProgressByAclUserId(aclUserId);
	}

	@PostMapping("/save")
	@PutMapping("/save")
	public @ResponseBody
	GameDTO save(@RequestBody GameDTO gameDTO) {
		System.out.println("I receive a save request");
		System.out.println(gameDTO.toString());
		return gameService.save(gameDTO);
	}
}
