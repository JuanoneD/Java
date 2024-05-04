public class Time {
    private int hour;
    private int minutes;
    private String date;
    


    Time(String date,int hour, int minutes){

        this.date = date;
        this.hour = hour;
        if(minutes > 59){
            hour ++;
            this.minutes = minutes % 60;
        }
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getDate() {
        return date;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }
}
