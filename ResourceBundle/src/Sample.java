import java.util.ResourceBundle;

public class Sample
{
    public static void main( String[] args )
    {
        ResourceBundle bundle = ResourceBundle.getBundle("res");
        System.out.println(bundle.getString( "test.data1" ) );
        System.out.println(bundle.getString("test.data2"));
    }
} 