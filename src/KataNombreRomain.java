public class KataNombreRomain {

        static private int[] nombresArabesSpecifique = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        static private String[] equivalentRomain = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V" ,"IV" , "I"};

        public static String convert(int nombreArabe){
            String nombreRomain = "";

            for (int i = 0; i < nombresArabesSpecifique.length; i++){
                while (nombreArabe >= nombresArabesSpecifique[i]){
                    nombreRomain += equivalentRomain[i];
                    nombreArabe -= nombresArabesSpecifique[i];
                }
            }

            return nombreRomain;
        }
}
