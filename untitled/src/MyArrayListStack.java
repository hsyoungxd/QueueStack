public class MyArrayListStack {
    MyArrayListStack(){}
    private MyArrayList stack = new MyArrayList();
    public void push(Object o){
        stack.add(o);
    }
    public Object pop(){
        Object buff = stack.get(0);
        stack.remove(0);
        return buff;
    }
    public Object peek(){
        return null;
    }
    public boolean isEmpty(){
        return true;
    }
    public int size(){
        return 0;
    }
}
