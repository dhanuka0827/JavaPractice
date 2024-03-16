package module1.random;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueObject {

    private static ConcurrentLinkedQueue<String> itemQueue = new ConcurrentLinkedQueue<>();

    /**
     * Returns the ConcurrentQueue
     * @return
     */
    public ConcurrentLinkedQueue<String> getItemQueue() {
        return itemQueue;
    }

    /**
     * Adds Item data into ConcurrentQueue
     * @param itemData
     */
    public void addDataQueue(String itemData)
    {
        itemQueue.add(itemData);
    }
}
