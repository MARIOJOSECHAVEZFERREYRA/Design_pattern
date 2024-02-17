package Enums;

public class TestEnums {
    public static void main(String[] args) {
        for (Dia dia : Dia.values()){
            System.out.println("El día de la semana es: " + dia);
        }
        Dia domingo = Dia.DOMINGO;
        System.out.println(domingo.name());
        System.out.println(domingo.ordinal());
        System.out.println(domingo.toString());
    }
}
