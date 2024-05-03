public class PointDay {
    private float entrance = 0;
    private float exit = 0;
    private String date;
    private PointDay nextDay = null;

    PointDay(){

    }

    public void setEntrance(Time current) {
        this.date = current.getDate();
        this.entrance = current.getHour() + current.getMinutes()/60;
    }

    public void setExit(Time current) {
        this.date = current.getDate();
        this.exit = current.getHour() + current.getMinutes()/60;
    }

    public PointDay getNextDay() {
        return nextDay;
    }

    public void setNextDay(PointDay nextDay) {
        this.nextDay = nextDay;
    }

    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public float getEntrance() {
        return entrance;
    }

    public float getExit() {
        return exit;
    }
    

}
