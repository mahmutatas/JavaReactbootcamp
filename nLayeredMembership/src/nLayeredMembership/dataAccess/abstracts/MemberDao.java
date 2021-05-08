package nLayeredMembership.dataAccess.abstracts;



import nLayeredMembership.entities.concretes.Member;

public interface MemberDao 
{
	void add(Member member);
	void delete(Member member);
}
