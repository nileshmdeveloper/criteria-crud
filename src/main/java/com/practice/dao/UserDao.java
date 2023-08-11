package com.practice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.practice.model.User;

@Repository
public class UserDao {
	
	@PersistenceContext
	EntityManager em;
	
	 public List<User> getUsers() {
	        CriteriaBuilder cb = em.getCriteriaBuilder();
	        CriteriaQuery<User> cq = cb.createQuery(User.class);

	        Root<User> User = cq.from(User.class);
//	        Predicate authorNamePredicate = cb.equal(User.get("name"), name);
//	        Predicate titlePredicate = cb.like(User.get("title"), "%" + title + "%");
//	        cq.where(authorNamePredicate, titlePredicate);

	        TypedQuery<User> query = em.createQuery(cq);
	        return query.getResultList();
	    }

}
