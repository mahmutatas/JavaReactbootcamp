package nLayeredMembership.dataAccess.concretes;


import nLayeredMembership.dataAccess.abstracts.MemberDao;
import nLayeredMembership.entities.concretes.Member;

public class HipernateMemberDao implements MemberDao
{

	

	@Override
	public void add(Member member) 
	{
		System.out.println("New member saved with Hipernate!");		
	}

	@Override
	public void delete(Member member)
	{
		System.out.println("The member deleted with Hipernate!!");	
	}


	
}
