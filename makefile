#This is the makefile used by the make utility to compile the EnDaBi Demos
ENDABI_RSA_DEMO_GUI: ENDABI_RSA_CORE.hpp 3rd_party/isProbablePrime.java 3rd_party/InfInt.h
	javac 3rd_party/isProbablePrime.java
	gdc segmented_sieve.d -o segmented_sieve
	fltk-config --compile ENDABI_RSA_DEMO_GUI.cxx
	g++ ENDABI_RSA_DEMO.cpp -o ENDABI_RSA_DEMO 
