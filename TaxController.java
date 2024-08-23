package com.example.demo.controller;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.SessionAttribute;
	import org.springframework.web.bind.annotation.SessionAttributes;

	
	import com.example.demo.model.TaxLogic;


	@Controller
	@SessionAttributes({ "uname", "sal", "gender", "tax" }) // session.setAttribute("id",id)
	public class TaxController {

//		@Autowired // EmployeeRepository employeeRepository = new EmployeeRepository()
//		private EmployeeRepository employeeRepository;

		@GetMapping("showIncomeForm")
		public String showIncomeForm() {
			System.out.println("Inside showIncomeForm");
			return "IncomeDetails";
		}

		@PostMapping("showTaxDetails")
		public String showTaxDetails(@RequestParam("uname") String uname, @RequestParam("sal") int sal,
				@RequestParam("gender") String gender, @ModelAttribute TaxLogic taxobj, Model model) {

//			System.out.println(uname);
//			System.out.println(sal);
//			System.out.println(gender);

			float tax = taxobj.getTax(sal, gender);

			model.addAttribute("uname", uname);
			model.addAttribute("sal", sal);
			model.addAttribute("gender", gender);
			model.addAttribute("tax", tax);

			return "Taxdisplay";
		}
	}




