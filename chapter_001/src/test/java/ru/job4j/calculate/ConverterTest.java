package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(74);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(65);
        assertThat(result, is(1));
    }
	 @Test
    public void when60EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(74));
    }

    @Test
    public void when70DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(65));
    }
}