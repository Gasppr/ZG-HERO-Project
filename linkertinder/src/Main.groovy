
static void main(String[] args) {
   Scanner sc = new Scanner(System.in)
   int op
  List<Empresa> empresas = []
  List<Candidato> candidatos = []


  candidatos.add(new Candidato("Joel Aparecido Gomes" , "joelg@gmail.com", "111.111.111-11", 32,"SP" ,"18000-000", "Sou mestre em Ciências de dados", "Python", "Angular", "JAva"))
  candidatos.add(new Candidato("Marcelo Rogrigues Goes" , "marcelrg@hotmail.com", "222.222.222-22", 21,"MG" , "21000-000", "Estudante de Engenharia civil", "SketchUp", "AutoCad"))
  candidatos.add(new Candidato("Pablo Santos" , "pablosan@gmail.com", "333.333.333-33", 45,"PR" , "31000-000", "Dev sênior , já trabalhei na NASA", "Java", "Python", "Kotlin"))
  candidatos.add(new Candidato("Rubens Silva Mariano" , "rubenSilmar@outlook.com", "444.444.444-44", 36,"GO" , "72000-000", "Especialista em dados e mestre em engenharia da computação", "Sistemas embarcados", "C++" , "Python"))
  candidatos.add(new Candidato("Naldo Rubens Almeida" , "naldoRual@gmail.com","555.555.555-55", 26,"AC" , "99000-000", "Mestre em Ciência da computação", "Python", "C++", "Groovy", "Java", "Assembly"))


  empresas.add(new Empresa("Facebook" , "meta@gmail.com", "000.000.000/0000.00", "EUA", "CA", "0000-0000", "Empresa que \"inventa coisas novas\"", "Angular", "PHP"))
  empresas.add(new Empresa("Amazon" , "amazon@gmail.com", "111.111.111/1111.11", "EUA", "CA", "0000-0000", "Empresa que vai comprar voce uma hora", "Angular", "Python"))
  empresas.add(new Empresa("ZG Soluções" , "zgsolucoes@gmail.com", "333.333.333/3333.33", "BR", "GO", "1111-1111", "Empresa que sempre irá te ajudar", "Java", "Groovy"))
  empresas.add(new Empresa("Tencent" , "tencent@gmail.com", "222.222.222/2222.22", "CH", "NA", "9999-9999", "Empresa que inova em todos aspectos", "Python", "JAVA", "Ruby", "C#"))
  empresas.add(new Empresa("Avell" , "avell@gmail.com", "444.444.444/4444.44", "BR", "SP", "19000-000", "Empresa que de criação e venda de produtos gamers", "Angular", "Typescript", "Java"))


  println "OLÁ \"{nomeDoUsuário}\" SEJA BEM-VINDO AO Linketinder"


  do{
    println "\n 1 - Ver todos os candidatos \n 2- Ver todas as empresas \n 3- Cadastrar candidato \n 4- Cadastrar empresa \n 5 - Sair"
    op = sc.nextInt()


    if (op == 1){
      candidatos.each { candidato -> candidato.toString(candidato) }
    }

    else if( op == 2){
      empresas.each { empresa -> empresa.toString(empresa) }
    }

    else if (op == 3){


        println "Digite o nome do candidato: "
        def nome = sc.next()


        println "Digite o email do candidato: "
        def email = sc.next()

        println "Digite o CPF do candidato: "
        def cpf = sc.next()

        println "Digite o idade do candidato: "
        def idade = sc.nextInt()

        println "Digite o Estado do candidato: "
        def estado = sc.next()

        println "Digite o CEP do candidato: "
        def cep = sc.next()

        println "Digite a descrição do candidato: "
        def descricao = sc.next()

        candidatos.add(new Candidato(nome, email, cpf, idade, estado, cep, descricao))


    }
        else if(op == 4){
        println "Digite o nome da empresa: "
        def nome = sc.next()


        println "Digite o email da empresa: "
        def email = sc.next()

        println "Digite o CNPJ da empresa: "
        def cnpj = sc.next()

        println "Digite o nome do país da empresa: "
        def pais = sc.next()

        println "Digite o Estado da empresa: "
        def estado = sc.next()

        println "Digite o CEP da empresa: "
        def cep = sc.next()

        println "Digite a descrição da empresa: "
        def descricao = sc.next()

        empresas.add(new Empresa(nome, email, cnpj,pais, estado, cep, descricao))
    }

    else if (op == 5){
      println "Adeus {nomeDoUsuario}"
    }

    else{
      println "Está opção não existe"
    }



  }while (op != 5)


}