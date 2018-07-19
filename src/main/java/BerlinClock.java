class BerlinClock {

    String getSeconds(int second) {
        if (second == 0) {
            return "Y";
        } else if (second == 1) {
            return "O";
        } else if (second % 2 == 0) {
            return "Y";
        } else
            return "O";
    }

    String getTopHours(int hour) {
        if (hour == 0 || hour < 5) {
            return "OOOO";
        }
        if (hour == 5 || hour < 10) {
            return "ROOO";
        }
        if (hour == 10 || hour < 15) {
            return "RROO";
        }
        if (hour == 15 || hour < 20) {
            return "RRRO";
        }
        if (hour == 20 || hour <= 24) {
            return "RRRR";
        }
        return "Berlin";
    }

    String getBottomHours(int hour) {
        if (hour == 0) {
            return "OOOO";
        }
        if (hour == 1 || hour == 6 || hour == 11 || hour == 16 || hour == 21) {
            return "ROOO";
        }
        if (hour == 2 || hour == 7 || hour == 12 || hour == 17 || hour == 22) {
            return "RROO";
        }
        if (hour == 3 || hour == 8 || hour == 13 || hour == 18 || hour == 23) {
            return "RRRO";
        } else return "RRRR";
    }

    String getTopMinutes(int minute) {

        if (minute / 5 == 1) {
            return "YOOOOOOOOOO";
        }
        if (minute / 5 == 2) {
            return "YYOOOOOOOOO";
        }
        if (minute / 5 == 3) {
            return "YYROOOOOOOO";
        }
        if (minute / 5 == 4) {
            return "YYRYOOOOOOO";
        }
        if (minute / 5 == 5) {
            return "YYRYYOOOOOO";
        }
        if (minute / 5 == 6) {
            return "YYRYYROOOOO";
        }
        if (minute / 5 == 7) {
            return "YYRYYRYOOOO";
        }
        if (minute / 5 == 8) {
            return "YYRYYRYYOOO";
        }
        if (minute / 5 == 9) {
            return "YYRYYRYYROO";
        }
        if (minute / 5 == 10) {
            return "YYRYYRYYRYO";
        }
        if (minute / 5 == 11) {
            return "YYRYYRYYRYY";
        }

        return "OOOOOOOOOOO";
    }

    String getBottomMinutes(int minute) {

        if (minute % 5 == 1) {
            return "YOOO";
        } else if (minute % 5 == 2) {
            return "YYOO";
        } else if (minute % 5 == 3) {
            return "YYYO";
        } else if (minute % 5 == 4) {
            return "YYYY";
        }
        return "OOOO";
    }

    String[] convertToBerlinTime(String time) {
        String[] convertTimeToArray = time.split(":");
        int hour = Integer.valueOf(convertTimeToArray[0]);
        int minute = Integer.valueOf(convertTimeToArray[1]);
        int second = Integer.valueOf(convertTimeToArray[2]);
        return new String[]{getSeconds(second), getTopHours(hour), getBottomHours(hour), getTopMinutes(minute), getBottomMinutes(minute)};
    }

}
