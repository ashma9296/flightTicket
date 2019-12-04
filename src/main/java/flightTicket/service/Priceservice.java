package flightTicket.service;

import flightTicket.dto.FlightDto;

public class Priceservice {
	
	public double calculatePrice( FlightDto ft) {
		
		if (ft.getAirlines().equals("united")) {
			if ("roundtrip".equals(ft.getTriptype())) {
				return 850;
			} else if ("oneway".equals(ft.getTriptype()))  {
				return 600;
			}
		} else if (ft.getAirlines().equals("american")) {
			if ("roundtrip".equals(ft.getTriptype())) {
				return 800;
			} else if ("oneway".equals(ft.getTriptype())) { 
				return 500;
			}
		} else if (ft.getAirlines().equals("spirit")) {
			if ("roundtrip".equals(ft.getTriptype())) {
				return 600;
				
			} else if ("oneway".equals(ft.getTriptype())) {
				return 450;
			}
		}
		return -1;
		
	}

}
