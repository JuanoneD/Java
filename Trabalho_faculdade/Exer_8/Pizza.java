package Exer_8;
import java.util.ArrayList;

public class Pizza {
    private String flavor;
    private Double price;
    private ArrayList<String> ingredients = new ArrayList<>();
    Pizza(String flavorPizza,Double pricePizza){
        this.flavor = flavorPizza;
        this.price = pricePizza;
    }
    public String getFlavor() {
        return flavor;
    }
    public Double getPrice() {
        return price;
    }
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    public void seePizza(){
        System.out.print("Pizza sabor "+this.flavor+" com o valor de "+this.price+" com os ingredientes: ");
        for(int i = 0;i<this.ingredients.size();i++){
            System.out.print(this.ingredients.get(i) + ",");
        }

    }
}
