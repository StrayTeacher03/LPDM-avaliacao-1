# Cartão de Perfil Profissional Digital

## Descrição do Projeto
Este projeto consiste em um aplicativo Android nativo desenvolvido como parte da 1ª Avaliação Prática da disciplina de Laboratório de Programação para Dispositivos Móveis (LPDM). O aplicativo exibe um cartão de perfil profissional digital em uma única tela, contendo imagem de topo, saudação sobreposta a um fundo, informações de identificação, seção "Sobre" e dados de contato organizados de forma otimizada e modular.

## Tecnologias Utilizadas
* **Linguagem:** Kotlin
* **Kit de UI:** Jetpack Compose (Desenvolvimento 100% declarativo, sem XML)
* **IDE:** Android Studio (Versão Ladybug | 2024.2.1 ou superior)
* **Arquitetura de UI:** Material Design 3

## Como Compilar e Executar o Projeto
1. Certifique-se de ter o **Android Studio** instalado e configurado com o SDK do Android 10 (API 29) ou superior.
2. Clone este repositório executando o seguinte comando no terminal:
   ```bash
   git clone https://github.com
   ```
3. Abra o Android Studio e selecione a opção **Open**.
4. Navegue até a pasta onde o projeto foi clonado e clique em **OK**.
5. Aguarde a sincronização inicial do Gradle terminar completamente.
6. Selecione o dispositivo virtual (Emulador Pixel 4 API 29 configurado) ou conecte um dispositivo físico com depuração USB ativada.
7. Clique no botão **Run** (ícone do triângulo verde na barra superior) ou pressione `Shift + F10` para compilar e instalar o app.

## Estrutura de Componentes e Responsabilidades

* **`MainActivity`**: Ponto de entrada do aplicativo. Responsável por iniciar a Activity, ativar o layout de ponta a ponta (`enableEdgeToEdge`) e injetar o tema e o container `Scaffold` que envolve a interface.
* **`Greeting`**: Função composable principal da tela. Gerencia a disposição estrutural através de uma `Column` centralizada horizontalmente, aplicando cor de fundo (`Color(0xFFE0F7FA)`) e espaçamentos internos nas bordas.
* **`CriarRegistro`**: Função composable própria e reutilizável criada especificamente para otimizar as linhas de contato do perfil. Ela recebe o ID do recurso gráfico como `Int` (`icone`), a `String` com os dados do contato (`texto`) e repassa o `modifier`, encapsulando os dados em uma estrutura horizontal de `Row` e eliminando a repetição redundante de código.

## Hierarquia de Composables (Diagrama Textual)

```text
MainActivity
└── LPDMAtividade1Theme
    └── Scaffold
        └── Greeting [Column]
            ├── Image (Logo/Avatar de topo)
            ├── Box (Contâiner de sobreposição)
            │   ├── Image (Fundo decorativo)
            │   └── Text ("Erga-se")
            ├── Text (Nome Completo: Keslley Antonio de Almeida Dornelas Junior)
            ├── Text (Cargo: Desenvolvedor Mobile)
            ├── Text ("Sobre:")
            ├── Text (Frase Curta de Apresentação)
            ├── CriarRegistro [Row] -> (Contato 1: Celular Pessoal)
            ├── CriarRegistro [Row] -> (Contato 2: Celular Comercial)
            └── CriarRegistro [Row] -> (Contato 3: Email Comercial)
```

## Identificação do Desenvolvedor
* **Aluno:** Keslley Antonio de Almeida Dornelas Junior
* **Disciplina:** Laboratório de Programação para Dispositivos Móveis (LPDM)
* **Módulo:** 3º Período
* **Instituição:** CEFET-MG - Unidade Conveniada: Campo Belo / MG
