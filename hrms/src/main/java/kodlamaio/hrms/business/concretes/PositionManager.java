package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.dataAccess.abstracts.PositonsDao;
import kodlamaio.hrms.entities.concretes.Positions;

public class PositionManager implements PositionsService
{

	private PositonsDao positionsDao;
	
	@Autowired
	PositionManager(PositonsDao positionsDao) {
		super();
		this.positionsDao = positionsDao;
	}

    @Override
	public List<Positions> getPositions()
	{
		return this.positionsDao.findAll();
	}


	

}
