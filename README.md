# Proyecto Pokémon

**Autor:** Franco Ismael Raguza

---
## <img src="src/main/resources/static/img/pokeball.svg.webp" width="24" height="24" alt="Poké Ball"> Descripcion
Aplicación web hecha con Spring Boot y Thymeleaf con fines educativos del mitico juego "Pokémon" para aplicar conocimientos de clase.
Pokémon es propiedad de Nintendo, Creatures Inc. y GAME FREAK. Proyecto de fan sin ánimo de lucro.

---
## <img src="src/main/resources/static/img/pokeball.svg.webp" width="24" height="24" alt="Poké Ball"> Peticiones

| Método | Ruta | Qué hace | Respuesta del navegador |
|--------|------|----------|-------------------------|
| GET | `/` | Página de bienvenida con el formulario de entrenador | Página (`index`) |
| POST | `/login` | Valida el nombre (3-15 caracteres) | Si es inválido: página `index` con el error. Si es válido: redirección a `/pokemons` |
| GET | `/pokemons` | Lista todos los Pokémon | Página (`pokemon`) |
| GET | `/pokemons/{id}` | Ficha detallada del Pokémon con ese id | Página (`detallePokemon`) si existe; redirección a `/notfound` si no |
| GET | `/notfound` | Aviso de Pokémon no encontrado | Página (`notfound`) |

---
## <img src="src/main/resources/static/img/pokeball.svg.webp" width="24" height="24" alt="Poké Ball"> Features
- features/fase1

---
## <img src="src/main/resources/static/img/pokeball.svg.webp" width="24" height="24" alt="Poké Ball"> Versión
Version: **v1.0.0**
