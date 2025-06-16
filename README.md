# literatura
# 📚 Desafío Libros - Alura

Este proyecto en Java con Spring Boot permite explorar libros de la API pública [Gutendex](https://gutendex.com/), almacenar información en una base de datos, y consultar libros y autores a través de un menú interactivo por consola.

## 🚀 Funcionalidades

A través de un menú en consola, el usuario puede:

1. 🔍 Buscar un libro en la web por título y guardarlo en la base de datos.
2. 📖 Mostrar todos los libros buscados y almacenados.
3. 🧠 Buscar un libro almacenado por su título.
4. 📚 Listar todos los libros registrados.
5. ✍️ Listar todos los autores registrados.
6. 🔥 Mostrar los 10 libros más descargados.
7. 🌍 Buscar libros según su idioma (inglés, español, francés, etc.).
8. 🕰️ Consultar qué autores estaban vivos en un año determinado.
9. 🪦 Mostrar los 5 autores con más años de fallecidos (A.C. y D.C.).
10. 🔎 Buscar un autor por su nombre.

## 💡 Tecnologías usadas

- **Java 17+**
- **Spring Boot 3**
- **JPA/Hibernate**
- **PostgreSQL o H2 (según configuración)**
- **API externa:** [Gutendex](https://gutendex.com/)
- **Librerías y herramientas:** Jackson, Maven, Git




## 🌍 API de libros - Gutendex
La aplicación obtiene información de libros desde:
https://gutendex.com/books/



## 📂 Base de datos
El sistema guarda y gestiona:

1. Libros: título, número de descargas, idiomas
2. Autores: nombre, fecha de nacimiento y fallecimiento
3. Relación muchos a muchos entre libros y autores
4. Relación muchos a muchos entre libros y idiomas

## Diagrama ERD
![Texto alternativo](https://github.com/pedro8734/literatura/blob/131f248cd6cc80e28f0fac55bd618592799b8e5d/Diagrama.png)

## 🙋‍♂️ Autor
Proyecto creado por Pedro Montes
Desarrollado como parte del programa de formación de Alura Latam

## 📜 Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

## 📦 Instalación y ejecución

1. Clona este repositorio:

   ```text
    git clone https://github.com/pedro8734/literatura.git

    cd literatura
   

2. Configura tu base de datos en src/main/resources/application.properties.

3. Ejecuta el proyecto:
     ```text
    ./mvnw spring-boot:run
   
5. Interactúa con el menú desde consola.

## 🏗️ Estructura del proyecto

```text
└── src
    └── main
        ├── java
        │   └── com.aluracursos.desafioLibros
        │       ├── principal          # Clase Principal.java con el menú interactivo
        │       ├── model              # Clases modelo: Libro, Autor, DatosLibros, Datos, etc.
        │       ├── repository         # Interfaces de repositorio JPA
        │       └── service            # Servicios de consumo de API y conversión de datos
        └── resources
            └── application.properties ```







