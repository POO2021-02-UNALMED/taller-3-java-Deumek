package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    public static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() {
        return TV.numTV;
    }

    public void canalUp() {
        if(canal < 120 && estado) {
            canal++;
        }
    }

    public void canalDown() {
        if(canal > 1 && estado){
            canal--;
        }
    }

    public void volumenUp() {
        if(volumen < 7 && estado) {
            volumen++;
        }
    }

    public void voumenDown() {
        if(volumen > 1 && estado) {
            volumen--;
        }
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen >= 1 && volumen <= 7 && estado) {
            this.volumen = volumen;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal >= 1 && canal <= 120 && estado) {
            this.canal = canal;
        }   
    }
}