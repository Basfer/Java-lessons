public class Season {

    public static void main(String[] args) {
        var i = 4;
        System.out.println(getSeason(i));
    }

    public static String getSeason(int month) {
        var res = switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6,7,8 -> "summer";
            case 9,10,11 -> "autumn";
            default -> "";
        };
        return res;
    }
}
