package flightTicket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import flightTicket.dto.FlightDto;

@Controller
public class TicketBookController {

	@RequestMapping(value = "book-flight", method = RequestMethod.GET)
	public ModelAndView showflightPage() {

		FlightDto fd = new FlightDto();
		ModelAndView mv = new ModelAndView("book-flight");
		mv.addObject("flightobject", fd);

		return mv;

	}

}
