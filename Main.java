package escola;

public class Main {
    public static void main(String[] args) {
        // Testando com média aritmética
        Aritmetica calculoAritmetico = new Aritmetica();
        Disciplina disciplinaAritmetica = new Disciplina(calculoAritmetico);
        disciplinaAritmetica.setNome("Padrões de Desenvolvimento");
        disciplinaAritmetica.setP1(10);
        disciplinaAritmetica.setP2(5);
        disciplinaAritmetica.calcularMedia();
        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s", 
            disciplinaAritmetica.getP1(), 
            disciplinaAritmetica.getP2(), 
            disciplinaAritmetica.getMedia(), 
            disciplinaAritmetica.getSituacao()));

        // Testando com média geométrica
        Geometrica calculoGeometrico = new Geometrica();
        Disciplina disciplinaGeometrica = new Disciplina(calculoGeometrico);
        disciplinaGeometrica.setNome("Padrões de Desenvolvimento");
        disciplinaGeometrica.setP1(10);
        disciplinaGeometrica.setP2(5);
        disciplinaGeometrica.calcularMedia();
        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s", 
            disciplinaGeometrica.getP1(), 
            disciplinaGeometrica.getP2(), 
            disciplinaGeometrica.getMedia(), 
            disciplinaGeometrica.getSituacao()));
    }
}

