package service;

import java.util.ArrayList;
import java.util.List;

import beans.Drapeau;
import dao.IDao;

public class DrapeauService implements IDao<Drapeau> {
    private List <Drapeau> drapeaus;
    private  static DrapeauService instance;

    public DrapeauService() {
        this.drapeaus = new ArrayList<>();
    }
     public  static  DrapeauService getInstance(){
        if(instance==null) instance=new DrapeauService();
        return  instance;
     }
    @Override
    public boolean create(Drapeau o) {
       return drapeaus.add(o);

    }

    @Override
    public boolean update(Drapeau o) {
        return false;
    }

    @Override
    public boolean delete(Drapeau o) {
        return drapeaus.remove(o);
    }

    @Override
    public Drapeau findById(int id) {
        for(Drapeau d :drapeaus){
            if (d.getId()==id)  return d;

        }
     return null;

    }

    @Override
    public List<Drapeau> findAll() {
        return drapeaus;
    }
}
