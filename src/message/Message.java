package message;

import java.lang.reflect.Field;
import java.util.List;




import com.mingJiang.as.ByteArray;

import component.User;

public abstract class Message {
	
	
	
	protected User user;

	public Message(User user){
		this.user= user;
	}

	public void digestBytes(ByteArray data){
		deserialize(data);
	//	System.out.println(this.getClass()+"  "+user);
		if(user!=null){
			action();
		}
	}
	public abstract void deserialize(ByteArray data);
	public abstract void serialize(ByteArray data);

	public abstract int getID();
	public abstract Message getInstance(User user);
	
	public abstract void action();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String toString(){
		return toString("");
	}
    public String toString(String indent){
    	 String startIndent = indent;
         StringBuilder sb = new StringBuilder(startIndent + this.getClass().getSimpleName() + "{\n");
         indent = indent + "\t";
         for (Field f : this.getClass().getFields()) {
       // 	 System.out.println(f);
             try {
                 if (f.getType() == List.class) {
                     sb.append(indent).append(f.getName()).append(" =[");
                     @SuppressWarnings("unchecked")
                     List<Object> list = (List<Object>) f.get(this);
                     if(list.size()>0)
                    	 sb.append("\n");
                     for (Object o : list) {
                         if (o instanceof Message) {
                             sb.append(((Message) o).toString(indent + "\t")).append("," + "\n");
                         } else if (o instanceof String) {
                             sb.append(o.toString()).append(",\n");
                         } else {
                             sb.append(indent).append("\t").append(o).append(",");
                         }
                     }
                     if (list.size() > 0) {
                         sb.append(indent);
                     }
                     sb.append("]\n");
                 } else {
                     Object obj = f.get(this);
                     if (obj instanceof Message) {
                         sb.append(indent).append(f.getName()).append(" =\n")
                                 .append(((Message) f.get(this)).toString(indent + "\t")+",\n");
                     } else {
                         sb.append(indent).append(f.getName()).append(" = ").append(obj).append(",\n");
                     }
                 }
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
         if(indent.length()<1)
        	 return sb.append(startIndent).append("}\n").toString();
         return sb.append(startIndent).append("}").toString();
    }
}