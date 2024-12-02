public class Primes {
    public static void main(String[] args) {

        // get inputs
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;


        // Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1];
        isPrime[0] = false;
        isPrime[1] = false;
              for (int i = 2; i <= n; i++) 
               {
               isPrime[i] = true;
               }
        
   
         for (int i = 2; i <= n; i++) {
            for (int p = i; p * p <= n; p++) {
               if (isPrime[p]) {
                   for (int multiple = p * 2; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                    }
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                primeCounter ++;
            }
        }
        double percentage = ((double) primeCounter / (n - 1)) * 100;
        percentage = Math.round(percentage * 100.0) / 100.0;
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + " (" + percentage + " % are primes)");
    }
    }

       
 
