package com.cms.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cms.main.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	@Query("SELECT c FROM Contact c WHERE " + "LOWER(c.firstName) LIKE %:keyword% OR "
			+ "LOWER(c.lastName) LIKE %:keyword% OR " + "LOWER(c.email) LIKE %:keyword%")
	List<Contact> search(@Param("keyword") String keyword);

}
