package kodlamaio.hrms.business.abstracts;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Positions;

import java.util.List;

@Service
public interface PositionsService
{
	List<Positions> getPositions();

}
