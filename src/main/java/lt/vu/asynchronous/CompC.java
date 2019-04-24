package lt.vu.asynchronous;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named("compC")
public class CompC implements IComp, Serializable {

    public String helloWorld(){
        return "Hello, world.";
    }
    public String byeWorld() { return "Bye, world."; }
}
