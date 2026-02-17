# 🔐 Spring Security JWT Backend

API REST de autenticación y autorización con JWT, construida con Spring Boot 3 y Spring Security 6.

## 🛠️ Tecnologías
- Java 17 · Spring Boot 3.2.3 · Spring Security 6
- JWT (JJWT 0.12.3) · JPA/Hibernate · MariaDB · Lombok

## 🚀 Endpoints
| Método | Ruta | Acceso |
|--------|------|--------|
| POST | `/auth/register` | Público |
| POST | `/auth/login` | Público |
| GET | `/user/test` | ROLE_USER |
| GET | `/admin/test` | ROLE_ADMIN |

## ▶️ Cómo ejecutar
1. Clona el repositorio
2. Copia `application.properties.example` → `application.properties`
3. Configura tu BD en `application.properties`
4. Inserta los roles en MySQL:
   \```sql
   INSERT INTO role (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');
   \```
5. Ejecuta: `./mvnw spring-boot:run`
