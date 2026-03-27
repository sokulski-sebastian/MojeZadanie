public class Samochod {
	String marka;
	String model;
	int rokProdukcji;
	
	public Samochod(String marka, String model, int rokProdukcji) {
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
	}

	//Samochod BMW = new Samochod();
	//BMW.marka = "BMW";
	//BMW.model = "Seria 4";
	//BMW.rokProdukcji = "2023";

	@Override
		public String toString() {
    	return "Samochod:" + marka + ' ' +
            ", model:'" + model + ' ' +
            ", rokProdukcji:" + rokProdukcji;
		}

	public static void main(String[] args) {
		Samochod BMW = new Samochod("BMW", "Seria 4",2023);
		Samochod Audi = new Samochod("Audi", "RS6",2023);
		System.out.println(BMW);
		System.out.println(Audi);
	}
}
