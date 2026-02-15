# Variáveis para facilitar a manutenção
MVN = ./mvnw
APP_NAME = teste-pipeline

# Alvo padrão (roda quando você digita apenas 'make')
all: build

build:
	$(MVN) clean package

run:
	$(MVN) spring-boot:run

clean:
	$(MVN) clean

test:
	$(MVN) test

# Atalho para build e run juntos
up: build run

# Novo comando: Testar e commitar se passar
commit: test
	@echo "Testes concluídos com sucesso! Preparando o commit..."
	git add .
	@read -p "Mensagem do commit: " msg; \
	if [ -z "$$msg" ]; then \
		echo "Erro: A mensagem de commit não pode estar vazia."; \
		exit 1; \
	fi; \
	git commit -m "$$msg"
	@echo "Alterações salvas no git."