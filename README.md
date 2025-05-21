# Proyecto LaboratorioCalificado02

Este repositorio contiene la solución completa del **Examen Calificado 02** para el curso de Desarrollo de Aplicaciones Móviles. El proyecto está dividido en tres ejercicios:

1. **Ejercicio 1: Agenda de Contactos en Consola**
2. **Ejercicio 2: Mostrar/Ocultar Vista en UI**
3. **Ejercicio 3: Registro de Pedidos e Intents**

---

## Tecnologías y Herramientas

* Android Studio Arctic Fox o superior
* Kotlin
* Android SDK API 26+
* ConstraintLayout
* ViewBinding
* Vector Assets para íconos

---

## Estructura del Proyecto

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/cabello/franco/laboratoriocalificado02
│   │   │   ├── Agenda.kt
│   │   │   ├── Contacto.kt
│   │   │   ├── Main.kt
│   │   │   ├── Ejercicio01Activity.kt
│   │   │   ├── Ejercicio02Activity.kt
│   │   │   └── PedidoActivity.kt
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_main.xml
│   │       │   ├── activity_ejercicio01.xml
│   │       │   ├── activity_ejercicio02.xml
│   │       │   └── activity_pedido.xml
│   │       ├── drawable/
│   │       │   ├── data_extraction_rules.xml
│   │       │   ├── ic_person.xml
│   │       │   ├── ic_phone.xml
│   │       │   ├── ic_shopping_cart.xml
│   │       │   ├── ic_location.xml
│   │       │   └── circle_border.xml
│   │       └── values/
│   │           └── strings.xml
└── build.gradle
```

---

## Ejercicio 1: Agenda de Contactos en Consola

**Archivos involucrados:**

* `Agenda.kt` – Clase que administra una lista de `Contacto`.
* `Contacto.kt` – Data class con campos: nombres, apellidos, número y carrera.
* `Main.kt` – Punto de entrada en consola con menú para agregar, listar y buscar contactos.

**Cómo ejecutar:**

1. Abre `Main.kt` en Android Studio.
2. Click derecho ▶ **Run 'MainKt'**.
3. En la consola interactiva, elige las opciones:

   * **1**: Agregar contacto
   * **2**: Listar todos
   * **3**: Buscar por nombre
   * **0**: Salir

---

## Ejercicio 2: Control de Componentes UI

**Archivos involucrados:**

* `activity_ejercicio01.xml` – Layout con un `View` verde y dos botones (Mostrar/Ocultar).
* `Ejercicio01Activity.kt` – Activity que utiliza ViewBinding para cambiar la visibilidad del `View`.

**Características:**

* ConstraintLayout como root.
* ViewBinding habilitado en `build.gradle` (`buildFeatures.viewBinding = true`).
* Botones al 50% del ancho en cadena horizontal.
* Drawable `circle_border.xml` para esquinas redondeadas (opcional).

**Cómo probar:**

1. Asegúrate de que `Ejercicio01Activity` sea la launcher en `AndroidManifest.xml`.
2. Run ▶ **app**.
3. Pulsa **Mostrar** y **Ocultar**, verificando el cambio de visibilidad.

---

## Ejercicio 3: Registro de Pedidos e Intents

**Archivos involucrados:**

* `activity_ejercicio02.xml` – Formulario con 5 `EditText` (Nombre, Número, Productos, Ciudad, Dirección) y 4 botones (Registrar, Llamar, WSP, MAPS).
* `Ejercicio02Activity.kt` – Activity que valida campos, muestra toasts y lanza `PedidoActivity`.
* `activity_pedido.xml` – Segunda pantalla “Pedido” con 4 filas de icono + texto y 3 botones inferiores.
* `PedidoActivity.kt` – Recupera los extras del Intent y los muestra en la UI.

**Funcionalidades:**

1. **Validación**: Todos los campos deben tener texto antes de registrar.
2. **Intent Explícito**: `btnRegistrar` abre `PedidoActivity`, pasando los datos.
3. **Intents Implícitos** (simulados): `btnLlamar`, `btnWhatsApp` y `btnMaps` muestran `Toast` con mensajes personalizados.
4. **Vector Assets**: Íconos SVG para persona, teléfono, carrito y ubicación.
5. **UI Resposiva**: ConstraintLayout + `width=0dp` en vistas clave.

**Cómo probar:**

1. En `AndroidManifest.xml`, configura `Ejercicio02Activity` como launcher.
2. Run ▶ **app**.
3. Completa el formulario y prueba cada botón:

   * **Registrar** ▶ va a la pantalla Pedido.
   * **Llamar/WSP/MAPS** ▶ muestra mensajes en pantalla.

---

## Notas Finales

* Mantén tu Android Studio sincronizado después de cambios en `build.gradle` o recursos.
* Usa **Clean ▶ Rebuild** frecuentemente ante errores de recursos o IDs.
* Asegúrate de que el `package` en el Manifest coincide con tus clases Kotlin.
* No dejes recursos hard-coded: utiliza `strings.xml` para textos visibles.

¡Listo! Con esta guía tienes todo el detalle para entender y ejecutar el Examen Calificado 02 completo.
