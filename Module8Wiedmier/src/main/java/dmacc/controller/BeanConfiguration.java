/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Toaster;

/**
 * 
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Toaster toaster() {
		Toaster bean = new Toaster("Amazing Toaster");
//		bean.setName("Amazing Toaster");
//		bean.setModel("ABC-123");
//		bean.setYear(2024);
//		bean.setSlots(4);
		return bean;
	}
}
