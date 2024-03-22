public class Books{
    String title;
    String writer;
    String year;
    Books(String title,String writer,String year){
        this.title = title;
        this.writer = writer;
        this.year = year;
    }
    public String  GetInfo(){
        return title + " escrito por "+ writer + " publicado em " + year;
    }
}
