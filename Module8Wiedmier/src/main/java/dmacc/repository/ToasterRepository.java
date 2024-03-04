/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import dmacc.beans.Toaster;

/**
 * 
 */
@Repository
public interface ToasterRepository extends JpaRepository<Toaster, Long>{

}
