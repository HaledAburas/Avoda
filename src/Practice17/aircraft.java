package Practice17;

import java.util.Date;

public class aircraft {
    private final String m_manufacturer;
    private float m_max_speeed;
    private final float m_max_altitude;
    private final Date m_production_date;

    public aircraft(String m_manufacturer, float m_max_speeed, float m_max_altitude) {
        this.m_manufacturer = m_manufacturer;
        this.m_max_speeed = m_max_speeed;
        this.m_max_altitude = m_max_altitude;
        this.m_production_date = new Date();
    }

    public String getM_manufacturer() {
        return m_manufacturer;
    }

    public float getM_max_speeed() {
        return m_max_speeed;
    }

    public float getM_max_altitude() {
        return m_max_altitude;
    }

    public Date getM_production_date() {
        return m_production_date;
    }
}
