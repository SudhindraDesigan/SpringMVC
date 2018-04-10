package com.example.sample;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ProductService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value= "/saveproduct", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("product") Product product,ModelMap model){
			
		service.save(product);
		  model.addAttribute("success", "Product " + product.getName() + " Added successfully");
	       return "success";
		
	}
	 @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	   public String save(Product product, BindingResult result,
	           ModelMap model) {
	 return "newproduct";
	   }
	 @RequestMapping(value = {"/list" }, method = RequestMethod.GET)
		public String listEmployees(ModelMap model) {
			System.out.println("Enteringgg...");
			List<Product> products = service.findAll();
			model.addAttribute("products", products);
			return "allProducts";
		}
	
}
