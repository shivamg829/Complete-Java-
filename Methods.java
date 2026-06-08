class  Demo {
    public void playing() {
        System.out.println("Playing...");
    }
    public String getMePen(int cost) {
        if(cost > 20) {
            return "pencil";
        }else{
            return "pen";
        }
    }
}
public class Methods {
    public static void main(String[] args) {
        Demo m = new Demo();
        m.playing();
        String pen = m.getMePen(10);
        System.out.println(pen);
    }
}