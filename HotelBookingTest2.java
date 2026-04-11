public class HotelBookingTest2 {
    public static void test(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected=" + expected + ", actual=" + actual);
        }
    }

    public static void main(String[] args) {
        test("1350k", HotelBooking.calculate("standard", 3, true, "low"));     // TC1
        test("12000k", HotelBooking.calculate("deluxe", 10, false, "high"));   // TC2
        test("invalid", HotelBooking.calculate("vip", 5, true, "low"));        // TC3
        test("invalid", HotelBooking.calculate("standard", 0, false, "low"));  // TC4
        test("invalid", HotelBooking.calculate("standard", 31, true, "high")); // TC5
        test("invalid", HotelBooking.calculate("deluxe", 5, false, "mid"));    // TC6
        test("2250k", HotelBooking.calculate("standard", 3, false, "high"));   // TC7
        test("720k", HotelBooking.calculate("deluxe", 1, true, "low"));        // TC8
        test("22500k", HotelBooking.calculate("standard", 30, false, "high")); // TC9
    }
}
