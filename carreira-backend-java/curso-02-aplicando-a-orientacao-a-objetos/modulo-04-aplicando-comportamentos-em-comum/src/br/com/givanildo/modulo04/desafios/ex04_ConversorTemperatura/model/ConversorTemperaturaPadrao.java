package br.com.givanildo.modulo04.desafios.ex04_ConversorTemperatura.model;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) * 5/9;
    }
}
