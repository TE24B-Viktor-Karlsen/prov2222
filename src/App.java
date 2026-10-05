
static int addera(int tal1, int tal2){
    return tal1 + tal2;
}

void main() {

    int summaAddera = addera(11, 22);
    IO.println(summaAddera);


    Random slump = new Random();
    int[] tal = new int[10];


    for (int i = 0; i < 10; i++) {
        tal[i] = slump.nextInt(10);
    }


    int max = tal[0];
    for (int i = 0; i < 10; i++) {
        if (tal[i] > max) {
            max = tal[i];
        }
    }
    IO.println(max);


    int summa = 0;
    for (int i = 0; i < 10; i++) {
        summa = summa + tal[i];
    }
    IO.println(summa);
}

// Jag kopierar koden till ett nytt java projekt därför jag skrev i min förra och kan inte publisha den på github