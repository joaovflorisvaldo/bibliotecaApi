# Biblioteca Virtual - Teste de API Local

Este projeto é uma aplicação de biblioteca virtual desenvolvida para testar APIs localmente utilizando WildFly, pgAdmin, PostgreSQL, IntelliJ IDEA e Postman. O objetivo é fornecer uma plataforma simples para o gerenciamento de livros e autores, permitindo testes locais de integração entre diferentes tecnologias.

## Requisitos

- [WildFly](https://wildfly.org/)
- [pgAdmin](https://www.pgadmin.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Postman](https://www.postman.com/)

## Configuração

1. **Clonagem do Repositório**: Clone este repositório em sua máquina local utilizando o seguinte comando:

   ```
   git clone [https://github.com/seu-usuario/biblioteca-virtual.git](https://github.com/joaovflorisvaldo/bibliotecaApi.git)
   ```

2. **Configuração do Banco de Dados**: Utilize o pgAdmin ou qualquer outra ferramenta de administração do PostgreSQL para criar um novo banco de dados com o nome `bibliotecaApi`.

3. **Configuração do WildFly**: Configure o servidor WildFly no IntelliJ IDEA para hospedar a aplicação. Certifique-se de que o driver JDBC do PostgreSQL esteja configurado corretamente no WildFly.

4. **Configuração do Projeto IntelliJ**: Abra o projeto no IntelliJ IDEA e configure-o para utilizar o servidor WildFly configurado anteriormente.

5. **Execução do Projeto**: Execute o projeto no IntelliJ IDEA. Isso implantará a aplicação no servidor WildFly e a tornará acessível localmente.

## Autores

- Felipe Koji
- João Vitor

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
