class recurssiontimes{

    /* Here  the function will go on until whatever n numeric value is given */

    public void printNos(int n) {
        if(n == 0){
            return;
        }

        /*  the below function is a recursive function and will keep on repeating*/

        printNos(n-1);
        System.out.print(" "+n);
    }
}