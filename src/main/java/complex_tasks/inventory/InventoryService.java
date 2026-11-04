package complex_tasks.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private final Map<String, List<Product>> products = new HashMap<>();
    public boolean isInventoryOpen = true;

    public synchronized void addProduct(Product product) {
        if (!isInventoryOpen) return;

        if (products.containsKey(product.getCategory())) {
            List<Product> p = products.get(product.getCategory());
            p.add(product);
        } else {
            products.put(product.getCategory(), new ArrayList<>(List.of(product)));
        }
    }

    public synchronized Product getProductByCategory(String category) {
        List<Product> searchedCategory = products.get(category);
        if (searchedCategory == null || searchedCategory.isEmpty()) {
            throw new OutOfStockException("Товаров в данной категории нет");
        }

        return searchedCategory.getFirst();
    }

    public synchronized List<Product> getFilteredProductsByCategory(String category) {
        List<Product> searchedCategory = products.get(category);
        if (searchedCategory == null || searchedCategory.isEmpty()) {
            throw new OutOfStockException("Товаров в данной категории нет");
        }

        return searchedCategory.stream()
                .filter(product -> product.getCategory().equals(category))
                .toList();
    }

    public synchronized List<Product> getFilteredProductsByPrice(int price) {
        return products.values()
                .stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() < price)
                .toList();
    }


}
