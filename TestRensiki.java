package testrensiki;
public class TestRensiki {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.sisipDepan(2);
        sll.sisipDiakhir(5);
        sll.sisipDepan(3);
        sll.sisipDiakhir(6);
        sll.sisipAfter(8, 5);
        sll.cetak();
    }
    
}
