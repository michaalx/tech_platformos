package lt.vu.asynchronous;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class FirstComponent implements Serializable {

    public FirstComponent() {
        System.out.println("FirstComponent has been created.");
    }

    public String helloWorld() {
        return "Hello, World!";
    }

    @PostConstruct
    public void init() {
        System.out.println(toString() + " has been constructed.");
    }

    @PreDestroy
    public void dismount() {
        System.out.println(toString() + " is being destroyed.");
    }

    public String toString(){
        return "FirstComponent";
    }
}
