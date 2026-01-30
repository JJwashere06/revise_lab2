package logic.unit;

import java.util.ArrayList;

public class RangeUnit extends BaseUnit{
    public RangeUnit(int startColumn,int startRow,boolean isWhite,String name){
        super(startColumn,startRow,isWhite,name);
        this.setHp(2);
    }
    public void attack(ArrayList<BaseUnit> targetPieces){
        for(BaseUnit d:targetPieces){
            if(d.isWhite()){ //above this unit

            }
            else{ //below this unit

            }
        }
        System.out.println(this.getName()+" attacks "+);
    }
}
