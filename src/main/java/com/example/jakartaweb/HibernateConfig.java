package com.example.jakartaweb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class HibernateConfig {
    public static EntityManager getInstance(){
        EntityManagerFactory entityManagerFactory = jakarta.persistence.Persistence.createEntityManagerFactory("com.example.jakartaweb");
        return entityManagerFactory.createEntityManager();
    }
}
