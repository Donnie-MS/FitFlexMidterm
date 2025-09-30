# Parcial de Objetos II

## Consideraciones Iniciales

- El código entregado debe compilar obligatoriamente. Un parcial entregado cuyo código no compila queda desaprobado automáticamente.

- Se realizará un control exhaustivo, incluyendo distintas herramientas de análisis estático de código para identificar posibles copias entre las soluciones entregadas.

- La solución debe aplicar patrones de diseño apropiados para la problemática planteada.

- El código entregado debe tener los test suficientes que garantice el correcto funcionamiento de la solucion que propone el alumno

- No se aceptan entregas fuera de plazo ni que no estén correctamente subidas al repositorio del classroom de la materia

# 🏋️ FitFlex

📘 **Contexto**  
Se nos encomienda desarrollar el módulo de **sugerencia de entrenamientos** de la nueva aplicación de fitness **FitFlex**. La idea principal es agregar una funcionalidad que permita sugerir entrenamientos de la plataforma a los usuarios registrados que ya tienen un **perfil fitness** definido. Cada usuario de la plataforma debe contar con la funcionalidad de **aceptar o no la sugerencia de un entrenamiento** de acuerdo al **perfil fitness** que tenga definido.

---

## 🧠 Perfil Fitness

Cada usuario registrado debe tener asociado un **perfil fitness**, que puede cambiar cuando lo desee. Actualmente existen los siguientes perfiles (y podrían agregarse más en el futuro):

- 🏃 **Tipo de entrenamiento**: El usuario define qué tipos de entrenamiento acepta en las sugerencias. Puede elegir más de uno (por ejemplo: Cardio, Yoga, Caminata, Fuerza, Crossfit, Spinning, etc).
- 🆕 **Nivel Moderno**: Define a partir de qué año acepta entrenamientos. Por ejemplo, si configura 2023, solo recibirá entrenamientos creados desde ese año en adelante.
- 🎧 **Con Audio en el idioma Original**: Solo recibe sugerencias de entrenamientos que estén narrados en el idioma original del entrenamiento.
- 🔀 **Mixto**: Puede combinar más de un perfil y acepta sugerencias si se cumple **al menos una** de las condiciones configuradas.

---

## 🏋️ Entrenamientos

Cada entrenamiento registrado en la plataforma cuenta con la siguiente información:

- 📛 **Nombre**
- 📅 **Año de creación**
- 🧬 **Tipo de entrenamiento**
- 🗣️ **Idioma original del instructor**
- 🎧 **Audios disponibles**: Lista de idiomas disponibles (por ejemplo: ['español', 'portugués'])

Un entrenamiento se considera **narrado en el idioma original** si tiene audio en el mismo idioma del instructor.  
Pueden existir entrenamientos sin audios adicionales o en idiomas distintos al original.  
Por ejemplo, un entrenamiento con idioma original Japonés y audios solo en ['español', 'inglés'] no está narrado en su idioma original.

---

## 👤 Usuarios

Los usuarios tienen los siguientes atributos:

- 📧 **Mail**
- 🏋️ **Perfil fitness** . Por default es **Tipo de Entrenamiento** configurado solo con "Caminata", pero puede cambiarlo cuando lo desee.
- 📋 **Lista de entrenamientos sugeridos**

Los usuarios pueden aceptar o no sugerencias de entranamiento. Y pueden agregar un entrenamiento a la lista de entrenamientos sugeridos. Estas dos operaciones deben ser independientes.

---

## 💻 La Plataforma

La plataforma mantiene el registro de todos los usuarios y entrenamientos. En cualquier momento se pueden:

- ➕ Agregar o ➖ quitar **entrenamientos**
- ➕ Agregar o ➖ quitar **usuarios**

Además la plataforma debe tener la funcionalidad de realizar un proceso de **sugerencia** que consiste en evaluar cada entrenamiento contra el **perfil fitness** de cada usuario, y en el caso de que el usuario acepta la sugerencia de entrenamiento debe sumarlo a la lista de **entrenamientos sugeridos**.

## Test

Realizar el Conjunto de Test que garanticen que la solución funciona y cuando mayor sea el grado de covertura mejor es. A continuación te dejamos algunos nombres de ejemplos para los test de perfiles, usuario y plataforma.

### Perfiles

- **dado** Un Entrenamiento De Un Tipo _ **cuando** Se Evalua Perfil Por Un Tipo Aceptado _ **entonces** Es Aceptado
- **dado** Un Entrenamiento De Un Tipo _ **cuando** Se Evalua Perfil Por Un Tipo NO Aceptado _ **entonces** NO Es Aceptado()
- **dado** Un Entrenamiento Narrado En Su Idioma Origina l* **cuando** Se Evalua Con Perfil Audio Original * **entonces** Es Aceptado
- **dado** Un Entrenamiento NO Narrado En SuIdioma Original _ **cuando** Se Evalua Con Perfil Audio Original _ **entonces** NO Es Aceptado

### Usuario

- **dado** Un Usuario Con Perfil De Tipo _ **cuando** Recibe Entrenamiento Compatible _ **entonces** Lo Acepta.

### Plataforma

- **dado** Un Usuario Y Un Entrenamiento Compatible _ **cuando** Se Ejecuta Sugerencia entrenamiento **entonces** Es Sugerido Al Usuario y lo acpeta.
  -- **dado** Un Entrenamiento _ **cuando** Se Quita De La Plataforma \_ **entonces** Ya No Esta En La Lista De Entrenamientos
