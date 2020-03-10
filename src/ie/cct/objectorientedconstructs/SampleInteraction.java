package ie.cct.objectorientedconstructs;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.HotelManagementSystemInterface;
import ie.cct.objectorientedconstructs.s2018385s2018315.HotelManagementSystem;

public class SampleInteraction implements HotelManagementSystemInterface{
	
	public static void main(String[] args) {
    
	
		HotelManagementSystemInterface hm = new HotelManagementSystem();
        // build the hotel from the text file
		
		HotelInterface h = hm.setupHotel("mespil.txt");
        // try some bookings
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("February", 3, "Single", 10);
		h.bookRoom("February", 10, "Penthouse", 12);
		
        // see the calendar for January for single rooms
		System.out.println(hm.getCalendar("January", h));
	}
		@Override
		public String getCalendar(String month, HotelInterface hotel) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public HotelInterface setupHotel(String file) {
			// TODO Auto-generated method stub
			return null;
		}
}
