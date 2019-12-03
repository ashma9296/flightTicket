package flightTicket.dto;

public class FlightDto {

	private String triptype;
	private String to;
	private String from;
	private String airlines;

	public String getTriptype() {
		return triptype;
	}

	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return "FlightDto [triptype=" + triptype + ", to=" + to + ", from=" + from + ", airlines=" + airlines + "]";
	}

}
