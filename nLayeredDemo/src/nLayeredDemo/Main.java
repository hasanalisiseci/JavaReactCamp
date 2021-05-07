package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.Adapters.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {
    public static void main(String [] args) {

        //ToDo: Spring IoC ile iyileştirilecek!
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter(new JLoggerManager()));
        Product product1 = new Product(2,11,"Logitech Keyboard G213",600,7);
        productService.add(product1);
    }
}
