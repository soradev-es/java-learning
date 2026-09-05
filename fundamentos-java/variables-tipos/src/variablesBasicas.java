public class variablesBasicas {
    public static void main(String[] args){
        byte pequeño = 127; //Entero pequeño va de -128 a 127.
        short mediano = 32767; //Entero mediano, va de -32,768 a 32,767.
        int entero = 2147483647; //Entero comun, va de -2,147,483,648.
        long grande = 9223372036854775807l; 
        float decimal = 1.4e-45f;  //1.4e-45f = 0.000000000000000000000000000000000000000000000014 a 3.4028235e38f.
        double decimaGrande = 1.7976931348623157e308; // -4.9e-324 a 1.7976931348623157e308.
        char caracter = 'M'; //Almacena un solo caracter (letra, numero o simbolo) entre comilla simple.
        boolean logico = true; //Almacena un valor logico, puede ser true o false.

        System.out.println("Variable 'pequeño' (byte): "+pequeño);
        System.out.println("Variable 'mediano' (short): "+mediano);
        System.out.println("Variable 'entero' (int): "+entero);
        System.out.println("Variable 'grande' (long): "+grande);
        System.out.println("Variable 'decimal' (float): "+decimal);
        System.out.println("Variable 'decimaGrande' (double): "+decimaGrande);
        System.out.println("Variable 'caracter' (char): "+caracter);
        System.out.println("Variable 'logico' (boolean): "+logico);

    }
}
