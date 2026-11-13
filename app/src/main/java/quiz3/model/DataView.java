package quiz3.model;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView <T> {
    private List<T> records = new ArrayList<>();
    public void printAll(){
        String[] fields = this.getFields();

        for(int i = 0, i <= records, i++){
            System.out.println(i + "");
        }
        String[] values = this.convertModelTovalues(records);

    };
    public void printByPk(String primaryKey){

    };
    public void showInsertForm(){

    };
    public void showUpdateForm(){

    };
    public void promptDelete(){

    };
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValueToModel(String [] value);
    protected abstract String[] convertModelTovalues(T data);
}
