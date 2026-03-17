public class UC3_HelloApp {
	public static void main(string[] args){
	   string name="World";
	   if(args.length>0){
	      name=args[0];
	   }
	   system.out.println("Hello,"+name+"!");
	}
}