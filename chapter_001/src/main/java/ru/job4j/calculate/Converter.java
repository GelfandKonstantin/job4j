package ru.job4j.calculate;


/**
 * Корвертор валюты.
 */
public class Converter {
	public static void main(String[] args);

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return (ruble/74.08);
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return (ruble/65.78);
    }
}
