package kodlamaio.hrms.business.concretes;

import java.sql.DriverManager;

import com.sun.tools.javac.util.List;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService 
{
	@Override
	public boolean checkEmployer(Employer employer)
	{
		return false;
	}

	@Override
	public void addEmployer(Employer employer) 
	{
		String query = "INSERT INTO employer(id,password, email, company_name, web_site, phone_number) "
				+ "VALUES ("+
						employer.getId() + ",'" + employer.getPassword() + ",'"  + ",'" + employer.getEmail() + ",'" + ",'" + employer.getCompanyName() + ",'" +
						",'" + employer.getWebSite() + ",'" + employer.getPhoneNo() + ",'" + "')";
		
		List<String> emails = null;
		for (int i = 0; i < emails.length(); i++) 
		{
			emails.add(employer.getEmail());
		}
		for (int j = 0; j < emails.length(); j++)
		{
			if(emails.contains(employer.getEmail())) 
			{
				System.out.println("Exist the email address. Try another one!! ");
			}			
		}
	}

}
