package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.JPAQuery;

public class UserRepositoryImpl implements UserRepositoryCustom{
@PersistenceContext
private EntityManager entityManager;

@SuppressWarnings("unchecked")
@Override
public List<User> findByFirstName(String firstName) {
	JPAQuery<User> query=new JPAQuery<>(entityManager);
	return query
			.from(QUser.user)
			.where(QUser.user.firstName.eq(firstName))
			.createQuery()
			.getResultList();
}
}
