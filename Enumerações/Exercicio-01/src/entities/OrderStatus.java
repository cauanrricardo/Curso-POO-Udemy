package entities;

public enum OrderStatus {

    PENDING_PYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;

}
// enum são classes especiais usadas para representar conjuntos fixos de constantes
/*
1️⃣ um enum é uma classe, não uma String, mas pode ser convertido para String
2️⃣ cada valor do enum é um objeto dessa classe
3️⃣ ideal para representar categorias fixas (status, tipos, dias da semana, etc.)
 */
