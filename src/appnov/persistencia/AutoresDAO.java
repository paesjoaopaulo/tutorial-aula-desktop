package appnov.persistencia;

import appnov.controls.AutoresController;
import appnov.models.Autor;
import java.util.List;

public class AutoresDAO {

    private AutoresController controller = new AutoresController();

    public void adicionar(Autor s) {
        controller.adicionar(s);
    }

    public void excluir(Autor s) {
        controller.excluir(s);
    }

    public void atualizar(Autor s) {
        controller.atualizar(s);
    }

    public List<Autor> buscaPorNome(Autor s) {
        return controller.buscaPorNome(s);
    }

    public Autor buscaPorId(Autor s) {
        return controller.buscaPorId(s);
    }

    public List<Autor> imprime() {
        return controller.imprime();
    }
}
