# 🛠️ Git & GitHub: Do Zero ao Profissional

Este repositório é o meu laboratório de estudos de controle de versão. Aqui registro comandos, resoluções de problemas reais e boas práticas de versionamento.

---

## 🧠 Lições de Ouro (Aprendidas na Prática)

* **Case Sensitivity no Windows:** Aprendi que o Windows é "cego" para maiúsculas/minúsculas em nomes de pastas, mas o Git e o Java não. Para renomear pastas como `projeto-Login` para `projeto_login`, é necessário usar uma "pasta ponte" ou o comando `git mv` para não quebrar o rastreamento.

* **Rastreabilidade (Status R):** Entendi a importância de usar `git mv` em vez de apenas renomear pelo explorador de arquivos, garantindo que o Git veja uma **Renomeação (R)** e não um arquivo deletado seguido de um novo (U).

* **Limpeza de Ambiente (.gitignore):** Descobri como evitar que arquivos inúteis de IDEs (como `.settings`, `.classpath` e `.class`) poluam o repositório remoto.

* **Ciclo de Segurança:** Mensagens de erro em sistemas devem ser genéricas para proteger a infraestrutura, um conceito de segurança aplicado até nos commits de correção.

---

## 🕹️ Guia de Comandos Essenciais

### 1. Inicialização e Configuração
| Comando | O que ele faz |
| :--- | :--- |
| `git init` | Cria um novo repositório Git local. |
| `git remote add origin <URL>` | Conecta seu repositório local ao GitHub. |
| `.gitignore` | Arquivo para listar o que o Git deve ignorar (ex: pastas de configuração). |

### 2. Fluxo de Trabalho (O Arroz com Feijão)
* `git status`: O comando mais importante para saber o que está acontecendo (Modified, Untracked, Renamed).
* `git add .`: Prepara as alterações para o commit.
* `git commit -m "mensagem"`: Grava um ponto na história do projeto.
* `git push origin main`: Envia seu trabalho para o GitHub.
* `git pull`: Traz as atualizações do GitHub para sua máquina.

### 3. Organização e Limpeza
* `git mv <antigo> <novo>`: Renomeia arquivos mantendo o histórico de commits.
* `git rm --cached <arquivo>`: Remove do GitHub mas mantém o arquivo no seu PC.
* `git checkout -- <arquivo>`: Desfaz alterações locais que ainda não foram comitadas.

### 4. Branches e Colaboração
* `git branch <nome>`: Cria uma nova linha de desenvolvimento.
* `git checkout <nome>`: Muda para a branch desejada.
* `git merge <nome>`: Une o código de uma branch à outra.
* `git stash`: "Esconde" o código atual para mudar de tarefa sem perder o que foi feito.

---

## 📊 Auditoria e Histórico
* `git log`: Histórico completo de quem fez o quê.
* `git shortlog -s -n`: Resumo de quem mais contribuiu no projeto.
* `git diff`: Mostra a diferença exata entre duas versões de um arquivo.