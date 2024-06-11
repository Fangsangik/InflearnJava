package chap35.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //MyArrayList<Integer> list = new MyArrayList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(5000_000);
    }
}
