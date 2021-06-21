package ShapeWithArray;

public class Shape {

    void aLetter(){
        
        String[][] aDizi = new String[6][4];

        for(int i=0; i<aDizi.length; i++){
            
            for(int j=0; j<aDizi[i].length; j++){
                if(i==0 || i==2){
                    aDizi[i][j] = "* "; 
                }
                else if(j==0 || j==3){
                    aDizi[i][j] = "* ";
                }
                else{
                    aDizi[i][j] = "  ";
                }

            }
        }

        for(String[] row : aDizi){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    void bLetter(){
        
        String[][] aDizi = new String[7][4];

        for(int i=0; i<aDizi.length; i++){
            
            for(int j=0; j<aDizi[i].length; j++){
                if(i==0 || i==3 || i==6){
                    aDizi[i][j] = "* "; 
                }
                else if(j==0 || j==3){
                    aDizi[i][j] = "* ";
                }
                else{
                    aDizi[i][j] = "  ";
                }

            }
        }

        for(String[] row : aDizi){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
