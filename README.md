# ApiTeca
API que regista um cadastro de usuário, cadastro de livro e data de empréstimo e devolução usando JAVA, Spring Boot, JPA Maven e Banco de Dados H2.

## :memo: About
Desafio proposto pela [Java DevGirl](https://www.instagram.com/devsjavagirl/?hl=pt-br) de criar uma API de um sistema que trata-se de uma biblioteca comunitária que faz empréstimos de livros de forma gratuita. Os livros físicos são organizados, por autor e em ordem alfabética, para facilitar a localização do livro físico, o sistema deverá ter esse mapeamento.

### Cadastro de usuário: 
- Código do usuário 
- Nome completo
- Data de nascimento
- Endereço 

### Cadastro de livros: 
- Código do livro
- Nome
- Autor

### Cadastro de empréstimo:
- Código da solicitação
- Usuario solicitante
- Livro a ser emprestado
- Data da solicitação
- Data da devolução 

### Regra: 
- A data da devolução deve ser maior que a data do empréstimo.

