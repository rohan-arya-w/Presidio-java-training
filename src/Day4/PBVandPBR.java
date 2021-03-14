package Day4;

public class PBVandPBR {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		System.out.println("size of og Laddu"+laddu.size);
		PassByValue pbv = new PassByValue();
		pbv.getLaddu(laddu.size);
		System.out.println("size of laddu after PBV..."+laddu.size);
		PassByRef pbr=new PassByRef();
		pbr.getLaddu(laddu);
		System.out.println("size of laddu after PBR..."+laddu.size);
	}
}

class Laddu{
	int size=10;
}

class PassByValue{
	public void getLaddu(int size) {
		size=0;
	}
}

class PassByRef{
	public void getLaddu(Laddu laddu) {
		laddu.size=0;
	}
}