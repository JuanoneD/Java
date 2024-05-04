public class Employer {
    private String name;
    private String CPF;
    private String birthDate;
    private String password;
    private boolean admin;
    private int hitPoint = 0;

    Employer(String name,String CPF,String birthDate,String password,boolean admin){

        this.name = name;
        this.CPF = CPF;
        this.birthDate = birthDate;
        this.password = password;
        this.admin = admin;

    }
    public String getBirthDate() {
        return birthDate;
    }
    public Boolean getAdmin() {
        return this.admin;
    }
    public String getCPF() {
        return CPF;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
}
