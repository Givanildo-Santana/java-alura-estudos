package br.com.givanildo.modulo03.desafios.ex03_usuario_github.model;

public record UsuarioGitHub(String login, String id, String html_url, String name, String bio, String public_repos) {

    @Override
    public String toString() {
        return String.format("\nnome: %s\nlogin: %s\nid: %s\nbio: %s\nurl: %s\nrepositórios: %s",name,login,id,bio,html_url,public_repos);
    }
}
