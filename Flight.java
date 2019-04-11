/**
 * Flight class The Flight class enables robust information about each flight
 * Includes corresponding getters
 * 
 * @param DayofMonth		Day of Month (int)
 * @param DayOfWeek			Day of Week (int)
 * @param FlightDate		Flight Date (String)
 * @param UniqueCarrier		Airline Carrier (String)
 * @param TailNum			Aircraft Tail Number (String)
 * @param OriginAirportID	Originating Airport ID (int)
 * @param Origin			Origin Airport Code (String)
 * @param OriginStateName	Origin Airport State (String)
 * @param DestAirportID		Destination Airport ID (int)
 * @param Dest				Destination Airport Code (String)
 * @param DestStateName		Destination Airport State (String)
 * @param DepTime			Departure Time (local time, hhmm) (int)
 * @param DepDelay			Departure Delay (minutes, early departures are negative numbers) (int)
 * @param WheelsOff			Wheels Off Time (local time, hhmm) (int)
 * @param WheelsOn			Wheels On Time (local time, hhmm) (int)
 * @param ArrTime			Arrival Time (local time, hhmm) (int)
 * @param ArrDelay			Arrival Delay (minutes, early departures are negative numbers) (int)
 * @param Cancelled			Cancelled Flight Indicator (boolean)
 * @param CancellationCode	Cancellation Code (if cancelled) (String)
 * @param Diverted			Diverted Flight Indicator (boolean)
 * @param AirTime			Flight Time (in minutes) (int)
 * @param Distance			Flight Distance (in miles) (int)
 * 
 * @author Jason D. Baker
 *
 * Added Flight class to local git repository in Week 11
 * pdesanct added a second comment line which bakerjd edited again
 */

public class Flight {

	private int DayofMonth;
	private int DayOfWeek;
	private String FlightDate;
	private String UniqueCarrier;
	private String TailNum;
	private int OriginAirportID;
	private String Origin;
	private String OriginStateName;
	private int DestAirportID;
	private String Dest;
	private String DestStateName;
	private int DepTime;
	private int DepDelay;
	private int WheelsOff;
	private int WheelsOn;
	private int ArrTime;
	private int ArrDelay;
	private boolean Cancelled;
	private String CancellationCode;
	private boolean Diverted;
	private int AirTime;
	private int Distance;
	
	public Flight(int DayofMonth, int DayOfWeek, String FlightDate, String UniqueCarrier, String TailNum, int OriginAirportID, String Origin, String OriginStateName, 
			int DestAirportID, String Dest, String DestStateName, int DepTime, int DepDelay, int WheelsOff, int WheelsOn, int ArrTime, int ArrDelay, boolean Cancelled,
			String CancellationCode, boolean Diverted, int AirTime, int Distance) {
		
		this.DayofMonth = DayofMonth;
		this.DayOfWeek = DayOfWeek;
		this.FlightDate = FlightDate;
		this.UniqueCarrier = UniqueCarrier;
		this.TailNum = TailNum;
		this.OriginAirportID = OriginAirportID;
		this.Origin = Origin;
		this.OriginStateName = OriginStateName;
		this.DestAirportID = DestAirportID;
		this.Dest = Dest;
		this.DestStateName = DestStateName;
		this.DepTime = DepTime;
		this.DepDelay = DepDelay;
		this.WheelsOff = WheelsOff;
		this.WheelsOn = WheelsOn;
		this.ArrTime = ArrTime;
		this.ArrDelay = ArrDelay;
		this.Cancelled = Cancelled;
		this.CancellationCode = CancellationCode;
		this.Diverted = Diverted;
		this.AirTime = AirTime;
		this.Distance = Distance;
		
	}

	public int getDayofMonth() {
		return DayofMonth;
	}

	public int getDayOfWeek() {
		return DayOfWeek;
	}

	public String getFlightDate() {
		return FlightDate;
	}

	public String getUniqueCarrier() {
		return UniqueCarrier;
	}

	public String getTailNum() {
		return TailNum;
	}

	public int getOriginAirportID() {
		return OriginAirportID;
	}

	public String getOrigin() {
		return Origin;
	}

	public String getOriginStateName() {
		return OriginStateName;
	}

	public int getDestAirportID() {
		return DestAirportID;
	}

	public String getDest() {
		return Dest;
	}

	public String getDestStateName() {
		return DestStateName;
	}

	public int getDepTime() {
		return DepTime;
	}

	public int getDepDelay() {
		return DepDelay;
	}

	public int getWheelsOff() {
		return WheelsOff;
	}

	public int getWheelsOn() {
		return WheelsOn;
	}

	public int getArrTime() {
		return ArrTime;
	}

	public int getArrDelay() {
		return ArrDelay;
	}

	public boolean getCancelled() {
		return Cancelled;
	}

	public String getCancellationCode() {
		return CancellationCode;
	}

	public boolean getDiverted() {
		return Diverted;
	}

	public int getAirTime() {
		return AirTime;
	}

	public int getDistance() {
		return Distance;
	}
	
}
