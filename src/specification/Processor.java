package specification;

/**
 * created by Kimone
 * date 2020/8/26
 */
public enum Processor {
     I9_M("Intel i9低功耗版"), I9_U("Intel i9标准电压版"), AMD("AMD系列");
     private String processorName;

     Processor(String processorName) {
         this.processorName = processorName;
     }

     public String getProcessorName() {
         return processorName;
     }
}
