package beans;

public class Drapeau {

    private int id;
    private String pays;
    private String capitale;
    private String desc;
    private  int image;
    private static  int count=0;

    public Drapeau(String pays, String capitale, String desc, int image) {
        this.capitale = capitale;
        this.id = ++count;
        this.pays = pays;
        this.desc = desc;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }
}
