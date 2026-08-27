package queue;
/*
Suppose capacity=5

offer(10)
offer(20)
offer(30)

array:
[10,20,30]

front points at 10
rear points at 30

peek() 10
poll() 10

[10,20,30]
after poll [20,30]
front=20
 */
public class Q1ImplementQueueUsingArray {
    static class MyQueue{

        int[] arr;
        int frontIndex=-1;
        int rearIndex=-1;

        int capacity;
        int size=0;

        public MyQueue(int capacity){
            this.capacity=capacity;
            arr=new int[this.capacity];

        }
        public void offer(int value){
            //if(arr.length>=capacity)System.out.println("Queue Full sorry");
            if(size>=capacity)System.out.println("Queue Full sorry");
            else {
                if(rearIndex==-1){
                    rearIndex++;
                    arr[rearIndex]=value;
                    size++;
                    frontIndex++;
                }
                else
                {
                    rearIndex++;
                    arr[rearIndex]=value;
                    size++;
                    frontIndex++;
                }


            }



        }
        public int poll(){
            if(frontIndex==-1){
                return -1;
            }

            int polled= arr[frontIndex];
            frontIndex++;
            size--;
            return polled;


        }

        public int peek(){
            if(frontIndex==-1){
                return -1;
            }

            int polled= arr[frontIndex];
            return polled;

        }

        public boolean isEmpty(){
            return arr.length<=0;

        }

        public int size(){
            return arr.length;

        }
    }
    public static void main(String[] args){
        MyQueue myQueue=new MyQueue(3);
        myQueue.offer(10);
        System.out.println("myqueue has "+myQueue);
        myQueue.offer(20);
        System.out.println("myqueue has "+myQueue);
        myQueue.offer(30);
        System.out.println("myqueue has "+myQueue);
        myQueue.offer(40);
        System.out.println("myqueue has "+myQueue);
        myQueue.offer(50);
        System.out.println("myqueue has "+myQueue);
        System.out.println("peek val"+myQueue.peek());
        System.out.println("polled val"+myQueue.poll());
        System.out.println("myqueue has "+myQueue);
        System.out.println("myqueue isEmpty? "+myQueue.isEmpty() );
        System.out.println("myqueue size  "+myQueue.size());



    }
}

