package org.tnsif.springweb;

import org.springframework.data.jpa.repository.JpaRepository;
/*JpaRepository is a JPA (Java Persistence API) specific extension of Repository. 
 * It contains the full API of CrudRepository and PagingAndSortingRepository.
 *  So it contains API for basic CRUD operations and also API for pagination and sorting.*/
public interface StudentRepository extends JpaRepository<Student, Integer> {

}