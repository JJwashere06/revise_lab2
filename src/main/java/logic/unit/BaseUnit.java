package logic.unit;

import java.util.ArrayList;

public class BaseUnit {
    private int row;
    private int column;
    private boolean isWhite;
    private String name;
    protected int hp;
    protected int power;
    protected boolean isFlying;
    public BaseUnit(int startColumn,int startRow,boolean isWhite,String name){
        power=1;
        isFlying=false;
        setHp(2);
        setColumn(startColumn);
        setRow(startRow);
        setWhite(isWhite);
        setName(name);
    }
    public boolean move(int direction){
        if(direction>=0 && direction<=3){
            if(direction==0){
                setRow(getRow()+1);
            }
            else if(direction==1){
                setColumn(getColumn()+1);
            }
            else if(direction==2){
                setRow(getRow()-1);
            }
            else{
                setColumn(getColumn()-1);
            }
            return true;
        }
        else{
            return false;
        }
    }
    public void attack(ArrayList<BaseUnit> targetPieces) {

        for(BaseUnit b:targetPieces){
            if(!b.isFlying()){
                if(b.getRow()==this.getRow() && b.getColumn()==this.getColumn()){
                    System.out.println(this.getName()+" attacks "+b.getName());
                    b.setHp(b.getHp()-this.getPower());
                }
            }
        }

    }

    //getter
    public int getRow() {
        return row;
    }
    public int getColumn(){
        return column;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    public int getPower(){
        return power;
    }
    public boolean isFlying() {
        return isFlying;
    }

    //setter
    public void setRow(int row) {
        if(row<0){
            this.row=0;
        }
        else if(row>4){
            this.row=4;
        }
        else{
            this.row=row;
        }
    }
    public void setColumn(int column){
        if(column<0){
            this.column=0;
        }
        else if(column>4){
            this.column=4;
        }
        else{
            this.column=column;
        }
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
