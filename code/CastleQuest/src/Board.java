
public class Board {

	private Space p1; //space where p1 is
	private Space p2; //space where p2 is
	private Space p3; //space where p3 is
	private Space p4; //space where p4 is
	private Space d; //space where d is
	
	//======================== ALL GAME SPACES =========================
	private Space[] spaces = new Space[67];
	public Board(){
		spaces[0] = new Space(0,"Throne Room","/resources/throne.png");
		spaces[1] = new Space(1,"Royal Staircase","/resources/staircase.png"); 
		spaces[2] = new Space(2,"Courtyard","/resources/courtyard.png"); 
		spaces[3] = new Space(3,"Castle Gates","/resources/gates.png"); 
		spaces[4] = new Space(4,"Forest","/resources/forest.png"); 
		
	}
	
	
	
	public void initialize(int numPlayers, Player play1, Player play2, Player play3, Player play4){
		
	}
	

}
