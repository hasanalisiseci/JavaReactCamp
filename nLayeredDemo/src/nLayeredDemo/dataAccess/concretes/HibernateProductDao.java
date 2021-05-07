package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

// DAO -> Data Access Object | Burada veriye erişim kodlarımızı yazacağız
//Hibernate -> Veri tabanı ile iletişim kuran java yapısı

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi: " + product.getName()+"#"+product.getId());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
