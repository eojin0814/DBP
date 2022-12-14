package model;

public class ReservationDTO {
	private int driverId;
	private String arrival;
	private String departure;
	private String arrivalTime;
	private String departureTime;
	private int state;
	private int reservationId;
	private String date;
	
	public ReservationDTO(int resetvationId) 
	{
		this.reservationId = resetvationId;
	}
	
	public ReservationDTO(int driverId, String arrival, String departure, String arrivalTime, String departureTime,
			int state, int resetvationId) {
		super();
		this.driverId = driverId;
		this.arrival = arrival;
		this.departure = departure;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.state = state;
		this.reservationId = resetvationId;
	}

	
	/**
	 * @param driverId
	 * @param arrival
	 * @param departure
	 * @param arrivalTime
	 * @param departureTime
	 * @param state
	 * @param reservationId
	 * @param date
	 */
	public ReservationDTO(int driverId, String arrival, String departure, String arrivalTime, String departureTime,
			int state, int reservationId, String date) {
		super();
		this.driverId = driverId;
		this.arrival = arrival;
		this.departure = departure;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.state = state;
		this.reservationId = reservationId;
		this.date = date;
	}


	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
}
