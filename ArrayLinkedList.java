class ArrayLinkedList<E>{
  public static final DEFAULT_SIZE = 5;
  E[] array;
  int[] next;
  int [] prev;
  int last = 0;
  int dangling;

  private newBackingArray(int capacity){
    if(array == null){
      array = new E[capacity];
      next = new int[capacity];
      prev = new int[capacity];
      prev[0] = -1;

      for(int i = 0; i < next.length - 1; i++){
        next[i] = i+1;
        prev[i+1] = i;
      }
      dangling = next.length - 1;
    }
    else if(capacity - 1 > array.length){
      int newSize = array.length;
      newSize += newSize;

      E[] newArray = new E[newSize];
      int[] newNext = new E[newSize];
      int[] newPrev = new E[newSize];

      for(int i = 0; i < next.length; i++){
        newNext[i] = next[i];
        newArray[i] = array[i];
        newPrev[i] = prev[i];
      }
      newNext[dangling] = next.length;
      newPrev[next.length] = dangling;
      for(int i = next.length; i < newNext.length - 1; i++){
        newNext[i] = i+1;
        newPrev[i+1] = i;
      }
      dangling = newNext.length - 1;
      array = newArray;
      next = newNext;
      prev = newPrev;
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
