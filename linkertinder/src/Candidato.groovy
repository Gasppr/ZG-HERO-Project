/*
O programa tem que manter um array de candidatos com no mínimo 5 candidatos pré-cadastrados:
Para cada candidato, tem que ser possível salvar informações de Nome, E-mail, CPF, idade, Estado,
CEP e descrição pessoal;

Cada candidato tem um atributo de competências, que também é um array.
 Por enquanto, as competências podem ser pré-definidas, tais como Python, Java, Spring Framework, Angular entre outras;
*/

class Candidato {


    String nome
    String email
    String CPF
    int idade
    String estado
    String CEP
    String DescricaoPessoal
    String[] competencias


    void toString(Candidato candidato) {
        println "Nome: $candidato.nome , E-mail: $candidato.email , CPF: $candidato.CPF, Idade: $candidato.idade , Estado: $candidato.estado , " +
                "CEP: $candidato.CEP , Descricao: $candidato.DescricaoPessoal" +
                "Competencias: ${candidato.competencias.each {n ->  n}}"
    }

    Candidato(String nome, String email, String CPF, int idade, String estado, String CEP, String descricaoPessoal, String[] competencias) {
        this.nome = nome
        this.email = email
        this.CPF = CPF
        this.idade = idade
        this.estado = estado
        this.CEP = CEP
        DescricaoPessoal = descricaoPessoal
        this.competencias = competencias
    }
}
