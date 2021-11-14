# Microsservices com Spring Cloud, Spring Boot e Docker
Curso de microserviço com Leandro Costa, onde é abordado uma pequena estrutura de microsservices.

[![Generate Datas](https://github.com/Ismadrade/Ismadrade/actions/workflows/cobrinha.yml/badge.svg)](https://github.com/Ismadrade/Ismadrade/actions/workflows/cobrinha.yml)
<img src="https://img.shields.io/badge/swagger-cambio--service-brightgreen?logo=swagger" />
<img src="https://img.shields.io/badge/swagger-book--service-brightgreen?logo=swagger" />
<div style="display: inline_block"><br>
  <img align="center" alt="Spring" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />  
  <img align="center" alt="Docker" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" />
  <img align="center" alt="RabbitMQ" height="80" width="90" src="https://www.vectorlogo.zone/logos/rabbitmq/rabbitmq-icon.svg" />  
  <img align="center" alt="Linux" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linux/linux-original.svg" />
  <img align="center" alt="Github Actions" height="80" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original-wordmark.svg" />
</div>

# Tecnologias Abordadas:

- Spring Cloud Configuration;
- Spring Boot Actuator;
- Feign;
- Service Discovery e Service Registry com Eureka;
- Load Balancing com Eureka, Feign e Spring Cloud LoadBalancer;
- API Gateway e RouteLocator com Spring Cloud Gateway;
- Circuit Breaker com Resilience4j;
- Swagger e OpenAPI nos microsserviços;
- Distributed Tracing com Docker, Zipkin, Eureka e Sleuth;
- Dockerização, entrega contínua com Github Actions;

# Rodando o Projeto no Docker:

**Requisito: Ter o  _Docker_ e o _Docker Compose_ instalado.** <br/>
Após baixar o projeto, entrar na pasta GithubActions através do terminal Linux ou PowerShell do Windows e rodar o seguinte comando:

```
docker-compose up -d
```

# Portas dos Projetos:
- Zipkin: 9411
- RabbitMQ: 15672
- Naming Server (Eureka): 8761
- Cambio Service: 8000 
- Book Service: 8100
