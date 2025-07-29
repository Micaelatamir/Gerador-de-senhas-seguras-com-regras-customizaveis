# Gerador-de-senhas-seguras-com-regras-customizaveis

# Gerador de Senhas Seguras em Java

Este é um gerador de senhas seguras e customizáveis desenvolvido em Java. O programa permite que o usuário defina as regras para criação da senha, incluindo tamanho e quais tipos de caracteres devem ser incluídos.

## Funcionalidades

- Define o tamanho da senha
- Permite escolher se a senha terá:
  - Letras maiúsculas
  - Letras minúsculas
  - Números
  - Caracteres especiais
- Garante que pelo menos um caractere de cada categoria selecionada esteja presente na senha
- Gera senhas aleatórias usando `SecureRandom` para maior segurança
- Embaralha os caracteres para evitar padrões previsíveis

## Como usar

No arquivo `PasswordGenerator.java`, no método `main`, ajuste os parâmetros para personalizar a senha:

```java
int length = 12;            // tamanho da senha
boolean useUpper = true;    // incluir letras maiúsculas
boolean useLower = true;    // incluir letras minúsculas
boolean useNumbers = true;  // incluir números
boolean useSpecial = true;  // incluir caracteres especiais

EXEMPLO DE SAIDA
Senha gerada: A9!fG2#kLp0@


