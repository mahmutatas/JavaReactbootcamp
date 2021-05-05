package Concrete;

import Entities.Gamers;

public class GamersManager 
{
	public void addGamer(Gamers gamer)
	{
		gamer.setTcNo("012345678901");
		gamer.setName("Mahmut");
		gamer.setSurname("Ataş");
		gamer.setBirthYear(1111);
		gamer.setMailAdresses("mahmut_atas03@hotmail.com");
		gamer.setNickname("engineer");
		
		System.out.println("Added gamer to system! " + gamer.getName());
	}
	
	public void showGamerDetails(Gamers gamer) 
	{
		System.out.println("Gamer Tc: " + gamer.getTcNo());
		System.out.println("Gamer Name: " + gamer.getName());
		System.out.println("Gamer Surname: " + gamer.getSurname());
		System.out.println("Gamer Mail Adresess: " + gamer.getMailAdresses());
		System.out.println("Gamer Nickname: " + gamer.getNickname());
	}
}
