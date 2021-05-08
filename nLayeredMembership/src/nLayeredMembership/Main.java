package nLayeredMembership;

import nLayeredMembership.entities.concretes.Member;
import nLayeredMembership.business.abstracts.MemberService;
import nLayeredMembership.business.concretes.MemberManager;
import nLayeredMembership.dataAccess.concretes.GoogleMemberDao;

public class Main 
{

	public static void main(String[] args) 
	{
		Member member = new Member("Mahmut","Ataş","mahmut_atas03@hotmail.com","123456");
		
		MemberService memberService = new MemberManager(new GoogleMemberDao());
		memberService.add(member);

	}

}
