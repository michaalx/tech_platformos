package lt.vu.asynchronous;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CompD implements Serializable {
    @Inject
    @Named("compC")
    private IComp comp;

    public String greeting(){
        return comp.helloWorld();
    }
}
