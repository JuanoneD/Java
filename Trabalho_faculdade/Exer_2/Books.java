package Exer_2;
public class Books{
    private  String title;
    private  String writer;
    private  String year;
    Books(String title,String writer,String year){
        this.title = title;
        this.writer = writer;
        this.year = year;
    }
    public String  GetInfo(){
        return title + " escrito por "+ writer + " publicado em " + year;
    }
}
