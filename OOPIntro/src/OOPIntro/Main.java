package OOPIntro;

public class Main {

    public static void main(String[] args) {

        //"Class'lar refereans tiptedir."
        Product product1 = new Product(1,"Lenovo V15", 15000, "16 GB Ram",10); //referans oluşturma, instance

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("32GB Ram");
        product2.setUnitPrice(16000);
        product2.setDiscount(10);

        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("İçecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

//		Product product3 = new Product();
//
//
//		Product[] products = {product1,product2,product3};
//		for (Product product : products) {
//			System.out.println(product.getName());
//		}
//
//		Category category1 = new Category();
//		category1.id = 1;
//		category1.name = "Bilgisayar";
//
//		Category category2 = new Category();
//		category2.id = 2;
//		category2.name = "Ev/Bahçe";
//
//		ProductManager productManager = new ProductManager();
//		productManager.addToCart(product1);
//		productManager.addToCart(product2);
//		productManager.addToCart(product3);
    }
}
