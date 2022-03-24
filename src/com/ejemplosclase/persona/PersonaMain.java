package com.ejemplosclase.persona;

//autor SaezMontes Daniel

public class PersonaMain {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Daniel", "ApeFalso", "apeFalso2");
        Persona persona2 = new Persona("Perico", "ElDeLos", "Palotes");
        Persona persona3 = new Persona("Juan", "Juanillo", "Juanote");
        Persona persona4 = new Persona("Maria", "ApeFalso", "apefalso");

        persona1.setEdad(28);

        persona2.setEdad(14);

        persona3.setPeso(100);
        persona3.setAltura(1.78);

        persona4.setPeso(40); //es un pelin anorexica
        persona4.setAltura(1.65);

        System.out.println(persona1.getNombre() + " con una edad de "+persona1.getEdad()+" es mayor de edad? " + persona1.isMayorDeEdad());
        System.out.println(persona2.getNombre() + " con una edad de "+persona2.getEdad()+" es mayor de edad? " + persona2.isMayorDeEdad());
        System.out.println(persona3.getNombre() + " con un peso de "+persona3.getPeso() + " y una altura de "+ persona3.getAltura()+" tiene sobrepeso? " + persona3.isSobrepeso());
        System.out.println(persona4.getNombre() + " con un peso de "+persona4.getPeso() + " y una altura de "+ persona4.getAltura()+" tiene sobrepeso? " + persona4.isSobrepeso());

    }
}
