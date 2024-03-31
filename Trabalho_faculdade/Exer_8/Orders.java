package Exer_8;
import java.util.*;

public class Orders {

    private static ArrayList<Orders> order = new ArrayList<>();
    private String name;
    private String address;
    private String flavor;
    private Double price;


    public void addOrders(String name,String address,Pizza pizzaName){
        Orders newOrder = new Orders();
        newOrder.addInfo(name, address, pizzaName);
        order.add(newOrder);
    }
    private  void addInfo(String name,String address,Pizza pizzaName){
        this.name = name;
        this.address = address;
        this.flavor = pizzaName.getFlavor();
        this.price = pizzaName.getPrice();
    }
    public void removeOrders(String name){
        order.remove(searchName(name));
    }
    private Orders searchName(String name){
        for(int i = 0;i<order.size();i++){
            if(order.get(i).getName().equalsIgnoreCase(name)){
                return order.get(i);
            }
        }
        return null;
    }
    String reportOrder(){
        double totalPrice=0d;
        for(int i = 0;i<order.size();i++){
            totalPrice += order.get(i).getPrice();
        }
        return "foram feitos "+order.size()+" pedidos e a media gasta foi "+(totalPrice/order.size());
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public String getAddress() {
        return address;
    }
    public String getFlavor() {
        return flavor;
    }
}
