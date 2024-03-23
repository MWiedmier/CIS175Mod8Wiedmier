/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Mar 23, 2024
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Toaster;
import dmacc.repository.ToasterRepository;

/**
 * 
 */
@Controller
public class WebController {
	@Autowired
	ToasterRepository repo;
	
	@GetMapping({ "/", "viewAll" }) 
	public String viewAllToaster(Model model) { 
		if(repo.findAll().isEmpty()) { 
		return addNewToaster(model); 
		} 
		model.addAttribute("toasters", repo.findAll()); 
		return "results"; 
	}
	
	@GetMapping("/inputToaster") 
	public String addNewToaster(Model model) { 
		Toaster t = new Toaster(); 
		model.addAttribute("newToaster", t); 
		return "input"; 
	}
	
	@PostMapping("/inputContact") 
	public String addNewToaster(@ModelAttribute Toaster t, Model model) { 
		repo.save(t); 
		return viewAllToaster(model); 
	}
	
	@GetMapping("/edit/{id}") 
	public String showUpdateContact(@PathVariable("id") long id, Model model) { 
		Toaster t = repo.findById(id).orElse(null); 
		model.addAttribute("newToaster", t); 
		return "input"; 
	} 
	
	@PostMapping("/update/{id}")
	public String reviseContact(Toaster t, Model model) {
		repo.save(t);
		return viewAllToaster(model);
	}
	
	@GetMapping("/delete/{id}") 
	public String deleteUser(@PathVariable("id") long id, Model model) { 
		Toaster t = repo.findById(id).orElse(null); 
		repo.delete(t); 
		return viewAllToaster(model); 
	}
	
}
