package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(74.08);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(65.78);
        assertThat(result, is(1));
    }
	 @Test
    public void when60EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(0.013);
        assertThat(result, is(1));
    }

    @Test
    public void when70DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(0.015);
        assertThat(result, is(1));
    }
}