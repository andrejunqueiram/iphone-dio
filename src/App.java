public class App {
    public static void main(String[] args) throws Exception {
        IPhone telefone = new IPhone("42", "42");
        telefone.dadosIPhone();
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        telefone.fazerChamada("4242424242");
        telefone.atenderChamada();
        telefone.encerrarChamada();
        telefone.iniciarCorreioVoz();
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        telefone.tocarMusica();
        telefone.pararMusica();
        telefone.pausarMusica();
        telefone.selecionarMusica("Resposta para a vida, o universo e tudo mais...");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        telefone.abrirAba();
        telefone.abrirPagina("www.respostaparaavidaouniversoetudomais.com");
        telefone.atualizarPagina();
        telefone.fecharAba();
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
    }
}
