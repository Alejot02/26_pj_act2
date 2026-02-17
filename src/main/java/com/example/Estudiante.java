package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(){
        this.nombre = "John Doe";
        this.edad = 18;
        this.promedio = 1;
    }

    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean haAprobado(){
        if (this.promedio >= 3.0){
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: [" + nombre + "] | Edad: [" + edad + "] | Promedio: [" + promedio + "], el estudiante ha " + (haAprobado() ? "APROBADO" : "REPROBADO")); 
    }
}
