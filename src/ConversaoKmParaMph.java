
public class ConversaoKmParaMph extends Dados implements Calculo {
    public ConversaoKmParaMph (double kmh) {
        super(kmh);
    }
    @Override
    public double calculo() {
        return this.getKmh() * 0.621371;
    }
}