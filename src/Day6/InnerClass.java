package Day6;
public class InnerClass {
	public static void main(String[] args) {
		//Cola campaCola=new CampaCola();
		//Cola campaCola=new Kalimark().new CampaCola();
		//Cola campaCola=new Kalimark().trojan(); //or I can also do hacking...
		Pepsi pepsiCo=new Pepsi();
		Kalimark kali=new Kalimark();
		
		//pepsiCo.setCola(campaCola);
		//kali.setCola(campaCola);
		kali.sellBovontoCola();
		pepsiCo.sellPepsiCola();
		
	}
}

interface Cola{
	public void makeCola();
}
class Pepsi{
	private Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public void sellPepsiCola() {
		
		cola.makeCola();
		System.out.println("Pepsi cola ready...");
	}
}
class Kalimark{
	private Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public static void makeBovontoCola() {
		System.out.println("campa cola logic copied..to create cola....");
	}
	public void sellBovontoCola() {
		
		
				Cola cola=()->{
			System.out.println("campa cola logic copied to create cola .....-lambda way");
			};
	
		cola.makeCola();
		System.out.println("bovonto cola ready...");
	}
	
//	public Cola trojan() {
//		return new CampaCola();
//	}
}