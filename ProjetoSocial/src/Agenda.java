import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Agenda {

    String descricao, acao, dataProjeto;
     SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");


    // String dataProjeto = date.parseString()


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDataProjeto() {
        return dataProjeto;
    }

    public void setDataProjeto(String dataProjeto) {
        this.dataProjeto = dataProjeto;
    }
}
