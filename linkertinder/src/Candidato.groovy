
class Candidato extends Pessoa{

    String CPF
    int idade


   static void toString(Candidato candidato) {
        println "Nome: $candidato.nome , E-mail: $candidato.email , CPF: $candidato.CPF, Idade: $candidato.idade , Estado: $candidato.estado , " +
                "CEP: $candidato.CEP , Descricao: $candidato.descricao " +
                ", Competencias: ${candidato.competencias.each { n -> n }}"
    }

    Candidato(String nome, String email, String CPF, int idade, String estado, String CEP, String descricaoPessoal, String ...competencias) {
        this.nome = nome
        this.email = email
        this.CPF = CPF
        this.idade = idade
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricaoPessoal
        this.competencias = competencias
    }

    Candidato(String nome, String email, String CPF, int idade, String estado, String CEP, String descricaoPessoal) {
        this.nome = nome
        this.email = email
        this.CPF = CPF
        this.idade = idade
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricaoPessoal
        this.competencias = competencias
    }

}
