package principal;

public class Radio {

    private final double SALTOS = 0.5;
    private final double FRECUENCIAMAX = 108;
    private final double FRECUENCIAMIN = 80;
    private double sintonizador;

    public Radio() {
        sintonizador = 80;
    }



    public void subirFrecuencia(int numeroSaltos) {

        double total = (numeroSaltos * SALTOS);


        if (total + sintonizador <= FRECUENCIAMAX) {
            sintonizador = sintonizador + total;

        } else {

            sintonizador=(total+sintonizador);


            while (sintonizador>FRECUENCIAMAX){

                sintonizador=sintonizador-FRECUENCIAMAX;

                sintonizador=FRECUENCIAMIN+sintonizador;
            }

        }

    }



    public void bajarFrecuencia(int numeroSaltos) {

        double total = (numeroSaltos * SALTOS);


        if ( sintonizador-total >= FRECUENCIAMIN) {
            sintonizador = sintonizador - total;

        } else {

            sintonizador=sintonizador-total;

            while (sintonizador<FRECUENCIAMIN){

              sintonizador=FRECUENCIAMIN-sintonizador;
              sintonizador=FRECUENCIAMAX-sintonizador;

            }


        }
    }




    // Metodos Getter and Setter
    public double getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(double sintonizador) {
        this.sintonizador = sintonizador;
    }

}
