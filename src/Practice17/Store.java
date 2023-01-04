package Practice17;

public class Store {
    public String name;
    public final String address;
    private String m_owner_name;

    public Store(String name, String address, String m_owner_name) {
        this.name = name;
        this.address = address;
        this.m_owner_name = m_owner_name;


    }


//5Getter Setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getM_owner_name() {
        return m_owner_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setM_owner_name(String m_owner_name) {
        this.m_owner_name = m_owner_name;
    }
}
