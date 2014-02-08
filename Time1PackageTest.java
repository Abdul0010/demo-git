import com.detil.jhtp;
public class Time1PackageTest
{
   public static void main( String[] args )
   {
      Time1 time = new Time1(); // invokes Time1 constructor
	  System.out.print( "The initial universal time is: " );
	  System.out.println( time.toUniversalString() );
   }
}