package flightTicket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import flightTicket.dto.FlightDto;
import flightTicket.service.Priceservice;

@Controller
public class TicketBookController {
	
	private Priceservice pr; 

	public Priceservice getPr() {
		return pr;
	}

	public void setPr(Priceservice pr) {
		this.pr = pr;
	}

	@RequestMapping(value = "book-flight", method = RequestMethod.GET)
	public ModelAndView showflightPage() {

		FlightDto fd = new FlightDto();
		ModelAndView mv = new ModelAndView("book-flight");
		mv.addObject("flightobject", fd);

		return mv;

	}
	
	@RequestMapping(value="process-flight", method = RequestMethod.POST)
	public ModelAndView showpricePage(FlightDto fc) {
		
		ModelAndView mvs = new ModelAndView("price-page");
		double price = pr.calculatePrice(fc);
		fc.setPrice(price);
		
		mvs.addObject("s", fc);
		//mvs.addObject("price", pr.calculatePrice(fc));
		System.out.println(fc.toString());
		return mvs;
		
		
		 
	}

}
