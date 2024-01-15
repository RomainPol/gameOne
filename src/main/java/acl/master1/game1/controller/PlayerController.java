package acl.master1.game1.controller;

import acl.master1.game1.dto.PlayerDTO;
import acl.master1.game1.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
	allowCredentials = "true",
	origins = {"http://localhost:8081", "http://localhost:4200", "http://localhost:8888"},
	methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST})

@RequestMapping({"/player"})
@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;


	@GetMapping({"/{id}"})
	public @ResponseBody
	PlayerDTO findById(@PathVariable("id") Integer id) {
		return this.playerService.findById(id);
	}

	@GetMapping({"", "/"})
	public @ResponseBody
	List<PlayerDTO> findAll(){
		return this.playerService.findAll();
	}

	@PostMapping("/register")
	@PutMapping("/register")
	public @ResponseBody
	PlayerDTO save(@RequestBody PlayerDTO playerDTO) {
		System.out.println("I recieve a save request");
		return playerService.save(playerDTO);
	}
}
