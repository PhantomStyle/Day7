package forReflection;


import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        App app = new App();
        System.out.println(app.readSecretField(new A()));
    }

    public String readSecretField (Object o) throws NoSuchFieldException {
        A.SecretField annotation = (A.SecretField) ReflectionHelper.findAnnotatedConstructor(o.getClass(), A.SecretField.class).getAnnotation(A.SecretField.class);
        return (String) ReflectionHelper.getFieldValue(o.getClass(), annotation.secretField());
    }

}
