public class Car {
    private String brand,model,plate;
    private int year,currentSpeed;
    Car(String Brand,String Model,int year,String plate,int speed){
        this.brand = Brand;
        this.model = Model;
        this.year = year;
        this.plate = plate;
        this.currentSpeed = speed;
    }
    public String Getinfo(){
        return this.brand +" "+ this.model + " de " + this.year + " com a  placa " + this.plate + " sua velociade atual é " + this.currentSpeed;
    }
    public void SpeedUp(){
        this.currentSpeed += 10;
    }
    public void SpeedDown(){
        if (this.currentSpeed - 10 < 0){
            this.currentSpeed = 0;
        }else{
            this.currentSpeed -= 10;
        }
    }
    public int GetSpeed(){
        return this.currentSpeed;
    }
}
