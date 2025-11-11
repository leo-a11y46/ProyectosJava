public class PruebaCoche {

    public static void main(String[] args) {
        Coche c=new Coche("5466-FNZ", 
                60.0, 
                7.1, 
                200);

        c.repostar(15);

        c.arrancarMotor();

        c.fijarVelocidad(120);

        c.recorrerDistancia(177);

    }
}