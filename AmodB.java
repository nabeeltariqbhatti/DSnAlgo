public class AmodB{
static int mod(int a, int b) {
if (b <= 0) {
return -1;
}
int div = a / b;
return a - div * b;
}
    public static void main(String[] args) {

	    //O(1)
	    //suppose you take 2%5
	    //then int div = 2/5 which is actually 0 because in will ignore 
	    //digits after decimal point so div = 0
	    //next 2 - (0*5) will return 2(which is mod)
	    //second case 5 % 2 
	    //div = 2 (note .5 will e ignored)
	    // 5 - (2*2) returns 1
	    // in short if a number id=s divisble by second the mod is 0
	    // if not then 1. and if number a/b gives the value 0.** then a is the mod
        System.out.println(mod(5,2)); 
    }
}
