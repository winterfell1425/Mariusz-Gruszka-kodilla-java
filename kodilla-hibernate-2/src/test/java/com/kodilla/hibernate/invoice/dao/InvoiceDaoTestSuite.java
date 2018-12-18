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
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item (new BigDecimal(1500), 2, new BigDecimal(3000));
        Item item2 = new Item(new BigDecimal(1000), 4, new BigDecimal(4000));
        Item item3 = new Item(new BigDecimal(200), 3, new BigDecimal(600));
        Product iron = new Product("Iron");
        Product coal = new Product("Coal");
        Product stone = new Product("Stone");
        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        iron.getItems().add(item1);
        coal.getItems().add(item2);
        stone.getItems().add(item3);
        item1.setProduct(iron);
        item2.setProduct(coal);
        item3.setProduct(stone);

        //When
        invoiceDao.save(invoice);
        productDao.save(iron);
        productDao.save(coal);
        productDao.save(stone);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);
    }
}
