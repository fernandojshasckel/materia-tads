# Api

Maven - Gerenciador de dependencias

Dependencias Spring Boot

ctrl + shift + p -> abre view
Views -> Command Pallet -> Spring Initializr

----------------------------------------------------------------------------------------------------------------------------------------------------

Dependencias projeto Spring

JPA,
Web,
MySQL,
Actuator, 
DevTools

----------------------------------------------------------------------------------------------------------------------------------------------------

jpa - mapeamento relacional com o banco de dados, acesso via objeto e não linha de comando sql, em consulta mais complexa permite usar sql ou hql

----------------------------------------------------------------------------------------------------------------------------------------------------

classe model representação do banco de dados que faz a parte de orm

----------------------------------------------------------------------------------------------------------------------------------------------------

@Entity - entidade, ligação entre o model e uma entidade no banco de dados

@Table(name = "cidade") - Se não passar por parametro pega o nome da classe

@EntityListeners(AuditingEntityListener.class) - lista de jpa que importo

@Id - Esse campo é chave primaria

@GeneratedValue(strategy = GenerationType.AUTO) - Digo qual sequencia posso usar

@Column(name = "criado_em", nullable = false) - Nome da minha coluna e propriedades, se eu nao colocar o tamanho por padrao fica 255

@Temporal(TemporalType.TIMESTAMP) - Tenho 3 tipos date, time e timestamp

@CreatedDate - Vem do spring, implementação de parte de criação

@CreatedBy - Assume qual usuario criou o registro

@LastModifiedDate - Data da ultima modificação

@LastModifiedBy - Alterado por quem

@Autowired - Quando crio a classe ja instancia a variavel por conta

@GetMapping("/cidade") - Digo que é um get que responde quando chamo /cidade nesse caso

----------------------------------------------------------------------------------------------------------------------------------------------------

Interface Repository

- Primeiro valor qual classe está ligado, segundo é o tipo da minha chave primaria
- Dessa forma implemento todas as minhas funções de manipulação do banco
public interface CidadeRepository extends JpaRepository<Cidade, Long>{ }

Quando estou utilizando o Jpa ou Hibernate, eu consigo fazer uma chave primaria composta mas tenho que ter uma classe com minhas chaves
e minha chave é uma instancia dessa classe

Preciso ter um @id

JpaRepository aqui tenho meus metodos do banco

----------------------------------------------------------------------------------------------------------------------------------------------------

Classe Controller

Responsavel de onde vão estar as funções de onde vão chamar, aqui vão estar meu endpoints, funções que eu chamo da Api

Quando for controller assino com @RestController

@RequestMapping("/api/V1") - V1: Versão 1 da minha Api