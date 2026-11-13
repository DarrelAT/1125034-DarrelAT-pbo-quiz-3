package quiz3.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public abstract class DataView <T> {
    Scanner sc = new Scanner(System.in);
    private List<T> records = new ArrayList<>();

    public void printAll(){
        String[] fields = this.getFields();

        for(int i = 0; i < this.records.size(); i++){
            T records = this.records.get(i);
            String[] values = this.convertModelTovalues(records);
            System.out.println(i + ". ");

            for(int j = 0; j < fields.length; j++){
                System.out.println(fields[j] + "=" + values[j] + ", ");
            }
            System.out.println();
        }
    };

    public void printByPk(String primaryKey){
        String[] fields = this.getFields();
        String[] pk = this.getPrimaryKeyValue(records);
        for(int i = 0; i < this.records.size(); i++){
            if(pk = primaryKey){
                pk = convertModelTovalues(pk);
            }
        }
    };
    public void showInsertForm(){
        String[] fileds = this.getFields();
        String[] values = this.;
        for(int i = 0; i < this.records.size(); i++){
            System.out.println();
        }

    };
    public void showUpdateForm(){
        String pkawal = printByPk(pk);
        System.out.println("input pk yang mau di ubah: ");
        String pk = sc.next();
        String[] fields = this.getFields();
        for(int i = 0; i < this.records.size(); i++){
            if(pkawal = records.primaryKey){
                pkawal = pk;
            }
        }
    };
    public void promptDelete(){
        String pkawal = printByPk(pk);
        System.out.println("input pk yang mau di ubah: ");
        String pk = sc.next();
        String[] fields = this.getFields();
        for(int i = 0; i < this.records.size(); i++){
            if(pkawal = records.primaryKey){
                pk = null;
            }
        }
    };
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValueToModel(String [] value);
    protected abstract String[] convertModelTovalues(T data);
}
