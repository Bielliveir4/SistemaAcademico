package sistema;


public class Professor {

    String nome;
    String areas[];
    long siape;

    void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    boolean novaArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == null) {
                areas[i] = area;
                return true;
            }
        }
        return false;
    }
    
    boolean removerArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].equals(area)) {
                areas[i] = null;
                return true;
            }
        }
        return false;
    }
}
