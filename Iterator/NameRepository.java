package Iterator;

public class NameRepository implements Container{
    public String names [] = {"Robert" , "John" , "Juile" , "Lora"};
    private NameIterator nameIter;

    @Override
    public Iterator getIterator() {
       nameIter = new NameIterator(names);
       return nameIter;
    }
}
