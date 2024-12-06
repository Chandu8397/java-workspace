package collections.demo;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :2:48:11 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public final class PlayerListTest {

	public static void main(String[] args) {
		
		PlayerList playerList= new PlayerList();
		
		playerList.addPlayer();
		playerList.display();
		playerList.search();
		playerList.extract();  
		playerList.display();

	}

}
