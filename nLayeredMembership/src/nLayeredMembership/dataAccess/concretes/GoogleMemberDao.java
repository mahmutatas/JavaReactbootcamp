package nLayeredMembership.dataAccess.concretes;


import nLayeredMembership.dataAccess.abstracts.MemberDao;
import nLayeredMembership.entities.concretes.Member;

public class GoogleMemberDao implements MemberDao
{


	@Override
	public void add(Member member)
	{
		System.out.println("Added new member with Google Account. ");		
	}

	@Override
	public void delete(Member member) 
	{
		System.out.println("Deleted new member with Google Account!! ");		
		
	}

}
