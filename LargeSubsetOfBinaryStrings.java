     String[]  strings =  new String[]{"00","0","1111","1","1","1"};
        int m=3,n=3;
        Stack<Integer> stack = new Stack<>();
        Stack<Character> characters = new Stack<>();
        for(int i =0; i<strings.length; i++){
            int last_M = m;
            int last_N = n;
            stack.push(i);
            if(strings[i].length()<=m+n){
                for (int j = 0; j < strings[i].length(); j++) {
                    if(strings[i].charAt(j) == '0' ){
                        m--;
                    }else if(strings[i].charAt(j) == '1'){
                        n--;
                    }
                }
            }else {
                stack.pop();
            }
                if(m<0 || n< 0){
                    m = last_M;
                    n = last_N;
                    stack.pop();
                    continue;
                }
                if(m== 0 && n == 0) break;
        }
        System.out.println(characters);
        System.out.println(stack);
