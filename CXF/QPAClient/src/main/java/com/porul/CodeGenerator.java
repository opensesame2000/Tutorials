package com.porul;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {
public static void main(String[] args) {
WSDLToJava.main(new String[] {
"-client",
"-p", "http://porul.com/QPAService=com.porul.qpa",
"-d", "src/main/java",
"src/main/resources/QPAService.wsdl" });
System.out.println("Done!");
}
}