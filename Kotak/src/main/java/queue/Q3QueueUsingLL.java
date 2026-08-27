package queue;

public class Q3QueueUsingLL {
    static class MyQueue{
        class Node{
            int val;
            Node next;
            Node(int val){
                this.val=val;

            }
        }
        private Node front;
        private Node rear;
        private int size;

        public MyQueue(){
            //initialise
            front=null;
            rear=null;
            size=0;

        }
        public void offer(int value){
            Node node=new Node(value);
            if(rear==null){
                front=node;
                rear=node;
            }
            else {
                rear.next=node;
                rear=node;
            }
            size++;
        }

        //Remove element from FRONT
        public int poll(){
//            if(front==null){
//                return -1;
//            }
            if(isEmpty()){
                return -1;
            }
            int value=front.val;
            front=front.next;
            size--;
            //Imp
            //If last element was removed
            //rear should also become null.
            if(front==null) rear=null;

            return value;
        }

        public int peek(){
            if(front==null){
                return -1;
            }
            int value=front.val;
            return value;
        }

        public boolean isEmpty(){
           //wrong  return size==0;
            return front==null;

        }

//        public boolean isFull(){
//            return size==capacity;
//        }

        public int size(){
            return size;
        }



    }

    public static void main(String[] args){
        MyQueue q=new MyQueue();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());


    }
}
