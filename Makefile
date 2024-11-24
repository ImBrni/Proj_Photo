SRC=$(wildcard *.java)
COMPILED=$(wildcard *.class)
PROJECT_NAME="Proj_Photos"

all: $(SRC)
	javac $^

create-jar: all
	jar cfe $(PROJECT_NAME).jar Main $(COMPILED)

run: create-jar
	java -jar $(PROJECT_NAME).jar $(ARGS)

clean:
	rm -rf *.class *.jar
