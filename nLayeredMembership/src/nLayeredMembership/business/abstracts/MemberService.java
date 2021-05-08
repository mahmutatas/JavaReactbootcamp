package nLayeredMembership.business.abstracts;


import nLayeredMembership.entities.concretes.Member;

public interface MemberService 
{
	void add(Member member);
	
	boolean isNameValid(Member member);
	boolean isEmailValid(Member member);
	boolean isPasswordValid(Member member);
	boolean checkMailInSystem(Member member);
}
