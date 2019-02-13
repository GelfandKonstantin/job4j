package ru.job4j.calculate;


/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param ruble рубли.
     * @return Евро.
     */
    public int rubleToEuro(int ruble) {
        return (int)(ruble/74.08);
    }

    /**
     * Конвертируем рубли в доллары.
     * @param ruble рубли.
     * @return Доллары
     */
    public int rubleToDollar(int ruble) {
        return (int)(ruble/65.78);
    }
    /**
     * Конвертируем евро в рубли.
     * @param euro евро.
     * @return Рубли.
     */

    public int euroToRuble(int euro) {
        return (int)(euro/0.013);
    }

    /**
     * Конвертируем доллары в рубли.
     * @param dollar доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int dollar) {
        return (int)(dollar/0.015);
    }
}
