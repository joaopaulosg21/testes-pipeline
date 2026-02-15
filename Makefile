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