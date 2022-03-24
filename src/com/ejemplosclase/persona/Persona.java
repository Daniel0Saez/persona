package com.ejemplosclase.persona;

//autor SaezMontes Daniel

public class Persona {

    private final int GENERO_DESCONOCIDO = 0;
    private final int GENERO_MASCULINO = 1;
    private final int GENERO_FEMENINO = 2;
    private String nombre= "";
    private String apellido = "";
    private String apellido2= "";
    private int edad=0;
    private int genero=0;
    private double peso=0;
    private double altura=0;
    private double imc;

    public Persona(String nombre, String apellido, String apellido2){
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
    }

    public Persona(String nombre, String apellido, String apellido2,int genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.genero = genero; //como se hace para aceptar solo 3 valores?
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getGenero() {
        return genero;
    }

    private double calcularIMC(){
        imc =peso/(altura*2);

        return imc;
    }

    public boolean isMayorDeEdad(){
        boolean chivato= false;
        if(edad>18) chivato=true;

        return chivato;
    }

    public boolean isSobrepeso(){
        boolean sobre = false;
        calcularIMC();  //llamo al metodo desde dentro de la clase y una vez usado tomo el resultado del imc
        if(imc > 20) sobre=true;
        return sobre;
    }

}
