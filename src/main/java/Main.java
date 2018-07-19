public class Main {

    public static void main(String[] args) {

        BerlinClock berlinClock = new BerlinClock();
        String[] s = berlinClock.convertToBerlinTime("16:20:29");
        System.out.print("seconds: " + s[0] + "\n" + "Hours:   " + s[1] + "\n         " + s[2] + "\n" + "Minutes: " + s[3] + "\n         " + s[4]);

    }
}
