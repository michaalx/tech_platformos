package lt.vu.asynchronous;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationComponent {
    public ApplicationComponent() {
        System.out.println("ApplicationComponent has been created.");
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
        return "ApplicationComponent";
    }
}
