package acl.master1.game1.controller;

import acl.master1.game1.dto.CardDTO;
import acl.master1.game1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(
	allowCredentials = "true",
	origins = {"http://localhost:8081", "http://localhost:4200", "http://localhost:8888"},
	methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST})

@RequestMapping({"/card"})
@RestController
public class CardController {

	@Autowired
	private CardService cardService;


	@GetMapping({"/{id}"})
	public @ResponseBody
	CardDTO findById(@PathVariable("id") Integer id) {
		return this.cardService.findById(id);
	}

	@GetMapping({"", "/"})
	public @ResponseBody
	List<CardDTO> findAll(){
		System.out.println("method reached");
		return this.cardService.findAll();
	}

	@PostMapping("/register")
	@PutMapping("/register")
	public @ResponseBody
	CardDTO save(@RequestBody CardDTO cardDTO) {
		System.out.println("I recieve a save request");
		return cardService.save(cardDTO);
	}
}
