package online.provajava.phonebook.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import online.provajava.phonebook.model.Contact;

@RestController
public class HomeController {
	
	
	@RequestMapping(value="/vediamo", method= RequestMethod.GET)
 public HashMap <String, String> vediamo() {
		HashMap<String, String> result = new HashMap<>(); 
		result.put("valore 1", "ciao"); 
		result.put("valore 2", "ciao di nuovo"); 
		
		
	 return result; 
 }
	@RequestMapping(value= "/contatto", method = RequestMethod.GET)
	public Contact contatto() {
	return new Contact ("Franco", "Rossi", "230894830"); 
			}
	
	
	@RequestMapping(value= "/contatti", method = RequestMethod.GET) 
	public List<Contact> contatti(){
		List<Contact> result = new ArrayList<>(); 
		result.add(new Contact ("Franco", "Rossi", "2308948540")); 
		result.add(new Contact ("Ettore", "Rossi", "230864830")); 
		result.add(new Contact ("Paolo", "Rossi", "230895830")); 
		result.add(new Contact  ("Anna", "Rossi", "230765830")); 
		result.add(new Contact ("Gianni", "Rossi", "676548949940")); 
		result.add(new Contact ("Kobe", "Rossi", "235658894830")); 
		
		return result; 
		
		
		
		
	}
	     
}





