import java.util.Date;

public class MobileOS {

    private String osType;
    private String osModel;
    private String version;
    private Date lastUpdateDate;

    private final OSCaretaker osCaretaker = new OSCaretaker();

    public MobileOS(String osType, String osModel, String version, Date lastUpdateDate) {
        this.osType = osType;
        this.osModel = osModel;
        this.version = version;
        this.lastUpdateDate = lastUpdateDate;
    }

    public void Set_OS_Details(String osType, String osModel, String version, Date lastUpdateDate) {
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

    public void save(){
        osCaretaker.addMobileOSMemento(new MobileOSMemento(osType, osModel, version, lastUpdateDate));
    }

    public void downgrade(){

        MobileOSMemento mobileOSMemento = osCaretaker.getMobileOSMemento();
        this.osType = mobileOSMemento.getOsType();
        this.osModel = mobileOSMemento.getOsModel();
        this.version = mobileOSMemento.getVersion();
        this.lastUpdateDate = mobileOSMemento.getLastUpdateDate();

    }

    @Override
    public String toString() {
        return "MobileOS{" +
                "osType='" + osType + '\'' +
                ", osModel='" + osModel + '\'' +
                ", version='" + version + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                ", osCaretaker=" + osCaretaker +
                '}';
    }
}
