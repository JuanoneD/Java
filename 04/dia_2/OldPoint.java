public class OldPoint {

    private float workHours;
    private PointDay workDay = null;
    private int numbersDays = 0;


    OldPoint(){

    }

    private void addEntrance(PointDay current,Time currentTime){

        if(current == null){

            PointDay newPoint = new PointDay();
            newPoint.setEntrance(currentTime);
            this.workDay = newPoint;
            return;
        }

        if(current.getNextDay() == null){

            PointDay newPoint = new PointDay();
            newPoint.setEntrance(currentTime); 
            current.setNextDay(newPoint);
            return;
        }

        addEntrance(current.getNextDay(),currentTime);
    }

    private void addExit(PointDay current,Time currenTime){

        if(current.getExit() == 0){

            current.setExit(currenTime);
            workHours += current.getExit() - current.getEntrance();
            return;
        }

        addExit(current.getNextDay(), currenTime);
    }

    private PointDay getDay(PointDay day,int index){
        if(index == 0){
            return day;
        }

        return getDay(day.getNextDay(), index-1);
    }

    public void addEntrance(Time currentTime){

        addEntrance(workDay, currentTime);
        numbersDays ++;
    }

    public void addExit(Time currenTime){
        addExit(workDay, currenTime);
    }

    public PointDay getDay(int index){
        if(index >= numbersDays){
            return null;
        }
        return getDay(workDay, index);
    }
    

    public int getNumbersDays() {
        return numbersDays;
    }

    public float getWorkHours() {
        return workHours;
    }

}
