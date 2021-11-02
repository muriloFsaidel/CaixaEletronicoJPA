# CaixaEletronicoJPA

Projeto que simula um CaixaEletrônico usando o framework JPA. Onde suas requisições, após o projeto executar na IDE, são feitas pelo insomnia ou postman.Apenas configurar o Insomnia para chamar a rota http://localhost:8080/terminal, e caso for realizar saques chamar por http://localhost:8080/terminal/saque com o corpo da requisição em json com campo "valor": qualquer número inteiro, senão se for puxar o extrato chamar por http://localhost:8080/terminal/extrato.
![image](https://user-images.githubusercontent.com/51511259/139949288-fef66762-f335-4cc7-bb4c-f47462a249c9.png)
![image](https://user-images.githubusercontent.com/51511259/139949373-d34f8ea6-9848-44ab-bec4-abbfa8d84cf7.png)
![image](https://user-images.githubusercontent.com/51511259/139949407-9ebf0cfb-fe0c-4bed-9bf0-bd8e2c9da112.png)



Requisitos:
IDE com framework JPA 
Insominia ou postman

bibliotecas:
spring-boot-starter-data-jpa	
spring-boot-starter-validation
spring-boot-starter-web
spring-boot-devtools
com.h2database
org.projectlombok
spring-boot-starter-test
	
	
	
