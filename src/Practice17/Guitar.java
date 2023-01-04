package Practice17;

import lombok.Getter;

public class Guitar {
    private final String m_brand;
    private final boolean m_is_electric=true;
    private final int m_StringsNum;
    private boolean m_tuned;
    private float m_price;

    public Guitar(String m_brand, boolean m_is_electric, int m_StringsNum, boolean m_tuned,float m_price) {
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_StringsNum = m_StringsNum;
        this.m_tuned = m_tuned;
        this.m_price = m_price;
    }


    public Guitar(String m_brand, boolean m_is_electric) {
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_price = 50;
        this.m_StringsNum = 6;
    }

    public Guitar(String m_brand) {
        this.m_brand = m_brand;
        this.m_is_electric = false;
        this.m_price =50f;
        this.m_StringsNum = 6;
    }

    public String getM_brand() {
        return m_brand;
    }

    public boolean isM_is_electric() {
        return m_is_electric;
    }

    public int getM_StringsNum() {
        return m_StringsNum;
    }

    public boolean isM_tuned() {
        return m_tuned;
    }

   public void tuneGuiter(){
       System.out.println("guitar is tuned");
       m_tuned = true;
   }

}
