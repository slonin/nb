package inventory;

import complex_tasks.inventory.InventoryService;
import complex_tasks.inventory.OutOfStockException;
import complex_tasks.inventory.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    @AfterEach
    void reopenInventory() {
        InventoryService.setInventoryOpen(true);
    }

    @Test
    void inventoryService_addProduct() {
        InventoryService is = new InventoryService();
        is.addProduct(new Product("Milk", 14, "food"));
        is.addProduct(new Product("Plate", 15, "home"));
        assertEquals(new Product("Milk", 14, "food"), is.getProductByCategory("food"));
    }

    @Test
    void inventoryService_addProductWhenInventoryCloses() {
        InventoryService is = new InventoryService();
        InventoryService.setInventoryOpen(false);

        is.addProduct(new Product("Plate", 15, "home"));
        assertThrows(OutOfStockException.class, () -> is.getProductByCategory("home"));
    }

    @Test
    void inventoryService_filterProductsByPrice() {
        InventoryService is = new InventoryService();
        is.addProduct(new Product("Milk", 14, "food"));
        is.addProduct(new Product("Beef", 44, "food"));
        is.addProduct(new Product("Plate", 15, "home"));
        is.addProduct(new Product("Plate", 25, "home"));
        is.addProduct(new Product("Knife", 10, "home"));

        assertEquals(4, is.getFilteredProductsByPrice(30).size());
    }

    @Test
    void inventoryService_filterProductsByCategory() {
        InventoryService is = new InventoryService();
        is.addProduct(new Product("Milk", 14, "food"));
        is.addProduct(new Product("Beef", 44, "food"));
        is.addProduct(new Product("Plate", 15, "home"));
        is.addProduct(new Product("Plate", 25, "home"));
        is.addProduct(new Product("Knife", 10, "home"));

        assertEquals(2, is.getFilteredProductsByCategory("food").size());
    }

}
