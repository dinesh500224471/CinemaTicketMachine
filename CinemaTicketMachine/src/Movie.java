public class Movie {
    private int id;
    private String title;
    private String genre;
    private double price;
    
    public Movie(int tid, String ttitle, String tgenre, double tprice){
        id=tid;
        title=ttitle;
        genre=tgenre;
        price=tprice;
    }
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }
}
