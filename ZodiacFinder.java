package PracticeTasks;

import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month;
        System.out.println("Please enter your birth date with MONTH..");
        month = sc.nextInt();

        System.out.println("Please enter your birth date with DAY");
        day = sc.nextInt();

        String zodiacSign = "";
        int zodiac = 0;
        boolean isError = false;

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        zodiacSign = "Capricorn";
                        zodiac = 0x2648;
                    } else {
                        zodiacSign = "Aquarius";
                        zodiac = 0x2652;
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 29) {
                    if (day < 19) {
                        zodiacSign = "Aquarius";
                        zodiac = 0x2652;
                    } else {
                        zodiacSign = "Pisces";
                        zodiac = 0x2653;
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        zodiacSign = "Pisces";
                        zodiac = 0x2653;
                    } else {
                        zodiacSign = "Aries";
                        zodiac = 0x2648;
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        zodiacSign = "Aries";
                        zodiac = 0x2648;
                    } else {
                        zodiacSign = "Taurus";
                        zodiac = 0x2649;
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        zodiacSign = "Taurus";
                        zodiac = 0x2649;
                    } else {
                        zodiacSign = "Gemini";
                        zodiac = 0x264A;
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        zodiacSign = "Gemini";
                        zodiac = 0x264A;
                    } else {
                        zodiacSign = "Cancer";
                        zodiac = 0x264B;
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiacSign = "Cancer";
                        zodiac = 0x264B;
                    } else {
                        zodiacSign = "Leo";
                        zodiac = 0x264C;
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiacSign = "Leo";
                        zodiac = 0x264C;
                    } else {
                        zodiacSign = "Virgo";
                        zodiac = 0x264D;
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        zodiacSign = "Virgo";
                        zodiac = 0x264D;
                    } else {
                        zodiacSign = "Libra";
                        zodiac = 0x264E;
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiacSign = "Libra";
                        zodiac = 0x264E;
                    } else {
                        zodiacSign = "Scorpio";
                        zodiac = 0x264F;
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        zodiacSign = "Scorpio";
                        zodiac = 0x264F;
                    } else {
                        zodiacSign = "Sagittarius";
                        zodiac = 0x2650;
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiacSign = "Sagittarius";
                        zodiac = 0x2650;
                    } else {
                        zodiacSign = "Capricorn";
                        zodiac = 0x2648;
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;

        }

        if (isError) {
            System.out.println("Please enter correct date");

        } else {
            System.out.println("Your zodiac sign is: " + zodiacSign + (char) zodiac);
        }


    }
}
