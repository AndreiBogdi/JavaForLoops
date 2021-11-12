public class Lab4 {
    public static void main(String[] args){
        int x=1;
        LogicalOperations op = new LogicalOperations();
        System.out.println("Exercitiul 1: ");
        while(x<=100){

                System.out.println(x);
                x++;

        }
        System.out.println("Exercitiul 2: ");
        op.getEnumeration(2,-100);
        System.out.println("Exercitiul 3:");
        op.getEnumeration2Parameters(5,15);
        System.out.println("Exercitiul 4:");
        op.getCompareParameters(6,3);
        System.out.println("Exercitiul 5:");
        op.getEvenNumbersEnumeration(1,100);
        System.out.println("Exercitiul 6:");
        op.getOddNumbersEnumeration(1,100);
        System.out.println("Exercitiul 7:" + op.getSumFromInterval(90,100));
        System.out.println("Exercitiul 8:" +op.getSumAverageFromInterval(50,100));



    }
}
