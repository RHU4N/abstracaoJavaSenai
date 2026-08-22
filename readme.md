# Abstração em Java

Exemplo didático de abstração, herança e polimorfismo em Java. O projeto modela diferentes tipos de funcionários a partir de uma classe abstrata comum.

## Conceitos praticados

- classe abstrata;
- herança com `extends`;
- sobrescrita de métodos com `@Override`;
- polimorfismo por meio da referência `Funcionario`;
- encapsulamento com atributos privados, getters e setters.

## Estrutura

```text
src/
├── Engenheiro.java       # Funcionário com desconto de 27%
├── Farmaceutico.java     # Funcionário com desconto de 15%
├── Funcionario.java      # Classe abstrata base
└── Main.java             # Ponto de execução do exemplo
```

## Funcionamento

`Funcionario` declara o método abstrato `calcularSalario(double valor)`. Cada especialização implementa sua própria regra:

- `Farmaceutico`: salário líquido igual ao valor informado menos 15%;
- `Engenheiro`: salário líquido igual ao valor informado menos 27%.

No `Main`, os objetos são armazenados em variáveis do tipo `Funcionario`, demonstrando que a implementação correta é escolhida em tempo de execução.

Com os valores atuais do exemplo, a saída esperada é semelhante a:

```text
1700.0
5110.0
```

## Requisitos

- Java 25;
- IntelliJ IDEA ou outro editor compatível;
- JDK configurado no `PATH` para executar pelo terminal.

O projeto utiliza a sintaxe moderna de classe implícita e `IO.println`, disponível nas versões recentes do Java. Por isso, recomenda-se usar o JDK configurado no projeto: Temurin 25.

## Como executar pela IDE

1. Abra a pasta `abstracaoJavaSenai` no IntelliJ IDEA.
2. Configure o projeto com o JDK Temurin 25.
3. Abra `src/Main.java`.
4. Execute o método `main` pelo botão de execução da IDE.

## Como executar pelo terminal

Na raiz do projeto, compile os arquivos para a pasta `out`:

```bash
javac -d out src/*.java
```

Depois, execute a classe principal:

```bash
java -cp out Main
```

## Objetivo

Este é um projeto de estudo desenvolvido para praticar os fundamentos de programação orientada a objetos em Java.
