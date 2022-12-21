package lab6.prob11;

public class toKelvin implements Convertable{
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
