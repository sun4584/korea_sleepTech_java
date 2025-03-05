//package asd;
//
//public class exam3 {
//import java.util.*;
//
//	        int[] parent;
//	        int[] size;
//	        Map<Integer, Map<Character, Integer>> charCount;
//
//	        public UnionFind(int n) {
//	            parent = new int[n];
//	            size = new int[n];
//	            charCount = new HashMap<>();
//	            for (int i = 0; i < n; i++) {
//	                parent[i] = i;
//	                size[i] = 1;
//	                charCount.put(i, new HashMap<>());
//	            }
//	        }
//
//	        public int find(int x) {
//	            if (parent[x] != x) {
//	                parent[x] = find(parent[x]);
//	            }
//	            return parent[x];
//	        }
//
//	        public void union(int x, int y) {
//	            int rootX = find(x);
//	            int rootY = find(y);
//	            if (rootX != rootY) {
//	                if (size[rootX] < size[rootY]) {
//	                    parent[rootX] = rootY;
//	                    mergeCharCount(rootY, rootX);
//	                } else {
//	                    parent[rootY] = rootX;
//	                    mergeCharCount(rootX, rootY);
//	                }
//	            }
//	        }
//
//	        private void mergeCharCount(int rootDest, int rootSrc) {
//	            Map<Character, Integer> srcCount = charCount.get(rootSrc);
//	            Map<Character, Integer> destCount = charCount.get(rootDest);
//
//	            for (Map.Entry<Character, Integer> entry : srcCount.entrySet()) {
//	                destCount.put(entry.getKey(), destCount.getOrDefault(entry.getKey(), 0) + entry.getValue());
//	            }
//
//	            charCount.remove(rootSrc);
//	        }
//
//	        public void addChar(int index, char c) {
//	            int root = find(index);
//	            charCount.get(root).put(c, charCount.get(root).getOrDefault(c, 0) + 1);
//	        }
//
//	        public boolean isConnected(int x, int y) {
//	            return find(x) == find(y);
//	        }
//
//	        public Map<Character, Integer> getCharCount(int index) {
//	            return charCount.get(find(index));
//	        }
//	    
//
//	    public static List<String> solution(String s, String[] query) {
//	        UnionFind uf = new UnionFind(s.length());
//	        List<String> result = new ArrayList<>();
//
//	        // 초기 문자열 처리
//	        for (int i = 0; i < s.length(); i++) {
//	            uf.addChar(i, s.charAt(i));
//	        }
//
//	        // 쿼리 처리
//	        for (String q : query) {
//	            String[] parts = q.split(" ");
//	            int type = Integer.parseInt(parts[0]);
//
//	            if (type == 1) {  // 1 x y
//	                int x = Integer.parseInt(parts[1]) - 1;
//	                int y = Integer.parseInt(parts[2]) - 1;
//	                result.add(uf.isConnected(x, y) ? "YES" : "NO");
//	            } else if (type == 2) {  // 2 x word
//	                int x = Integer.parseInt(parts[1]) - 1;
//	                String word = parts[2];
//
//	                for (char c : word.toCharArray()) {
//	                    int idx = x;
//	                    while (idx < s.length() && s.charAt(idx) == c) {
//	                        uf.addChar(idx, c);
//	                        idx++;
//	                    }
//	                }
//	            } else if (type == 3) {  // 3 x y word
//	                int x = Integer.parseInt(parts[1]) - 1;
//	                int y = Integer.parseInt(parts[2]) - 1;
//	                String word = parts[3];
//
//	                for (int i = x; i <= y; i++) {
//	                    if (word.indexOf(s.charAt(i)) != -1) {
//	                        uf.addChar(i, s.charAt(i));
//	                    }
//	                }
//	            } else if (type == 4) {  // 4 x y
//	                int x = Integer.parseInt(parts[1]) - 1;
//	                int y = Integer.parseInt(parts[2]) - 1;
//
//	                uf.union(x, y);
//	            } else if (type == 5) {  // 5
//	                List<Map<Character, Integer>> allCharCounts = new ArrayList<>();
//	                for (int i = 0; i < s.length(); i++) {
//	                    if (uf.parent[i] == i) {
//	                        allCharCounts.add(uf.getCharCount(i));
//	                    }
//	                }
//
//	                for (Map<Character, Integer> count : allCharCounts) {
//	                    StringBuilder sb = new StringBuilder();
//	                    for (char c = 'a'; c <= 'z'; c++) {
//	                        if (count.containsKey(c)) {
//	                            sb.append(c).append(" ").append(count.get(c)).append(" ");
//	                        }
//	                    }
//	                    result.add(sb.toString().trim());
//	                }
//	            }
//	        }
//
//	        return result;
//	    }
//
//	    public static void main(String[] args) {
//	        String s = "programmers";
//	        String[] query = {"1 1 5", "2 1 rm", "1 1 5", "5"};
//	        System.out.println(solution(s, query)); // 결과: ["YES", "NO", "a 1 e 1 g 1 o 1 p 1 s 1", "m 2 r 3"]
//
//	        s = "abacadae";
//	        query = new String[]{"3 1 4 aa", "1 1 5", "4 1 7", "1 1 5", "5"};
//	        System.out.println(solution(s, query)); // 결과: ["NO", "YES", "a 4 b 1 c 1 d 1 e 1"]
//	    }
//	}
//
//


