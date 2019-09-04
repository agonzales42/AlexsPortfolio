all: Lab8

Date.o: Date.cpp Date.h
	g++ -c Date.cpp

LongDate.o: LongDate.cpp LongDate.h
	g++ -c LongDate.cpp

Lab8.o: Lab8.cpp
	g++ -c Lab8.cpp

Lab8: Lab8.o Date.o LongDate.o
	g++ Lab8.o Date.o LongDate.o -o Lab8

clean:
	rm *.o
