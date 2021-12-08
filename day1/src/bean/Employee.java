package bean;

/**
 * @author shiyutao
 * @create 2021-11-08 16:07
 */
public class Employee {
    private String ename;
    private String gender;
    private Depart depart;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }
}
