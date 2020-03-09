# 207946252
# gilkarl
compile: bin
	find src -name "*.java" > sources.txt
	javac -cp biuoop-1.4.jar: -d bin @sources.txt
run:
	java -cp biuoop-1.4.jar:bin:resources Ass7Game level_sets2.txt
jar:
	jar -cfm ass7game.jar MANIFEST -C bin . -C resources .
bin:
	mkdir bin
