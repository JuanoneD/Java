package Exer_7;

import java.util.ArrayList;
public class Product {
    private ArrayList<Product> products = new ArrayList<>();
    private String name;
    private String code;
    private Integer amount;
    private Double price;

    public void addProduct(String nameProduct,String codeProduct,Integer amountProduct,Double priceProduct){
        Product newProduct = new Product();
        newProduct.addInfo(nameProduct, codeProduct, amountProduct, priceProduct);
        products.add(newProduct);
    }
    private void addInfo(String nameProduct,String codeProduct,Integer amountProduct,Double priceProduct){
       this.name = nameProduct;
       this.code = codeProduct;
       this.amount = amountProduct;
       this.price = priceProduct;
    }
    public void removeProduct(String nameProduct){
        products.remove(searchProduct(nameProduct));
    }
    private Product searchProduct(String name){
        for(int i = 0;i<products.size();i++){
            if(products.get(i).getName().contains(name)){
                return products.get(i);
            }
        }
        return products.get(0);
    }
    public void updateStock(String nameProduct,int stock){
        searchProduct(nameProduct).setAmount(stock);
    }
    public void updateProduct(String nameProduct,String codeProduct,Integer amountProduct,Double priceProduct){
        searchProduct(nameProduct).setCode(codeProduct);
        searchProduct(nameProduct).setAmount(amountProduct);
        searchProduct(nameProduct).setPrice(priceProduct);

    }
    public void reportProducts(){
        for(int i = 0; i < products.size();i++){
            System.out.println( products.get(i).getName() +" com o codigo "+ products.get(i).getCode()  + " estoque de " + products.get(i).getAmount() + " com o valor unitario de "+ products.get(i).getPrice() + "  com o valor total de "+ (products.get(i).getAmount() * products.get(i).getPrice()));
        }
    }
    public String getName() {
        return name;
    }
    public Integer getAmount() {
        return amount;
    }
    public String getCode() {
        return code;
    }
    public Double getPrice() {
        return price;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
