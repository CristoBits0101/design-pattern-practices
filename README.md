# 14 patrones de diseño en Java

Cada patrón se estudia en **un archivo autocontenido** con un problema concreto y una ejecución breve. El catálogo coincide con los [14 patrones seleccionados en Tech Training](https://github.com/CristoBits0101/tech-training/blob/main/src/data/design-patterns.ts).

## Método de estudio

1. **Problema:** lee la primera frase y piensa cómo lo resolverías.
2. **Idea:** identifica quién crea el objeto o a quién se delega el trabajo.
3. **Observa:** empieza por el `main` y predice su salida antes de ejecutarlo.
4. **Practica:** realiza el pequeño cambio propuesto en las tablas.
5. **Explica:** cuenta en una frase qué puedes cambiar gracias al patrón y qué código permanece igual.

Al terminar, identifica un caso en el que usarías el patrón y otro en el que su estructura añadiría trabajo innecesario.

Cada ejemplo conserva los tipos necesarios para reconocer su estructura. Los nombres describen su función y los comentarios explican las decisiones. Cada archivo contiene un `Main` público y los tipos del patrón con acceso de paquete. Así puedes leer la colaboración completa y distinguir el cliente de las clases que utiliza.

## Ejecutar

Requisitos: **JDK 17 o posterior y Maven 3.9 o posterior**.

```bash
# Compilar y comprobar los comportamientos con las pruebas.
mvn clean verify

# Ejecutar todos los patrones en el orden de estudio.
mvn compile exec:java

# Ejecutar sólo un patrón. Las comillas también sirven en PowerShell.
mvn compile exec:java "-Dexec.mainClass=com.patterns.creational.factorymethod.Main"
```

Para ejecutar otro patrón cambia el nombre del paquete. Por ejemplo: `com.patterns.behavior.visitor.Main` o `com.patterns.behavior.strategy.Main`.

## 1. Creación de objetos

| Patrón y código | Pregunta que resuelve | Prueba tú |
| --- | --- | --- |
| [Simple Factory](src/main/java/com/patterns/creational/factory/Main.java) | ¿Qué clase instancio según un dato? | Añade un canal `push` a la fábrica. |
| [Factory Method](src/main/java/com/patterns/creational/factorymethod/Main.java) | ¿Cómo reutilizo un proceso si el producto lo decide una subclase? | Añade un creador para `push` conservando el proceso común. |
| [Builder](src/main/java/com/patterns/creational/builder/Main.java) | ¿Cómo construyo un objeto por pasos? | Reutiliza el builder para crear otro coche y comprueba el primero. |
| [Prototype](src/main/java/com/patterns/creational/prototype/Main.java) | ¿Cómo creo un objeto a partir de otro ya configurado? | Renombra la copia y comprueba que el original conserva su título. |
| [Singleton](src/main/java/com/patterns/creational/singleton/Main.java) | ¿Cómo accedo siempre a una misma instancia? | Obtén tres referencias y compara su identidad con `==`. |

**Comparación clave:** Simple Factory y Factory Method utilizan las mismas notificaciones de correo y SMS y producen la misma salida. En Simple Factory decide el argumento de `create(channel)`. En Factory Method la clase base reutiliza `notifyUser(message)` y cada subclase redefine `createNotification()`.

## 2. Composición de objetos

| Patrón y código | Pregunta que resuelve | Prueba tú |
| --- | --- | --- |
| [Adapter](src/main/java/com/patterns/structural/adapter/Main.java) | ¿Cómo utilizo una interfaz incompatible desde el contrato esperado? | Cambia el voltaje dentro del adaptador y conserva el cliente. |
| [Facade](src/main/java/com/patterns/structural/facade/Main.java) | ¿Cómo coordino varios componentes con una llamada? | Añade un proyector al proceso de la fachada. |
| [Decorator](src/main/java/com/patterns/structural/decorator/Main.java) | ¿Cómo añado comportamiento combinando envoltorios? | Intercambia leche y azúcar y compara el precio y la descripción. |

**Comparación clave:** Adapter traduce un contrato. Facade coordina varios componentes. Decorator conserva el contrato del objeto que envuelve y añade comportamiento.

## 3. Colaboración y comportamiento

| Patrón y código | Pregunta que resuelve | Prueba tú |
| --- | --- | --- |
| [Strategy](src/main/java/com/patterns/behavior/strategy/Main.java) | ¿Cómo cambio el algoritmo que usa un contexto? | Añade una forma de pago conservando el contexto. |
| [Observer](src/main/java/com/patterns/behavior/observer/Main.java) | ¿Cómo notifico a los objetos que se han suscrito? | Da de baja a un lector y publica otra noticia. |
| [Iterator](src/main/java/com/patterns/behavior/iterator/Main.java) | ¿Cómo recorro una colección sin conocer su almacenamiento? | Crea dos iteradores y avanza sólo uno. |
| [Mediator](src/main/java/com/patterns/behavior/mediator/Main.java) | ¿Cómo coordino objetos sin que se comuniquen directamente entre ellos? | Añade un tercer usuario y comprueba quién recibe el mensaje. |
| [State](src/main/java/com/patterns/behavior/state/Main.java) | ¿Cómo cambia la respuesta de un objeto según su estado? | Predice el resultado de pulsar el botón tres veces. |
| [Visitor](src/main/java/com/patterns/behavior/visitor/Main.java) | ¿Cómo añado operaciones sobre distintos tipos de elementos? | Añade un visitante que calcule el coste de pintar cada figura. |

**Comparación clave:** en Strategy el contexto recibe un algoritmo intercambiable. En State el estado actual determina la respuesta y puede iniciar una transición. En Visitor cada figura acepta un visitante y le entrega su tipo concreto mediante `visit(this)`.

## Qué conviene conservar al simplificar

- **Factory Method:** el proceso común debe utilizar el producto creado por el método que redefinen las subclases.
- **Builder:** cada `build()` entrega un objeto nuevo. `return this` devuelve el mismo builder para continuar configurándolo.
- **Prototype:** copiar un objeto no implica copiar en profundidad todos los objetos que referencia. Este ejemplo usa cadenas inmutables.
- **Singleton:** la inicialización con `static final` protege la creación de la instancia. Añadir atributos mutables exigiría estudiar su sincronización por separado.
- **Iterator:** cada recorrido tiene su propio cursor y `next()` lanza `NoSuchElementException` al agotarse.
- **Visitor:** conserva `accept(visitor)` y las operaciones `visit` por tipo. El ejemplo calcula área y perímetro sobre las mismas figuras.

Las pruebas comprueban estas propiedades y los efectos observables de cada patrón. Los ejemplos trabajan en memoria y muestran sus resultados en consola.
