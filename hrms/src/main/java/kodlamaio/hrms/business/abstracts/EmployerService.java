package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService 
{
	boolean checkEmployer(Employer employer);
	void addEmployer(Employer employer);
}
