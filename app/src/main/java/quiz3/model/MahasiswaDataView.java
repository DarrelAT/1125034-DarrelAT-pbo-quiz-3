package quiz3.model;

public abstract class MahasiswaDataView extends DataView<Mahasiswa> {


    @Override 
    protected abstract String getPrimaryKeyValue(Mahasiswa data){
        return data.getNama();
    }

    @Override
    protected String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    @Override
    protected Mahasiswa convertValueToModel(String[] value) {
        return new Mahasiswa(value[0], value[1], value[2], 
        Integer.parseInt(value[3]));
    }

    @Override
    protected String[] convertModelTovalues(Mahasiswa data) {
        return new String[]{data.getNim(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur())};
    }
    
}