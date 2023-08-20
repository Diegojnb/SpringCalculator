# SpringCalculator

Este es un microservicio simple de calculadora que expone un API para realizar operaciones aritméticas básicas. El microservicio está construido con Spring Boot y Swagger.

## Requisitos

- Java (versión 8)
- Apache Maven 3.8.7

## Compilación

Para compilar el proyecto, asegúrate de tener Java y Maven instalados y luego ejecuta el siguiente comando:

```bash
mvn clean install
```

# Ejecución
Siguiendo los pasos anteriores, bastaría con ejecutar el comando en la carpeta raíz del proyecto:

mvn spring-boot:run

El microservicio estará disponible en http://localhost:10000/swagger-ui/# . (puerto definido en application.properties, modificar si es necesario)

# API Endpoints
## Suma
Realiza una suma de dos números.

```
GET /sum?v1=<valor>&v2=<valor>
```
# Resta
Realiza una resta entre dos números.

```
GET /subtract?v1=<valor>&v2=<valor>
```

# Incluyendo Traceo
Este microservicio incluye una biblioteca de traceo que registra el resultado de las operaciones realizadas. La biblioteca se encuentra en el archivo lib/traceo-api.jar.

