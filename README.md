# Comandos para inicializar seu projeto: 

git init 
git add . (Caso queira subir apenas o arquivo coloque o nome dele ao invés de colocar o ponto)
git commit -m ""
git branch -M main
git remote add origin (Url que o git vai te fornecer)
git push -u origin main

# Comando para verificar alterações: 
git status

# Comando para commit específico: 
git commit -a (nome do arquivo) -m "sua mensagem"

# Comando para receber mudanças: 
git pull

# Comando para clonar um repositório: 
git clone 

# Remover arquivos do repositório: 
git rm

# Verificar atualizações via log: 
git log

# Renomear arquivos ou ser movido para outro local: 
git mv

# Desfazendo alterações
git checkout 

# Ignorar arquivos no projeto
.gitignore

# Criar Branches: 
git branch <nome>

# Deletar branches: 
git branch -d ou -delete

# Mudar branches: 
git checkout -b <nome>

# Unindo branches: 
git merge <nome>

# Prosseguir com uma solução sem perder o código
git stash

# Recuperar arquivos stash:
git stash list > git stash apply (numero que o cmd vai informar)

# Removendo a stash
git stash list > git stash drop (numero da stash que ele informar)

# utilizando tags para banches para demarcar o estágio do desenvolvimento:
git tag -a <nome> -m "<msg>"

# Verificar tags
git show <nome>

# Alterar tags 
git checkout <nome>

# Enviar tags ao repositório 
git push origin (nome tag) --tags

# Encontrando branches:
git fetch

# Trabalhando com submódulos: 
git submodule add <repo>

# Verificar submódulos: 
git submodule

# Enviar para o repositório os submodules:
git push --recurse-submodules=on-demand