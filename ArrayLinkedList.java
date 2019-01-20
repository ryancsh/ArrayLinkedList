class ArrayLinkedList<E>{
  public static final DEFAULT_SIZE = 5;
  E[] array;
  public ArrayLinkedList(){
    this(DEFAULT_SIZE);
  }

  public ArrayLinkedList(int intitialCapacity){
    array = new E[intitialCapacity]
  }


}
