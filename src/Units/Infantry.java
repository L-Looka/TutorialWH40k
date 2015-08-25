package Units;

public class Infantry implements SpecialRule 
{
	private String Name;
	private int WS = 0;
	private int BS = 0;
	private int S = 0;
	private int T = 0;
	private int W = 0;
	private int I = 0;
	private int A = 0;
	private int Ld = 0;
	private int Save = 7;
	
	public Infantry (String Name, int WS, int BS, int S, int T,  int W, int I, int A, int Ld, int Save){
		this.Name = Name;
		this.WS = WS;
		this.BS = BS;
		this.S = S;
		this.T = T;
		this.W = W;
		this.I = I;
		this.A = A;
		this.Ld = Ld;
		this.Save = Save;
	}
	public Infantry (){}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getWS() {
		return WS;
	}
	public void setWS(int wS) {
		WS = wS;
	}
	public int getBS() {
		return BS;
	}
	public void setBS(int bS) {
		BS = bS;
	}
	public int getS() {
		return S;
	}
	public void setS(int s) {
		S = s;
	}
	public int getT() {
		return T;
	}
	public void setT(int t) {
		T = t;
	}
	public int getW() {
		return W;
	}
	public void setW(int w) {
		W = w;
	}
	public int getI() {
		return I;
	}
	public void setI(int i) {
		I = i;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getLd() {
		return Ld;
	}
	public void setLd(int ld) {
		Ld = ld;
	}
	public int getSave() {
		return Save;
	}
	public void setSave(int save) {
		Save = save;
	}
	public String [] Header (){
		String [] x = new String [11];
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
		x[10] = "Type";
		return x;
	}
	public String [] toPrint (){
		String [] x = new String [11];
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
		x[10] = Type();
		return x;
	}
}
