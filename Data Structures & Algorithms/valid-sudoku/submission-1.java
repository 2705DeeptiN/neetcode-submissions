class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>>row=new HashMap<>();
        Map<Integer,Set<Character>>col=new HashMap<>();
        Map<String,Set<Character>>sq=new HashMap<>();

        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];

                if(val=='.')continue;
                String skey=(i/3)+","+(j/3);
                if(!sq.containsKey(skey))sq.put(skey,new HashSet<>());

                if(row.get(i).contains(val)|| col.get(j).contains(val)||sq.get(skey).contains(val))return false;

                row.get(i).add(val);
                col.get(j).add(val);
                sq.get(skey).add(val);
            }
        }
return true;
    }
}
