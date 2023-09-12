package Javaptit.J05026;
public class GiangVien {
    static int ID = 1;
    private String id;
    private String name;
    private String sub;

    public GiangVien(String name, String sub) {
        this.name = name;

        String[] a = sub.split("\\s+");
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            tmp += a[i].substring(0, 1).toUpperCase();
        }
        this.sub = tmp;
        this.id = String.format("GV%02d", ID++);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("GV%02d", ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sub;
    }
}
