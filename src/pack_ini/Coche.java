package pack_ini;

public class  Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    private String  color;
    private int peso_total;
    private boolean asisntos_cuero, climatizador;


    /* falta poner valores. Esto con un metodo constructor */
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    /* A continuacion 5 metodos getter */

    public int getRuedas() {
        return ruedas;
    }

    public String getLargo() {
        return "El largo del coche es " + largo;
    }

    public String getColor() {
        return "El color del coche con metodo propuesto es: " + color;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public boolean isAsisntos_cuero() {
        return asisntos_cuero;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }

    // los 2 setters de abajo hacen casi lo mismo. Poner un color
    // la 1era. acepta paramentros y la 2da. da un color estatico
    public void setColor(String color_coche) { // esto es un setter propuesto por inteliJ
        if (color_coche == "") {
            this.color = "sin color OR azul por default";
        }
        else{
            this.color = color_coche;
        }
    }

    //public void establece_color(String verde_manubrio){ // tambien es un SETTER a manubrio
    public void establece_color(){ // tambien es un SETTER a manubrio
        color = "azul estatico";
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setAncho(int ancho_cms) {
        this.ancho = ancho_cms;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public void setLargo(int largo_cm) {
        this.largo = largo_cm;
    }

    public void setAsisntos_cuero(String is_asisntos_cuero) {
        this.asisntos_cuero = false;
        if (is_asisntos_cuero == "Y" || is_asisntos_cuero == "Yes"){
            this.asisntos_cuero = true;
        }
    }

    public boolean isClimatizador() {
        return climatizador;
    }


}

