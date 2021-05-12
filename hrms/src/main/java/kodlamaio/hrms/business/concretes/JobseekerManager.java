package kodlamaio.hrms.business.concretes;

import java.util.Iterator;

import com.sun.tools.javac.util.List;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.entities.concretes.Jobseeker;

public class JobseekerManager implements JobseekerService
{

	@Override
	public boolean checkRealPerson(Jobseeker jobseeker) 
	{
		return true;
	}

	@Override
	public void add(Jobseeker jobseeker)
	{
		String query = "INSERT INTO jobseeker(tcno,id,name,surname,birthyear,password,email) "
				+ "VALUES ("+
						jobseeker.getTcNo() + ",'" + jobseeker.getId() + ",'"  + ",'" + jobseeker.getName() + ",'" + ",'" + jobseeker.getSurname() + ",'" +
						",'" + jobseeker.getBirthyear() + ",'" + jobseeker.getPassword() + ",'" + ",'" + jobseeker.getEmail() + ",'" + "')";
		
		List<String> emails = null;
		for (int i = 0; i < emails.length(); i++) 
		{
			emails.add(jobseeker.getEmail());
		}
		for (int j = 0; j < emails.length(); j++)
		{
			if(emails.contains(jobseeker.getEmail())) 
			{
				System.out.println("Exist the email address. Try another one!! ");
			}			
		}
	}

}
