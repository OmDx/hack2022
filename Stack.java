class Stack{
  int top=0;
  int[] arr;
  public Stack(int size){
    arr[] = new int[size];
  }
  public int peek(){
    return top-1;
  }
  public int push(int val){
    arr[top] = val;
    top++;
  }
  public int pop(){
    top--;
  }
}
