public class logistica {
    private int peso_mercancia;
    private int distancia;
    private String Transporte;

    private double costo_envio;
    public logistica() {
    }

    public logistica(int peso_mercancia, int distancia, String transporte, double costo_envio) {
        this.peso_mercancia = peso_mercancia;
        this.distancia = distancia;
        Transporte = transporte;
        this.costo_envio = costo_envio;
    }

    public int getPeso_mercancia() {
        return peso_mercancia;
    }

    public void setPeso_mercancia(int Peso_mercancia) {
        this.peso_mercancia = Peso_mercancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String transporte) {
        Transporte = transporte;
    }

    public double getCosto_envio() {
        return costo_envio;
    }

    public void setCosto_envio(double costo_envio) {
        this.costo_envio = costo_envio;
    }


    public void transporte() {
        String[] transporte = new String[0];
        transporte[0] = "Terrestre";
        transporte[1] = "Maritimo";
        transporte[2] = "Aereo";
    }

    public void numeropositivo() {
        if (peso_mercancia >= 0) {
            System.out.println("Prueba realizada correctamente el numero es positivo");
        } else {
            System.out.println("el numero tiene que ser positivo");
        }
    }

    public void distanciapositiva() {
        if (distancia >= 0) {
            System.out.println("Prueba exitosa, la distancia es un numero positivo");
        } else {
            System.out.println("Error el numero tiene que ser positivo");
        }
    }

    public void costoenvio(int peso_mercancia, int transporte){
        if (transporte==0) {
            if (peso_mercancia <= 100) {
                costo_envio = peso_mercancia * 50;
            } else if (peso_mercancia>100) {
                costo_envio=peso_mercancia*40;
            }
        } else if (transporte==1) {
            if (peso_mercancia<=500){
                costo_envio=peso_mercancia*100;
            } else if (peso_mercancia>500) {
                costo_envio=peso_mercancia*80;
            }
        } else if (transporte==2) {
            costo_envio=peso_mercancia*200;
        }
    }

    @Override
    public String toString() {
        return "logistica{" +
                "peso_mercancia=" + peso_mercancia +
                ", distancia=" + distancia +
                ", Transporte='" + Transporte + '\'' +
                ", costo_envio=" + costo_envio +
                '}';
    }
}

