public class LogicalOperations {
    public float getAverageFromInterval(int start, int max) {
        float sum = 0;
        for (int i = start; i <= max; i++) {
            sum = i + sum;
        }
        return sum / 100;
    }

    public void getEnumeration(int numar, int max) {
        numar = 2;
        max = -100;
        for (int i = numar; i >= max; i--) {
            System.out.println(i);
        }
    }

    public void getEnumeration2Parameters(int x, int y) {

        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void getCompareParameters(int x, int y) {

        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    public void getEvenNumbersEnumeration(int x, int y) {
            for (int i = x; i <= y; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

    }
    public void getOddNumbersEnumeration(int x, int y){
        for(int i=x; i<=y;i++){
            if(i % 2!=0){
                System.out.println(i);
            }
        }
    }
    public int getSumFromInterval(int start, int max){
        int sum =0;
        for(int i=start;i<=max;i++){
            sum =i + sum;
        }
          return sum;
    }
    public float getSumAverageFromInterval(int start, int max){
        int sum =0;
        for(int i=start;i<=max;i++){
            sum =i + sum;
        }
        return (float) sum/(max - start + 1);
    }
    //public void tipar(String start, int max){
     //   start =*;
     //   max =*******;
     //   for(int i=start;i<=max;i++){

   //     }
  //  }
}