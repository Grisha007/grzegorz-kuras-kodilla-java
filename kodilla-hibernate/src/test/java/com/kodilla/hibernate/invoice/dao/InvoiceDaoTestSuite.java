package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice1 = new Invoice("123");
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Item item1 = new Item(invoice1, product1, new BigDecimal(150), 2, new BigDecimal(300));
        Item item2 = new Item(invoice1, product1, new BigDecimal(150), 1, new BigDecimal(150));
        Item item3 = new Item(invoice1, product2, new BigDecimal(400), 2, new BigDecimal(800));
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);
        Assert.assertNotEquals(0, product1Id);
        Assert.assertNotEquals(0, product2Id);
        Assert.assertNotEquals(0, item1Id);
        Assert.assertNotEquals(0, item2Id);
        Assert.assertNotEquals(0, item3Id);
    }
}
