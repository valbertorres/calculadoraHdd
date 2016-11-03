package classededados;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import utilmessagem.UtilMessage;

public class ControleTela implements Serializable {

    private static ControleTela instancia;

    /**
     * @return the instancia
     */
    public static synchronized ControleTela getInstancia() {
        if (instancia == null) {
            instancia = new ControleTela();
        }
        return instancia;
    }
    private JTextField jtHexa;
    private JTextArea jtSaida;
    private JButton btnConverte;

    public void inicializar() {
        this.iniciaListene();

    }
    public void iniciaListene(){
       btnConverte.addActionListener(( ActionEvent e) -> {
           try {
               
                Calculadora c = new Calculadora();
                String numero = (jtHexa.getText());
                
//                c.binario(numero);
//                c.decimal(numero);
                
                String saida = " Binario: "+c.binario(numero)+"\n";
                saida+= "Decimal: "+c.decimal(numero);
                
               jtSaida.setText(saida);
            
           } catch (Exception exception) {
             UtilMessage.message(exception);
           }
           
        });
        
        
        
    }

    /**
     * @return the jtHexa
     */
    public JTextField getJtHexa() {
        return jtHexa;
    }

    /**
     * @param jtHexa the jtHexa to set
     */
    public void setJtHexa(JTextField jtHexa) {
        this.jtHexa = jtHexa;
    }

    /**
     * @return the jtSaida
     */
    public JTextArea getJtSaida() {
        return jtSaida;
    }

    /**
     * @param jtSaida the jtSaida to set
     */
    public void setJtSaida(JTextArea jtSaida) {
        this.jtSaida = jtSaida;
    }

    /**
     * @return the btnConverte
     */
    public JButton getBtnConverte() {
        return btnConverte;
    }

    /**
     * @param btnConverte the btnConverte to set
     */
    public void setBtnConverte(JButton btnConverte) {
        this.btnConverte = btnConverte;
    }

}
