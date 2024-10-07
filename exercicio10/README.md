
# API REST para Aplicativo de Música

Equipe: Lucas Perito Lopes, Marcos Vinicius Goudinho da Silva, Nicolas Andrade de Freitas 

## Casos de Uso:
1. Acessar e gerenciar as playlists de um usuário.
2. Acessar e gerenciar os detalhes dos usuários.

## Recursos:
- Usuários
- Playlists

---

## Endpoints

### 1. Retornar um usuário
- **Descrição**: Retorna os detalhes de um usuário específico.
- **URI**: `/usuarios/{usuario-id}`
- **Método HTTP**: `GET`
- **Corpo**: Vazio
- **Resposta Esperada**:
  ```json
  {
    "id": "123",
    "nome": "João Silva",
    "email": "joao@email.com"
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Usuário não foi encontrado.

### 2. Criar um novo usuário
- **Descrição**: Cria um novo usuário na plataforma.
- **URI**: `/usuarios`
- **Método HTTP**: `POST`
- **Corpo**:
  ```json
  {
    "nome": "Maria Souza",
    "email": "maria@email.com",
    "senha": "senhaSegura123"
  }
  ```
- **Resposta Esperada**:
  ```json
  {
    "id": "456",
    "nome": "Maria Souza",
    "email": "maria@email.com"
  }
  ```
- **Erros Esperados**:
  - `400 Bad Request`: Dados inválidos.

### 3. Atualizar os dados de um usuário
- **Descrição**: Atualiza os detalhes de um usuário existente.
- **URI**: `/usuarios/{usuario-id}`
- **Método HTTP**: `PUT`
- **Corpo**:
  ```json
  {
    "nome": "Maria Souza",
    "email": "maria.atualizado@email.com"
  }
  ```
- **Resposta Esperada**:
  ```json
  {
    "id": "456",
    "nome": "Maria Souza",
    "email": "maria.atualizado@email.com"
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Usuário não foi encontrado.
  - `400 Bad Request`: Dados inválidos.

### 4. Deletar um usuário
- **Descrição**: Remove um usuário da plataforma.
- **URI**: `/usuarios/{usuario-id}`
- **Método HTTP**: `DELETE`
- **Corpo**: Vazio
- **Resposta Esperada**: 
  ```json
  {
    "mensagem": "Usuário removido com sucesso."
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Usuário não foi encontrado.

### 5. Retornar playlists de um usuário
- **Descrição**: Retorna todas as playlists criadas por um usuário.
- **URI**: `/usuarios/{usuario-id}/playlists`
- **Método HTTP**: `GET`
- **Corpo**: Vazio
- **Resposta Esperada**:
  ```json
  [
    {
      "id": "789",
      "nome": "Rock Classics",
      "musicas": ["Stairway to Heaven", "Bohemian Rhapsody"]
    },
    {
      "id": "101",
      "nome": "Pop Hits",
      "musicas": ["Blinding Lights", "Levitating"]
    }
  ]
  ```
- **Erros Esperados**:
  - `404 Not Found`: Usuário não foi encontrado.

### 6. Criar uma nova playlist
- **Descrição**: Cria uma nova playlist para um usuário.
- **URI**: `/usuarios/{usuario-id}/playlists`
- **Método HTTP**: `POST`
- **Corpo**:
  ```json
  {
    "nome": "Novas Favoritas",
    "musicas": ["Peaches", "Leave the Door Open"]
  }
  ```
- **Resposta Esperada**:
  ```json
  {
    "id": "102",
    "nome": "Novas Favoritas",
    "musicas": ["Peaches", "Leave the Door Open"]
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Usuário não foi encontrado.
  - `400 Bad Request`: Dados inválidos.

### 7. Atualizar uma playlist
- **Descrição**: Atualiza os detalhes de uma playlist existente de um usuário.
- **URI**: `/usuarios/{usuario-id}/playlists/{playlist-id}`
- **Método HTTP**: `PUT`
- **Corpo**:
  ```json
  {
    "nome": "Novas Favoritas Atualizada",
    "musicas": ["Peaches", "Stay"]
  }
  ```
- **Resposta Esperada**:
  ```json
  {
    "id": "102",
    "nome": "Novas Favoritas Atualizada",
    "musicas": ["Peaches", "Stay"]
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Playlist ou usuário não foi encontrado.
  - `400 Bad Request`: Dados inválidos.

### 8. Deletar uma playlist
- **Descrição**: Remove uma playlist de um usuário.
- **URI**: `/usuarios/{usuario-id}/playlists/{playlist-id}`
- **Método HTTP**: `DELETE`
- **Corpo**: Vazio
- **Resposta Esperada**:
  ```json
  {
    "mensagem": "Playlist removida com sucesso."
  }
  ```
- **Erros Esperados**:
  - `404 Not Found`: Playlist ou usuário não foi encontrado.
