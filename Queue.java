public class Queue {
    DoublyLinkedList[] queue;
    int size;
    int count = 0;

    Queue(int size){
        this.size = size;
        queue = new DoublyLinkedList[this.size];
    }



    public void enqueue(String data){
        for (int i = 0; i < count; i++){
            if (data.charAt(0) == queue[i].head.data.charAt(0)){
                queue[i].addLast(data);
                return;
            }
        }
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(data);
        if(count != size){
            queue[count] = list;
            count++;
        }else {
            resizing();
        }
    }
    public String dequeue(){
        if (count != size){
            if (queue[0].size != 0){
                String data = queue[0].removeFirst();
                return data;
            }else {
                for (int i = 1; i < size; i++) {
                    queue[i-1] = queue[i];
                }
                count--;
                String data = queue[0].removeFirst();
                return data;
            }
        }else {
            throw new RuntimeException("Queue is Empty");
        }
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            queue[i].print();
        }
    }
    public void resizing(){
        DoublyLinkedList[] oldQueue = queue;
        queue = new DoublyLinkedList[size*2];
        System.arraycopy(oldQueue, 0, queue, 0, oldQueue.length);
    }
}
