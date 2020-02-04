package ourbusinessproject.ourbusinessproject;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class EnterpriseProjectService {

    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public Project findProjectById(long id) {

        return this.entityManager.find(Project.class, id);
    }

    public Enterprise findEnterpriseById(long id) {

        return this.entityManager.find(Enterprise.class, id);
    }

    public void save(Object objet) {
        entityManager.persist(objet);
        entityManager.flush();
    }

}
