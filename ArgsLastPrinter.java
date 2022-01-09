public class ArgsLastPrinter {
    public static void main(String[] args) {
      if (args.length == 0) {
        System.out.println("引数なし");
      } else {
        System.out.println(args[args.length -1]); 
      }
    }
  }