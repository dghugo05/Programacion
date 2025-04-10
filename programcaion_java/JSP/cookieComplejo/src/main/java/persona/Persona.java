/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

public class Persona implements java.io.Serializable {
public String nombre;
public String cargo;
public Persona() {
}
public Persona(String nombre, String cargo) {
this.nombre = nombre;
this.cargo = cargo;
}
@Override
public String toString() {
return "Nombre: " + nombre + ", Cargo: " + cargo;
}
}
