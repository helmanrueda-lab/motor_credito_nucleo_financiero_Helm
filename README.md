# motor_credito_nucleo_financiero_Helm

## ACA #3
* **Asignatura:** Calidad de Software
* **Código de Asignatura:** / 53325 / SEGUNDO BLOQUE / 26P03
* **Actividad:** Entregable Final - ACA3 - INFORME TÉCNICO DE VALIDACIÓN Y ASEGURAMIENTO DE CALIDAD DE SOFTWARE
* **Institución:** Corporación Unificada Nacional de Educación Superior (CUN)
* **Fecha de Entrega:** septiembre de 2026

## Estudiante / Desarrollador (Individual)
* **Nombre:** Helman Rueda
* **Rol:** Desarrollador & QA Engineer (Líder de Calidad / Analista / Ingeniero de Pruebas)

---

## Descripción del Sistema
Este repositorio contiene el código fuente y las pruebas unitarias automatizadas desarrolladas para el módulo de evaluación de riesgo crediticio de la plataforma (Core Credit Engine v2.1). El sistema implementa una arquitectura híbrida combinando Programación Orientada a Objetos (POO) para el cálculo de cupos financieros y Programación Orientada a Eventos (EDP) para la mensajería asíncrona de pagos.

## Pruebas Unitarias Automatizadas (JUnit 5)
1. `CP-UNI-001`: Validación de aprobación de crédito para solicitantes de bajo riesgo.
2. `CP-UNI-002`: Rechazo automático por incumplimiento de edad mínima legal (menores de 18 años).
3. `CP-UNI-003`: Inyección y validación de excepciones (`IllegalArgumentException`) ante montos solicitados negativos.

## Cobertura y Métricas de Calidad
* **Cobertura de Código (Code Coverage):** 88.4%
* **Densidad de Defectos (DD):** 1.2 defectos/KLOC
* **Complejidad Ciclomática Promedio:** 6.0

## Enlace al Video Pitch (YouTube)
* **URL del Video Pitch:** `https://youtu.be/ntFX9zc83NY`
