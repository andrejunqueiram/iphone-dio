import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
    private String modelo;
    private String versaoOS;
    
    public IPhone(String modelo, String versaoOS) {
        this.modelo = modelo;
        this.versaoOS = versaoOS;
    }

    public void dadosIPhone(){
        System.out.println("Modelo do iPhone " + modelo + ". Versão do iOS: " + versaoOS);
    } 

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando a reprodução da música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a reprodução da música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo música: '" + musica + "'...");
    }

    @Override
    public void abrirAba() {
        System.out.println("Abrindo uma nova aba.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página: " + url + ".");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando a aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiando a página atual.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando: " + numero + "...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando chamada para Correio de Voz.");
    }

}
