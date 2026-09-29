class Solution {
    public String simplifyPath(String path) {
        String token[]=path.split("/");
        int n=token.length;
        
        StringBuilder sb=new StringBuilder();
        int skip=0;
        for(int i=n-1;i>=0;i--){
            if(token[i].trim().equals(""))continue;
            if(token[i].equals("..")){
                skip++;
                continue;
            }
            if(token[i].equals("."))continue;

            if(skip>0){
                skip--;
                continue;
            }

            sb.insert(0,"/"+token[i]);
            

            
        }

        return sb.length()==0?"/":sb.toString();
    }
}