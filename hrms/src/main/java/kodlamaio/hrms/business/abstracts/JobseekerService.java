package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService 
{
	boolean checkRealPerson(Jobseeker jobseeker);
	void add(Jobseeker jobseeker);
	
}
