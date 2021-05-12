package kodlamaio.hrms.business.adapters;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSeriviceAdapter implements JobseekerService 
{
	@Override
	public boolean checkRealPerson(Jobseeker jobseeker) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean bool = false;
		try {
			
			bool = proxy.TCKimlikNoDogrula(Long.parseLong(jobseeker.getTcNo()), jobseeker.getName().toUpperCase(),jobseeker.getSurname().toUpperCase(), jobseeker.getBirthyear());
		} catch (Exception e) {
			System.out.println("Person informations are not True!! ");
		}
		return bool;		
	}

	@Override
	public void add(Jobseeker jobseeker) 
	{
		
	}
}
