public class OldPoint {
    private float workHours;
    private float joinedTime,exitTime;
    private String date;

    OldPoint(){

        this.workHours = 0;
        this.joinedTime = 0;
        this.exitTime = 0;
        this.date = null;
    }

    public void setJoinedTime(float joinedTime) {

        this.joinedTime = joinedTime;
    }

    public void setExitTime(float exitTime) {

        this.exitTime = exitTime;
        this.workHours += exitTime - joinedTime;
    }

    public float getWorkHours() {

        return workHours;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public float getExitTime() {
        return exitTime;
    }
    public float getJoinedTime() {
        return joinedTime;
    }

}
