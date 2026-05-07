# Anàlisi de males pràctiques - GestorSessions

| # | Mala pràctica | On (classe/mètode/var.) | Patró de refacció suggerit |
| :--- | :--- | :--- | :--- |
| 1 | Mètode massa llarg | Mètodes de validació principals | Extract Method |
| 2 | Obsessió pels tipus primitius | Ús de strings/enters per a tot | Replace Data Value with Object |
| 3 | Lògica condicional complexa | Molts if/else niuats | Decompose Conditional |
| 4 | Manca de cohesió | Barreja de responsabilitats diferents | Move Method / Extract Class |
| 5 | Comentaris innecessaris | Explicant codi que hauria de ser obvi | Introduce Explanatory Variable |