package org.sway.test.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.sway.test.entity.Bill;

@Repository
@Transactional
public class BillDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Bill bill){
        entityManager.persist(bill);
        return bill.getId();
    }

}