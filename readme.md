# Proyecto de Recuperación Wordle

#### Autor

Este proyecto ha sido creado por [Wanru Zhou](https://github.com/ptaseta/Recuperacion-SpringBoot).

## Descripción

Este proyecto ha sido desarrollado en el editor de VsCode, con el lenguaje de programación Java, y con el framework Spring Boot. Además como gestor de dependencias se ha utilizado Maven. En la siguiente tabla os muestro la tecnología y versión empleada.

| Tecnología | Versión |
| --         |  --     |
|   java     | 17      |
|spring boot | 3.0.2   |
|   maven    | 4.0.0   |
|    html    | 5.0     |
|bootstrap   | 5.3.0   |

## Funcionamiento

### Jerarquía y función de paquetes

Para empezar la siguiente imagen explicará como funciona este tipo de proyectos de MVC (Modelo Vista Controlador) aunque en este caso también está el service.

<p align="center">
  <img src="https://glossar.hs-augsburg.de/w/media/4/4b/VCSM-Schichtenarchitektur_01.png">
</p>

En la siguiente imagen podemos ver todos los paquetes y archivos que hay en cada una de ellas. En la carpeta models encontramos la clase `Letra`, que contiene los atributos privados de cada letra y sus correspondientes getters y setters para poder acceder a ellas.

<p align="center">
  <img src="recuperacion\src\main\resources\imgs\Packages.png">
</p>

##### Service

Luego está la carpeta services, que contiene la clase `WordleService`, que es la que se encarga de realizar la lógica del programa. En esta clase se encuentra los métodos que se encargan de:

* Comprobar las letras de la palabra son correctas con la posición.
* Añade y almacena las palabras intentadas a una lista.
* Los métodos que hemos creado se los pasa a la interfaz `IWordleService`.

##### Controller

En la carpeta controllers tenemos la clase `WordleController`, que es la que se encarga de recibir las peticiones del cliente y devolver la vista correspondiente. En esta clase se encuentra:

* Se encarga de recibir las peticiones del cliente y devolver la vista correspondiente.
* Usa las anotaciones @GetMapping y @PostMapping para mostrar la vista antes y despues de enviar la palabra.

##### Templates

En la carpeta views tenemos la carpeta templates, que contiene la vista de la página web. En esta carpeta se encuentra el archivo `index.html`, que es la vista que se muestra al cliente. En esta vista se encuentra:

* La view del `index` que es donde está el juego.
* La view del `buscador` que es donde se muestra el buscador de palabras intentadas.

##### Repository

En la carpeta repository tenemos la clase `WordleRepository`, que es la que se encarga de almacenar las palabras intentadas. En esta clase se encuentra:

* `IWordleRepository` que es la interfaz que contiene los métodos que se van a usar en la clase `WordleRepository`.
* `WordleRepository` que es la clase que contiene los métodos que se van a usar en la clase WordleService y que implementa la interfaz `IWordleRepository`.
* Hay 3 `WordleRepository`, uno para cada profile de dificiltad (facil, medio, dificil).

## Demostración del juego

Asi es como se ve el juego. Como se puede ver hay una nueva funcionalidad que es la de la pista que va cambiando en funcion del profile y el popup de has ganado o has perdido que salta:

<p align="center">
  <img src="recuperacion\src\main\resources\imgs\Demostracion.gif">
</p>

Ahora muestro el buscador:

<p align="center">
  <img src="recuperacion\src\main\resources\imgs\Buscador.gif">
</p>
