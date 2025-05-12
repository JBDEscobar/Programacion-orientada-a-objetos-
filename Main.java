public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Javier ", "escobar", 16, 2008);
        Usuario usuario2 = new Usuario("Jorge", "Lopez", 17, 2008);
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getapellido());
        System.out.println(usuario1.getfechadenacimiento());
        System.out.println(usuario1.getnombre());
        // metodos del nombre 
        usuario1.setNombre("nelson");
        

        if (usuario1.getEdad() >= 18){
            System.out.println("mayor de edad");
        }
       
    }

}