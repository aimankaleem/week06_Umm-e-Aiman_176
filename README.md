# Week 06: Interfaces, Multiple Realization & Decoupled Polymorphism

## Student Information
- **Name:** Umm-e-Aiman
- **Seat Number:** 176
- **Course:** Object-Oriented Programming (CS)

---

## Technical Architecture & Core Interfaces

1. **`Drawable` & `Resizable` Interfaces:**
   - Define pure behavioral contracts (`draw()` and `resize(double factor)`).
   - Decouple capability from class inheritance, allowing independent objects to adhere to shared protocols.

2. **Abstract Class vs. Interface Separation:**
   - **`Shape` (Abstract Class):** Maintains shared state (`color`) and fundamental geometric computations (`calculateArea()`, `calculatePerimeter()`).
   - **Interfaces:** Realized across derived subclasses (`Circle`, `Rectangle`) to enable multi-faceted polymorphic processing.

3. **Multiple Interface Realization:**
   - Both `Circle` and `Rectangle` implement `Drawable` and `Resizable`, satisfying multiple role contracts concurrently.

---

## Compilation & Execution Guide

```bash
# Compile all source files
javac src/*.java

# Run interface test suite
java -cp src Main

# Capture execution output
java -cp src Main > SampleOutput.txt