package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Konstantin Gelfand (k.ermakov34@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
	/**
	 * Main.
	 * @param args - args.
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	/**
	 * Method echo.
	 * @return Echo plus your name.
	 */
	String echo () {
		return echo();
	}


	/**
	 * Method echo.
	 * @param name Konstantin.
	 * @return Echo plus your name.
	 */
	String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}
	