public class HotelBooking {

    public static boolean isValidDays(int days) {
        return days >= 1 && days <= 30;
    }

    public static int getBasePrice(String roomType) {
        if ("standard".equals(roomType)) return 500;
        if ("deluxe".equals(roomType)) return 800;
        return -1;
    }

    public static double getSeasonMultiplier(String season) {
        if ("low".equals(season)) return 1.0;
        if ("high".equals(season)) return 1.5;
        return -1;
    }

    public static double applyDiscount(double total, boolean isMember) {
        if (isMember) return total * 0.9;
        return total;
    }

    public static String calculate(String roomType, int days, boolean isMember, String season) {

        if (!isValidDays(days)) return "invalid";

        int base = getBasePrice(roomType);
        if (base == -1) return "invalid";

        double multiplier = getSeasonMultiplier(season);
        if (multiplier == -1) return "invalid";

        double total = base * days * multiplier;
        total = applyDiscount(total, isMember);

        return (int) total + "k";
    }

    public static void main(String[] args) {
        System.out.println(calculate("standard", 0, true, "low"));
        System.out.println(calculate("standard", 3, true, "low"));
        System.out.println(calculate("standard", 3, false, "low"));
        System.out.println(calculate("standard", 3, false, "high"));
        System.out.println(calculate("deluxe", 5, true, "high"));
        System.out.println(calculate("deluxe", 5, false, "high"));
    }
}