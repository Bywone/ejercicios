public class Main {
    public static void main(String[] args) {
        
        double fahrenheit = ConversorUnidades.celsiusAFahrenheit(25);
        double kilometros = ConversorUnidades.metrosAKm(1500);         
        double kilogramos = ConversorUnidades.librasAKg(10);           

       
        System.out.println("25°C = " + fahrenheit + "°F");
        System.out.println("1500 metros = " + kilometros + " km");
        System.out.println("10 libras = " + kilogramos + " kg");
    }
}
