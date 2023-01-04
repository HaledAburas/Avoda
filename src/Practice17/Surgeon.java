package Practice17;

public class Surgeon extends Doctor{
    private String m_department;
    private int m_YearsOfExpirience;

    public Surgeon(String m_department, int m_YearsOfExpirience) {
        super (1212121,"Namw1","Hospital 1");
        this.m_department = m_department;
        this.m_YearsOfExpirience = m_YearsOfExpirience;
    }
    void operate(){
        System.out.println("stating operation");
    }

}
