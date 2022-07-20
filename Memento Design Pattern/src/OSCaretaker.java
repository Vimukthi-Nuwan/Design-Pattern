import java.util.Stack;

public class OSCaretaker {

    public final Stack<MobileOSMemento> mobileOSMementos = new Stack<>();

    public void addMobileOSMemento(MobileOSMemento mobileOSMemento){
        mobileOSMementos.push(mobileOSMemento);
    }

    public MobileOSMemento getMobileOSMemento(){
        MobileOSMemento mobileOSMemento = mobileOSMementos.pop();
        return mobileOSMemento;
    }

}
