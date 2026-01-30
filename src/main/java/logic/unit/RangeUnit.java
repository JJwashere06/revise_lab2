package logic.unit;

import java.util.ArrayList;

public class RangeUnit extends BaseUnit{
    public RangeUnit(int startColumn,int startRow,boolean isWhite,String name){
        super(startColumn,startRow,isWhite,name);
        this.setHp(2);
    }
    public void attack(ArrayList<BaseUnit> targetPieces){
        int attackRow;
        int attackColumn=this.getColumn();
        if(this.isWhite()){ //above this unit
            attackRow=this.getRow()-1;
        }
        else{ //below this unit
            attackRow=this.getRow()+1;
        }
        for(BaseUnit d:targetPieces){
            if(d.getRow()==attackRow && d.getColumn()==attackColumn){
                System.out.println(this.getName()+" attack "+d.getName());
                d.setHp(d.getHp()-this.getPower());
            }
        }

    }
}
