import java.util.Date;

public class MobileOSMemento {

    private final String osType;
    private final String osModel;
    private final String version;
    private final Date lastUpdateDate;

    public MobileOSMemento(String osType, String osModel, String version, Date lastUpdateDate) {
        this.osType = osType;
        this.osModel = osModel;
        this.version = version;
        this.lastUpdateDate = lastUpdateDate;

    }

    public String getOsType() {
        return osType;
    }

    public String getOsModel() {
        return osModel;
    }

    public String getVersion() {
        return version;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }
}
