public class Players {
    private  String name;
    private  int score,level;
    Players(String Name,int Score,int Level){ 
        this.name = Name;
        this.score = Score;
        this.level = Level;
   } 
    public String  GetName() {
        return this.name;
   }
    public int GetScore(){
        return this.score;
    }
    public int GetLevel(){
        return this.level;
    }
    public void SetScore(int newScore){
        this.score = newScore;
    }
    public void Setlevel(int newLevel){
        this.level = newLevel;
    }
}
