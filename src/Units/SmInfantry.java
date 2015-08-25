package Units;

public class SmInfantry extends Infantry{
		
	private String ChapterTactics = "SM";

	
	public SmInfantry (String Name, int WS, int BS, int S, int T,  int W, int I, int A, int Ld, int Save, String ChapterTactics){
		super (Name,WS,BS,S,T,W,I,A,Ld,Save);
		this.ChapterTactics = ChapterTactics;
	}
	public SmInfantry (){}
	
	public String getChapterTactics() {
		return ChapterTactics;
	}
	public void setChapterTactics(String chapterTactics) {
		ChapterTactics = chapterTactics;
	}
	public boolean CombatSquads() {
		return true;
	}
	public boolean AndTheyShallKnowNoFear() {
		return true;
	}

	


	public String [] Header (){
		String [] x = new String [12];
		x[0] = "Name";
		x[1] = "WS";
		x[2] = "BS";
		x[3] = "S";
		x[4] = "T";
		x[5] = "W";
		x[6] = "I";
		x[7] = "A";
		x[8] = "Ld";
		x[9] = "Save";
		x[10] = "ChapterTactics";
		x[11] = "Type";
		return x;
	}
	public String [] toPrint (){
		String [] x = new String [12];
		x[0] = getName();
		x[1] = "" + getWS();
		x[2] = "" + getBS();
		x[3] = "" + getS();
		x[4] = "" + getT();
		x[5] = "" + getW();
		x[6] = "" + getI();
		x[7] = "" + getA();
		x[8] = "" + getLd();
		x[9] = "" + getSave()+"+";
		x[10] = ChapterTactics; 
		x[11] = Type();
		return x;
	}
	
}
