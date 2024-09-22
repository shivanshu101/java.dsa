// public class Recursion3{
//    public static void printPerm(String str, String permutation){
//       if(str.length() == 0){
//        System.out.println(permutation);
//        return;

//       }

//        for(int i=0; i<str.length(); i++){
//            char currchar = str.charAt(i);
//             abc -> "ab" time complexity = O(n!)
//            String newstr = str.substring(0, i) + str.substring(i+1);
//            printPerm(newstr, permutation+currchar);
//        }
//     }

//     public static void main(String[] args){
//        String str = "abc";
//        printPerm(str,"" );

//    }
// }

// Q count total paths in a maze to move from (0,0) to (n,m)   try again

// public class Recursion3{

//   public static int countPaths(int i, int j, int n, int m) {
//     if(i == n || j == m){
//      return 0;
//     }
//      if(i == n-1 && j == m-1){
//         return 1;
//      }
//       move downwarld
//      int downPaths = countPaths(i+i,j,n,m);

//       move right
//      int rightPaths = countPaths(i, j+1, n, m);

//      return downPaths + rightPaths; 
//    }
//    public static void main(String[] args){
//    int n = 3 , m = 3;
//    int totalPaths = countPaths(0, 0, n, m);
//    System.out.println(totalPaths);
//    }
// }

// Q place tiles of size 1xm in a floar of maximum

// public class Recursion3 {
 
//   public static int placeTiles(int n, int m){
//      if(n == m){
//         return 2 ;
//      }

//      if(n < m) {
//         return 1 ;
//     }
//       verticat
//      int vertPlacement = placeTiles(n-m, m);

//       horizontal
//      int horPlacement = placeTiles(n-1, m);

//    return vertPlacement + horPlacement;
//    }

//    public static void main(String[] args){
//     int n = 4, m = 2;
//     System.out.println(placeTiles(n, m));
//    }
//    }

// Q find the number of ways in which you can invite n numbers of people to your party . single or in pairs

// public class Recursion3 {

  // public static int callGuests(int n) {
  //  if(n <= 1){
  //      return 1;
  //  } 

    // single
   // int ways1 = callGuests(n-1);

    // pair
   // int ways2 = (n-1) * callGuests(n-2);

  //  return ways1 + ways2;
  //  }

   // public static void main(String[] args){
   //  int n = 4;
  //  System.out.println(callGuests(n));
  // }
  //  }

  //Q find the number of ways in which you can invite n people to your party, single or in pairs
   // find error and learn its itself and also currect
   import javautil.*;

   public class Recursion3{
  public static void printSubset(ArrayList<Integer> subset){
    for(int i=-0; i<subset.size(); i++){
      System.out.print(subset.get(i) +" ");
    }
    System.out.println();
  }
  public static void findSusets(int n, ArrayList<Integer> subset){
    if(n == 0){
      printsubset(subset);
      return;
    }
    // add hoga
    subset.add(n);
    findSubsets(n-1, subset);

    // add nai hoga
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
  }
public static void main(String[] args) {
  int n = 3;
  ArrayList<Interger> subset = new ArrayList<>();
  findSubsets(n, subset);
} 
 }