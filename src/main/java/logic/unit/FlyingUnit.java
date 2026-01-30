package logic.unit;

public class FlyingUnit extends BaseUnit{
    public FlyingUnit(int startColumn,int startRow,boolean isWhite,String name){
        super(startColumn,startRow,isWhite,name);
        this.setHp(2);
        this.isFlying=true;
    }
    public boolean move(int direction){
        if(direction>=0 && direction<=3){
            if(direction==0){
                setRow(getRow()+2);
            }
            else if(direction==1){
                setColumn(getColumn()+2);
            }
            else if(direction==2){
                setRow(getRow()-2);
            }
            else{
                setColumn(getColumn()-2);
            }
            return true;
        }
        else{
            return false;
        }
    }
}
