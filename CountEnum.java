package test;
public enum  CountEnum {
    ONE("1","qi"),TWO("2","chu"),THREE("3","yan"),FOUR("4","zhao"),FIVE("5","wei"),SIX("6","han");
    private String id;
    private  String value;

    CountEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }
   static String getValueById(String id){
       CountEnum[] values = CountEnum.values();
       for (CountEnum element : values) {
          String test =element.id;
           if (id.equals(element.id)){
               return element.value;
           }

       }

       return null;
   }


}
