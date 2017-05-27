package app.chien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       System.out.println( "Hello World!" );
       TestBean bean = new TestBean();
       System.out.println("bean : " + bean);
       
       
       try {
    	   new NonNullExample();
       } catch (Exception e) {
    	   // TODO: handle exception
       }
       
       
       BuilderExample b = BuilderExample.builder()
       	.id(1).name("").shape(null).build();
       
       new LogExample().test01();;
       
       
        
    }
}
