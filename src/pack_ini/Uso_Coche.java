package pack_ini;

public class Uso_Coche {
    public static void main(String[] args) {
        /*Esto se llama Instanciar una clase
        El nuevo objeto Renault es una instancia de la clase coche*/
        Coche Renault = new Coche();

        /*
         * Aqui yo ppodria hacer
         *  -- "Renault.ruedas = 3;" -- y sin problema, el codigo funciona e imprimiria "3"
         * Esto seria una violacion de datos
         * PAra evitar estos "sabotakes""
         * Se usa la ENCAPSULACION
         * ejemplo: Equipo musica modular. El netx song solo debe poderse hacer desde el CD module y no desde el radio module
         * Se evita con un "modificado de aceso" editando la clase Coche usando la palabra "private" en la declaracion de la variable
         *
         * entonces la instruccion siguiente "DEJA" de funcionar. (antes sin pivcate funcionaba)
         * System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");
         *
         * Para poder ver las ruedas, necesito "metodos"
         *
         * para modificar las propiedades de un objeto se usan los metodos: SETTERS y GETTERS
         * */
        System.out.println("El Renault tiene " + Renault.getRuedas());
        System.out.println(Renault.getLargo());

        Coche micoche = new Coche();
        micoche.establece_color();
        System.out.println(micoche.getColor());

        micoche.setColor("verde propuesto");
        System.out.println(micoche.getColor());

        micoche.setColor("rojo propuesto");
        System.out.println(micoche.getColor());

        micoche.setColor("");
        System.out.println(micoche.getColor());

        System.out.println();
        micoche.setAncho(500);
        System.out.println(new StringBuilder().append("micoche tiene de ancho ").append(micoche.getAncho()).append(" cms.").toString());

        System.out.println();
        micoche.setLargo(1500);
        System.out.println("mi coche tiene: " + micoche.getLargo() + " cm de largo");

        System.out.println();
        micoche.setAsisntos_cuero("Nel");
        System.out.println("El coche tiene asistos de cuero?: " + micoche.isAsisntos_cuero());

    }
}
