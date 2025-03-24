📚 Sistema de Gestión de Biblioteca en Java 📚

Este proyecto es un sistema de gestión de biblioteca desarrollado en Java, que permite administrar libros, registrar usuarios y gestionar préstamos de manera eficiente. Su diseño modular y estructurado facilita la escalabilidad y el mantenimiento del código, asegurando una experiencia intuitiva tanto para los usuarios como para los desarrolladores que trabajen con él.

📌 Objetivo del Proyecto

Este sistema busca proporcionar una solución simple pero efectiva para la gestión de bibliotecas, permitiendo:

✅ Registrar nuevos libros y usuarios.

✅ Gestionar préstamos y devoluciones de libros.

✅ Consultar la disponibilidad de los libros.

✅ Ver el historial de préstamos de cada usuario.

🛠️ Decisiones de Diseño

Para garantizar un código limpio, organizado y escalable, se aplicaron los principios de Programación Orientada a Objetos (POO), dividiendo la funcionalidad en cuatro clases principales:

📖 Clases Implementadas

Libro.java → Representa los libros dentro del sistema, con atributos como título, autor, ISBN, año de publicación y disponibilidad.

Usuario.java → Representa a los usuarios registrados, almacenando información como ID, nombre, correo electrónico y su historial de préstamos.

Prestamos.java → Se encarga de administrar el proceso de préstamo y devolución, incluyendo el cálculo de fechas de devolución y posibles retrasos.

Biblioteca.java → Actúa como el gestor principal, encargándose de manejar la colección de libros, los usuarios y los préstamos activos.

También se implementó Main.java, que permite interactuar con el sistema para probar sus funcionalidades.

⚙️ Decisiones Técnicas
Para garantizar un rendimiento eficiente y un código escalable, se tomaron en cuenta las siguientes decisiones técnicas:

1️⃣ Uso de Listas Dinámicas (ArrayList):Se utilizó la clase ArrayList para almacenar libros, usuarios y préstamos, ya que permite agregar o eliminar elementos de forma flexible sin necesidad de definir un tamaño fijo.

private List<Libro> libros = new ArrayList<>();
private List<Usuario> usuarios = new ArrayList<>();
private List<Prestamos> prestamos = new ArrayList<>();

2️⃣ Manejo de Fechas (Date): El sistema calcula automáticamente la fecha de préstamo y la fecha de devolución prevista utilizando la clase Date. El período de préstamo es de 14 días, aunque este valor puede ajustarse según las necesidades.

java
Copiar
Editar
this.fechaDePrestamo = new Date();
this.fechaDeDevolucionPrevista = new Date(fechaDePrestamo.getTime() + (14L * 24 * 60 * 60 * 1000));
3️⃣ Encapsulación y Métodos de Acceso:Para mantener un código seguro y modular, se implementó encapsulación, restringiendo el acceso directo a los atributos mediante getters y setters. Esto evita manipulaciones indebidas de los datos y permite mayor flexibilidad en futuras modificaciones.

4️⃣ Validaciones y Control de Flujo:Se incorporaron validaciones para evitar errores y mejorar la experiencia del usuario. Por ejemplo, antes de prestar un libro, se verifica su disponibilidad:


public void prestarLibro() {
    if (disponibilidad) {
        disponibilidad = false;
    } else {
        System.out.println("El libro no está disponible.");
    }
}

🔧 Funcionalidades Detalladas

📌 Gestión de Libros

📖 Se pueden registrar nuevos libros en el sistema mediante el método agregarLibro(). Cada libro contiene información como:

Título
Autor
Año de publicación
ISBN
Disponibilidad

🧑‍💻 Gestión de Usuarios
👤 Se pueden registrar usuarios con un ID único, nombre y correo electrónico. Cada usuario tiene un historial de préstamos que permite rastrear los libros que ha tomado prestados.

📕 Préstamos de Libros
📦 Un usuario puede solicitar el préstamo de un libro, siempre que esté disponible. Al realizar el préstamo, el libro se marca como no disponible hasta su devolución.

🔄 Devolución de Libros
📚 Los usuarios pueden devolver los libros prestados. Una vez devuelto, el libro vuelve a estar disponible para otros usuarios.

🔍 Consulta de Disponibilidad
📌 Se puede verificar la disponibilidad de un libro en cualquier momento, asegurando que los usuarios tengan acceso a la información en tiempo real.

📊 Historial de Préstamos
📜 Se puede consultar el historial de préstamos de cada usuario, lo que facilita el seguimiento de los libros que ha tomado prestados y la detección de posibles retrasos en la devolución.

⚡ Uso del Proyecto

🚀 Pasos para Interactuar con el Sistema:

1️⃣ Crea instancias de Libro, Usuario y Prestamos.
2️⃣ Registra los libros y los usuarios en la clase Biblioteca.
3️⃣ Realiza préstamos y devoluciones.
4️⃣ Consulta la disponibilidad de los libros.
5️⃣ Verifica el historial de préstamos de los usuarios.

Este sistema puede ejecutarse desde la consola o integrarse en una aplicación gráfica para mejorar la experiencia del usuario.

📄 Conclusión

El Sistema de Gestión de Biblioteca en Java se diseñó con un enfoque modular y orientado a objetos, lo que facilita la organización, mantenimiento y escalabilidad del código.

Gracias a la implementación de listas dinámicas (ArrayList), el sistema permite una gestión flexible de libros, usuarios y préstamos.

La clase Date permite manejar eficientemente las fechas de préstamo y devolución, facilitando el control del tiempo de préstamo.

Se incorporaron validaciones y controles de flujo para garantizar la correcta operación del sistema, evitando errores como prestar libros no disponibles.

Este proyecto proporciona una base sólida para futuras expansiones y mejoras, como la incorporación de una interfaz gráfica, una base de datos o la posibilidad de enviar notificaciones automáticas a los usuarios sobre sus préstamos y devoluciones.

Con una documentación clara y estructurada, el código es fácil de entender y modificar, permitiendo que otros desarrolladores colaboren y amplíen las funcionalidades sin dificultad. 🚀📚

