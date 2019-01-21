class ArrayLinkedList<E>{
  public static final DEFAULT_SIZE = 5;
  E[] array;
  int[] next;
  int last = 0;
  int dangling;

  private newBackingArray(int capacity){
    if(array == null){
      array = new E[capacity];
      next = new int[capacity];

      for(int i = 0; i < next.length - 1; i++){
        next[i] = i+1;
      }
      dangling = next.length - 1;
    }
    else if(capacity - 1 > array.length){
      int newSize = array.length;
      newSize += newSize;

      E[] newArray = new E[newSize];
      int[] newNext = new E[newSize];

      for(int i = 0; i < next.length; i++){
        newNext[i] = next[i];
        newArray[i] = array[i];
      }
      newNext[dangling] = next.length;
      for(int i = next.length; i < newNext.length - 1; i++){
        newNext[i] = i+1;
      }
      dangling = newNext.length - 1;
      array = newArray;
      next = newNext;
    }
  }

  public ArrayLinkedList(){
    this(DEFAULT_SIZE);
  }

  public ArrayLinkedList(int initialCapacity){
    newBackingArray(initialCapacity);
  }

  public void add(E element){
    int newPosition = next[last];
    array[newPosition] = E;
  }

  public E remove(int index){
    
  }

  public E get(int index){
    
  }

  public boolean set(int index, E element){

  }
}
