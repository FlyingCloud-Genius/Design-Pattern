package iterator;

/**
 * @FileName: IteratorPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 * 1. The java Iterator use this pattern.
 * 2. The separation of the iterator and the class increase the total number of classes.
 * 3. A different way to iterate an aggregated object.
 **/

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
