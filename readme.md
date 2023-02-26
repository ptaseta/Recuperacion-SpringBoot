# Proyecto de Recuperación Wordle

## Descripción

Este proyecto ha sido desarrollado en el editor de VsCode, con el lenguaje de programación Java, y con el framework Spring Boot. Además como gestor de dependencias se ha utilizado Maven. En la siguiente tabla os muestro la la tecnología y versión empleada.

| Tecnología | Versión |
| --         |  --     |
|   java     | 17      |
|spring boot | 3.0.2   |
|   maven    | 4.0.0   |
|    html    | 5.0     |
|bootstrap   | 5.3.0   |

## Funcionamiento

#### Jerarquía y función de paquetes

Para empezar la siguiente imagen explicará como funciona este tipo de proyectos de MVC (Modelo Vista Controlador) aunque en este caso también está el service.


![Mapa conceptual](https://glossar.hs-augsburg.de/w/media/4/4b/VCSM-Schichtenarchitektur_01.png)


En la siguiente imagen podemos ver todos los paquetes y archivos que hay en cada una de ellas. En la carpeta models encontramos la clase Letra, que contiene los atributos privados de cada letra y sus correspondientes getters y setters para poder acceder a ellas.

Luego está la carpeta services, que contiene la clase `WordleService`, que es la que se encarga de realizar la lógica del programa. En esta clase se encuentra los métodos que se encargan de:

* Comprobar las letras de la palabra son correctas con la posición
