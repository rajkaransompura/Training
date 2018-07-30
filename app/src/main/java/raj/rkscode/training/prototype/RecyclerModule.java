package raj.rkscode.training.prototype;

public class RecyclerModule {
    private int pic;
    private String title,year;

    public RecyclerModule(){}

    public RecyclerModule(int pic, String title, String year){
        this.pic = pic;
        this.title = title;
        this.year = year;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
