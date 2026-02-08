# Práctica 2 – Creación de una API REST con Spring Boot

## Descripción general

Este repositorio contiene la **Práctica 2** de la asignatura, cuyo objetivo es el diseño e implementación de una **API REST** utilizando **Spring Boot**, siguiendo el estilo arquitectónico **request/response sobre HTTP**.

La API implementa operaciones **CRUD (Create, Read, Update, Delete)** sobre un recurso llamado **Carrito**, que modela de forma simplificada el estado de una compra en un sistema de e-commerce.

---

## Objetivo de la práctica

- Introducir el desarrollo de servicios web REST.
- Aplicar los conceptos básicos de **Spring MVC**.
- Implementar correctamente los métodos HTTP y códigos de estado.
- Diseñar una API sencilla y clara sin uso de base de datos persistente.

---

## Modelo de dominio: Carrito

El recurso **Carrito** representa una compra en curso y contiene las siguientes propiedades:

| Campo          | Tipo    | Descripción |
|----------------|---------|-------------|
| idCarrito      | Long    | Identificador único del carrito |
| idArticulo     | String  | Identificador del artículo |
| descripcion    | String  | Descripción del artículo |
| numeroUnidades | Integer | Número de unidades del artículo |
| precioFinal    | Double  | Precio total del carrito |

**Simplificación aplicada**:  
Cada carrito solo puede contener **un único producto** (no existe lista de líneas).

---

## Arquitectura y tecnología

- **Java**
- **Spring Boot**
- **Spring Web / Spring MVC**
- Almacenamiento **en memoria** mediante `ConcurrentHashMap`
- Proyecto gestionado con **Maven**

No se utiliza base de datos externa; los datos se mantienen en memoria durante la ejecución.

---

## Endpoints de la API

### Crear un carrito
- **Método**: `POST`
- **Ruta**: `/api/carrito`
- **Descripción**: Crea un nuevo carrito y genera automáticamente su identificador.
- **Códigos de respuesta**:
  - `201 CREATED`

---

### Obtener un carrito por id
- **Método**: `GET`
- **Ruta**: `/api/carrito/{idCarrito}`
- **Descripción**: Devuelve el carrito con el identificador indicado.
- **Códigos de respuesta**:
  - `200 OK`
  - `404 NOT FOUND` (si no existe)

---

### Obtener todos los carritos
- **Método**: `GET`
- **Ruta**: `/api/carrito`
- **Descripción**: Devuelve la lista de todos los carritos existentes.
- **Códigos de respuesta**:
  - `200 OK`

---

### Actualizar un carrito
- **Método**: `PUT`
- **Ruta**: `/api/carrito/{idCarrito}`
- **Descripción**: Actualiza completamente un carrito existente.
- **Códigos de respuesta**:
  - `202 ACCEPTED`
  - `404 NOT FOUND` (si no existe)

---

### Eliminar un carrito
- **Método**: `DELETE`
- **Ruta**: `/api/carrito/{idCarrito}`
- **Descripción**: Elimina un carrito por su identificador.
- **Códigos de respuesta**:
  - `204 NO CONTENT`
  - `404 NOT FOUND` (si no existe)

---


---

## Conclusión

Este proyecto implementa una API REST funcional y sencilla, cumpliendo con los requisitos de la **Práctica 2**, utilizando correctamente Spring Boot, los métodos HTTP y los códigos de estado, manteniendo un diseño claro y fácilmente extensible.

---
