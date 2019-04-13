# Lab 9
## Comparison
In the functional solution, I defined a new interface for operations that's being taken by each handler. The operation function is passed into `handleRequest` as a parameter, and executed whenever necessary. This way, we can define different operations for each event handling. Adding more flexibility to the handlers compare to the original implementation.