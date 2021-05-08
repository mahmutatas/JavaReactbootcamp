package nLayeredMembership.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import nLayeredMembership.business.abstracts.MemberService;
import nLayeredMembership.dataAccess.abstracts.MemberDao;
import nLayeredMembership.entities.concretes.Member;



public class MemberManager implements MemberService
{
	private MemberDao memberDao;
	
	public MemberManager(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}


	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private List<String> list;
	 

	@Override
	public boolean isNameValid(Member member)
	{
		if(member.getName().length() < 2 && member.getSurname().length() < 2) 
		{
			System.out.println("Name or Surname are invalid! Enter characters more than two,please!!");
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	
	public boolean isEmailValid(Member member) 
	{
		String checkMail = member.getEmail();
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		boolean result = pattern.matcher(checkMail).find();
		if(result) 
		{
			System.out.println("Email is valid. ");
			return true;
		}
		else 
		{
			System.out.println("Invalid email address!! ");			
			return false;
		}
	}

	@Override
	public boolean isPasswordValid(Member member)
	{
		if(member.getPassword().length() < 6) 
		{
			System.out.println("Invalid Password!! Enter characters more than six,please. ");
			return false;
		}
		else 
		{
			System.out.println("Password is valid. ");						
			return true;
		}
		
	}
	

	@Override
	public boolean checkMailInSystem(Member member)
	{
		list = null;
		list.add(member.getEmail());
		boolean result = false;
		
		for (int i = 0; i < list.size(); i++) 
		{
			if (member.getEmail() == list.get(i))
			{
				System.out.println("This email used from somebody!! ");
				result = true; 
				return result;
			}
		}
		return result;
	}
	
	@Override
	public void add(Member member) 
	{
		if ((isNameValid(member)) && (isEmailValid(member)) && (isPasswordValid(member))) 
		{
			this.memberDao.add(member);
		}
		else
		{
	
		}
	}

}
