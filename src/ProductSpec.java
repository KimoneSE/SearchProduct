import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * created by Kimone
 * date 2020/8/26
 */

/**
 * SRP原则:该类专注于管理产品属性，当需要添加产品属性时，仅需在properties中添加键值对即可，不需要修改其他类
 */
public class ProductSpec {

    private Map<String, Object> properties;

    public ProductSpec(Map<String, Object> properties) {
        if(properties==null) {
            this.properties = new HashMap<>();
        }else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public Object getProperty(String specName){
        return properties.get(specName);
    }

    public boolean matches(ProductSpec otherSpec) {
        for(Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); ) {
            String propertyName = (String)i.next();
            if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
