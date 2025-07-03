# 🧮 Proyecto: Calculadora de Pagos para Programadores Freelance

## 🔍 Descripción

Este programa en Java simula la liquidación de un programador freelance, calculando su tarifa por hora en función del nivel de experiencia y años trabajados. También registra las horas y bonificaciones de tres clientes, y genera un reporte con subtotal, descuentos, impuestos y total final.

---

## ❌ Problemas encontrados

### 1. Scanner mal declarado

- `Scanner sc = new scanner(system);`

### 2. Imports faltantes

- No se importaron `Scanner` ni `LocalDate`.

### 3. Sintaxis incorrecta en prints

- Paréntesis mal ubicados o faltantes en `System.out.print`

### 4. Variables mal escritas o inexistentes

- `scanner`, `leer`, `sc.nex()`, etc.

### 5. Tarifa base mal escrita

- `tarifaBase = 50,0,0;`

### 6. Variables con errores tipográficos

- `horasProyec1`, `bonusCliene1`, `tarifaHoraFnal`, etc.

### 7. Asignación inválida

- `subtotal ==== pagoProyecto1 + pagoProyecto2 + pagoProyecto3;`

### 8. Lectura de horas comentada

- `horasProyectoX` estaba comentado pero se usaba en operaciones.

---

## 🛠️ Cambios realizados

### ✅ Declaración correcta de Scanner

```java
Scanner sc = new Scanner(System.in);
```

### ✅ Imports agregados

```java
import java.util.Scanner;
import java.time.LocalDate;
```

### ✅ Corrección de System.out.print

Todos los prints corregidos con paréntesis y comillas bien escritas.

### ✅ Variables arregladas

- `scanner` → `sc`
- `leer` → `sc`
- `sc.nex()` → `sc.next()` o `sc.nextLine()` según el caso.

### ✅ Tarifa base corregida

```java
tarifaBase = 50.0;
```

### ✅ Variables corregidas en cálculos

- `horasProyec1` → `horasProyecto1`
- `bonusCliene1` → `bonusCliente1`
- `tarifaHoraFnal` → `tarifaHoraFinal`

### ✅ Asignación válida

```java
subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;
```

### ✅ Lectura de horas restaurada

```java
horasProyecto1 = sc.nextInt();
horasProyecto2 = sc.nextInt();
horasProyecto3 = sc.nextInt();
```

---

## 📅 Fecha de corrección

03 de julio de 2025

---

## 🤖 Herramientas de apoyo utilizadas

- **ChatGPT (OpenAI):** análisis, explicación de errores y sugerencias de código.
- **IntelliJ IDEA:** edición y depuración del proyecto.
- **Documentación oficial de Java:** referencia para `Scanner`, `LocalDate` y estructura de código.

