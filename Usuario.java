public class Usuario {
    // Propiedades del objeto 
    private  String nombre ;
       private  String apellido;
       private  int edad; 
       private  int fechadenacimiento;
    // Metodo constructor


public  Usuario (String nombre, String apellido, int edad , int fechadenacimiento) {
    this.nombre= nombre ; 
    this.apellido = apellido;
    this.edad = edad; 
    this.fechadenacimiento = fechadenacimiento;




    
}
// Metodo gets
public int getEdad(){
    return this.edad;
}
public String getnombre(){
    return this.nombre;
}
public String getapellido(){
    return this.apellido;
}
public int getfechadenacimiento(){
    return this.fechadenacimiento;
}
// Metodos sets
public void setNombre(String nombre ){
    this.nombre = nombre;

}

public void mostrarDatos() {
    System.out.println("Nombre:  " + nombre);
    System.out.println("apellido:  " + apellido);
    System.out.println("Edad:  " + edad);
    System.out.println("Fecha de nacimiento  :" + fechadenacimiento);
    
}
}