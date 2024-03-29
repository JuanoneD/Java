import java.util.ArrayList;
public class Product {
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> code = new ArrayList<String>();
    private ArrayList<Integer> amount = new ArrayList<Integer>();
    private ArrayList<Double> price = new ArrayList<Double>();

    public void addProduct(String nameProduct,String codeProduct,Integer amountProduct,Double priceProduct){
        name.add(nameProduct);
        code.add(codeProduct);
        amount.add(amountProduct);
        price.add(priceProduct);
    }
    public void removeProduct(String nameProduct){
        int index = name.indexOf(nameProduct);
        name.remove(index);
        code.remove(index);
        amount.remove(index);
        price.remove(index);
    }
    public void updateStock(String nameProduct,int stock){
        int index = name.indexOf(nameProduct);
        amount.add(index,stock);
    }
    public void updateProduct(String nameProduct,String codeProduct,Integer amountProduct,Double priceProduct){
        int index = name.indexOf(nameProduct);
        System.out.println(index);
        code.add(index,codeProduct);
        amount.add(index,amountProduct);
        price.add(index,priceProduct);
    }
    public void reportProducts(){
        for(int i = 0; i < name.size();i++){
            System.out.println(name.get(i)+" com o codigo "+ code.get(i) + " estoque de " + amount.get(i) + " com o valor unitario de "+ price.get(i) + "  com o valor total de "+ (amount.get(i)*price.get(i)));
        }
    }

}
