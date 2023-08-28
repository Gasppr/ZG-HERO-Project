/*
Para cada empresa, tem que ser possível salvar informações de
Nome, E-mail Corporativo,
CNPJ, País, Estado, CEP e Descrição da empresa;

A empresa também tem um atributo de competências, que se refere
 ao que a empresa espera dos candidatos;
*
*/


class Empresa {

    Empresa(String nome, String emailCorporativo, String CNPJ, String pais, String estado, String CEP, String descricaoEmpresa, String[] competenciasEsperadas) {
        this.nome = nome
        this.emailCorporativo = emailCorporativo
        this.CNPJ = CNPJ
        this.pais = pais
        Estado = estado
        this.CEP = CEP
        this.descricaoEmpresa = descricaoEmpresa
        this.competenciasEsperadas = competenciasEsperadas
    }
    String nome
    String emailCorporativo
    String CNPJ
    String pais
    String Estado
    String CEP
    String descricaoEmpresa
    String[] competenciasEsperadas


    void toString(Empresa empresa) {
        println "Nome: $empresa.nome , E-mail: $empresa.emailCorporativo , CPF: $empresa.CNPJ, Idade: $empresa.pais , Estado: $empresa.Estado ," +
                " CEP: $empresa.CEP , Descricao: $empresa.descricaoEmpresa" +
                "Competencias: ${empresa.competenciasEsperadas.each {n ->  n}}"
    }
}




