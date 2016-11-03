package classededados;

public class Calculadora {

    private String numero;

    public Calculadora() {
        this.numero = "";
    }

    public String binario(String numero1) {
        int numero = Integer.parseInt(numero1, 16);
        this.numero = Integer.toBinaryString(numero);
        return this.numero;
        
        

    }
    public Integer decimal(String numero2){
        int numero1 = Integer.parseInt(numero2,16);
        this.numero = Integer.toBinaryString(numero1);
        numero1 = Integer.parseInt(this.numero,2);
        return numero1;
    }
    

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
