import java.util.ArrayList;
public class Orders {
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> flavor = new ArrayList<>();
    private ArrayList<String> address = new ArrayList<>();
    private ArrayList<Double> price = new ArrayList<>();
    public void addOrder(String nameOrder,String flavorOrder,String addressOrder,Double priceOrder){
        name.add(nameOrder);
        flavor.add(flavorOrder);
        address.add(addressOrder);
        price.add(priceOrder);
    }
    public void cancelOrder(String nameOrder){
        int index = name.indexOf(nameOrder);
        name.remove(index);
        flavor.remove(index);
        address.remove(index);
        price.remove(index);
    }
    public String reportOrders(){
        int index = name.size();
        Double sum=0d;
        for(int i = 0;i<index;i++){
            sum +=price.get(i);
        }
        return "Foram realizados "+ name.size() + " pedidos e media de preço foi "+ (sum/name.size());
    }

}
