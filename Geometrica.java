package escola;

public class Geometrica implements CalculoMedia {

    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String situacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}

