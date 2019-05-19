package org.spring.contacts.dao;

import javax.transaction.Transactional;

import org.spring.contacts.entities.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// test comment

public interface ContactRepository extends JpaRepository<Contact, Long>{

	@Query("select c from Contact c where c.nom like :x")
	public Page<Contact> chercher(@Param("x")String mc, Pageable pageable);
	
	
	//@Query(value = "UPDATE contact SET nom = :nom WHERE id = :id", nativeQuery=true)
	@Query (value = "UPDATE contact SET nom= :nom WHERE id = :id ", nativeQuery = true)
	public void update(@Param("id") Long id, @Param("nom") String nom);
}
