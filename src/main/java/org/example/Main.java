void main() {
    println("Hello...");
    String name = readln();
    System.out.println("name: " + name);

    unnamedVariables();
}


void unnamedVariables() {

    try{
        Integer.parseInt("teste");
    } catch (NumberFormatException _) {
        System.out.println("error...");
    }

    IntStream.range(0, 5).forEach(_ -> System.out.println("unnamed"));
}