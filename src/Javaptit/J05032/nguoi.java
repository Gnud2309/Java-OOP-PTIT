package Javaptit.J05032;

public class nguoi {
    private String name,birth;

    public nguoi(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String chuanHoa(String s){
        String a[] = s.split("/");
        return  a[2] + a[1] +a[0];
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return name;
    }
}
