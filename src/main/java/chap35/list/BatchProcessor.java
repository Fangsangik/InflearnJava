package chap35.list;

public class BatchProcessor {

    private final List<Integer> list;

    public BatchProcessor(List<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long endTime= System.currentTimeMillis();
        System.out.println("크기: " + size + " 계산 시간 : " + (endTime - startTime) + " ms");
    }
}
