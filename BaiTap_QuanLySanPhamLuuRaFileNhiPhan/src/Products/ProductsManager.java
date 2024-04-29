package Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsManager {

    private List<Product> productsList;
    public ProductsManager(){
        this.productsList=new ArrayList<>();
    }
    public void addProduct(Product product){
        productsList.add(product);
    }


    public void showListProducts(){
        System.out.println("ds san pham");
        for (Product item: productsList){
            System.out.println(item);
        }
    }
    public void findById(int id){
        for (Product item: productsList){
            if(id == item.getId()){
                System.out.println(item);
            }
        }
    }

}
