JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: classes

.include.mk:
	@echo JAVA  = $(shell find . -name '*.java') >> $@
	@echo MAIN  = $$(grep 'public static void main' $(shell find . -name '*.java') | cut -d: -f 1) >> $@

-include .include.mk

CLASSES=$(JAVA:.java=.class)

classes: $(CLASSES)

clean:
	$(RM) $(CLASSES) *~ .include.mk
