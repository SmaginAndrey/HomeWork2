package Task1;

import java.util.Date;

public class D extends C {
    public E varD1;

    public E getVarD1() {
        return varD1;
    }

    public void setVarD1(E varD1) {
        this.varD1 = varD1;
    }
    @Override
    public int foo(Date date) {
        return 0;
    }
    @Override
    public void buzz() {

    }

    class E{
        public E varE1;

        public E getVarE1() {
            return varE1;
        }

        public void setVarE1(E varE1) {
            this.varE1 = varE1;
        }
        public void bar(){

        }
        private int bar(int size){
            return size;
        }
    }
}
