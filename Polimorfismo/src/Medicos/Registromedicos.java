package Medicos;

public class Registromedicos{

    public Registromedicos()    {
        arrayMedicos = new Medico[50];
    }

    public void addmedico(Medico medico_){
        boolean insertado = false;
        for(int i = 0; i < arrayMedicos.length && !insertado; i++)
            if(arrayMedicos[i] == null)
            {
                arrayMedicos[i] = medico_;
                insertado = true;
            }

    }

    public void listar(){
        for(int i = 0; i < arrayMedicos.length; i++)
        {
            Medico m = arrayMedicos[i];
            if(m != null)
                m.mostrardatos();
        }

    }

    private Medico arrayMedicos[];
}
