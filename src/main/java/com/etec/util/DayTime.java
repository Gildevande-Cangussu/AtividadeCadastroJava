package com.etec.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime {
    private String data;
    private String hora;
    
public DayTime(){
Date DataHoraAtual = new Date();

this.setdata(new SimpleDateFormat("dd/mm/yyyy").format(DataHoraAtual));

this.setHora(new SimpleDateFormat("HH:mm:ss").format(DataHoraAtual));
}

public String getData(){
return data;
}

public void setdata(String data){
this.data = data;
}
public String getHora(){
return hora;
}

public void setHora(String hora){
this.hora = hora;

}
    }
