# Anàlisi de males pràctiques - GestorReserves

| # | Mala pràctica | On (classe/mètode/var.) | Patró de refacció suggerit |
| :--- | :--- | :--- | :--- |
| 1 | Nom no descriptiu | Classe R | Rename Class (ex: GestorReserves) |
| 2 | Classe Déu (massa responsabilitats) | Classe R | Extract Class |
| 3 | Noms de variables poc clars | Ex: var1, a, b | Rename Variable |
| 4 | Codi duplicat | Mètodes de càlcul | Extract Method |
| 5 | "Magic Numbers" (números fixos sense explicar) | Preus o IDs | Replace Magic Number with Symbolic Constant |