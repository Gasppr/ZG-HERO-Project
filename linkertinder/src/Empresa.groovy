class Empresa extends Pessoa{

    String emailCorporativo
    String CNPJ




    Empresa(String nome, String emailCorporativo, String CNPJ, String pais, String estado, String CEP, String descricaoEmpresa, String[] competenciasEsperadas) {
        this.nome = nome
        this.emailCorporativo = emailCorporativo
        this.CNPJ = CNPJ
        this.pais = pais
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricaoEmpresa
        this.competencias = competenciasEsperadas
    }


    Empresa(String nome, String emailCorporativo, String CNPJ, String pais, String estado, String CEP, String descricaoEmpresa) {
        this.nome = nome
        this.emailCorporativo = emailCorporativo
        this.CNPJ = CNPJ
        this.pais = pais
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricaoEmpresa
    }


    static void toString(Empresa empresa) {
        println "Nome: $empresa.nome , E-mail: $empresa.emailCorporativo , CPF: $empresa.CNPJ, Idade: $empresa.pais , Estado: $empresa.estado ," +
                " CEP: $empresa.CEP , Descricao: $empresa.descricao" +
                "Competencias: ${empresa.competencias.each {n ->  n}}"
    }
}




