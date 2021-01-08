package ru.netology.repository;
package ru.netology.domain;

import junit.framework.TestCase;
import ru.netology.domain.Product;

public class ProductManagerTest extends TestCase {

    public void testMatches() {
        Product newProduct = new Product(1, "имя", 123);
        Product.matches(Product newProduct, "имя" 123)
       int expected = true;
       int action = Product.matches;
        assertEquals(expected, action);
    }
}