package kodlamaio.hrms.api.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.Positions;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/user")
public class UsersController 
{
	private PositionsService positionsService;
	
	@Autowired
	public UsersController(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}

	@GetMapping("/getpositions")
	public List<Positions> getPositions()
	{
		return this.positionsService.getPositions();
	}

}
