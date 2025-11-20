💪 AppFitLife

Asignatura: Desarrollo de Aplicaciones Móviles (DSY1105)
Integrantes: Javiera Marchesse – Elena Espinoza
Sección: 004D
Docente: Atanacio Montano

📱 Descripción del Proyecto

AppFitLife es una aplicación móvil desarrollada en Kotlin + Jetpack Compose (Material 3) que promueve hábitos saludables mediante herramientas como:

Registro y visualización de actividad física

Control de hidratación

Gestión de rutinas diarias

Perfil personal

Integración con microservicios propios

Consumo de API externa

El proyecto se basa en una problemática real: la falta de motivación y seguimiento de hábitos saludables. La app busca entregar una herramienta intuitiva para mejorar el bienestar físico y la organización personal.

🧱 Arquitectura del Proyecto
🧩 Arquitectura general

MVVM (Model-View-ViewModel)

Repositorios para manejo de datos

ViewModels para la lógica y estados

UI declarativa con Jetpack Compose

📦 Estructura principal
AppFitLife/
│── app/
│   ├── ui/ (pantallas y componentes)
│   ├── viewmodel/
│   ├── repository/
│   ├── network/ (API externa + microservicios)
│   └── data/ (modelos, DataStore)
│
└── backend/
    ├── controller/
    ├── model/
    ├── service/
    └── resources/

🧪 Funcionalidades Principales
📲 En la App Móvil

Pantallas diseñadas con Material 3

Formularios con validaciones (login, registro, rutinas, etc.)

Navegación fluida con Navigation Compose

Gestión de estado reactiva (StateFlow / MutableState)

Integración con microservicios (Retrofit)

Consumo de API externa (JSONPlaceholder)

Persistencia local mediante DataStore

🌐 En el Backend (Spring Boot)

Microservicios con endpoints REST funcionales

Controladores estructurados

Lógica basada en listas en memoria
(válido porque el profesor indicó que no era necesario BD para esta entrega)

🔗 Integraciones
📡 Integración con Microservicios Propios

La app se comunica con el backend mediante Retrofit:

http://10.0.2.2:8080/api/

🌍 API Externa Consumida

Se integra JSONPlaceholder para mostrar datos externos:

https://jsonplaceholder.typicode.com/

🧪 Pruebas Unitarias

La aplicación incluye pruebas unitarias usando:

Kotest

MockK

Test de ViewModels

Test de Repositories

Las pruebas cubren el flujo principal de obtención de datos y lógica UI, cumpliendo el indicador IE 3.2.1.

📦 APK Firmado

La entrega incluye:

APK firmado en modo Release: app-release.apk

Archivo .jks utilizado en la configuración

build.gradle configurado con signingConfigs

Cumple con el indicador IE 3.3.1.

🛠 Tecnologías Utilizadas
📱 Frontend

Kotlin

Jetpack Compose (Material 3)

Navigation Compose

ViewModel + StateFlow

Retrofit + Gson

DataStore

🖥 Backend

Spring Boot

REST Controllers

Maven

Dependencias Spring Web

🔐 Distribución

Firma de APK

Keystore propia

🌐 Gestión y Control

GitHub (commits distribuidos, ramas, versionamiento)

Trello (planificación y seguimiento de tareas)

🧭 Instrucciones de Ejecución
▶️ Ejecutar la App Móvil

Abrir el proyecto en Android Studio.

Sincronizar Gradle.

Ejecutar en emulador o dispositivo físico.

Nota: Para comunicación con backend en emulador, se utiliza 10.0.2.2.

▶️ Ejecutar Backend (Spring Boot)

Abrir carpeta /backend

Ejecutar:
mvn spring-boot:run

El backend expone sus endpoints en:
http://localhost:8080/api/

📋 Cumplimiento de Rúbrica – Evaluación Parcial 5 (Experiencia 3)
Indicador	Cumple	Descripción
IE 3.1.1 – App móvil completa	✅	Pantallas, flujos, validaciones y navegación funcional sin errores.
IE 3.1.2 – Microservicios propios	✅	Endpoints operativos. BD no requerida según instrucciones del docente.
IE 3.1.3 – Integración app ↔ microservicios	✅	Retrofit conectado al backend, envío y recepción de datos.
IE 3.1.4 – API externa	✅	JSONPlaceholder integrado a la UI.
IE 3.2.1 – Pruebas unitarias	✅	ViewModels y repositorios probados.
IE 3.3.1 – APK firmado	✅	Se incluye APK + .jks y configuración Gradle.
IE 3.3.2 – GitHub y Trello	✅	Repositorio activo, commits distribuidos y tablero Trello utilizado.

🙌 Conclusión
AppFitLife cumple completamente con los requisitos del Encargo y la Experiencia 3, integrando microservicios, API externa, pruebas unitarias, APK firmado, planificación colaborativa y una app estable y funcional desarrollada con buenas prácticas.
AppFitLife cumple completamente con los requisitos del Encargo y la Experiencia 3, integrando microservicios, API externa, pruebas unitarias, APK firmado, planificación colaborativa y una app estable y funcional desarrollada con buenas prácticas.
