# Padrões de Projeto com Java e Spring

Projeto desenvolvido como parte do **Bootcamp Santander 2026 - AI Java Back-end** na plataforma [DIO](https://www.dio.me/).

---

## Descrição

Implementação prática dos padrões de projeto **Singleton**, **Strategy** e **Facade** em dois contextos distintos, organizados como módulos independentes neste repositório.

---

## Estrutura do Repositório

```
lab-padroes-projeto/
├── padroes-projeto-java/     ← Padrões com Java Puro
└── padroes-projeto-spring/   ← Padrões com Spring Boot 3
```

---

## Padrões Implementados

| Padrão | Categoria | Java Puro | Spring Boot |
|---|---|---|---|
| Singleton | Criacional | 3 variações (Lazy, Eager, LazyHolder) | `@Service` / `@Repository` |
| Strategy | Comportamental | `Comportamento` + `Robo` | `ClienteService` + `ClienteServiceImpl` |
| Facade | Estrutural | `Facade` → CepApi + CrmService | `ClienteRestController` → JPA + ViaCEP |

---

## Módulos

### [Java Puro](./lab-padroes-projeto-java/README.md)
Exemplos didáticos sem framework, focados em entender a essência de cada padrão.

### [Spring Boot](./lab-padroes-projeto-spring/README.md)
API REST completa com integração à API ViaCEP, banco H2, Swagger e tratamento global de exceções.

---

## Tecnologias

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA / OpenFeign
- H2 Database
- Springdoc OpenAPI (Swagger)
- Maven

---

## Autor

Desenvolvido durante o **Bootcamp Santander 2026 - AI Java Back-end**
Plataforma: [DIO — Digital Innovation One](https://www.dio.me/)
