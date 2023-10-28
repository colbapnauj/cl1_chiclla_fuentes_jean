# CL1 Lenguaje de Programación 2

Este proyecto Java ofrece una aplicación de consola para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos de empleados. Utiliza JPA para la gestión de la persistencia.

## Clases en el Paquete `domain`

### 1. Clase `Empleado`

La clase `Empleado` representa a un trabajador y tiene los siguientes atributos:

- `id` (Long): Identificador único del empleado.
- `apellidoPaterno` (String): Apellido paterno del empleado.
- `apellidoMaterno` (String): Apellido materno del empleado.
- `nombres` (String): Nombres del empleado.
- `nroHijos` (Integer): Número de hijos del empleado.
- `sueldo` (Double): Sueldo del empleado.
- `fechaNacimiento` (LocalDate): Fecha de nacimiento del empleado.

Además, proporciona métodos para acceder y modificar estos atributos.

### 2. Clase `JpaTest`

La clase `JpaTest` es una clase de prueba que demuestra el uso de JPA para realizar operaciones CRUD en la base de datos de empleados.

### 3. Clase `Program`

La clase `Program` es la clase principal que contiene el bucle de interacción con el usuario. Permite al usuario seleccionar opciones para probar las operaciones CRUD en la base de datos de empleados.

## Uso de la Aplicación

1. Ejecuta el programa y sigue las instrucciones en la consola para seleccionar una opción.
2. Las opciones disponibles son:
   - **1. Guardar 3 Empleados**: Guarda tres nuevos empleados en la base de datos.
   - **2. Modificar Primer empleado**: Modifica el primer empleado en la base de datos.
   - **3. Eliminar Primer empleado**: Elimina el primer empleado de la base de datos.
   - **4. Buscar empleado con id 3**: Busca un empleado con el ID 3 en la base de datos.
   - **-1. Salir**: Sale del programa.

## Autor
- **Jean Paul Chiclla**
