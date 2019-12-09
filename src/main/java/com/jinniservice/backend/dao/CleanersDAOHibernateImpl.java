package com.jinniservice.backend.dao;

import com.jinniservice.backend.entites.Cleaners;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class CleanersDAOHibernateImpl implements CleanersDAO {


    private EntityManager entityManager;

    @Autowired
    public CleanersDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Cleaners> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Cleaners> cleanersQuery = session.createQuery("from Cleaners", Cleaners.class);
        List<Cleaners> cleaners = cleanersQuery.getResultList();
        return cleaners;
    }

    @Override
    public void save(Cleaners theCleaner) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(theCleaner);
    }

    @Override
    public void deleteById(int cleanerId) {
        Session session = entityManager.unwrap(Session.class);
        Query theQuery = session.createQuery("delete from Cleaners where id =:id");
        theQuery.setParameter("id", cleanerId);
        theQuery.executeUpdate();
    }

    @Override
    public Cleaners getCleanerById(int cleanerId) {
        Session session = entityManager.unwrap(Session.class);
        Cleaners theCleaner = session.get(Cleaners.class, cleanerId);
        return theCleaner;
    }
}
