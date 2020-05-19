package prototype;

/**
 * @fileName: PrototypePatternDemo
 * @author: Cloud
 * @create: 2020-05-14
 * @description:
 * 1. used for resource optimization
 * 2. need a lot of resource for class initialization
 * 3. safety and performance concerned
 * 4. very complicated process to get object ready and access permission
 * 5. multiple used of an object
 * 6. access for other object
 * 7. always used with factory pattern
 * -------------------------
 * from my point of view, it is a kind of optimization for factory pattern.
 * solve the problem of multiple times class initialization. save resource for JVM.
 **/
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
