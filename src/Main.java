// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        DesafioTemperatura();
    }



        static void DesafioTemperatura() {
            double tempCelsius = 100;
            double tempFahrenheit = (tempCelsius * 1.8) + 32;

            String newtemp = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", tempCelsius, tempFahrenheit);
            System.out.println(newtemp);

        }


}

