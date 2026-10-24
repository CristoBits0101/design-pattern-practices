# Prácticas de patrones de diseño en Java

Ejemplos ejecutables de los **14 patrones seleccionados en [Tech Training](https://github.com/CristoBits0101/tech-training/blob/main/src/data/design-patterns.ts)**. Cada práctica muestra el problema que resuelve el patrón y cómo colaboran sus clases.

## Requisitos y ejecución

- JDK 17 o posterior.
- Maven 3.9 o posterior.

Compilar y ejecutar las pruebas de regresión:

```bash
mvn clean verify
```

Ejecutar los 14 ejemplos:

```bash
mvn compile exec:java
```

Ejecutar una práctica concreta. Las comillas también permiten usar estos comandos en PowerShell:

```bash
mvn compile exec:java "-Dexec.mainClass=com.patterns.creational.factorymethod.Main"
mvn compile exec:java "-Dexec.mainClass=com.patterns.behavior.visitor.Main"
mvn compile exec:java "-Dexec.mainClass=com.patterns.behavior.strategy.Main"
```

La clase de entrada predeterminada es `com.patterns.Main`. Cada carpeta de patrón conserva su propio `Main`.

## Patrones creacionales

Definen cómo se crean los objetos.

| Patrón | Qué demuestra | Práctica |
| --- | --- | --- |
| Simple Factory | Elige la clase que instancia según el argumento recibido y devuelve su objeto mediante una interfaz común. | [Precios EUR y USD](src/main/java/com/patterns/creational/factory) |
| Factory Method | Una clase base reutiliza un proceso y sus subclases deciden qué producto crear al redefinir el método de creación. | [Notificaciones por correo y SMS](src/main/java/com/patterns/creational/factorymethod) |
| Builder | Configura un objeto paso a paso y entrega el resultado al llamar a `build()`. | [Construcción de vehículos](src/main/java/com/patterns/creational/builder) |
| Prototype | Crea un objeto copiando el estado de otro existente. El alcance de la copia depende de su implementación. | [Copias de coche y moto](src/main/java/com/patterns/creational/prototype) |
| Singleton | Mantiene una instancia compartida y proporciona un punto de acceso a ella. | [Contador compartido](src/main/java/com/patterns/creational/singleton) |

## Patrones estructurales

Definen cómo se componen los objetos para formar estructuras.

| Patrón | Qué demuestra | Práctica |
| --- | --- | --- |
| Adapter | Adapta una interfaz para que un componente pueda utilizarse mediante el contrato esperado por el cliente. | [Adaptador de LED](src/main/java/com/patterns/structural/adapter) |
| Decorator | Añade comportamiento envolviendo un objeto con otro que conserva su interfaz. | [Funciones de teléfono](src/main/java/com/patterns/structural/decorator) |
| Facade | Ofrece un acceso común que coordina las operaciones de varios componentes. | [Cine en casa](src/main/java/com/patterns/structural/facade) |

## Patrones de comportamiento

Definen cómo colaboran los objetos y se reparten responsabilidades.

| Patrón | Qué demuestra | Práctica |
| --- | --- | --- |
| Iterator | Recorre una colección mediante un contrato de iteración sin exponer su almacenamiento. | [Recorrido de usuarios](src/main/java/com/patterns/behavior/iterator) |
| Mediator | Coordina la comunicación entre objetos para reducir sus dependencias directas. | [Comunicación entre participantes](src/main/java/com/patterns/behavior/mediator) |
| Observer | Notifica a los objetos suscritos cuando ocurre un evento. | [Estación y receptores](src/main/java/com/patterns/behavior/observer) |
| State | Delega el comportamiento de un objeto en el objeto que representa su estado actual. | [Estados de un teléfono](src/main/java/com/patterns/behavior/state) |
| Strategy | Permite cambiar el algoritmo que utiliza un contexto mediante una interfaz común. | [Métodos de pago](src/main/java/com/patterns/behavior/strategy) |
| Visitor | Separa las operaciones de las clases sobre las que actúan y selecciona la operación según el tipo de elemento. | [Área y perímetro de figuras](src/main/java/com/patterns/behavior/visitor) |

## Diferencias que conviene practicar

### Simple Factory y Factory Method

`PriceFactory.create(country)` elige una implementación con un `switch` y devuelve un `PriceService`. El cliente usa el objeto devuelto para consultar el precio.

`NotificationService.notifyUser(message)` contiene el flujo común de validación y envío. Llama a `createNotification()` y cada subclase decide si crea una notificación por correo o por SMS. Así se reutiliza el proceso aunque cambie el producto que necesita.

### Strategy y Visitor

En **Strategy** el contexto de pago cambia entre `CreditCardPayment` y `PayPalPayment` mediante `setStrategy()`. El ejemplo de pagos que antes estaba en la carpeta `visitor` pertenece ahora a `strategy` y su interfaz se llama `PaymentStrategy`.

En **Visitor** una colección contiene objetos `Circle` y `Rectangle` mediante la interfaz `Shape`. Cada figura implementa `accept(visitor)` y llama a la sobrecarga `visit` correspondiente a su tipo. `AreaVisitor` y `PerimeterVisitor` aplican operaciones distintas sobre las mismas figuras. Se puede añadir otra operación creando un visitante sin modificar esas clases de figuras.

## Detalles de las prácticas

- **State:** `Phone()` crea el estado inicial con una referencia válida al propio teléfono. El ejemplo recorre las transiciones hasta volver al estado desbloqueado.
- **Singleton:** la instancia se crea con `static final`. La inicialización de la clase es segura entre hilos. El ejemplo también sincroniza los accesos al contador. Una secuencia de varias llamadas sigue necesitando su propia coordinación si debe ser atómica.
- **Builder:** `return this` devuelve el mismo builder para encadenar pasos. Cada `build()` crea un vehículo nuevo para que reutilizar el builder no modifique vehículos anteriores.
- **Prototype:** los ejemplos copian campos primitivos y cadenas. Si se añaden atributos que referencien objetos mutables hay que decidir cuáles se comparten y cuáles se copian.

El ejemplo anterior de Strategy con almacenamiento de usuarios se conserva en `UsersStorageExample`:

```bash
mvn compile exec:java "-Dexec.mainClass=com.patterns.behavior.strategy.UsersStorageExample"
mvn compile exec:java "-Dexec.mainClass=com.patterns.behavior.strategy.UsersStorageExample" "-Dexec.args=file"
```

La primera variante utiliza memoria. La segunda añade usuarios a `usuarios.txt` en el directorio de ejecución. No borra los registros anteriores y cierra los recursos después de cada operación.

Las pruebas comprueban las transiciones de State y las diferencias observables entre Factory Method, Strategy y Visitor. También cubren la reutilización de Builder, la identidad compartida de Singleton y la conservación del almacenamiento entre instancias.
