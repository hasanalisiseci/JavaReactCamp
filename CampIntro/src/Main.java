public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.12;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t�");
		} else if (dolarDun > dolarBugun) {
			System.out.println("Dolar artt�");
		} else {
			System.out.println("Dolarda de�i�iklik yok");
		}

		String krediler[] = { "H�zl� Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "�ift�i Kredisi", "MSB Kredisi",
				"MEB Kredisi", "K�lt�r Bakanl��� Kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
	}
}