@@ -1,2 +1,29 @@
# motor_credito_nucleo_financiero_Helm
ACA3 - Calidad de Software

## Información del Proyecto Académico - CUN
* **Asignatura:** Calidad de Software
* **Código de Asignatura: /53325/SEGUNDO BLOQUE/26P03
* **Actividad:** Entregable Final - ACA3
* **Institución:** Corporación Unificada Nacional de Educación Superior (CUN)
* **Fecha de Entrega:** 13 de septiembre de 2026

## Integrantes del Grupo
1. Helman Rueda - (Líder de Calidad / Test Manager), (Analista de Pruebas / Test Analyst), (Ingeniero de Pruebas / Test Engineer)

---

## Descripción del Sistema
Este repositorio contiene el código fuente y las pruebas unitarias automatizadas desarrolladas para el módulo de evaluación de riesgo crediticio de la plataforma **XYZ FinTech / AssureAI** (Core Credit Engine v2.1)[cite: 2, 3]. El sistema implementa una arquitectura híbrida combinando Programación Orientada a Objetos (POO) para el cálculo de cupos financieros y Programación Orientada a Eventos (EDP) para la mensajería asíncrona de pagos[cite: 3].

## Pruebas Unitarias Automatizadas (JUnit 5)
1. `CP-UNI-001`: Validación de aprobación de crédito para solicitantes de bajo riesgo.
2. `CP-UNI-002`: Rechazo automático por incumplimiento de edad mínima legal (menores de 18 años).
3. `CP-UNI-003`: Inyección y validación de excepciones (`IllegalArgumentException`) ante montos solicitados negativos[cite: 1, 3].

## Cobertura y Métricas de Calidad
* **Cobertura de Código (Code Coverage):** 88.4%[cite: 2, 4]
* **Densidad de Defectos (DD):** 1.2 defectos/KLOC[cite: 3, 4]
* **Complejidad Ciclomática Promedio:** 6.0[cite: 4]

## Enlace al Video Pitch (YouTube)
* **URL del Video Pitch:** `https://www.youtube.com/watch?v=[Tu_Enlace_De_YouTube]`
