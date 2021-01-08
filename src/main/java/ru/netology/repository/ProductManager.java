package ru.netology.repository;
import ru.netology.domain.Product;

public class ProductManager {
    public Product[] searcyBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy (result,tmp);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product instanceof Product) {
            Product product1 = (Product) product;
            if (product1.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (product1.getPrice().equalsIgnoreCase(search)) {
                return true;
            }
            return false;
        }
    }

    public void save(Product item) {
        Product[] items = new Product[0];
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
}
