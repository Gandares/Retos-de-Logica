class Main{
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        try{
            // De Celcius a Farenheit
            System.out.println(tc.Conversor(33, 'F'));
            // De Farenheit a Celcius
            System.out.println(tc.Conversor(78, 'C'));
            // Error
            System.out.println(tc.Conversor(45, 'Z'));
        } catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
}

class TemperatureConverter{

    public float Conversor(float num, char form) throws Exception{
        if(form != 'C' && form != 'F')
            throw new Exception("Unidad de medida de temperatura no reconocida, probar con 'C' o 'F'");

        if(form == 'C')
            return FarenheitToCelsius(num);
        else
            return CelsiusToFarenheit(num);
    }
    
    private static float FarenheitToCelsius(float value){
        return (value - 32) * 5 / 9;
    }

    private static float CelsiusToFarenheit(float value){
        return (value * 9 / 5) + 32;
    }

}