package forReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



public class A {
    private String secretField;
    @Target({ElementType.TYPE
            , ElementType.METHOD
            , ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE
            , ElementType.PACKAGE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    @interface SecretField {
        String secretField();
    }

    @SecretField(secretField = "fieldName")
    public A() {
    }

    public A(String string){

    }
}
