package ru.job4j.calculate;

public class CarUsage {
    private static boolean canDrive() {
        return true;
    }

    public static void main(String[] args) {
        Car opel = new Newcar();
        boolean driving = CarUsage.canDrive();
        System.out.println("Can you drive?:" + driving);
        System.out.println("I am going to a gas station.");
        int gas = 30;
        driving = opel.canDrive();
        System.out.println("Can you drive now?:" + driving);
        System.out.println("Now. I am going to my granny.");
        System.out.println("It`s 10 kilometeres from here.");
        int distance = 10;
        opel.drive(distance);
        opel.gasInfo();
    }
}

		
	