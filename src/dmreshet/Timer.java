package dmreshet;

import java.util.HashMap;
import java.util.Map;

public class Timer {
    private Map<String, Operation> operations = new HashMap<String, Operation>();
    private Operation lastOperation;

    public void start(String label) {
        lastOperation = new Operation();
        lastOperation.label = label;
        lastOperation.startTime = System.currentTimeMillis();
    }

    public Operation stop() {
        lastOperation.endTime = System.currentTimeMillis();
        operations.put(lastOperation.label, lastOperation);
        return lastOperation;
    }

    public Operation getOperation(String label) {
        return operations.get(label);
    }

    public long getDuration(String label) {
        return operations.get(label).getDuration();
    }

    private class Operation {
        private String label;
        private long startTime;
        private long endTime;

        public long getDuration() {
            return lastOperation.endTime - lastOperation.startTime;
        }

        @Override
        public String toString() {
            return "Operation{" +
                    "label='" + label + '\'' +
                    ", duration =" + getDuration() +

                    '}';
        }
    }

}
