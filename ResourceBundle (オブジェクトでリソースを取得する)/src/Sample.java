import java.util.ResourceBundle;

public class Sample
{
    public static void main( String[] args )
    {
        ResourceBundle bundle = ResourceBundle.getBundle("jp.gorigori.res");
        System.out.println(bundle.getObject("test.data") );
    }
}