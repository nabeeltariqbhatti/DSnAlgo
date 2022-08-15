class WordDictionary {
    public Map<Integer,ArrayList<String>> dictionary = new HashMap<>();


    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        //if(word!=null){
            if(dictionary.get(word.length()) == null){
            dictionary.put(word.length(), new ArrayList<>());
        //}
        dictionary.get(word.length()).add(word);
        }
    }
    
    public boolean search(String word) {
        List<String> words = dictionary.get(word.length());
        if(words==null)return false;
            if(word.replace(".", "").isEmpty()){
                return true;
            }
        for(String w: words){
            for(int i =0; i<word.length(); i++){
              Character searchAble =   w.charAt(i);
              Character searching = word.charAt(i);
             if(!searchAble.equals(searching) && !searching.equals('.')){
                 System.out.println(word);
                 System.out.println(dictionary);
                       return false;
             } 
            }
        }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
