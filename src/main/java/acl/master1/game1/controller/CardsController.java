package acl.master1.game1.controller;

import acl.master1.game1.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
allowCredentials = "true",
origins = {"http://localhost:8081", "http://localhost:4200", "http://localhost:8888"},
methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST})

@RequestMapping({"/cards"})
@RestController
public class CardsController {

	@Autowired
	private CardsService cardsService;


}

