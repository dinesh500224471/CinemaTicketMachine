public class ShowTime {
    private int movieID;
    private String date;
    private String timeSlot;
    private int availableTicket;
    
    public ShowTime(int tmovieID, String tdate, String ttimeSlot,int tavailableTicket){
        movieID=tmovieID;
        date=tdate;
        timeSlot=ttimeSlot;
        availableTicket=tavailableTicket;
    }
    
    public int getMovieID(){
        return movieID;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getTimeSlot(){
        return timeSlot;
    }
    
    public int getAvailableTicket(){
        return availableTicket;
    }
    
    public boolean purchaseTicket(int count){
        if (availableTicket>=count){
            availableTicket -= count;
            return true;
        }
        return false;
    }
}
