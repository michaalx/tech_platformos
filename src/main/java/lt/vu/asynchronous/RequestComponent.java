package lt.vu.asynchronous;

import lt.vu.entities.ExtracurriculumActivity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import javax.transaction.Transactional;

@Named
@RequestScoped
public class RequestComponent {
    @PersistenceContext(synchronization = SynchronizationType.SYNCHRONIZED)
    private EntityManager em;

    public RequestComponent() {

        System.out.println("RequestComponent has been created.");
    }

    @PostConstruct
    public void init() {
        System.out.println(toString() + " has been constructed.");
    }

    @PreDestroy
    public void dismount() {
        System.out.println(toString() + " is being destroyed.");
    }

    public String toString() {
        return "RequestComponent";
    }

    @Transactional
    public void createEntity() {
        ExtracurriculumActivity newEntity = new ExtracurriculumActivity();
        newEntity.setId(25);

        em.persist(newEntity);
        em.flush();
    }
}