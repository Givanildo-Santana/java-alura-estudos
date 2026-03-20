package br.com.givanildo.modulo03.desafios.ex03_usuario_github.excecao;

public class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }

}