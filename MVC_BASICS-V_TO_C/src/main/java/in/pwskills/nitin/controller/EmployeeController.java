package in.pwskills.nitin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.pwskills.jai.Enitity.Employee;

@Controller //@Component + HTTP METHODS(GET/POST)
@RequestMapping(value  = "/employee")
public class EmployeeController {
	
//	Display the from 
	
	@GetMapping(value = "/show")
	public String ShowForm() {
		return "Employee";
	}
	
//	process the form 
	@PostMapping(value = "/save")
	public String saveformData(@ModelAttribute Employee employee,Model model) {
		System.out.println(employee);
		model.addAttribute("obj",employee);
		return "EmpPage";
	}
}
